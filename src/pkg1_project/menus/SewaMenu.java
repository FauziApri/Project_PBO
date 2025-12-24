package pkg1_project.menus;

import pkg1_project.AppContext;

public class SewaMenu implements Menu {

    public String show(AppContext ctx) {
        System.out.println("\n=== SEWA MENU ===");
        System.out.println("Pilih menu selanjutnya: ");
        System.out.println("-> 1. Login");
        System.out.println("-> 2. Register");
        System.out.println("pilih disini (1 atau 2) = ");

        String res = ctx.scanner.nextLine();
        return res;
    }
}
