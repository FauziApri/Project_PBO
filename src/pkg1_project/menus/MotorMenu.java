package pkg1_project.menus;
import java.util.ArrayList;

import pkg1_project.AppContext;
import pkg1_project.models.Motor;
import pkg1_project.service.MotorService;

public class MotorMenu implements Menu {
    
    MotorService motorService;
    
    public MotorMenu(MotorService motorService) {
        this.motorService = motorService;
    }
    
    public String show(AppContext ctx) {
        System.out.println("==============");
        System.out.println("Menu Motor");
        
        ArrayList<Motor> listMotor = this.motorService.getAllMotor();
        for (Motor m : listMotor) {
            m.infoKendaraan();
        }
        
        return "";
    }
}
