/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Model.Bookclass;
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
import static sun.swing.SwingUtilities2.submit;

/**
 *
 * @author Susmit
 */
@WebServlet(name = "Literature", urlPatterns = {"/Literature"})
public class Literature extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    public void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException, SQLException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            String bookid=request.getParameter("BOOKID");
            String bookname=request.getParameter("BOOKNAME");
            String qty=request.getParameter("QTY");
            String price=request.getParameter("PRICE");
            String genre=request.getParameter("GENRE");
            String author=request.getParameter("AUTHOR");
            
            try {
                Class.forName("oracle.jdbc.OracleDriver");
            } catch (ClassNotFoundException ex) {
                Logger.getLogger(Insert.class.getName()).log(Level.SEVERE, null, ex);
            }
            Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE","hr","hr");
            PreparedStatement pst=con.prepareStatement("select BOOKNAME, AUTHOR, GENRE, PRICE from HR.BOOK where GENRE='literture'");
            
            ResultSet rs=pst.executeQuery();
            
            while(rs.next())
            {
                String a=rs.getString(1);
                String b=rs.getString(2);
                String c=rs.getString(3);
                String d=rs.getString(4);
                
                out.println("<table>");
                out.print("<tr>");
                     out.print("<td>"+"Book Name"+"</td>");
                        out.print("<td>"+a+"</td></tr>");
                        out.print("<tr><td>"+"Author"+"</td>");
                        out.print("<td>"+b+"</td></tr>");
                        out.print("<tr><td>"+"GENRE"+"</td>");
                        out.print("<td>"+c+"</td></tr>");
                        out.print("<tr><td>"+"PRICE"+"</td>");
                        out.print("<td>"+d+"</td></tr>"); 
                        out.println("<td><a href='buynow.jsp'>" + "Buynow" + "</td></tr>");
            }
            
            out.print("</table>");
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
            Logger.getLogger(featured.class.getName()).log(Level.SEVERE, null, ex);
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
            Logger.getLogger(featured.class.getName()).log(Level.SEVERE, null, ex);
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
