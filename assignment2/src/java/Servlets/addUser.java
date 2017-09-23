/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servlets;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 *
 * @author forCSGOcozcantalttab
 */
@WebServlet(name = "addUser", urlPatterns = {"/addUser"})
public class addUser extends HttpServlet {

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
//        creating a session object to retrieve and set data
        HttpSession session = request.getSession(); 
        
//        this is the parameter that is retrieved from the form
        String email = (String)request.getParameter("Email");
        
//        if email is null -> email to be added not valid -> return to adduser.html
        if(email == null){
         RequestDispatcher rd = request.getRequestDispatcher("addUser.html");
         rd.forward(request, response);
//         else if its not null but emailList is null -> emailList not made yet so create a new one
//         and add the email parameter to the list
//         then set the list as an object to the session object
//         then redirect to display list page
        }else{
                if(session.getAttribute("emailList") == null){
                List<String> emailList = new ArrayList<String>();
                emailList.add(email);
                
                session.setAttribute("emailList", emailList);
                RequestDispatcher rd = request.getRequestDispatcher("displayList.jsp");
                rd.forward(request, response);
            }
                //of list already exists then just add the email to the list
                //then set list to the session object
                //and redirect to the displaylist
                else{
                List<String> emailList = (List<String>)session.getAttribute("emailList");
                emailList.add(email);
             
                session.setAttribute("emailList", emailList);
                RequestDispatcher rd = request.getRequestDispatcher("displayList.jsp");
                rd.forward(request, response);
            }
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
