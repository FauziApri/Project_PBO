package pkg1_project.menus;
import pkg1_project.AppContext;

public class ValidasiSewaMenu implements Menu {
     public String show(AppContext ctx){
        
        ctx.activeKendaraan.infoKendaraan();

        return "";
     }
}
