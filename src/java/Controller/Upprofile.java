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
import java.util.ArrayList;

/**
 *
 * @author anhha
 */
public class Upprofile extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        super.doPost(req, resp); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        HttpSession session = req.getSession();
        Account acc = new Account();
        String a = (String) session.getAttribute("acco");
        String b = (String) session.getAttribute("password");
        
        String pass = acc.getPassworda(a);
        

        String oldpass = req.getParameter("oldpass");
        String newpass = req.getParameter("newpass");
        String cfpass = req.getParameter("cfpass");

        if (oldpass == null || newpass == null || cfpass == null) {
            session.setAttribute("update", null);
            session.setAttribute("ms1", "Empty PassWord box");
            session.setAttribute("update", null);
            resp.sendRedirect("profile");

        } else if (!oldpass.equalsIgnoreCase(pass) || !newpass.equalsIgnoreCase(cfpass)) {

            session.setAttribute("update", null);
            session.setAttribute("ms1", "Yourng Password");

            resp.sendRedirect("profile");

        } else {

            if (acc.checkNP(a, pass)) {
                acc.updateAccount(a, newpass);

                resp.sendRedirect("logout");
            } else {
                session.setAttribute("update", null);
                session.setAttribute("ms1", "Can t not update");

                resp.sendRedirect("profile");
            }
        }

    }

}
