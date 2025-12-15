package pkg1_project.menus;
import pkg1_project.AppContext;
 
public class ValidasiDataMenu implements Menu {
    
    public String show(AppContext ctx) {
        System.out.println("Validasi data");
        
        System.out.println("Pilih Kendaraan yang akan disewa: ");
        System.out.println("1. Mobil");
        System.out.println("2. Motor");
        System.out.println("Pilihan: ");
        String res = ctx.scanner.nextLine();
        return res;
    }
}
