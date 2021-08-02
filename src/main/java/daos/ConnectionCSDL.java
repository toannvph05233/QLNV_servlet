package daos;

import java.sql.Connection;
import java.sql.Driver;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionCSDL {


    public static Connection getConnection(){
        try {
            String url = "jdbc:mysql://localhost:3306/QLNV";
            String user = "root";
            String password = "12345678";

            Class.forName("com.mysql.jdbc.Driver");
            Connection connection = DriverManager.getConnection(url, user, password);
            return connection;
        }catch (Exception e){
            e.printStackTrace();
        }
        return null;
    }
}
