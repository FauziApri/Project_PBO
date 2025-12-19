package pkg1_project.menus;

import pkg1_project.AppContext;
import pkg1_project.models.Customer;
import pkg1_project.service.CustomerService;

public class RegisterMenu implements Menu {

    CustomerService customerService;

    public RegisterMenu(CustomerService cs) {
        this.customerService = cs;
    }

    public String show(AppContext ctx) {

        // ======================
        // INPUT DATA CUSTOMER
        // ======================
        System.out.println("Masukkan Nama   : ");
        String nama = ctx.scanner.nextLine();

        System.out.println("Masukkan Alamat : ");
        String alamat = ctx.scanner.nextLine();

        System.out.println("Masukkan No HP  : ");
        String noHP = ctx.scanner.nextLine();

        System.out.println("Masukkan NIK    : ");
        String NIK = ctx.scanner.nextLine();

        // ======================
        // BUAT OBJECT CUSTOMER
        // ======================
        Customer customer = new Customer(
            nama,
            alamat,
            noHP,
            NIK
        );

        Customer customerB = this.customerService.createCostumer(customer);
        ctx.activeCustomer = customerB;
        
        return "";
    }
}
