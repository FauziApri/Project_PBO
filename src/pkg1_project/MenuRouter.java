package pkg1_project;

import pkg1_project.menus.LoginMenu;
import pkg1_project.menus.MainMenu;
import pkg1_project.menus.Menu;
import pkg1_project.menus.RegisterMenu;

public class MenuRouter {
    public Menu currentMenu;


    public void start(AppContext ctx) {
        
        Menu mainMenu = new MainMenu();
        Menu loginMenu = new LoginMenu();
        Menu registerMenu = new RegisterMenu();

        String start = mainMenu.show(ctx);

        if(start.equalsIgnoreCase("login")) {
            loginMenu.show(ctx);
        }
        else if(start.equalsIgnoreCase("register")) {
            registerMenu.show(ctx);
        }

    }
}
