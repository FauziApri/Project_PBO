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

    
        return "";
    }
}
