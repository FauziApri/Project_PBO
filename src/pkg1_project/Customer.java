package pkg1_project;

public class Customer {
    private String nama, alamat, noHP, NIK;
    
    public Customer(String CsNama, String CsAlamat, String CsNoHP, String CsNIK) {
        this.nama = CsNama;
        this.alamat = CsAlamat;
        this.noHP = CsNoHP;
        this.NIK = CsNIK;
    }
    
    public String getNama() {
        return nama;
    }
    public String getNIK() {
        return NIK;
    }
    
    public void print() {
        System.out.println("--- INFORMASI CUSTOMER ---");
        System.out.println("Nama : " + nama);
        System.out.println("Alamat : " + alamat);
        System.out.println("No.HP : " + noHP);
        System.out.println("NIK : " + NIK);
    }
}
