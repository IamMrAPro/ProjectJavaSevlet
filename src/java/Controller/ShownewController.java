/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controller;

import Model.Comment;
import Model.News;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

/**
 *
 * @author anhha
 */
public class ShownewController extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        News nes = new News();
        Comment cmt = new Comment();
        HttpSession session = req.getSession();

        String ab = (String) session.getAttribute("acco");

        String title = req.getParameter("title");
        String id = nes.getid(title);

//         ArrayList<Comment> listCmt = cmt.getAllcmta(id);
        ArrayList<String> name = cmt.getuser(id);
        System.out.println("name:" + name);

        
        List<String> list = name.stream()
                .distinct()
                .collect(Collectors.toList());
       
        System.out.println("name:" + list);
        String nameeeee = null;
        for(String as : list){
            nameeeee =as;
        }
        
        String a = cmt.getUsercmt(id);
        req.setAttribute("a", a);
        String category = req.getParameter("category");

         Map<String, ArrayList> listanem = new HashMap<>();
         
         for(String as : list){
            ArrayList<Comment> listCmt = cmt.getAllcmt(id, as);
            listanem.put(as, listCmt);
        }
         req.setAttribute("listanem", listanem);
         
        ArrayList<News> listNew = nes.getNews(title);

        req.setAttribute("list", listNew);

        req.getRequestDispatcher("News.jsp").forward(req, resp);
    }
}
