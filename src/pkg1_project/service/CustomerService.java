package pkg1_project.service;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import pkg1_project.models.Customer;
import pkg1_project.models.Mobil;
import pkg1_project.models.Motor;

public class CustomerService {
    private Connection db;

    public CustomerService(Connection db){
        this.db = db;
    }

    public Customer getCustomerByNIK(String nik) {
        String sql = "SELECT * FROM customer WHERE nik=?";
        Customer costumer = null;
        
        try(
            PreparedStatement ps = this.db.prepareStatement(sql);
        ) {
            ps.setString(1, nik);
            ResultSet rs = ps.executeQuery();
            
            if (rs.next()) {
                costumer = new Customer(rs.getString("nama"), rs.getString("alamat"), rs.getString("no_hp"), rs.getString("nik"));
            }
             
        }catch(SQLException e) {
            System.err.println(e);
        }

        return costumer;
    }

}
