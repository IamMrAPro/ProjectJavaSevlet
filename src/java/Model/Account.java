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
import java.text.SimpleDateFormat;
import java.util.ArrayList;

/**
 *
 * @author anhha
 */
public class Account extends DBContext {

    private String Accid;

    public String getAccid() {
        return Accid;
    }

    public void setAccid(String Accid) {
        this.Accid = Accid;
    }

    private String name;
    private String pass;
    private String firstName;
    private String midleName;
    private String lastName;
    private String phone;
    private String email;
    private String gender;
    private String time;
    private int RoleId;

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public int getRoleId() {
        return RoleId;
    }

    public void setRoleId(int RoleId) {
        this.RoleId = RoleId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPass() {
        return pass;
    }

    public void setPass(String pass) {
        this.pass = pass;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getMidleName() {
        return midleName;
    }

    public void setMidleName(String midleName) {
        this.midleName = midleName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public Account() {
        connectDB();
    }

    public Account(String name, String pass) {
        this.name = name;
        this.pass = pass;
        connectDB();
    }

    public Account(String name, String pass, String firstName, String midleName, String lastName, String phone, String email, String gender, String time) {
        this.name = name;
        this.pass = pass;
        this.firstName = firstName;
        this.midleName = midleName;
        this.lastName = lastName;
        this.phone = phone;
        this.email = email;
        this.gender = gender;
        this.time = time;
        connectDB();
    }

    public Account(String name, String firstName, String midleName, String lastName, String phone, String email, String gender, String time) {
        this.name = name;
        this.pass = pass;
        this.firstName = firstName;
        this.midleName = midleName;
        this.lastName = lastName;
        this.phone = phone;
        this.email = email;
        this.gender = gender;
        this.time = time;
        connectDB();
    }

    public Account(String name, String firstName, String midleName, String lastName, String phone, String email, String gender) {

        this.name = name;

        this.firstName = firstName;
        this.midleName = midleName;
        this.lastName = lastName;
        this.phone = phone;
        this.email = email;
        this.gender = gender;
        connectDB();
    }

    public Account(String Accid, String name, String pass, int RoleId) {
        this.Accid = Accid;
        this.pass = pass;
        this.name = name;
        this.RoleId = RoleId;
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

    public Boolean checklogin() {

        try {
            String strSelect = "select [UserName],[Password] from Account "
                    + " where [UserName] =? and "
                    + " [Password] =?";
            pstm = cnn.prepareStatement(strSelect);
            pstm.setString(1, name);
            pstm.setString(2, pass);
            rs = pstm.executeQuery();
            while (rs.next()) {
                return true;
            }
        } catch (Exception e) {
            System.out.println("Login error : " + e.getMessage());
        }
        return false;

    }
    public Boolean checkAdmin() {

        try {
            String strSelect = "select [UserName],[Password] from Account "
                    + " where [UserName] =? and "
                    + " [Password] =? and [RoleId] = 1";
            pstm = cnn.prepareStatement(strSelect);
            pstm.setString(1, name);
            pstm.setString(2, pass);
            rs = pstm.executeQuery();
            while (rs.next()) {
                return true;
            }
        } catch (Exception e) {
            System.out.println("Login error : " + e.getMessage());
        }
        return false;

    }

    public void insertInfor(String name, String firstname, String middlename, String lastname, String phone, String email, int gender, String time) {
        try {
            String strSelect = "insert into Detail([UserName],[FirstName],[MiddleName],[LastName],[Phone],[Email],[GenderId],[TimeStart]) "
                    + "values(?,?,?,?,?,?,?,?)";

            pstm = cnn.prepareStatement(strSelect);
            pstm.setString(1, name);
            pstm.setString(2, firstname);
            pstm.setString(3, middlename);
            pstm.setString(4, lastname);
            pstm.setString(5, phone);
            pstm.setString(6, email);
            pstm.setInt(7, gender);
            pstm.setString(8, time);
            pstm.execute();
        } catch (Exception e) {
            System.out.println("Insert error:" + e.getMessage());
        }

    }

    public void insertAccount(String Accid, String name, String password, int role) {
        try {

            String strAcc = "insert into Account( [AccountId],[Username],[Password],[RoleId]) "
                    + "values(?,?,?,?)";
            pstm = cnn.prepareStatement(strAcc);

            pstm.setString(1, Accid);
            pstm.setString(2, name);
            pstm.setString(3, password);
            pstm.setInt(4, role);

            pstm.execute();
        } catch (Exception e) {
            System.out.println("Insert error:" + e.getMessage());
        }

    }

    public ArrayList<Account> getProfile(String user) {
        ArrayList<Account> list = new ArrayList<Account>();
        try {
            String strSelect = "select d.[UserName],d.[FirstName],d.[MiddleName],d.[LastName],d.[Phone],d.[Email],d.[GenderId],d.[TimeStart],a.[Password] From Detail d,Account a WHERE d.[UserName]=a.[UserName] and d.[UserName] = ? ";
            pstm = cnn.prepareStatement(strSelect);
            pstm.setString(1, user);

            rs = pstm.executeQuery();
            while (rs.next()) {
                String UserName = rs.getString(1);
                String FirstName = rs.getString(2);
                String MiddleName = rs.getString(3);
                String LastName = rs.getString(4);
                String Phone = rs.getString(5);
                String Email = rs.getString(6);
                String GenderId = rs.getString(7);
                String TimeStart = rs.getString(8);
                String pass = rs.getString(9);
                String Gender = null;
                if (GenderId.equalsIgnoreCase("0")) {
                    Gender = "Female";
                }
                if (GenderId.equalsIgnoreCase("1")) {
                    Gender = "Male";
                }

                Account p = new Account(UserName, pass, FirstName, MiddleName, LastName, Phone, Email, Gender, TimeStart);
                list.add(p);
            }
        } catch (Exception e) {
            System.err.println("Get all error" + e.getMessage());
        }
        return list;
    }

    public String getPassworda(String user) {
        String pass = "";
        try {
            String strSelect = "select [Password] From Account WHERE [UserName] = ? ";
            pstm = cnn.prepareStatement(strSelect);
            pstm.setString(1, user);

            rs = pstm.executeQuery();
            while (rs.next()) {
                pass = rs.getString(1);
            }
        } catch (Exception e) {
            System.err.println("Get all error" + e.getMessage());
        }
        return pass;
    }

    public void updateDatail(String phone, String email, String user) {
        try {
            String strSelect = "update Detail "
                    + "set [Phone]=? ,[Email]=? "
                    + "where[UserName] = ? ";
            pstm = cnn.prepareStatement(strSelect);
            pstm.setString(1, phone);
            pstm.setString(2, email);
            pstm.setString(3, user);
//            pstm.setString(4, pass);

            pstm.execute();

        } catch (Exception e) {
            System.out.println("Update error:" + e.getMessage());
        }

    }

    public void updateAccount(String user, String pass) {
        try {
            String strSelect = "update [Account] "
                    + "set [Password]=? "
                    + "where[UserName] = ? ";
            pstm = cnn.prepareStatement(strSelect);

            pstm.setString(1, pass);
            pstm.setString(2, user);

            pstm.executeUpdate();

        } catch (Exception e) {
            System.out.println("Update error:" + e.getMessage());
        }

    }

    public boolean checkNP(String account, String pass) {
        try {
            String strSelect = "select * from [Account] "
                    + "where UserName=? and "
                    + "Password=?";
            pstm = cnn.prepareStatement(strSelect);
            pstm.setString(1, account);
            pstm.setString(2, pass);
            rs = pstm.executeQuery();
            while (rs.next()) {
                //Tai khoan ton tai
                return true;
            }
        } catch (Exception e) {
            System.out.println("Check error:" + e.getMessage());
        }
        return false;
    }

    public void deleteAccount(String user) {
        try {
            String strSelect = "delete from Detail "
                    + "where UserName=?";
            pstm = cnn.prepareStatement(strSelect);
            pstm.setString(1, user);
            pstm.executeUpdate();

        } catch (Exception e) {
            System.out.println("Delete error:" + e.getMessage());
        }
    }


}

