package pkg1_project;

public class Motor extends Kendaraan {
    private boolean perlengkapan;
    
    public Motor(int CsID, String CsMerk, String CsTipe, String CsWarna, 
    String CsPlatNo, String CsTransmisi, int hrgSewa) {
        super(CsID, CsMerk, CsTipe, CsWarna, CsPlatNo, CsTransmisi, hrgSewa);
    }

    @Override public void infoKendaraan() {
        System.out.println("---- INFORMASI Motor ----");
        super.infoKendaraan();
        System.out.println("Perlengkapan : " + perlengkapan);
    }    
}
