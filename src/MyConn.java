
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;


public class MyConn {
    public static Connection getConnection()
    {
        Connection conn=null;
        try{
            conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/seit_seminar","root","");
        }
        catch(SQLException ex)
        {
        System.out.println(ex.getMessage());
        }
        return conn;
    }
}
