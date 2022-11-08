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
import jakarta.servlet.http.HttpSession;
import java.io.IOException;

/**
 *
 * @author anhha
 */
public class UpdateProfile extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        super.doPost(req, resp); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String update = req.getParameter("up");
        if (update.equalsIgnoreCase("Update Password")) {
            HttpSession session = req.getSession();
            session.setAttribute("update", update);
            resp.sendRedirect("profile");
        }else if (update.equalsIgnoreCase("Delete Account")) {
            HttpSession session = req.getSession();
            session.setAttribute("delete", "delete");
            resp.sendRedirect("profile");
        }

    }

}
