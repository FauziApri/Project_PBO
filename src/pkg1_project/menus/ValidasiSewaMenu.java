package pkg1_project.menus;
import pkg1_project.AppContext;

public class ValidasiSewaMenu implements Menu {
     public String show(AppContext ctx){
        
        ctx.activeKendaraan.infoKendaraan();

        System.out.println("Tentukan lama sewa (dalam hari): ");
        int lamaSewa = ctx.scanner.nextInt();
        
        // total = lamasewa*harga
        int total = ctx.activeKendaraan.hargaSewa*lamaSewa;
        
        System.out.println("Total biaya sewa : Rp." + total);
        System.out.println("=========================================");
        System.out.println("\t\tTERIMA KASIH");
        System.out.println("=========================================");
         
        
        return "";
     }
}
