package pkg1_project.service;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Date;

import pkg1_project.models.Sewa;

public class SewaService {
    private Connection db;
    
    public SewaService(Connection db){
        this.db=db;
    }


    public ArrayList<Sewa> getAllSewa() {
        ArrayList<Sewa> fnl = new ArrayList<>();
        String sql = "SELECT * FROM sewa";

       try(
            PreparedStatement ps = this.db.prepareStatement(sql);
        ){
            ResultSet rs = ps.executeQuery();

            while(rs.next()) {
                Sewa sewa = new Sewa(
                    rs.getInt("id"),
                    rs.getInt("mobil_id"),
                    rs.getInt("motor_id"),
                    rs.getInt("customer_id"),
                    rs.getInt("harga"),
                    rs.getDate("tanggal_sewa"),
                    rs.getDate("tanggal_akhir")
                );

                fnl.add(sewa);
            }

        }catch(SQLException e){
            System.err.println(e);
        }


        return fnl;
    }
}
