package jm.task.core.jdbc.util;



import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;


public class Util {


        private static final String userName = "root";
        private static final String password = "re20pi01n64Wt";
        private static final String connectionUrl = "jdbc:mysql://localhost:3306/123";


        public static Connection getConnection() {
            Connection connection = null;
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
        } catch (ClassNotFoundException e) {

            e.printStackTrace();
        }
        try {
           connection = DriverManager.getConnection(
                   connectionUrl,
                   userName,
                   password);

        } catch (SQLException e) {

            e.printStackTrace();
        }
        return connection;

    }
}