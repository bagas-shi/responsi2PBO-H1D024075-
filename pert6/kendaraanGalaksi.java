abstract class kendaraanGalaksi {
    protected String namakendaraan;
    protected int energi;
    protected int kapasitasPenumpang;

    public kendaraanGalaksi(String namakendaraan, int energi, int kapasitasPenumpang) {
        this.namakendaraan = namakendaraan;
        this.kapasitasPenumpang = kapasitasPenumpang;
        this.energi = 100;
    }
     public String getNamakendaraan() {
        return namakendaraan;
    }
    public int getenergi() {
        return energi;
    }
    public int getKapasitasPenumpang() {
        return kapasitasPenumpang;
    }
    protected void setenergi(int energi) {
        if (energi > 100)
            this.energi = 100;
        else if (energi < 0)
            this.energi = 0;
        else
            this.energi = energi;
    }

    final void tampilStatus() {
        System.out.println(
                namakendaraan + " | Energi: " + energi + "% | Kapasitas: " + kapasitasPenumpang + " awak");
    }
    abstract void aktifkanMesin();
    abstract void jelajah(int jarak);
    abstract void isiEnergi(int jumlah);
}
