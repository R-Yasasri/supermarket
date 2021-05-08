/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;

/**
 *
 * @author HP
 */
public class db {

    private static Connection c;

    private static void setUpConnection() throws Exception {

        Class.forName("com.mysql.jdbc.Driver");
       c = DriverManager.getConnection("jdbc:mysql://localhost:3307/coopcity_homagama", "root", "123");
    }

    public static void iud(String query) throws Exception {

        if (c == null) {
            setUpConnection();
        }
        c.createStatement().executeUpdate(query);
    }

    public static ResultSet search(String query) throws Exception {

        if (c == null) {
            setUpConnection();
        }
        return c.createStatement().executeQuery(query);
    }

    public static Connection getConnection() throws Exception {

        if (c == null) {
            setUpConnection();
        }
        return c;
    }
}
