/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package FLR.controller;

import FLR.model.Product;
import FLR.model.controller.ProductJpaController;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.Resource;
import javax.persistence.EntityManagerFactory;
import javax.persistence.PersistenceUnit;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.transaction.UserTransaction;

/**
 *
 * @author SARUNSUMETPANICH
 */
public class ShopServlet extends HttpServlet {

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

        String range = request.getParameter("range");
        ProductJpaController productCtrl = new ProductJpaController(utx, emf);

        if (range != null) {
            if (range.equalsIgnoreCase("1")) {
                List<Product> foundProduct = productCtrl.findByProductprice("1", "50");
                request.setAttribute("product", foundProduct);
                request.getRequestDispatcher("/shop.jsp?range=1").forward(request, response);
            } else if (range.equalsIgnoreCase("2")) {
                List<Product> foundProduct = productCtrl.findByProductprice("51", "100");
                request.setAttribute("product", foundProduct);
                request.getRequestDispatcher("/shop.jsp").forward(request, response);
            } else if (range.equalsIgnoreCase("3")) {
                List<Product> foundProduct = productCtrl.findByProductprice("101", "200");
                request.setAttribute("product", foundProduct);
                request.getRequestDispatcher("/shop.jsp").forward(request, response);
            } else if (range.equalsIgnoreCase("4")) {
                List<Product> foundProduct = productCtrl.findByProductprice("200", "100000");
                request.setAttribute("product", foundProduct);
                request.getRequestDispatcher("/shop.jsp").forward(request, response);
            } else if (range.equalsIgnoreCase("0")) {
                List<Product> product = productCtrl.findProductEntities();
                request.setAttribute("product", product);
                request.getRequestDispatcher("/shop.jsp").forward(request, response);
            }

        } else {
            List<Product> product = productCtrl.findProductEntities();
            request.setAttribute("product", product);
            request.getRequestDispatcher("/shop.jsp").forward(request, response);
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
