/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controllers;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author user
 */
@WebServlet(name = "showproducts", urlPatterns = {"/showproducts"})
public class showproducts extends HttpServlet {
@Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {    
        RequestDispatcher view = request.getRequestDispatcher("showproducts.jsp");
        view.forward(request, response);        
    }

    //protected void doPost(HttpServletReq  uest request, HttpServletResponse response)
      //      throws ServletException, IOException {
       // processRequest(request, response);
    }
//}
