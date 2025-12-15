package pkg1_project.models;

public class Kendaraan {
    protected String warna, merk, platNo, transmisi, tipe;
    public int hargaSewa, id, tahun;
    
    public Kendaraan(int CsID, String CsMerk, String CsTipe, int CsTahun, int hrgSewa,
                     String CsWarna, String CsPlatNo, String CsTransmisi) {
        this.id = CsID;
        this.merk = CsMerk;
        this.tipe = CsTipe;
        this.tahun = CsTahun;
        this.hargaSewa = hrgSewa;
        this.warna = CsWarna;
        this.platNo = CsPlatNo;
        this.transmisi = CsTransmisi;
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
        System.out.println("Tahun : " + tahun);
        System.out.println("Harga Sewa : Rp." + hargaSewa);
        System.out.println("Warna : " + warna);
        System.out.println("Plat NO : " + platNo);
        System.out.println("Transmisi : " + transmisi);
    }
}
