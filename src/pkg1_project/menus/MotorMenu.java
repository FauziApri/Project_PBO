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
        
        // INPUT ID
        System.out.println("\nPilih ID Motor: ");
        int idCari = ctx.scanner.nextInt();
        
        // CARI ID
        Motor motorTerpilih = null;
        
        for (Motor m : listMotor) {
            if(m.getID() == idCari) {
                motorTerpilih = m;
                break;
            }
        }
        
        // HASIL
        if (motorTerpilih != null) {
            ctx.activeKendaraan = motorTerpilih;
            System.out.println("\nMotor ditemukan:");
        } else {
            System.out.println("\nMotor dengan ID " + idCari + " tidak ditemukan");
            System.out.println("Mohon input dengan benar ");
        }
        
        return "";
    }
}
