package com.mycompany.oes;

import java.sql.ResultSet;
import java.sql.SQLException;

public class connectionExample {
    public static void main(String[] args) throws SQLException {
        MyConnection conn = new MyConnection();
        ResultSet rs =  conn.statement.executeQuery("select * from admin");
        while (rs.next()) {
            System.out.println(rs.getString(1));
        }
    }
}
