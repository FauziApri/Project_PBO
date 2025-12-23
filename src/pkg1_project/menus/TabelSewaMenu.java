package pkg1_project.menus;

import java.util.ArrayList;

import pkg1_project.AppContext;
import pkg1_project.models.Sewa;
import pkg1_project.service.SewaService;


public class TabelSewaMenu implements Menu {

    SewaService sewaService;

    public TabelSewaMenu(SewaService sewaService) {
        this.sewaService = sewaService;
    }

    public String show(AppContext ctx) {

        ArrayList<Sewa> swas = sewaService.getAllSewa();
        for (Sewa sewa : swas) {
           sewa.showSewa(); 
        }


        return "";
    }

}
