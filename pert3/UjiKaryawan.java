class UjiKaryawan {
    public static void main(String[] args) {
        // Tampilkan Header
        System.out.println("=== DATA KARYAWAN TECHMAJU ===");
        Karyawan staff= new Karyawan("Budi", 4000000);
        // Buat objek Karyawan biasa (Budi)
        
        
        // Tampilkan info Karyawan biasa
        System.out.println("Status: Karyawan Biasa");
        staff.tampilInfo();
        
        System.out.println(); // Baris baru/jarak
        Manajer manajer= new Manajer("Siti Aminah", 6000000, 2500000);
        // Buat objek Manajer (Siti)
        
        
        // Tampilkan info Manajer
        System.out.println("Status: Manajer");
        manajer.tampilInfo();
    }
}