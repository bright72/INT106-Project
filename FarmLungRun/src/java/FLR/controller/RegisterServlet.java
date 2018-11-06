/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package FLR.controller;

import FLR.model.Account;
import FLR.model.controller.AccountJpaController;
import FLR.model.controller.exceptions.RollbackFailureException;
import java.io.IOException;
import java.io.PrintWriter;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.List;
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
import org.hibernate.validator.constraints.URL;

/**
 *
 * @author SARUNSUMETPANICH
 */
public class RegisterServlet extends HttpServlet {

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
        HttpSession session = request.getSession(false);
        if (session.getAttribute("account") == null) {
            String username = request.getParameter("username");

            AccountJpaController ajc = new AccountJpaController(utx, emf);
            if (ajc.findAccount(username).getUsername() != null) {
                request.getSession().setAttribute("message", "Username already exists!");
                System.out.println("HI");
                getServletContext().getRequestDispatcher("/Register.jsp").forward(request, response);
            } else {
                String password = request.getParameter("password");
//                String fname = request.getParameter("fname");
                
                
                Account account = new Account(username);
                account.setEncryptedpassword(cryptWithMD5(password));
                account.setFname(request.getParameter("fname"));
                account.setLname(request.getParameter("lname"));
                account.setAddress(request.getParameter("address"));
                account.setProvince(request.getParameter("province"));
                account.setCountry(request.getParameter("country"));
                account.setPostalcode(request.getParameter("postalcode"));
                
                try {
                    ajc.create(account);
                } catch (RollbackFailureException ex) {
                    System.out.println(ex);
                } catch (Exception ex) {
                    System.out.println(ex);
                }
                request.getSession().setAttribute("message", "Register Successful!");
                getServletContext().getRequestDispatcher("/Login").forward(request, response);
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
