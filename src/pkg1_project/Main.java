package pkg1_project;

public class Main {
    public static void main(String[] args) {
        //MySQL TEST COONNECT
        // Koneksi.getConnection();
        
        //RUN TESTING (OPTIONAL)
        Customer cs = new Customer("Ozi","Bgr","0821","1111");
        cs.print();
        System.out.println("Get Nama CS : " + cs.getNama());
        System.out.println("Get NIK CS : " + cs.getNIK());
        
        System.out.println("");
        
        Mobil mobil = new Mobil(111,"Nissan GTR","Sedan","Silver","B 15 F","Manual",2,3000000);
        mobil.infoKendaraan();
        System.out.println("Get ID Mobil : " + mobil.getID());
        System.out.println("Get Merk Mobil : " + mobil.getMerk());
        
        System.out.println("");
        
        Motor motor = new Motor(222,"Yamaha R1","Superbike","Blue","F 11 G","Manual",3000000);
        motor.infoKendaraan();
        System.out.println("Get ID Motor : " + motor.getID());
        System.out.println("Get Merk Motor  : " + motor.getMerk());
    }
}
