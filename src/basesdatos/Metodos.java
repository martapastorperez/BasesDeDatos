
package basesdatos;

import java.sql.Connection;
import java.sql.DatabaseMetaData;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;


public class Metodos {
     static Connection con = null;
    static Statement s = null;
    public static String db = "base.db";
    public static String url = "jdbc:sqlite:" +db;
    
      public static Connection conectar(){
     
        Connection conn = null;
        try {
            conn = DriverManager.getConnection(url);
            DatabaseMetaData meta = conn.getMetaData();
            System.out.println("Estás conectado");
        }catch (SQLException e) {
            System.out.println(e.getMessage());
        }
        
        return conn;
    }
      public void crearTabla(){
//       
        String sql = "CREATE TABLE IF NOT EXISTS clase (\n"
                + "	nombre String,\n"
                + "	apellidos String,\n"
                + "     curso String\n"
                + ");";
        
        try (Connection conn = DriverManager.getConnection(url);
                Statement stmt = conn.createStatement()) {
            stmt.execute(sql);
            System.out.println("Creado");
        } catch (SQLException e) {
            System.out.println(e.getMessage()+"error1");
        }
    }
}
