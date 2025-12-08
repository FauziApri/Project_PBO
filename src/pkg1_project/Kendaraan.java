package pkg1_project;

public class Kendaraan {
    protected String warna, merk, platNo, transmisi, tipe;
    public int hargaSewa, id;
    
    public Kendaraan(int CsID, String CsMerk, String CsTipe, String CsWarna, 
    String CsPlatNo, String CsTransmisi, int hrgSewa) {
        this.id = CsID;
        this.merk = CsMerk;
        this.tipe = CsTipe;
        this.warna = CsWarna;
        this.platNo = CsPlatNo;
        this.transmisi = CsTransmisi;
        this.hargaSewa = hrgSewa;
    }
    
    public int getID() {
        return id;
    }
    
    public String getMerk() {
        return merk;
    }
    
    public void infoKendaraan() {
        System.out.println("ID : " + id);
        System.out.println("Merk : " + merk);
        System.out.println("Tipe : " + tipe);
        System.out.println("Warna : " + warna);
        System.out.println("Plat NO : " + platNo);
        System.out.println("Transmisi : " + transmisi);
        System.out.println("Harga Sewa : Rp." + hargaSewa);
    }
}
