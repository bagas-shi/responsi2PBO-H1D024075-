class defaultMesin {
    public String namaMesin;
    public int tenagaHP;

    public defaultMesin(String namaMesin, int tenagaHP) {
        this.namaMesin = namaMesin;
        this.tenagaHP = tenagaHP;
    }

    public void tampilInfo() {
        System.out.println("Nama Mesin: " + namaMesin + " | Tenaga HP: " + tenagaHP);
    }

    public double nilaiPerforma() {
        double nilaiPerforma= tenagaHP * 1.0; 
        return nilaiPerforma;
    }

    public String kategoriMesin() {
        return "Mesin Umum";
    }
}
