package pkg1_project.menus;

import pkg1_project.AppContext;

public class MainMenu implements Menu {

    public String show(AppContext ctx) {
        System.out.println("Main menu");
        System.out.println("Pilih menu selanjutnya: ");
        System.out.println("-> 1. Tabel Sewa Menu");
        System.out.println("-> 2. Sewa Kendaraan");
        System.out.println("Pilih disini (1 atau 2) = ");
        String res = ctx.scanner.nextLine();

        return res;
    }
}
