package pkg1_project.service;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import pkg1_project.models.Mobil;

public class MobilService {
    private Connection db;

    public MobilService(Connection db) {
        this.db=db;
    }
    
    public ArrayList<Mobil> getAllMobil() {
        ArrayList<Mobil> finalMobil = new ArrayList<>();
        String sql = "SELECT * FROM mobil;";
        
        try(
            PreparedStatement ps = this.db.prepareStatement(sql);
        ){
            ResultSet rs = ps.executeQuery();

            while(rs.next()) {
               Mobil mobil = new Mobil(
                    rs.getInt("id"),
                    rs.getString("merk"),
                    rs.getString("tipe"),
                    rs.getInt("tahun"),
                    rs.getInt("harga_sewa"),
                    rs.getString("warna"),
                    rs.getString("plat_no"),
                    rs.getString("transmisi"),
                    rs.getInt("jumlah_kursi")
                );

                finalMobil.add(mobil);
            }

        }catch(SQLException e){
            System.err.println(e);
        }

        return finalMobil;
    }
}
