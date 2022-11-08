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
public class DetailController extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String username = req.getParameter("username");
        String firstname = req.getParameter("firstname");
        String middlename = req.getParameter("middlename");
        String lastname = req.getParameter("lastname");
        String phone = req.getParameter("phone");
        String email = req.getParameter("email");
        java.util.Date date = new java.util.Date();
        String password = req.getParameter("password");
        String password_confirmation = req.getParameter("password_confirmation");
        String gender = req.getParameter("gender");
        int RoleId = 2;
        Account u = new Account();

        int a = 0;
        if (gender == "gender1") {
            a = 0;
        } else if (gender == "gender0") {
            a = 1;
        }

        if (username == null || firstname == null || middlename == null || lastname == null || phone == null || email == null || password == null || password_confirmation == null) {

            req.setAttribute("username", u.getName());
            req.setAttribute("password", u.getPass());
            req.setAttribute("firstname", u.getFirstName());
            req.setAttribute("middlename", u.getMidleName());
            req.setAttribute("lastname", u.getLastName());

            req.setAttribute("email", u.getEmail());
            req.setAttribute("phone", u.getPhone());
            req.setAttribute("password_confirmation", password_confirmation);

            req.setAttribute("ms2", "No blank");
            req.getRequestDispatcher("SignUp.jsp").forward(req, resp);
        }
        
        Account acc = new Account(username, password);
        Boolean oke = acc.checklogin();
        

            System.out.println("oke babe");
            u.insertInfor(username, firstname, middlename, lastname, phone, email, a, String.valueOf(date));

            u.insertAccount(username, username, password, RoleId);
            req.getRequestDispatcher("login").forward(req, resp);
        
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        super.doGet(req, resp); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
    }

}
