package jdbcutil;

import java.sql.Connection;

public class JdbcUtil {

    private static Connection conn;

    public static Connection getConnection() throws Exception {
        Class.forName("org.gjt.mm.mysql.Driver");
            return JdbcUtil.conn;
    }

    public static void main(String[] args) throws Exception {
        System.out.println(JdbcUtil.getConnection());
    }
}
