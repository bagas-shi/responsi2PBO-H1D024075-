class Karyawan {
    public  String nama;
    public double gajiPokok;
    // Deklarasikan variabel/state dasar (nama, gajiPokok)
    // Gunakan access modifier yang tepat agar bisa diakses oleh subclass (misal: protected)
    
    
    // Constructor untuk inisialisasi nama dan gajiPokok
    public Karyawan(String nama, double gajiPokok) {
        this.nama = nama;
        this.gajiPokok = gajiPokok;
    }
    
    // Method untuk menampilkan informasi dasar karyawan
    void tampilInfo() {
        System.out.println("Nama: " + nama);
        System.out.println("Gaji Pokok: " + gajiPokok);
    }
}