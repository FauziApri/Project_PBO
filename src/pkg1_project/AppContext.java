package pkg1_project;

import java.sql.Connection;
import java.util.Scanner;

public class AppContext {
    
    public Scanner scanner = new Scanner(System.in);
    public Connection dbConn;

    public void close() {
        this.scanner.close();
    }
}
