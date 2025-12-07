class Pengguna {
    private int umur;
    private double beratBadan;
    private double tinggiBadan;

    public final double FaktorAktivitas = 1.2;

    public Pengguna(int umur, double beratBadan, double tinggiBadan) {
        this.umur = umur;
        this.beratBadan = beratBadan;
        this.tinggiBadan = tinggiBadan;
    }

    double hitungBMI() {
        double tinggiMeter = tinggiBadan / 100;
        return beratBadan / (tinggiMeter * tinggiMeter);
    }

    void tampilKategori() {
        double BMI = hitungBMI();
        if (BMI < 18.5) {
            System.out.println("Kategori: Kurus");
        } else if (BMI < 25) {
            System.out.println("Kategori: Normal");
        } else {
            System.out.println("Kategori: Obesitas");
        }
    }

    double hitungKalori() {
        return beratBadan * FaktorAktivitas * 10;
    }

    void tampilInfo() {
        System.out.println("=== Informasi Kesehatan Pengguna ===");
        System.out.println("Umur: " + umur + " tahun");
        System.out.println("Berat Badan: " + beratBadan + " kg");
        System.out.println("Tinggi Badan: " + tinggiBadan + " cm");

        System.out.printf("BMI: %.2f\n", hitungBMI());

        tampilKategori();

        System.out.printf("Kebutuhan Kalori: %.0f kal/hari\n", hitungKalori());

        System.out.println("======================================");
    }
}
