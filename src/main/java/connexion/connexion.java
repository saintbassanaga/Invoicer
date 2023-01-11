package connexion;

import java.sql.Connection;
import java.sql.DriverManager;
/**
 * Created by gcode on 10/01/2023.
 */
public class connexion {
    Connection con;

    public Connection getConnection() {

        try {
            Class.forName("com.mysql.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/base", "root", "your-password");
        //here base is the database name;
        //root is the default username;
        } catch (Exception e) {
            System.out.println();
        }

        return con;
    }
}
