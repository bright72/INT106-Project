/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model.Controller;

import Model.Account;
import Model.Controller.exceptions.IllegalOrphanException;
import Model.Controller.exceptions.NonexistentEntityException;
import Model.Controller.exceptions.PreexistingEntityException;
import Model.Controller.exceptions.RollbackFailureException;
import java.io.Serializable;
import javax.persistence.Query;
import javax.persistence.EntityNotFoundException;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;
import Model.Orders;
import java.util.ArrayList;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.transaction.UserTransaction;

/**
 *
 * @author INT303
 */
public class AccountJpaController implements Serializable {

    public AccountJpaController(UserTransaction utx, EntityManagerFactory emf) {
        this.utx = utx;
        this.emf = emf;
    }
    private UserTransaction utx = null;
    private EntityManagerFactory emf = null;

    public EntityManager getEntityManager() {
        return emf.createEntityManager();
    }

    public void create(Account account) throws PreexistingEntityException, RollbackFailureException, Exception {
        if (account.getOrdersList() == null) {
            account.setOrdersList(new ArrayList<Orders>());
        }
        EntityManager em = null;
        try {
            utx.begin();
            em = getEntityManager();
            List<Orders> attachedOrdersList = new ArrayList<Orders>();
            for (Orders ordersListOrdersToAttach : account.getOrdersList()) {
                ordersListOrdersToAttach = em.getReference(ordersListOrdersToAttach.getClass(), ordersListOrdersToAttach.getOrderid());
                attachedOrdersList.add(ordersListOrdersToAttach);
            }
            account.setOrdersList(attachedOrdersList);
            em.persist(account);
            for (Orders ordersListOrders : account.getOrdersList()) {
                Account oldCustomeridOfOrdersListOrders = ordersListOrders.getCustomerid();
                ordersListOrders.setCustomerid(account);
                ordersListOrders = em.merge(ordersListOrders);
                if (oldCustomeridOfOrdersListOrders != null) {
                    oldCustomeridOfOrdersListOrders.getOrdersList().remove(ordersListOrders);
                    oldCustomeridOfOrdersListOrders = em.merge(oldCustomeridOfOrdersListOrders);
                }
            }
            utx.commit();
        } catch (Exception ex) {
            try {
                utx.rollback();
            } catch (Exception re) {
                throw new RollbackFailureException("An error occurred attempting to roll back the transaction.", re);
            }
            if (findAccount(account.getCustomerid()) != null) {
                throw new PreexistingEntityException("Account " + account + " already exists.", ex);
            }
            throw ex;
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }

    public void edit(Account account) throws IllegalOrphanException, NonexistentEntityException, RollbackFailureException, Exception {
        EntityManager em = null;
        try {
            utx.begin();
            em = getEntityManager();
            Account persistentAccount = em.find(Account.class, account.getCustomerid());
            List<Orders> ordersListOld = persistentAccount.getOrdersList();
            List<Orders> ordersListNew = account.getOrdersList();
            List<String> illegalOrphanMessages = null;
            for (Orders ordersListOldOrders : ordersListOld) {
                if (!ordersListNew.contains(ordersListOldOrders)) {
                    if (illegalOrphanMessages == null) {
                        illegalOrphanMessages = new ArrayList<String>();
                    }
                    illegalOrphanMessages.add("You must retain Orders " + ordersListOldOrders + " since its customerid field is not nullable.");
                }
            }
            if (illegalOrphanMessages != null) {
                throw new IllegalOrphanException(illegalOrphanMessages);
            }
            List<Orders> attachedOrdersListNew = new ArrayList<Orders>();
            for (Orders ordersListNewOrdersToAttach : ordersListNew) {
                ordersListNewOrdersToAttach = em.getReference(ordersListNewOrdersToAttach.getClass(), ordersListNewOrdersToAttach.getOrderid());
                attachedOrdersListNew.add(ordersListNewOrdersToAttach);
            }
            ordersListNew = attachedOrdersListNew;
            account.setOrdersList(ordersListNew);
            account = em.merge(account);
            for (Orders ordersListNewOrders : ordersListNew) {
                if (!ordersListOld.contains(ordersListNewOrders)) {
                    Account oldCustomeridOfOrdersListNewOrders = ordersListNewOrders.getCustomerid();
                    ordersListNewOrders.setCustomerid(account);
                    ordersListNewOrders = em.merge(ordersListNewOrders);
                    if (oldCustomeridOfOrdersListNewOrders != null && !oldCustomeridOfOrdersListNewOrders.equals(account)) {
                        oldCustomeridOfOrdersListNewOrders.getOrdersList().remove(ordersListNewOrders);
                        oldCustomeridOfOrdersListNewOrders = em.merge(oldCustomeridOfOrdersListNewOrders);
                    }
                }
            }
            utx.commit();
        } catch (Exception ex) {
            try {
                utx.rollback();
            } catch (Exception re) {
                throw new RollbackFailureException("An error occurred attempting to roll back the transaction.", re);
            }
            String msg = ex.getLocalizedMessage();
            if (msg == null || msg.length() == 0) {
                Integer id = account.getCustomerid();
                if (findAccount(id) == null) {
                    throw new NonexistentEntityException("The account with id " + id + " no longer exists.");
                }
            }
            throw ex;
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }

    public void destroy(Integer id) throws IllegalOrphanException, NonexistentEntityException, RollbackFailureException, Exception {
        EntityManager em = null;
        try {
            utx.begin();
            em = getEntityManager();
            Account account;
            try {
                account = em.getReference(Account.class, id);
                account.getCustomerid();
            } catch (EntityNotFoundException enfe) {
                throw new NonexistentEntityException("The account with id " + id + " no longer exists.", enfe);
            }
            List<String> illegalOrphanMessages = null;
            List<Orders> ordersListOrphanCheck = account.getOrdersList();
            for (Orders ordersListOrphanCheckOrders : ordersListOrphanCheck) {
                if (illegalOrphanMessages == null) {
                    illegalOrphanMessages = new ArrayList<String>();
                }
                illegalOrphanMessages.add("This Account (" + account + ") cannot be destroyed since the Orders " + ordersListOrphanCheckOrders + " in its ordersList field has a non-nullable customerid field.");
            }
            if (illegalOrphanMessages != null) {
                throw new IllegalOrphanException(illegalOrphanMessages);
            }
            em.remove(account);
            utx.commit();
        } catch (Exception ex) {
            try {
                utx.rollback();
            } catch (Exception re) {
                throw new RollbackFailureException("An error occurred attempting to roll back the transaction.", re);
            }
            throw ex;
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }

    public List<Account> findAccountEntities() {
        return findAccountEntities(true, -1, -1);
    }

    public List<Account> findAccountEntities(int maxResults, int firstResult) {
        return findAccountEntities(false, maxResults, firstResult);
    }

    private List<Account> findAccountEntities(boolean all, int maxResults, int firstResult) {
        EntityManager em = getEntityManager();
        try {
            CriteriaQuery cq = em.getCriteriaBuilder().createQuery();
            cq.select(cq.from(Account.class));
            Query q = em.createQuery(cq);
            if (!all) {
                q.setMaxResults(maxResults);
                q.setFirstResult(firstResult);
            }
            return q.getResultList();
        } finally {
            em.close();
        }
    }

    public Account findAccount(Integer id) {
        EntityManager em = getEntityManager();
        try {
            return em.find(Account.class, id);
        } finally {
            em.close();
        }
    }

    public int getAccountCount() {
        EntityManager em = getEntityManager();
        try {
            CriteriaQuery cq = em.getCriteriaBuilder().createQuery();
            Root<Account> rt = cq.from(Account.class);
            cq.select(em.getCriteriaBuilder().count(rt));
            Query q = em.createQuery(cq);
            return ((Long) q.getSingleResult()).intValue();
        } finally {
            em.close();
        }
    }
    
}
