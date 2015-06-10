package tasks;

import java.sql.Statement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 * Created by Admin on 05.04.2015.
 */
public class MysqlLDBCTest {

    public static void main(String[] args) {

        try {
            Class.forName("com.mysql.jdbc.Driver");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        Connection conn = null;
        try {
            conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/mydbtest", "root", "root");
            Statement statement = conn.createStatement();
        } catch (SQLException e) {
            e.printStackTrace();
        }


    }

}
