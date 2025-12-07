// Gunakan keyword untuk mewarisi class Karyawan
class Manajer extends Karyawan {
    private double tunjangan;

    public Manajer(String nama, double gajiPokok, double tunjangan) {
        super(nama, gajiPokok);
        this.tunjangan = tunjangan;
    }
    // Deklarasikan variabel tambahan khusus Manajer (tunjangan)
    
    
    // Constructor
    // Tips: Gunakan 'super' untuk memanggil constructor parent
    
    
    // Method Override tampilInfo
    // Tips: Tampilkan info dasar, lalu tambahkan info tunjangan dan total gaji
    @Override
    void tampilInfo() {
        System.out.println("Nama: " + nama);
        System.out.println("Gaji Pokok: " + gajiPokok);
        System.out.println("Tunjangan: " + tunjangan);
        System.out.println("Total Gaji: " + (gajiPokok + tunjangan));
    }
}