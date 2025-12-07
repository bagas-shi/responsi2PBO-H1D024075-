class mesinMotor extends defaultMesin {
    public String tipeMotor;

    public mesinMotor(String namaMesin, int tenagaHP, String tipeMotor) {
        super(namaMesin, tenagaHP);
        this.tipeMotor = tipeMotor;
    }

    @Override
    public void tampilInfo() {
        super.tampilInfo();
        // Override info mesin motor
    }

    @Override
    public double nilaiPerforma() {
        return tenagaHP * 1.2;
        // Override performa mesin motor
    }

    @Override
    public String kategoriMesin() {
        return "Mesin Motor";
        // Override kategori
    }

    public void suaraMesin() {
        System.out.println("Brumm! Mesin motor menyala!");
        // Suara mesin motor
    }
}
