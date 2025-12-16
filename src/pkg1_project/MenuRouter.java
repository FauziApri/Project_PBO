package pkg1_project;

//import pkg1_project.menus.LoginMenu;
//import pkg1_project.menus.MainMenu;
//import pkg1_project.menus.Menu;
//import pkg1_project.menus.RegisterMenu;
import pkg1_project.menus.*;

import pkg1_project.models.*;
import pkg1_project.service.CustomerService;
import pkg1_project.service.MobilService;

public class MenuRouter {

    public void start(AppContext ctx) {
        //Services
        CustomerService customerService = new CustomerService(ctx.dbConn);
        MobilService mobilService = new MobilService(ctx.dbConn);
        
        // Menus
        Menu mainMenu = new MainMenu();
        Menu loginMenu = new LoginMenu(customerService);
        Menu registerMenu = new RegisterMenu();
        Menu validasiDataMenu = new ValidasiDataMenu();
        Menu mobilMenu = new MobilMenu(mobilService);
        Menu motorMenu = new MotorMenu();
        Menu validasiSewaMenu = new ValidasiSewaMenu();

        String start = mainMenu.show(ctx);
        
        if(start.equalsIgnoreCase("login")) {
            loginMenu.show(ctx);
        }
        else if(start.equalsIgnoreCase("register")) {
            registerMenu.show(ctx);
        }
        else {
            System.err.println("Error input");
            return;
        }

        String pilihan = validasiDataMenu.show(ctx);
        if (pilihan.equalsIgnoreCase("1")) {
            mobilMenu.show(ctx);
        } else if (pilihan.equalsIgnoreCase("2")) { 
            motorMenu.show(ctx);
        }
        validasiSewaMenu.show(ctx);
    }
}
