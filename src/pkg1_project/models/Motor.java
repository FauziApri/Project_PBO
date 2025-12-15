package pkg1_project.models;

public class Motor extends Kendaraan {
    private String perlengkapan;
    
    public Motor(int CsID, String CsMerk, String CsTipe, int CsTahun, int hrgSewa, 
                 String CsWarna, String CsPlatNo, String CsTransmisi, String CsPerlengkapan) {
        super(CsID, CsMerk, CsTipe, CsTahun, hrgSewa, CsWarna, CsPlatNo, CsTransmisi);
        this.perlengkapan = CsPerlengkapan;
    }

    @Override public void infoKendaraan() {
        System.out.println("---- INFORMASI Motor ----");
        super.infoKendaraan();
        System.out.println("Perlengkapan : " + perlengkapan);
        System.out.println("");
    }    
}
