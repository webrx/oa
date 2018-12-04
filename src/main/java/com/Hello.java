package com;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

/**
 * Created by webrx on 2018-12-03.
 */
public class Hello {
    public static void main(String[] args) {
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/db?user=root&password=&useSSL=false&serverTimezone=PRC&useUnicode=true&characterEncoding=utf8");
            System.out.println(conn);
            PreparedStatement pst = conn.prepareStatement("select * from book");
            ResultSet rs = pst.executeQuery();
            while(rs.next()){
                System.out.println(rs.getString("name"));
            }
            rs.close();
            pst.close();
            conn.close();
        }catch(Exception e){
            e.printStackTrace();
        }
    }
}
