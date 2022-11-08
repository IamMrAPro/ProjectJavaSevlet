/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controller;

import Model.Account;
import Model.Comment;
import Model.News;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;
import java.io.IOException;
import java.util.ArrayList;

/**
 *
 * @author anhha
 */
public class CommentController extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        super.doPost(req, resp); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        HttpSession session = req.getSession();
        String id = req.getParameter("id");
        System.out.println(id);
        String a = (String) session.getAttribute("acco");
        java.util.Date date=new java.util.Date(); 
        String cment = req.getParameter("cmt");
        String title = req.getParameter("title");
        //titlenews
        
//        ArrayList<News> listNews = nes.getCategory(category);
        
        Comment cmt = new Comment();
        
        cmt.addComent(a+String.valueOf(date), cment, String.valueOf(date), a,id);
//        req.setAttribute("listcategory", listNew);
       
//        req.getRequestDispatcher("News.jsp").forward(req, resp);
        resp.sendRedirect("show?title="+title);
        
    }

}
