import java.util.Scanner;

public class RoyalGarden26 {
    
     // Harga bunga (konstanta)
    static final int AGLONEMA = 75000;
    static final int KELADI = 50000;
    static final int ALOCASIA = 60000;
    static final int MAWAR = 10000;

    // Fungsi menghitung pendapatan cabang
    public static int hitungPendapatan(int aglonema, int keladi, int alocasia, int mawar) {
        return (aglonema * AGLONEMA) +
               (keladi * KELADI) +
               (alocasia * ALOCASIA) +
               (mawar * MAWAR);
    }

    public static void main(String[] args) {

        // Data stok bunga (baris = cabang, kolom = jenis bunga)
        int[][] stok = {
                {10, 5, 15, 7},   // RoyalGarden 1
                {6, 11, 9, 12},   // RoyalGarden 2
                {2, 10, 10, 5},   // RoyalGarden 3
                {5, 7, 12, 9}     // RoyalGarden 4
        };

        String[] cabang = {
                "RoyalGarden 1",
                "RoyalGarden 2",
                "RoyalGarden 3",
                "RoyalGarden 4"
        };

        System.out.println("=== Pendapatan RoyalGarden ===\n");

        for (int i = 0; i < stok.length; i++) {

            int pendapatan = hitungPendapatan(
                    stok[i][0],
                    stok[i][1],
                    stok[i][2],
                    stok[i][3]
            );

            System.out.println(cabang[i]);
            System.out.println("Pendapatan : Rp " + pendapatan);

            if (pendapatan > 1500000) {
                System.out.println("Status     : Sangat Baik");
            } else {
                System.out.println("Status     : Perlu Evaluasi");
            }

            System.out.println("--------------------------------");
        }
    }
}

