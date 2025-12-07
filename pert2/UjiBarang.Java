class UjiBarang {
    public static void main(String[] args) {
        BarangMusik gitarAkustik = new BarangMusik("GTR-001", "Gitar Akustik Yamaha");

        gitarAkustik.ubahHarga(1500000);
        gitarAkustik.tambahStok(5);

        BarangMusik DrumSet= new BarangMusik("DRM-001", "Drum Set Pearl", 8500000, 3);
        
        System.out.println("=== INVENTARIS TOKO NADAKITA ===");
        gitarAkustik.tampilInfo();
        DrumSet.tampilInfo();
    }
}