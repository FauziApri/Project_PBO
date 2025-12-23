package pkg1_project;

import java.util.ArrayList;

import pkg1_project.menus.*;
import pkg1_project.models.Sewa;
import pkg1_project.service.CustomerService;
import pkg1_project.service.MobilService;
import pkg1_project.service.MotorService;
import pkg1_project.service.SewaService;

public class MenuRouter {

    public void start(AppContext ctx) {
        String opsi = "";


        //Services
        CustomerService customerService = new CustomerService(ctx.dbConn);
        MobilService mobilService = new MobilService(ctx.dbConn);
        MotorService motorService = new MotorService(ctx.dbConn);
        SewaService sewaService = new SewaService(ctx.dbConn);
        
        // Menus
        Menu mainMenu = new MainMenu();
        Menu loginMenu = new LoginMenu(customerService);
        Menu registerMenu = new RegisterMenu(customerService);
        Menu validasiDataMenu = new ValidasiDataMenu();
        Menu mobilMenu = new MobilMenu(mobilService);
        Menu motorMenu = new MotorMenu(motorService);
        Menu validasiSewaMenu = new ValidasiSewaMenu();
        Menu tabelSewaMenu = new TabelSewaMenu(sewaService);
        Menu sewaMenu = new SewaMenu();

        opsi = mainMenu.show(ctx);
        if(opsi.equalsIgnoreCase("1")) {
            tabelSewaMenu.show(ctx);
            return;
        }
        else if(opsi.equalsIgnoreCase("2")) {
            opsi = sewaMenu.show(ctx);
        }
        else {
            System.err.println("Error input");
            return;
        }

        if(opsi.equalsIgnoreCase("1")) {
            loginMenu.show(ctx);
        }
        else if(opsi.equalsIgnoreCase("2")) {
            registerMenu.show(ctx);
        }
        else {
            System.err.println("Error input");
            return;
        }

        opsi = validasiDataMenu.show(ctx);
        if (opsi.equalsIgnoreCase("1")) {
            mobilMenu.show(ctx);
        } else if (opsi.equalsIgnoreCase("2")) { 
            motorMenu.show(ctx);
        }
        validasiSewaMenu.show(ctx);
    }
}
