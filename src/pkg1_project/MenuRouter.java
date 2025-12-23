package pkg1_project;

//import pkg1_project.menus.LoginMenu;
//import pkg1_project.menus.MainMenu;
//import pkg1_project.menus.Menu;
//import pkg1_project.menus.RegisterMenu;
import pkg1_project.menus.*;
import pkg1_project.models.Sewa;
import pkg1_project.service.CustomerService;
import pkg1_project.service.MobilService;
import pkg1_project.service.MotorService;

public class MenuRouter {

    public void start(AppContext ctx) {
        //Services
        CustomerService customerService = new CustomerService(ctx.dbConn);
        MobilService mobilService = new MobilService(ctx.dbConn);
        MotorService motorService = new MotorService(ctx.dbConn);
        
        // Menus
        Menu mainMenu = new MainMenu();
        Menu loginMenu = new LoginMenu(customerService);
        Menu registerMenu = new RegisterMenu(customerService);
        Menu validasiDataMenu = new ValidasiDataMenu();
        Menu mobilMenu = new MobilMenu(mobilService);
        Menu motorMenu = new MotorMenu(motorService);
        Menu validasiSewaMenu = new ValidasiSewaMenu();
        Menu TabelSewaMenu = new TabelSewaMenu();
        Menu SewaMenu = new SewaMenu();

        String start = mainMenu.show(ctx);
        if(start.equalsIgnoreCase("1")) {
            TabelSewaMenu.show(ctx);
        }
        else if(start.equalsIgnoreCase("2")) {
            SewaMenu.show(ctx);
        }
        else {
            System.err.println("Error input");
            return;
        }

        String opsiMenu = SewaMenu.show(ctx);
        if(opsiMenu.equalsIgnoreCase("login")) {
            loginMenu.show(ctx);
        }
        else if(opsiMenu.equalsIgnoreCase("register")) {
            registerMenu.show(ctx);
        }
        else {
            System.err.println("Error input");
            return;
        }

        String opsiValidasi = validasiDataMenu.show(ctx);
        if (opsiValidasi.equalsIgnoreCase("1")) {
            mobilMenu.show(ctx);
        } else if (opsiValidasi.equalsIgnoreCase("2")) { 
            motorMenu.show(ctx);
        }
        validasiSewaMenu.show(ctx);
    }
}
