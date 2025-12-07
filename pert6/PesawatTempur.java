public class PesawatTempur extends kendaraanGalaksi{
    private int jumlahRudal;
    public PesawatTempur(String namakendaraan, int kapasitasPenumpang, int jumlahRudal) {
        super(namakendaraan, 100, kapasitasPenumpang);
        this.jumlahRudal = jumlahRudal;
    }

    @Override
    void aktifkanMesin() {
        if (getenergi() < 20) {
            System.out.println("Energi terlalu rendah! Mesin tidak dapat diaktifkan.");
        } else {
            System.out.println("Mesin pesawat tempur diaktifkan.");
        }
    }

    @Override
    void jelajah(int jarak) {
        int konsumsi = jarak * 3;
        if (getenergi() < konsumsi) {
            System.out.println("Energi tidak mencukupi untuk menjelajah sejauh " + jarak + " km.");
        } else {
            setenergi(getenergi() - konsumsi);
            System.out.println("Pesawat tempur menjelajah sejauh " + jarak + " km.");
        }
    }

    @Override
    void isiEnergi(int jumlah) {
        setenergi(getenergi() + jumlah);
        System.out.println("Energi ditingkatkan sebesar " + jumlah + "%.");
    }

    void tembakRudal(int jumlah) {
        if (jumlahRudal >= jumlah) {
            jumlahRudal -= jumlah;
            System.out.println("Menembakkan " + jumlah + " rudal!");
        } else {
            System.out.println("Gagal menembak! Jumlah rudal tidak mencukupi.");
        }
    }
}
