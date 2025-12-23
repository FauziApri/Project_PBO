package pkg1_project.menus;

import pkg1_project.AppContext;

public class SewaMenu implements Menu {

    public String show(AppContext ctx) {
        System.out.println("SEWA MENU");
        System.out.println("Pilih menu selanjutnya: ");
        System.out.println("-> Login");
        System.out.println("-> Register");
        System.out.println("ketik disini = ");

        String res = ctx.scanner.nextLine();
        return res;
    }
}