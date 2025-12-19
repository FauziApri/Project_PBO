package pkg1_project.service;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import pkg1_project.models.Motor;

public class MotorService {
    private Connection db;
    
    public MotorService(Connection db){
        this.db=db;
    }
    
    public ArrayList<Motor> getAllMotor(){
        ArrayList<Motor> finalMotor = new ArrayList<>();
        String sql = "SELECT * FROM motor;";
        
       try(
            PreparedStatement ps = this.db.prepareStatement(sql);
        ){
            ResultSet rs = ps.executeQuery();

            while(rs.next()) {
               Motor motor = new Motor(
                    rs.getInt("id"),
                    rs.getString("merk"),
                    rs.getString("tipe"),
                    rs.getInt("tahun"),
                    rs.getInt("harga_sewa"),
                    rs.getString("warna"),
                    rs.getString("plat_no"),
                    rs.getString("transmisi"),
                    rs.getString("perlengkapan")
                );

                finalMotor.add(motor);
            }

        }catch(SQLException e){
            System.err.println(e);
        }

        return finalMotor;
    }
}

    
