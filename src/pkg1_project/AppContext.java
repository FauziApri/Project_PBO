package pkg1_project;

import java.sql.Connection;
import java.util.Scanner;

import pkg1_project.models.Customer;

public class AppContext {
    
    public Scanner scanner = new Scanner(System.in);
    public Connection dbConn;
    public Customer activeCustomer;

    public AppContext() {
        Connection con = Koneksi.getConnection();
        this.dbConn = con;
    }

    public void close() {
        this.scanner.close();
    }
}
