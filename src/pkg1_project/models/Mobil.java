package pkg1_project.models;

public class Mobil extends Kendaraan {
    private int jumlahKursi;

    public Mobil(int CsID, String CsMerk, String CsTipe, int CsTahun, int hrgSewa,
                 String CsWarna, String CsPlatNo, String CsTransmisi, int JmlKursi) {
        super(CsID, CsMerk, CsTipe, CsTahun, hrgSewa, CsWarna, CsPlatNo, CsTransmisi);
        this.jumlahKursi = JmlKursi;
    }

    @Override public void infoKendaraan() {
        System.out.println("---- INFORMASI MOBIL ----");
        super.infoKendaraan();
        System.out.println("Jumlah Kursi : " + jumlahKursi);
        System.out.println("");
    }
}
