package pkg1_project.models;
import java.util.ArrayList;

public class Sewa {
    int id, idKendaraan, idCustomer;
    String tipeSewa;

    private ArrayList<Kendaraan> stokMotor = new ArrayList<>();
    private ArrayList<Kendaraan> stokMobil = new ArrayList<>();

    public Sewa() {
    stokMotor.add(new Motor(
        1, "Honda", "Beat", 2020, 70000,
        "Hitam", "B2001AAA", "Automatic",
        "Helm, Jas Hujan"
    ));

    stokMotor.add(new Motor(
        2, "Yamaha", "NMAX", 2022, 120000,
        "Putih", "B2002BBB", "Automatic",
        "Helm"
    ));

    stokMotor.add(new Motor(
        3, "Suzuki", "Satria FU", 2019, 80000,
        "Merah", "B2003CCC", "Manual",
        "Helm, Sarung Tangan"
    ));

    stokMotor.add(new Motor(
        4, "Honda", "Vario 125", 2021, 90000,
        "Hitam", "B2004DDD", "Automatic",
        "Helm"
    ));

    stokMotor.add(new Motor(
        5, "Yamaha", "Aerox", 2022, 110000,
        "Biru", "B2005EEE", "Automatic",
        "Helm, Jas Hujan"
    ));

    stokMotor.add(new Motor(
        6, "Honda", "PCX 160", 2023, 130000,
        "Silver", "B2006FFF", "Automatic",
        "Helm"
    ));

    stokMotor.add(new Motor(
        7, "Kawasaki", "W175", 2020, 150000,
        "Hijau", "B2007GGG", "Manual",
        "Helm, Sarung Tangan"
    ));

    stokMotor.add(new Motor(
        8, "Honda", "Supra X", 2019, 60000,
        "Hitam", "B2008HHH", "Manual",
        "Helm"
    ));

    stokMotor.add(new Motor(
        9, "Yamaha", "Fazzio", 2022, 100000,
        "Krem", "B2009III", "Automatic",
        "Helm, Jas Hujan"
    ));

    stokMotor.add(new Motor(
        10, "Suzuki", "Spin", 2017, 50000,
        "Hitam", "B2010JJJ", "Automatic",
        "Helm"
    ));


        
    stokMobil.add(new Mobil(
        1, "Toyota", "Avanza", 2021, 250000,
        "Silver", "B1111AAA", "Automatic", 7
    ));

    stokMobil.add(new Mobil(
        2, "Toyota", "Veloz", 2022, 300000,
        "White", "B2222BBB", "Automatic", 7
    ));

    stokMobil.add(new Mobil(
        3, "Honda", "Brio", 2020, 200000,
        "Yellow", "B3333CCC", "Manual", 5
    ));

    stokMobil.add(new Mobil(
        4, "Mitsubishi", "Xpander", 2021, 320000,
        "Black", "B4444DDD", "Automatic", 7
    ));

    stokMobil.add(new Mobil(
        5, "Suzuki", "Ertiga", 2021, 230000,
        "Grey", "B5555EEE", "Manual", 7
    ));

    stokMobil.add(new Mobil(
        6, "Daihatsu", "Xenia", 2020, 220000,
        "Silver", "B6666FFF", "Manual", 7
    ));

    stokMobil.add(new Mobil(
        7, "Toyota", "Raize", 2022, 260000,
        "Red", "B7777GGG", "Automatic", 5
    ));

    stokMobil.add(new Mobil(
        8, "Honda", "HR-V", 2021, 350000,
        "White", "B8888HHH", "Automatic", 5
    ));

    stokMobil.add(new Mobil(
        9, "Nissan", "Livina", 2020, 240000,
        "Black", "B9999III", "Automatic", 7
    ));

    stokMobil.add(new Mobil(
        10, "Wuling", "Confero", 2019, 210000,
        "Blue", "B1010JJJ", "Manual", 7
    ));
    }

    
    public void showMotor() {
        for (Kendaraan motor : stokMotor) {
            motor.infoKendaraan();   // POLYMORPHISM!
        }
    }

    public void showMobil() {
        for (Kendaraan mobil : stokMobil) {
            mobil.infoKendaraan();   // POLYMORPHISM!
        }
    }

    public Kendaraan pilihMotor(int id) {
        for (Kendaraan motor : stokMotor) if (motor.getID() == id) return motor;
        return null;
    }

    public Kendaraan pilihMobil(int id) {
        for (Kendaraan mobil : stokMobil) if (mobil.getID() == id) return mobil;
        return null;
    }
}

