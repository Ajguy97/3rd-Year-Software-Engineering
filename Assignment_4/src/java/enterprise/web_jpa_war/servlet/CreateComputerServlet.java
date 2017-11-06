/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package enterprise.web_jpa_war.servlet;

import enterprise.web_jpa_war.entity.ComputerFacade;
import enterprise.web_jpa_war.entity.Computer;
import java.io.IOException;
import java.io.PrintWriter;
import javax.ejb.EJB;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Andre Godinez
 */
@WebServlet(name = "CreateComputerServlet", urlPatterns = {"/CreateComputer"})
public class CreateComputerServlet extends HttpServlet {
   @EJB
    private ComputerFacade computerFacade;
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
        
        
        String cpu = request.getParameter("cpu");
        String motherboard = request.getParameter("motherboard");
        String memory = request.getParameter("memory");
        String storage= request.getParameter("storage");
        String gpu = request.getParameter("gpu");
        String pccase = request.getParameter("pccase");
        String psu = request.getParameter("psu");
   
        Computer newComp = new Computer();
       
        newComp.setCpu(cpu);
        newComp.setGpu(gpu);
        newComp.setMemory(memory);
        newComp.setMotherboard(motherboard);
        newComp.setPccase(pccase);
        newComp.setPsu(psu);
        newComp.setStorage(storage);
        
       computerFacade.create(newComp);
        
        request.getRequestDispatcher("ListComputer").forward(request, response);
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
