package pkg1_project.models;
import java.util.Date;

public class Sewa {
    int id, mobil_id, motor_id, costumer_id, harga;
    Date tanggal_sewa, tanggal_akhir;
    Mobil mobil;
    Motor motor;
    Customer customer;

    public Sewa(
        int id, 
        int mobil_id,
        int motor_id,
        int costumer_id,
        int harga,
        Date tanggal_sewa,
        Date tanggal_akhir
    ) {
        this.id = id;
        this.mobil_id = mobil_id;
        this.motor_id = motor_id;
        this.costumer_id = costumer_id;
        this.harga = harga;
        this.tanggal_sewa = tanggal_sewa;
        this.tanggal_akhir = tanggal_akhir;
    }

    public void showSewa() {
        System.out.println("===== INFORMASI SEWA =====");
        System.out.println("ID Sewa       : " + id);
        System.out.println("Harga Sewa    : " + harga);
        System.out.println("Tanggal Sewa  : " + tanggal_sewa);
        System.out.println("Tanggal Akhir : " + tanggal_akhir);
        System.out.println("");

        if (customer != null) {
            customer.print();
        }

        if (mobil != null) {
            mobil.infoKendaraan();
        }

        if (motor != null) {
            motor.infoKendaraan();
        }

        System.out.println("==========================");
    }
}

