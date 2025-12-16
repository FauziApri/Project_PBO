package pkg1_project.menus;

import pkg1_project.AppContext;
import pkg1_project.models.Customer;
import pkg1_project.service.CustomerService;

public class LoginMenu implements Menu {

    CustomerService customerService;

    public LoginMenu(CustomerService cs) {
        this.customerService = cs;
    }

    public String show(AppContext ctx) {
        System.out.println("Ini menu login");
        
        System.out.println("Input NIK:");
        String res = ctx.scanner.nextLine();

        Customer cust = this.customerService.getCustomerByNIK(res);

        ctx.activeCustomer = cust;
        return res;
    }
}
