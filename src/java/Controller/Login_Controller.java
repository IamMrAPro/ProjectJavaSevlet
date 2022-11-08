/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controller;

import Model.Account;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.ArrayList;
import org.apache.tomcat.jni.SSLContext;
import java.io.*;
import jakarta.servlet.*;
import jakarta.servlet.http.*;

/**
 *
 * @author anhha
 */
public class Login_Controller extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.setCharacterEncoding("UTF-8");
        String username = req.getParameter("username");
        String password = req.getParameter("password");
        Account acc = new Account(username, password);
        Boolean oke = acc.checklogin();
        Boolean oker = acc.checkAdmin();
        if (oke) {
            if (oker) {
                HttpSession session = req.getSession();
                session.setAttribute("acc", oke);
                session.setAttribute("acco", username);
                session.setAttribute("password", password);

                resp.sendRedirect("admin");
            } else {
                HttpSession session = req.getSession();
                session.setAttribute("acc", oke);
                session.setAttribute("acco", username);
                session.setAttribute("password", password);

                resp.sendRedirect("home");
            }

        } else {
            req.setAttribute("ms1", "Wrong user or pass");
            req.getRequestDispatcher("Login.jsp").forward(req, resp);
        }
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

    }
}
