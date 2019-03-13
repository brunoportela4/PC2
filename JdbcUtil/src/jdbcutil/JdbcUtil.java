package jdbcutil;

import java.sql.Connection;
import java.sql.DriverManager;

public class JdbcUtil {

    private static Connection conn;
    private static String strConn="jdbc:mysql://127.0.0.1:3306/nomeDoBanco";
    
    public static Connection getConnection() throws Exception {
        //Class.forName("org.gjf.mm.mysql.Driver");
        Class.forName("com.mysql.cj.jdbc.Driver");
        if (JdbcUtil.conn != null){
            return JdbcUtil.conn;
        }else {
            JdbcUtil.conn = DriverManager.getConnection(strConn,"user","password");
        }
        return JdbcUtil.conn;
    }

    public static void main(String[] args) throws Exception {
        System.out.println(JdbcUtil.getConnection());
    }
}

