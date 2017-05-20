/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import javax.mail.*;
import javax.mail.internet.*;
import javax.activation.*;  
import java.util.*;

/**
 *
 * @author Susmit
 */
@WebServlet(name = "Buynow", urlPatterns = {"/Buynow"})
public class Buynow extends HttpServlet {

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
            throws ServletException, IOException, SQLException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            String email=request.getParameter("EMAIL");
            String password=request.getParameter("PASSWORD");
            String confirm=request.getParameter("CONFIRM");
            String ph=request.getParameter("PH");
            String firstname=request.getParameter("FIRSTNAME");
            String lastname=request.getParameter("LASTNAME");
            String city=request.getParameter("CITY");
            
            HttpSession session = request.getSession(false);
            if (session == null) {
    
            request.getRequestDispatcher("Login.jsp").forward(request, response);
            } else {
            try {
                Class.forName("oracle.jdbc.OracleDriver");
            } catch (ClassNotFoundException ex) {
                Logger.getLogger(Insert.class.getName()).log(Level.SEVERE, null, ex);
            }
            Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE","hr","hr");
            PreparedStatement pst=con.prepareStatement("select EMAIL, FIRSTNAME, LASTNAME from HR.CUSTOMER");
            PreparedStatement pst1=con.prepareStatement("select BOOKID, BOOKNAME, PRICE from HR.BOOK");
            ResultSet rs=pst.executeQuery();
            ResultSet rs1=pst1.executeQuery();
            while(rs.next())
            {
                String a=rs.getString(1);
                String to = "a"; 
            String from = "sonoojaiswal1987@gmail.com";
            String host = "localhost"; 
            Properties properties = System.getProperties();  
            properties.setProperty("mail.smtp.host", host);  
            Session.getDefaultInstance(properties);  
  
     //compose the message  
      try{  
         MimeMessage message = new MimeMessage((MimeMessage) session);  
         message.setFrom(new InternetAddress(from));  
         message.addRecipient(Message.RecipientType.TO,new InternetAddress(to));  
         message.setSubject("Ping");  
         message.setText("Hello, you purchased succesfully  ");  
  
         // Send message  
         Transport.send(message);  
         System.out.println("message sent successfully....");  
  
      }catch (MessagingException mex) {mex.printStackTrace();}
            }
            
  
     //Get the session object  
        
            
            
}
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
        try {
            processRequest(request, response);
        } catch (SQLException ex) {
            Logger.getLogger(Buynow.class.getName()).log(Level.SEVERE, null, ex);
        }
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
        try {
            processRequest(request, response);
        } catch (SQLException ex) {
            Logger.getLogger(Buynow.class.getName()).log(Level.SEVERE, null, ex);
        }
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
