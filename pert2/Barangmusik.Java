class BarangMusik {
    private String kodeBarang;
    private String namaBarang;
    private double harga;
    private int stok;
    
    public BarangMusik(String kodeBarang, String namaBarang) {
        this.kodeBarang = kodeBarang;
        this.namaBarang = namaBarang;
        this.harga = 0.0;
        this.stok = 0;
    }

    public BarangMusik(String kodeBarang, String namaBarang, double hargaBarang) {
        this.kodeBarang = kodeBarang;
        this.namaBarang = namaBarang;
        this.harga = harga;
        this.stok = 0;
    }

    public BarangMusik(String kode, String nama, double harga, int stok) {
        this.kodeBarang = kodeBarang;
        this.namaBarang = namaBarang;
        this.harga = harga;
        this.stok = stok;
    }
    
    
    void ubahHarga(double hargaBaru) {
        this.harga = hargaBaru;
    }
    
    void tambahStok(int jumlah) {
        this.stok += jumlah;
    }

    void tampilInfo() {
        System.out.println("Alat Musik" + namaBarang +
        " | kode" + kodeBarang +
        " | Harga" + harga +
        "| Stok" + stok + "unit");
    }
}