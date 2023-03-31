
package com.onmotor.taller;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConexionMysql {

    String url = "jdbc:mysql://copiluz.ddns.net:3306/Taller";
    String user = "remotoRW", pass = "remoteRW";
    Connection con;

    public Connection getConnection() {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            con = DriverManager.getConnection(url, user, pass);
        } catch (ClassNotFoundException | SQLException e) {
        }
        return con;
    }
}
