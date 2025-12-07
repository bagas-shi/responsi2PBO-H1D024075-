class mesinTraktor extends defaultMesin {
    public double kapasitasTarik;

    // Constructor
    mesinTraktor(String namaMesin, int tenagaHP, double kapasitasTarik) {
        super(namaMesin, tenagaHP);
        this.kapasitasTarik = kapasitasTarik;
    }

    @Override
    public void tampilInfo() {
        super.tampilInfo();
        // Override info mesin traktor
    }

    @Override
    public double nilaiPerforma() {
        return (tenagaHP * 0.9)+(kapasitasTarik * 10);
        // Override performa traktor
    }

    @Override
    public String kategoriMesin() {
        return "Mesin Traktor";
        // Override kategori traktor
    }

    public void suaraMesin() {
        System.out.println("GGGRRRR! Hidup mesinnn!");
        // Suara traktor
    }
}
