class Customer {
    // TODO: Buatkan atribut
    public String namaLengkap;
    public String nomorIdentitas;
    public int totalBelanja;
    
    // TODO: Sediakan constructor
    public Customer(String namaLengkap, String nomorIdentitas, int totalBelanja) {
        this.namaLengkap = namaLengkap;
        this.nomorIdentitas = nomorIdentitas;
        this.totalBelanja = totalBelanja;
    }

    void tampilkanInfo() {
        // TODO: tampilkan data customer
        System.out.println("Nama Lengkap: " + namaLengkap + " | ID : " + nomorIdentitas + " | Total Belanja: " + totalBelanja);
    }
}
