package pkg1_project;
import java.sql.*;
import io.github.cdimascio.dotenv.Dotenv;

public class Koneksi {
    private static Connection conn;

    public static Connection getConnection() {
        if (conn == null) {
            try {

                Dotenv dotenv = Dotenv.load();

                String user = dotenv.get("DB_USER");
                String pass = dotenv.get("DB_PASS");
                String name = dotenv.get("DB_NAME");

                String url = "jdbc:mysql://localhost:3306/" + name;
                //GUNAKAN DATABASE KALIAN UNTUK TESTING(YANG ADA DI MYSQL KALIAN), misal db_agus,db_yudi
                
                // Load the MySQL JDBC driver
               Class.forName("com.mysql.cj.jdbc.Driver");

                conn = DriverManager.getConnection(url, user, pass);
                System.out.println("Koneksi Berhasil!");
            } catch (SQLException e) {
                System.out.println("Koneksi Gagal: " + e.getMessage());
            }
            catch (ClassNotFoundException e) {
                System.out.println("Driver MySQL tidak ditemukan!");
            }
        }
        return conn;
    }
}
