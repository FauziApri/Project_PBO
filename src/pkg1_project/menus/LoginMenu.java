package pkg1_project.menus;

import pkg1_project.AppContext;

public class LoginMenu implements Menu {

    public String show(AppContext ctx) {
        System.out.println("Ini menu login");
        return "";
    }
}
