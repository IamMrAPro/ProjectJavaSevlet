/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controller.Admin;

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
public class Acceptnew extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String update = req.getParameter("accpept");

        News nes = new News();
        if (update.equalsIgnoreCase("Accept")) {
//            HttpSession session = req.getSession();UnAccept
//            session.setAttribute("update", update);
//            resp.sendRedirect("accept");
            String title = req.getParameter("title");
            System.out.println(title);
            nes.accept(title);
            title = null;
            resp.sendRedirect("admin");
        } else if (update.equalsIgnoreCase("Delete")) {
            HttpSession session = req.getSession();

            String title = req.getParameter("titles");
            nes.deleteNews(title);

            resp.sendRedirect("admin");
        } else if (update.equalsIgnoreCase("UnAccept")) {
            String title = req.getParameter("titles");
            System.out.println(title);
            nes.Unaccept(title);

            resp.sendRedirect("admin");
        }else if (update.equalsIgnoreCase("Delete this news")) {
            String title = req.getParameter("titles");
            System.out.println(title);
            nes.deleteNews(title);

            resp.sendRedirect("admin");
        }
    }

}
