/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

import Context.DBContext;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Date;

/**
 *
 * @author anhha
 */
public class FeedBack extends DBContext{
    int id;
    String email,time,comment;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

   
   

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }

    public FeedBack( int id ,String email, String comment,String time) {
        this.email = email;
        this.id=id;
        this.comment = comment;
        this.time=time;
        connectDB();
    }
    
     public FeedBack() {
        connectDB();
    }
    //Khai báo các thanhf phan xu lý DB
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
    public void insertFeedback( String email , String comment, String time){
        try {
            String strSelect = "INSERT INTO [dbo].[FeedBack]([email],[Feedback],[timeFeedback]) values (?,?,?)";

            pstm = cnn.prepareStatement(strSelect);
            pstm.setString(1, email);
            pstm.setString(2,comment);
            pstm.setString(3, time);
            pstm.executeUpdate();
            

        } catch (Exception e) {
            System.out.println("Create error : " + e.getMessage());
            
        }
    }
        public static void main(String[] args) {
        FeedBack u = new FeedBack();
       
        
    }
}
