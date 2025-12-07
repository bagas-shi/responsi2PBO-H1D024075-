class mesinTraktorListrik extends mesinTraktor {
    private double kapasitasBaterai;
    // Variabel khusus mesin traktor listrik (kapasitasBaterai)

    // Constructor
    public mesinTraktorListrik(String nama, int hp, double tarik, double kapasitasBaterai) {
        super(nama, hp, tarik);
        this.kapasitasBaterai = kapasitasBaterai;
    }

    @Override
    public void tampilInfo() {
        super.tampilInfo();
        // Override info traktor listrik
    }

    @Override
    public double nilaiPerforma() {
        return (tenagaHP * 1.1)+(kapasitasTarik * 10)+(kapasitasBaterai * 5);
        // Override performa traktor listrik
    }

    @Override
    public String kategoriMesin() {
        return "Mesin Traktor Listrik";
        // Override kategori listrik
    }

    @Override
    public void suaraMesin() {
        System.out.println("Bzzzzz! Traktor listrik aktif!");
        // Suara traktor listrik
    }
}
