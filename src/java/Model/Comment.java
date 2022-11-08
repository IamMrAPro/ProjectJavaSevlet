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
public class Comment extends DBContext {

    private String cmtID, cmt, time, username,newid;

    public String getNewid() {
        return newid;
    }

    public void setNewid(String newid) {
        this.newid = newid;
    }

    public String getCmtID() {
        return cmtID;
    }

    public void setCmtID(String cmtID) {
        this.cmtID = cmtID;
    }

    public String getCmt() {
        return cmt;
    }

    public void setCmt(String cmt) {
        this.cmt = cmt;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
        connectDB();
    }

    public Comment() {
        connectDB();
    }

    public Comment(String cmt, String time) {
        this.cmt = cmt;
        this.time = time;
        connectDB();
    }

    public Comment(String username) {
        this.username = username;
        connectDB();
    }

    public Comment(String cmtID, String cmt, String time, String username,String newid) {
        this.newid=newid;
        this.cmtID = cmtID;
        this.cmt = cmt;
        this.time = time;
        this.username = username;
        connectDB();
    }
    public Comment( String cmt, String time, String username) {
        
        this.cmt = cmt;
        this.time = time;
        this.username = username;
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
    public void addComent(String cmtID, String cmt, String time, String  username,String id) {
        try {
            String strSelect = "insert into [Comment]([commentId],[comment],[TimeComment],[UserName],[NewId]) "
                    + "values(?,?,?,?,?)";
            pstm = cnn.prepareStatement(strSelect);
            pstm.setString(1, cmtID);
            pstm.setString(2, cmt);
            pstm.setString(3, time);
            pstm.setString(4, username);
            pstm.setString(5, id);
            
            pstm.execute();

        } catch (Exception e) {
            System.out.println("Add error:" + e.getMessage());
        }
    }
    public ArrayList<Comment> getAllcmt(String id,String user) {
        ArrayList<Comment> list = new ArrayList<>();
        try {
            String strSelect = "select [comment],[TimeComment],[UserName] from [Comment] where [NewId] = ? and [UserName]=?";
            pstm = cnn.prepareStatement(strSelect);
            pstm.setString(1, id);
            pstm.setString(2, user);
            rs = pstm.executeQuery();
            while (rs.next()) {
                String comment = rs.getString(1);
                String time = rs.getString(2);
                String username = rs.getString(3);
                
                Comment p = new Comment(comment, time, username);
                list.add(p);
            }
        } catch (Exception e) {
            System.err.println("Get all error" + e.getMessage());
        }
        return list;
    }
    public String getUsercmt(String newid) {
        String a = "";
        try {
            String strSelect = "select [UserName] from [Comment] where [NewId] = ?";
            pstm = cnn.prepareStatement(strSelect);
            pstm.setString(1, newid);
            rs = pstm.executeQuery();
            while (rs.next()) {
                a = rs.getString(1);
                
               
            }
        } catch (Exception e) {
            System.err.println("Get all error" + e.getMessage());
        }
        return a;
    }
    public ArrayList<Comment> getAllcmta(String id) {
        ArrayList<Comment> list = new ArrayList<Comment>();
        try {
            String strSelect = "select [comment],[TimeComment],UserName from [Comment] where [NewId] = ? ";
            pstm = cnn.prepareStatement(strSelect);
            pstm.setString(1, id);
//            pstm.setString(2, user);
            rs = pstm.executeQuery();
            while (rs.next()) {
                String comment = rs.getString(1);
                String time = rs.getString(2);
                String username = rs.getString(3);
                
                Comment p = new Comment(comment, time, username);
                list.add(p);
            }
        } catch (Exception e) {
            System.err.println("Get all error" + e.getMessage());
        }
        return list;
    }
    public ArrayList<Comment> getcmt(String id,String user) {
        ArrayList<Comment> list = new ArrayList<>();
        try {
            String strSelect = "select [comment],[TimeComment] from [Comment] where [NewId] = ? and [UserName]=?";
            pstm = cnn.prepareStatement(strSelect);
            pstm.setString(1, id);
            pstm.setString(2, user);
            rs = pstm.executeQuery();
            while (rs.next()) {
                String comment = rs.getString(1);
                String time = rs.getString(2);
                
                Comment p = new Comment(comment, time);
                list.add(p);
            }
        } catch (Exception e) {
            System.err.println("Get all error" + e.getMessage());
        }
        return list;
    }
    public ArrayList<String> getuser(String id) {
        ArrayList<String> list = new ArrayList<>();
        try {
            String strSelect = "select [UserName] from [Comment] where [NewId] = ? ";
            pstm = cnn.prepareStatement(strSelect);
            pstm.setString(1, id);
            
            rs = pstm.executeQuery();
            while (rs.next()) {
                String name = rs.getString(1);
                
                
                
                list.add(name);
            }
        } catch (Exception e) {
            System.err.println("Get all error" + e.getMessage());
        }
        return list;
    }
}
