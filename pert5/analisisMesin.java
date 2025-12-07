import java.util.Arrays;
import java.util.Comparator;

class analisisMesin {
    public static void main(String[] args) {
        defaultMesin[] info = new defaultMesin[5];
        info[0]= new mesinMotor("Honda Supra X", 125, "Bebek");
        info[1]= new mesinTraktor("Kubota MX5200", 520, 5.0);
        info[2]= new mesinTraktorListrik("EcoTrac Z900", 300, 4.2, 70);
        info[3]= new mesinMotor("Yamaha R25", 250, "Sport");
        info[4]= new mesinTraktorListrik("Volta FarmX", 200, 3.5, 80);

        System.out.println("=== DATA MESIN MEGATECH ===");
         for (defaultMesin m : info) {
            m.tampilInfo();
            System.out.println("Kategori: " + m.kategoriMesin());
            System.out.println("Performa: " + m.nilaiPerforma());
            System.out.println();
        }
       
        // Loop untuk menampilkan info masing-masing mesin

        // Loop untuk menampilkan kategori dan performa

        System.out.println("=== SUARA MESIN ===");
         for (defaultMesin m : info) {
            if (m instanceof mesinMotor) {
                ((mesinMotor) m).suaraMesin();
            } else if (m instanceof mesinTraktor) {
                if (m instanceof mesinTraktorListrik) {
                    ((mesinTraktorListrik) m).suaraMesin();
                } else {
                    ((mesinTraktor) m).suaraMesin();
                }
            }
        }

        // Loop untuk menghasilkan suara tiap mesin (instanceof)

        System.out.println("\n=== MESIN PERFORMA TERTINGGI ===");
        defaultMesin tertinggi = info[0];
        for (defaultMesin m : info) {
            if (m.nilaiPerforma() > tertinggi.nilaiPerforma()) {
                tertinggi = m;
            }
        }
        System.out.println(tertinggi.namaMesin + " -> " + tertinggi.nilaiPerforma());
        // Logika menemukan mesin dengan performa tertinggi

        System.out.println("\n=== TOP 3 MESIN TERBAIK ===");
        Arrays.sort(info, new Comparator<defaultMesin>() {
            @Override
            public int compare(defaultMesin m1, defaultMesin m2) {
                return Double.compare(m2.nilaiPerforma(), m1.nilaiPerforma()); // Descending
            }
        });

        for (int i = 0; i < 3; i++) {
            System.out.println((i + 1) + ". " + info[i].namaMesin + " -> " + info[i].nilaiPerforma());
        }
        // Logika sorting 3 performa tertinggi
    }
}
