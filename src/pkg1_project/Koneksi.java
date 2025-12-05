package pkg1_project;
import java.sql.*;

public class Koneksi {
    private static Connection conn;

    public static Connection getConnection() {
        if (conn == null) {
            try {
                String url = "jdbc:mysql://localhost:3306/db_fauzi";
                //GUNAKAN DATABASE KALIAN UNTUK TESTING(YANG ADA DI MYSQL KALIAN), misal db_agus,db_yudi
                String user = "root";
                String pass = ""; // isi jika ada password
                
                // Load the MySQL JDBC driver
//                Class.forName("com.mysql.cj.jdbc.Driver");

                conn = DriverManager.getConnection(url, user, pass);
                System.out.println("Koneksi Berhasil!");
            } catch (SQLException e) {
                System.out.println("Koneksi Gagal: " + e.getMessage());
            }
        }
        return conn;
    }
}
