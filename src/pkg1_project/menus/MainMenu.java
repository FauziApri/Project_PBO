package pkg1_project.menus;

import pkg1_project.AppContext;

public class MainMenu implements Menu {

    public String show(AppContext ctx) {
        System.out.println("Main menu");
        System.out.println("Pilih menu selanjutnya: ");

        String res = ctx.scanner.nextLine();
        return res;
    }
}
