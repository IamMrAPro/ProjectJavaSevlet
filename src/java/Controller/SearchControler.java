/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controller;

import Model.News;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.ArrayList;

/**
 *
 * @author anhha
 */
public class SearchControler extends HttpServlet{

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        super.doPost(req, resp); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String search = req.getParameter("search");
        if(search==null){
            req.getRequestDispatcher("Home.jsp").forward(req, resp);
        }else{
            
        News nes = new News();
        ArrayList<News> listNew = nes.search(search);
        if(listNew.isEmpty()){
            String a = "Don't can search";
             req.setAttribute("a", a);
             req.getRequestDispatcher("category.jsp").forward(req, resp);
        }else{
        req.setAttribute("listcategory", listNew);
        req.getRequestDispatcher("category.jsp").forward(req, resp);
        }
        }
    }
    
    
}
