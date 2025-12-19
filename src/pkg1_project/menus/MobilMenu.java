package pkg1_project.menus;
import java.util.ArrayList;

import pkg1_project.AppContext;
import pkg1_project.models.Mobil;
import pkg1_project.service.MobilService;

public class MobilMenu implements Menu {

    MobilService mobilService;

    public MobilMenu(MobilService mobilService) {
       this.mobilService = mobilService; 
    }

    public String show(AppContext ctx) {
        System.out.println("==============");
        System.out.println("Menu Mobil");
        
        ArrayList<Mobil> listMobil = this.mobilService.getAllMobil();

        for (Mobil m : listMobil) {
            m.infoKendaraan();
        }


         // ======================
        // INPUT ID MOBIL
        // ======================
        System.out.println("\nMasukkan ID Mobil: ");
        int idCari = ctx.scanner.nextInt();

        // ======================
        // CARI MOBIL
        // ======================
        Mobil mobilTerpilih = null;

        for (Mobil m : listMobil) {
            if (m.getID() == idCari) {   // pastikan Mobil punya getId()
                mobilTerpilih = m;
                break;
            }
        }


        // ======================
        // HASIL
        // ======================
        if (mobilTerpilih != null) {
            ctx.activeKendaraan = mobilTerpilih;
            System.out.println("\nMobil ditemukan:");
        } else {
            System.out.println("\n Mobil dengan ID " + idCari + " tidak ditemukan");
        }

    
        return "";
    }
}
