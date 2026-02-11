import java.util.Scanner;

public class PlatNomor26 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        // Array kode plat
        char[] KODE = {'A','B','D','E','F','G','H','L','N','T'};

        // Array nama kota (2 dimensi)
        String[][] KOTA = {
                {"BANTEN"},
                {"JAKARTA"},
                {"BANDUNG"},
                {"CIREBON"},
                {"BOGOR"},
                {"PEKALONGAN"},
                {"SEMARANG"},
                {"SURABAYA"},
                {"MALANG"},
                {"TEGAL"}
        };

        System.out.print("Masukkan kode plat nomor: ");
        char kodeInput = input.next().toUpperCase().charAt(0);

        boolean ditemukan = false;

        for (int i = 0; i < KODE.length; i++) {
            if (kodeInput == KODE[i]) {
                System.out.println("Kota asal kendaraan: " + KOTA[i][0]);
                ditemukan = true;
                break;
            }
        }

        if (!ditemukan) {
            System.out.println("Kode plat tidak ditemukan.");
        }
    }
}
