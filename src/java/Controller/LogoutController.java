/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controller;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;
import java.io.IOException;
import java.io.PrintWriter;

/**
 *
 * @author anhha
 */
public class LogoutController extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.setContentType("text/html;charset=UTF-8");

    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        try ( PrintWriter out = resp.getWriter()) {
            //Returns the valid session object associated with the request
            HttpSession session = req.getSession();
            //Removes the object bound with the specified name from this session
            session.removeAttribute("userlogged");
            session.removeAttribute("acc" );
            //Invalidates this session then unbinds any objects bound to it.
            session.invalidate();
            //Redirect to home page
            resp.sendRedirect("./home");
        }
    }

}
