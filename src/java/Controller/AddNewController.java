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
import jakarta.servlet.http.HttpSession;
import java.io.IOException;

/**
 *
 * @author anhha
 */
public class AddNewController extends HttpServlet{

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
    }   

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String Categoria = req.getParameter("op");
        String message = req.getParameter("message");
        String image = req.getParameter("image");
        String content = req.getParameter("content");
        
        String sumary = req.getParameter("sumary");
        HttpSession session = req.getSession();
        String accname = (String) session.getAttribute("acco");
        java.util.Date date=new java.util.Date(); 
        int a =0;
        if(Categoria.equalsIgnoreCase("Features")){
            a= 1;
        }else if(Categoria.equalsIgnoreCase("LifeStyle")){
            a=2;
        }else if(Categoria.equalsIgnoreCase("Food")){
            a=3;
        }else if(Categoria.equalsIgnoreCase("Travel")){
            a=4;
        }else if(Categoria.equalsIgnoreCase("Spost")){
            a=5;
        }
        System.out.println("okekekekkek");
        News p = new News(accname+String.valueOf(date),String.valueOf(date),String.valueOf(a), message, image, content, accname,sumary);
        p.addNew(accname+String.valueOf(date),String.valueOf(date), String.valueOf(a), message, image, content, accname,sumary);
        req.getRequestDispatcher("Post_news.jsp").forward(req, resp);
 //resp.sendRedirect("upnews");
    
    }
    
    
} 
    

