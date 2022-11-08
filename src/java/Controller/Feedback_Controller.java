/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controller;

import Model.FeedBack;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;
import java.io.IOException;

/**
 *
 * @author anhha
 */
public class Feedback_Controller extends HttpServlet{

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
       resp.setCharacterEncoding("UTF-8");
       HttpSession session = req.getSession();
       String email = req.getParameter("email");
       String comment = req.getParameter("feedback");
        System.out.println(email + " " + comment);
       java.util.Date date=new java.util.Date(); 
      FeedBack f = new FeedBack(0,email, comment,String.valueOf(date));
      f.insertFeedback(email, comment,String.valueOf(date));
       
       String buton = req.getParameter("button");
       session.setAttribute("button", buton);
       resp.sendRedirect("home");
//       req.getRequestDispatcher("index.html").forward(req, resp);
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        super.doGet(req, resp); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
    }
    
    
}
