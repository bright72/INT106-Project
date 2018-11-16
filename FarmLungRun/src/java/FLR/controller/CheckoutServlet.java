/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package FLR.controller;

import FLR.model.Account;
import FLR.model.LineItem;
import FLR.model.Orderdetail;
import FLR.model.Orders;
import FLR.model.Product;
import FLR.model.ShoppingCart;
import FLR.model.controller.AccountJpaController;
import FLR.model.controller.OrderdetailJpaController;
import FLR.model.controller.OrdersJpaController;
import FLR.model.controller.ProductJpaController;
import FLR.model.controller.exceptions.RollbackFailureException;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import javax.annotation.Resource;
import javax.persistence.EntityManagerFactory;
import javax.persistence.PersistenceUnit;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import javax.transaction.UserTransaction;

/**
 *
 * @author SARUNSUMETPANICH
 */
public class CheckoutServlet extends HttpServlet {

    @PersistenceUnit(unitName = "FarmLungRunPU")
    EntityManagerFactory emf;

    @Resource
    UserTransaction utx;

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        HttpSession session = request.getSession(true);
        Account accountSession = (Account) session.getAttribute("account");
        ShoppingCart cart = (ShoppingCart) session.getAttribute("cart");
        if (accountSession != null) {
            if (cart == null) {
                request.setAttribute("message", "Your cart is empty! You can't checkout anything now...");
                getServletContext().getRequestDispatcher("/checkout.jsp").forward(request, response);
            } else {
                AccountJpaController accountCtrl = new AccountJpaController(utx, emf);
                Account account = accountCtrl.findAccount(accountSession.getUsername());
                OrdersJpaController ordersCtrl = new OrdersJpaController(utx, emf);
                OrderdetailJpaController orderdetailCtrl = new OrderdetailJpaController(utx, emf);
                String comment = request.getParameter("comment");

                List<LineItem> lineItemList = cart.getLineItems();
                
                    Orders orders = new Orders();
                    if(orders.getOrderid()==null){
                    orders.setOrderid(0001);
                    }else{
                    orders.setOrderid(orders.getOrderid() + 1);
                    }
                    orders.setComment(comment);
                    orders.setOrderdate(new Date());
                    orders.setUsername(account);
                
                for (LineItem lineItem : lineItemList) {

                    Orderdetail orderDetail = new Orderdetail();
                    if(orderDetail.getOrderdetailid()==null){
                    orderDetail.setOrderdetailid(0001);
                    }else{
                    orderDetail.setOrderdetailid(orderDetail.getOrderdetailid()+1);
                    }
                    orderDetail.setOrderid(orders);
                    orderDetail.setProductcode(lineItem.getProduct());
                    orderDetail.setPriceeach(lineItem.getPrice());
                    orderDetail.setQuantity(lineItem.getQuantity());
          
                    try {
                            accountCtrl.edit(account);
                            ordersCtrl.create(orders);
                            orderdetailCtrl.create(orderDetail);
                        } catch (RollbackFailureException ex) {
                            System.out.println(ex);
                        } catch (Exception ex) {
                            System.out.println(ex);
                        }
                    
                }

                request.setAttribute("message", "");
                getServletContext().getRequestDispatcher("/checkout.jsp").forward(request, response);
            }
        } else {
            request.setAttribute("message", "Your cart is empty! You can't checkout anything now...");
            getServletContext().getRequestDispatcher("/Login").forward(request, response);
        }

    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
