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
public class DeleteAccountController extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        super.doPost(req, resp); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        HttpSession session = req.getSession();
        //deletePass
        String pass = req.getParameter("deletePass");
        Account acc = new Account();
        String a = (String) session.getAttribute("acco");
        if (acc.checkNP(a, pass)) {
            acc.deleteAccount(a);
            resp.sendRedirect("logout");
        } else {
            session.setAttribute("delete", null);
            session.setAttribute("update", null);
            session.setAttribute("ms1", "Can t not delete");

            resp.sendRedirect("profile");
        }

    }

}
