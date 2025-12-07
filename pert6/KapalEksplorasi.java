public class KapalEksplorasi extends kendaraanGalaksi {
    private int modulScan;
    public KapalEksplorasi(String namakendaraan, int kapasitasPenumpang, int modulScan) {
        super(namakendaraan, 100, kapasitasPenumpang);
        this.modulScan = modulScan;
    }
    @Override
    void aktifkanMesin() {
        if (getenergi() < 15) {
            System.out.println("Energi tidak mencukupi untuk memulai ekspedisi!");
        } else {
            System.out.println("Kapal eksplorasi siap berangkat!");
        }
    }

    @Override
    void jelajah(int jarak) {
        int konsumsi = jarak * 2;
        if (getenergi() < konsumsi) {
            System.out.println("Energi tidak mencukupi untuk menjelajah sejauh " + jarak + " km.");
        } else {
            setenergi(getenergi() - konsumsi);
            System.out.println("Kapal eksplorasi menjelajah sejauh " + jarak + " km.");
        }
    }

    @Override
    void isiEnergi(int jumlah) {
        setenergi(getenergi() + jumlah);
        System.out.println("Mengisi energi kapal eksplorasi.");
    }

    void scanPlanet(String namaPlanet) {
        System.out.println("Melakukan scan pada planet " + namaPlanet + " dengan modul level " + modulScan + ".");
    }
}