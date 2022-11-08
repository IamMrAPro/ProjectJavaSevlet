/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

import Context.DBContext;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;

/**
 *
 * @author anhha
 */
public class News extends DBContext {

    private String newid;
    private String date, categoria, title, urlImage, content, author, sumary;
    private String accept;
    
    public String getAccept() {
        return accept;
    }

    public void setAccept(String accept) {
        this.accept = accept;
    }

    public String getSumary() {
        return sumary;
    }

    public void setSumary(String sumary) {
        this.sumary = sumary;
    }

    public String getNewid() {
        return newid;
    }

    public void setNewid(String newid) {
        this.newid = newid;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getUrlImage() {
        return urlImage;
    }

    public void setUrlImage(String urlImage) {
        this.urlImage = urlImage;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public News() {
        connectDB();
    }

    public News(String newid, String date, String categoria, String title, String urlImage, String content, String author, String sumary, String accept) {
        this.newid = newid;
        this.date = date;
        this.categoria = categoria;
        this.title = title;
        this.urlImage = urlImage;
        this.content = content;
        this.author = author;
        this.sumary = sumary;
        this.accept = accept;
        connectDB();
    }
    
    public News(String date, String categoria, String title, String urlImage, String content, String author, String sumary) {
        this.date = date;
        this.categoria = categoria;
        this.title = title;
        this.urlImage = urlImage;
        this.content = content;
        this.author = author;
        this.sumary = sumary;
        connectDB();
    }

    public News(String newid, String date, String categoria, String title, String urlImage, String content, String author, String sumary) {
        this.newid = newid;
        this.date = date;
        this.categoria = categoria;
        this.title = title;
        this.urlImage = urlImage;
        this.content = content;
        this.author = author;
        this.sumary = sumary;
        connectDB();
    }
    Connection cnn;//ket noi DB

    Statement stm;//Thuc hien cau lenh SQL

    ResultSet rs;//Luu tru va xu ly du lieu

    PreparedStatement pstm;

    private void connectDB() {
        try {
            cnn = super.connection;
            System.out.println("Connect success");
        } catch (Exception e) {
            System.out.println("ConnectError" + e.getMessage());
        }
    }

    public void addNew(String id, String date, String categoria, String title, String urlImage, String content, String author, String sumary) {
        try {
            String strSelect = "insert into News([NewId],[TimePost],[CategoryId],[Title],[urlImage],[Content],[UserName],[Sumary],[AcceptId]) "
                    + "values(?,?,?,?,?,?,?,?,?)";
            pstm = cnn.prepareStatement(strSelect);
            pstm.setString(1, id);
            pstm.setString(2, date);
            pstm.setString(3, categoria);
            pstm.setString(4, title);
            pstm.setString(5, urlImage);
            pstm.setString(6, content);
            pstm.setString(7, author);
            pstm.setString(8, sumary);
            pstm.setString(9, "0");
            pstm.execute();

        } catch (Exception e) {
            System.out.println("Add error:" + e.getMessage());
        }
    }

    public ArrayList<News> getAllNew() {
        ArrayList<News> list = new ArrayList<News>();
        try {
            String strSelect = "select [Title] ,[Sumary],[urlImage],[TimePost],[Content],[CategoryId],[UserName],[NewId] from News where  [AcceptId]=1";
            pstm = cnn.prepareStatement(strSelect);
            rs = pstm.executeQuery();
            while (rs.next()) {
                String title = rs.getString(1);
                String sumary = rs.getString(2);
                String urlImage = rs.getString(3);
                String TimePost = rs.getString(4);
                String Content = rs.getString(5);
                String CategoryId = rs.getString(6);
                String UserName = rs.getString(7);
                String newid = rs.getString(8);
                String categoria = null ;
                if(CategoryId.equalsIgnoreCase("1")){
                    categoria="Features";
                }else if(CategoryId.equalsIgnoreCase("2")){
                    categoria="LifeStyle";
                }else if(CategoryId.equalsIgnoreCase("3")){
                    categoria="Food";
                }else if(CategoryId.equalsIgnoreCase("4")){
                    categoria="Travel";
                }else if(CategoryId.equalsIgnoreCase("5")){
                    categoria="Spost";
                }
                News p = new News(newid,TimePost, categoria, title, urlImage, Content, UserName, sumary);
                list.add(p);
            }
        } catch (Exception e) {
            System.err.println("Get all error" + e.getMessage());
        }
        return list;
    }
    public ArrayList<News> getNewAuthor() {
        ArrayList<News> list = new ArrayList<News>();
        try {
            String strSelect = "select [Title] ,[Sumary],[urlImage],[TimePost],[Content],[CategoryId],[UserName],[NewId] from News ";
            pstm = cnn.prepareStatement(strSelect);
            rs = pstm.executeQuery();
            while (rs.next()) {
                String title = rs.getString(1);
                String sumary = rs.getString(2);
                String urlImage = rs.getString(3);
                String TimePost = rs.getString(4);
                String Content = rs.getString(5);
                String CategoryId = rs.getString(6);
                String UserName = rs.getString(7);
                String newid = rs.getString(8);
                String categoria = null ;
                if(CategoryId.equalsIgnoreCase("1")){
                    categoria="Features";
                }else if(CategoryId.equalsIgnoreCase("2")){
                    categoria="LifeStyle";
                }else if(CategoryId.equalsIgnoreCase("3")){
                    categoria="Food";
                }else if(CategoryId.equalsIgnoreCase("4")){
                    categoria="Travel";
                }else if(CategoryId.equalsIgnoreCase("5")){
                    categoria="Spost";
                }
                News p = new News(newid,TimePost, categoria, title, urlImage, Content, UserName, sumary);
                list.add(p);
            }
        } catch (Exception e) {
            System.err.println("Get all error" + e.getMessage());
        }
        return list;
    }
    
    public ArrayList<News> getAllNews() {
        ArrayList<News> list = new ArrayList<News>();
        try {
            String strSelect = "select [Title] ,[Sumary],[urlImage],[TimePost],[Content],[CategoryId],[UserName] from News where [AcceptId] = 0 ";
            pstm = cnn.prepareStatement(strSelect);
            rs = pstm.executeQuery();
            while (rs.next()) {
                String title = rs.getString(1);
                String sumary = rs.getString(2);
                String urlImage = rs.getString(3);
                String TimePost = rs.getString(4);
                String Content = rs.getString(5);
                String CategoryId = rs.getString(6);
                String UserName = rs.getString(7);
                String categoria = null ;
                if(CategoryId.equalsIgnoreCase("1")){
                    categoria="Features";
                }else if(CategoryId.equalsIgnoreCase("2")){
                    categoria="LifeStyle";
                }else if(CategoryId.equalsIgnoreCase("3")){
                    categoria="Food";
                }else if(CategoryId.equalsIgnoreCase("4")){
                    categoria="Travel";
                }else if(CategoryId.equalsIgnoreCase("5")){
                    categoria="Spost";
                }
                News p = new News(TimePost, categoria, title, urlImage, Content, UserName, sumary);
                list.add(p);
            }
        } catch (Exception e) {
            System.err.println("Get all error" + e.getMessage());
        }
        return list;
    }
    public ArrayList<News> getCreateNews(String titlee) {
        ArrayList<News> list = new ArrayList<News>();
        try {
            String strSelect = "select  [Sumary],[urlImage],[TimePost],[Content],[CategoryId],[UserName] from News where [Title] = ";
            pstm = cnn.prepareStatement(strSelect);
            pstm.setString(1, titlee);
            rs = pstm.executeQuery();
            while (rs.next()) {
                String title = rs.getString(1);
                String sumary = rs.getString(2);
                String urlImage = rs.getString(3);
                String TimePost = rs.getString(4);
                String Content = rs.getString(5);
                String CategoryId = rs.getString(6);
                String UserName = rs.getString(7);
                String categoria = null ;
                if(CategoryId.equalsIgnoreCase("1")){
                    categoria="Features";
                }else if(CategoryId.equalsIgnoreCase("2")){
                    categoria="LifeStyle";
                }else if(CategoryId.equalsIgnoreCase("3")){
                    categoria="Food";
                }else if(CategoryId.equalsIgnoreCase("4")){
                    categoria="Travel";
                }else if(CategoryId.equalsIgnoreCase("5")){
                    categoria="Spost";
                }
                News p = new News(TimePost, categoria, title, urlImage, Content, UserName, sumary);
                list.add(p);
            }
        } catch (Exception e) {
            System.err.println("Get all error" + e.getMessage());
        }
        return list;
    }
    public ArrayList<News> getyourNews(String user) {
        ArrayList<News> list = new ArrayList<News>();
        try {
            String strSelect = "select [Title] ,[Sumary],[urlImage],[TimePost],[Content],[CategoryId],[UserName] from News where [UserName] = ? ";
            pstm = cnn.prepareStatement(strSelect);
            pstm.setString(1, user);
            rs = pstm.executeQuery();
            while (rs.next()) {
                String title = rs.getString(1);
                String sumary = rs.getString(2);
                String urlImage = rs.getString(3);
                String TimePost = rs.getString(4);
                String Content = rs.getString(5);
                String CategoryId = rs.getString(6);
                String UserName = rs.getString(7);
                String categoria = null ;
                if(CategoryId.equalsIgnoreCase("1")){
                    categoria="Features";
                }else if(CategoryId.equalsIgnoreCase("2")){
                    categoria="LifeStyle";
                }else if(CategoryId.equalsIgnoreCase("3")){
                    categoria="Food";
                }else if(CategoryId.equalsIgnoreCase("4")){
                    categoria="Travel";
                }else if(CategoryId.equalsIgnoreCase("5")){
                    categoria="Spost";
                }
                News p = new News(TimePost, categoria, title, urlImage, Content, UserName, sumary);
                list.add(p);
            }
        } catch (Exception e) {
            System.err.println("Get all error" + e.getMessage());
        }
        return list;
    }
    public String getid(String detail) {
        String id ="";
        try {
            String strSelect = "select [NewId] from News where [Title] = ? ";
            pstm = cnn.prepareStatement(strSelect);
            pstm.setString(1, detail);
            rs = pstm.executeQuery();
            while (rs.next()) {
                id = rs.getString(1);
                
                
            }
        } catch (Exception e) {
            System.err.println("Get all error" + e.getMessage());
        }
        return id;
    }
    public ArrayList<News> getCategory(String category){
        ArrayList<News> list = new ArrayList<News>();
         try {
            String strSelect = "select [Title] ,[Sumary],[urlImage],[TimePost],[Content],[CategoryId],[UserName] from News where [CategoryId]=? and [AcceptId]=1";
            pstm = cnn.prepareStatement(strSelect);
            pstm.setString(1, category);
            rs = pstm.executeQuery();
            while (rs.next()) {
                String title = rs.getString(1);
                String sumary = rs.getString(2);
                String urlImage = rs.getString(3);
                String TimePost = rs.getString(4);
                String Content = rs.getString(5);
                String CategoryId = rs.getString(6);
                String UserName = rs.getString(7);
                News p = new News(TimePost, CategoryId, title, urlImage, Content, UserName, sumary);
                list.add(p);
            }
        } catch (Exception e) {
            System.err.println("Get category error" + e.getMessage());
        }
         return list;
    }
     public ArrayList<News> search(String key){
          ArrayList<News> list = new ArrayList<News>();
         try {
            String strSelect = "select [Title] ,[Sumary],[urlImage],[TimePost],[Content],[CategoryId],[UserName] from News where [Title] LIKE CONCAT('%', ?, '%')";
            pstm = cnn.prepareStatement(strSelect);
            pstm.setString(1,key);
            rs = pstm.executeQuery();
            while (rs.next()) {
                String title = rs.getString(1);
                String sumary = rs.getString(2);
                String urlImage = rs.getString(3);
                String TimePost = rs.getString(4);
                String Content = rs.getString(5);
                String CategoryId = rs.getString(6);
                String UserName = rs.getString(7);
                News p = new News(TimePost, CategoryId, title, urlImage, Content, UserName, sumary);
                list.add(p);
            }
        } catch (Exception e) {
            System.err.println("Get category error" + e.getMessage());
        }
         return list;
    }
     public ArrayList<News> getNews(String title) {
        ArrayList<News> list = new ArrayList<News>();
        try {
            String strSelect = "select [Title] ,[Sumary],[urlImage],[TimePost],[Content],[CategoryId],[UserName],[NewId] from News where [Title] = ? ";
            pstm = cnn.prepareStatement(strSelect);
            pstm.setString(1, title);
            rs = pstm.executeQuery();
            while (rs.next()) {
                String titlee = rs.getString(1);
                String sumary = rs.getString(2);
                String urlImage = rs.getString(3);
                String TimePost = rs.getString(4);
                String Content = rs.getString(5);
                String CategoryId = rs.getString(6);
                String UserName = rs.getString(7);
                String newid = rs.getString(8);
                String categoria = null ;
                if(CategoryId.equalsIgnoreCase("1")){
                    categoria="Features";
                }else if(CategoryId.equalsIgnoreCase("2")){
                    categoria="LifeStyle";
                }else if(CategoryId.equalsIgnoreCase("3")){
                    categoria="Food";
                }else if(CategoryId.equalsIgnoreCase("4")){
                    categoria="Travel";
                }else if(CategoryId.equalsIgnoreCase("5")){
                    categoria="Spost";
                }
                News p = new News(newid,TimePost, categoria, titlee, urlImage, Content, UserName, sumary);
                list.add(p);
            }
        } catch (Exception e) {
            System.err.println("Get all error" + e.getMessage());
        }
        return list;
    }
     public void accept(String title) {
        try {
            String strSelect = "update News "
                    + "set [AcceptId]=1 "
                    + "where[Title] = ? ";
            pstm = cnn.prepareStatement(strSelect);
            pstm.setString(1, title);
            


            pstm.execute();

        } catch (Exception e) {
            System.out.println("Update news error:" + e.getMessage());
        }

    }
     public void tranfAuthor(String author,String title) {
        try {
            String strSelect = "update News "
                    + "set [UserName]=? "
                    + "where[Title] = ? ";
            pstm = cnn.prepareStatement(strSelect);
            pstm.setString(1, author);
            pstm.setString(2, title);


            pstm.execute();

        } catch (Exception e) {
            System.out.println("Update news error:" + e.getMessage());
        }

    }
     public void Unaccept(String title) {
        try {
            String strSelect = "update News "
                    + "set [AcceptId]=0 "
                    + "where[Title] = ? ";
            pstm = cnn.prepareStatement(strSelect);
            pstm.setString(1, title);
            


            pstm.execute();

        } catch (Exception e) {
            System.out.println("Update news error:" + e.getMessage());
        }
        

    }
     public void deleteNews(String id) {
        try {
            String strSelect = "delete from News "                   
                    +"where [Title] = ?";
            pstm = cnn.prepareStatement(strSelect);
            pstm.setString(1, id);
            pstm.executeUpdate();
            
        } catch (Exception e) {
            System.out.println("Delete error:" + e.getMessage());
        }
    }
     }


