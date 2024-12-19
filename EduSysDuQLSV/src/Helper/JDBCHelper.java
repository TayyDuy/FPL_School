package Helper;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class JDBCHelper {

    private static String driver = "com.microsoft.sqlserver.jdbc.SQLServerDriver";
    private static String hosting = "jdbc:sqlserver://localhost:1433;databaseName=Polypro2";
    private static String user = "sa";
    private static String password = "1211";
    public static ResultSet rs = null;
    public static PreparedStatement ps = null;
    public static Connection con;
    
    public static Connection ketnoi() {
        try {
            Class.forName(driver);
            con = DriverManager.getConnection(hosting, user, password);
            System.out.println("Connection successfully!");
        } catch (Exception ex) {
            System.out.println("Connection Error!");
            ex.printStackTrace();
        }
        return con;
    }

    public static PreparedStatement prepareStatement(String sql, Object... args) throws SQLException {
        if (sql.trim().startsWith("{")) {
            ps = con.prepareCall(sql);
        } else {
            ps = con.prepareStatement(sql);
        }
        for (int i = 0; i < args.length; i++) {
            ps.setObject(i + 1, args[i]);
        }
        return ps;
    }

    public static void executeUpdate(String sql, Object... args) {
        try {
            ps = prepareStatement(sql, args);
            try {
                ps.executeUpdate();
            } finally {
                ps.close();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void executeQuery(String sql) {
        try {
            ps = prepareStatement(sql);
            rs = ps.executeQuery();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
