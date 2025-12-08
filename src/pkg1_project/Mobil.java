package pkg1_project;

public class Mobil extends Kendaraan {
    private int jumlahKursi;

    public Mobil(int CsID, String CsMerk, String CsTipe, String CsWarna, 
    String CsPlatNo, String CsTransmisi, int JmlKursi, int hrgSewa) {
        super(CsID, CsMerk, CsTipe, CsWarna, CsPlatNo, CsTransmisi, hrgSewa);
        this.jumlahKursi = JmlKursi;
    }

    @Override public void infoKendaraan() {
        System.out.println("---- INFORMASI MOBIL ----");
        super.infoKendaraan();
        System.out.println("Jumlah Kursi : " + jumlahKursi);
    }
}