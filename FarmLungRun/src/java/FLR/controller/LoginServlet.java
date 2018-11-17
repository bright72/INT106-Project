/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package FLR.controller;

import FLR.model.Account;
import FLR.model.controller.AccountJpaController;
import java.io.IOException;
import java.io.PrintWriter;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
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
 * @author Dell
 */
public class LoginServlet extends HttpServlet {

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
        HttpSession session = request.getSession();
        String username = request.getParameter("username");
        String password = request.getParameter("password");
        
//        String url = null;
//        if (request.getHeader("Referer") != "http://localhost:8080/FarmLungRun/Login" ) {
//           url = request.getHeader("Referer"); 
//           System.out.println(">>"+url);
//        }
        
        
        if (session.getAttribute("account") != null){
            session.setAttribute("message", "");
            response.sendRedirect("Home");
            return;
        } else {
            if (username == null || password == null) {
                session.setAttribute("message", "");
                getServletContext().getRequestDispatcher("/Login.jsp").forward(request, response);
            } else {
                AccountJpaController accountCtrl = new AccountJpaController(utx, emf);
                Account account = accountCtrl.findAccount(username);
                if (account != null) {
                    if (cryptWithMD5(password).equals(account.getEncryptedpassword())){
                        
                        session.setAttribute("message", "");
                        session.setAttribute("account", account);
                        //session.setMaxInactiveInterval(60*60); //เพิ่ม session timeout
                        response.sendRedirect("Home");
                        //response.sendRedirect(url);
                        return;
                    } else {
                        session.setAttribute("message", "invalid password");
                    getServletContext().getRequestDispatcher("/Login.jsp").forward(request, response);
                    } 
                } else {
                    session.setAttribute("message", "invalid username");
                    getServletContext().getRequestDispatcher("/Login.jsp").forward(request, response);
                }
            }
        }
    }

    public static String cryptWithMD5(String pass) {
        try {
            MessageDigest md = MessageDigest.getInstance("MD5");
            byte[] passBytes = pass.getBytes();
            md.reset();
            byte[] digested = md.digest(passBytes);
            StringBuffer sb = new StringBuffer();
            for (int i = 0; i < digested.length; i++) {
                sb.append(Integer.toHexString(0xff & digested[i]));
            }
            return sb.toString();
        } catch (NoSuchAlgorithmException ex) {
            System.out.println(ex);
        }
        return null;
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
