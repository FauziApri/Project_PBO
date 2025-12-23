package pkg1_project.models;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Customer {
    private String nama, alamat, noHP, NIK;
    
    public Customer(String CsNama, String CsAlamat, String CsNoHP, String CsNIK) {
        this.nama = CsNama;
        this.alamat = CsAlamat;
        this.noHP = CsNoHP;
        this.NIK = CsNIK;
    }
    
    public String getNama() {
        return nama;
    }
    public String getNIK() {
        return NIK;
    }

    
    public String getAlamat() {
        return alamat;
    }

    public String getNoHP() {
        return noHP;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public void setAlamat(String alamat) {
        this.alamat = alamat;
    }

    public void setNoHP(String noHP) {
        this.noHP = noHP;
    }

    public void setNIK(String NIK) {
        this.NIK = NIK;
    }
    
    public void print() {
        System.out.println("--- INFORMASI CUSTOMER ---");
        System.out.println("Nama : " + nama);
        System.out.println("Alamat : " + alamat);
        System.out.println("No.HP : " + noHP);
        System.out.println("NIK : " + NIK);
    }

    // Public static test
    public static Customer getCustomerByNIK(Connection db, String nik) {
        String sql = "SELECT * FROM customer WHERE nik=?";
        Customer costumer = new Customer("test", "alamat", "08153153", "123243");
        
        try(
            PreparedStatement ps = db.prepareStatement(sql);
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
