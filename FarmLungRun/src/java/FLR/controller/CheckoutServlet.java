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
import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Random;
import java.util.logging.Level;
import java.util.logging.Logger;
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
        response.setContentType("text/html;charset=UTF-8");
        HttpSession session = request.getSession(true);
        Account accountSession = (Account) session.getAttribute("account");
        ShoppingCart cart = (ShoppingCart) session.getAttribute("cart");

        if (cart == null) {
            request.setAttribute("message_checkout", "Your cart is empty! You can't checkout now!");
            getServletContext().getRequestDispatcher("/Cart").forward(request, response);
        } else {
            AccountJpaController accountCtrl = new AccountJpaController(utx, emf);
            Account account = accountCtrl.findAccount(accountSession.getUsername());
            OrdersJpaController ordersCtrl = new OrdersJpaController(utx, emf);
            OrderdetailJpaController orderdetailCtrl = new OrderdetailJpaController(utx, emf);
            String comment = request.getParameter("comment");
            List<LineItem> lineItemList = cart.getLineItems(); 
            Orders orders = new Orders();

            orders.setOrderid(genOrderId());
            orders.setComment(comment);
            orders.setOrderdate(new Date());
            orders.setUsername(account);
            orders.setTotalprice(cart.getTotalPrice());
            try {
                ordersCtrl.create(orders);
            } catch (RollbackFailureException ex) {
                System.out.println(ex);
            } catch (Exception ex) {
                System.out.println(ex);
            }

            for (LineItem lineItem : lineItemList) {
                Orderdetail orderDetail = new Orderdetail();
                if (orderdetailCtrl.getOrderdetailCount() == 0) {
                    orderDetail.setOrderdetailid(1);
                } else {
                    orderDetail.setOrderdetailid(orderdetailCtrl.getOrderdetailCount() + 1);
                }
                orderDetail.setOrderid(orders);
                orderDetail.setProductcode(lineItem.getProduct());
                orderDetail.setPriceeach(lineItem.getPrice());
                orderDetail.setQuantity(lineItem.getQuantity());

                try {
                    //accountCtrl.edit(account);                        
                    orderdetailCtrl.create(orderDetail);
                    cart.remove(lineItem.getProduct());
                } catch (RollbackFailureException ex) {
                    System.out.println(ex);
                } catch (Exception ex) {
                    System.out.println(ex);
                }

            }

            session.removeAttribute("cart");
            request.setAttribute("success", "Checkout Success");
            request.setAttribute("message_checkout", "");
            request.setAttribute("message", "Your cart is empty!");
            getServletContext().getRequestDispatcher("/checkout.jsp").forward(request, response);
        }

    }

    private int genOrderId() {
        Random rd = new Random();
        String orderId = "1001";
        int intorderId = 0;
        OrdersJpaController ordersCtrl = new OrdersJpaController(utx, emf);
        Orders order = new Orders();
        while(order != null){
        while(orderId.length() !=7) {
            int code = rd.nextInt(10);
            String stCode = String.valueOf(code);
            orderId = orderId + stCode;
            intorderId = Integer.parseInt(orderId);
        }
        order = ordersCtrl.findOrders(intorderId);
        }
        return intorderId;
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
