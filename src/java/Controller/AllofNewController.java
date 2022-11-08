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
public class AllofNewController extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        News nes = new News();
        String title = req.getParameter("title");
        String category = req.getParameter("category");
        ArrayList<News> listNew = nes.getNews(title);
//        ArrayList<News> listNews = nes.getCategory(category);
        req.setAttribute("list", listNew);

        req.getRequestDispatcher("cateory.jsp").forward(req, resp);
    }
}
