import java.util.Scanner;

public class JadwalKuliah26 {
    static Scanner input = new Scanner(System.in);

    // a. Input data
    public static void inputJadwal(String[][] jadwal, int n) {
        for (int i = 0; i < n; i++) {
            System.out.println("\nJadwal ke-" + (i + 1));
            System.out.print("Nama Mata Kuliah : ");
            jadwal[i][0] = input.nextLine();
            System.out.print("Ruang            : ");
            jadwal[i][1] = input.nextLine();
            System.out.print("Hari             : ");
            jadwal[i][2] = input.nextLine();
            System.out.print("Jam              : ");
            jadwal[i][3] = input.nextLine();
        }
    }

    // b. Tampilkan semua jadwal
    public static void tampilSemua(String[][] jadwal, int n) {
        System.out.println("\n=== DAFTAR JADWAL KULIAH ===");
        System.out.printf("%-25s %-20s %-15s %-15s\n",
                "Mata Kuliah", "Ruang", "Hari", "Jam");
        System.out.println("--------------------------------------------------------------------");

        for (int i = 0; i < n; i++) {
            System.out.printf("%-25s %-20s %-15s %-15s\n",
                    jadwal[i][0], jadwal[i][1], jadwal[i][2], jadwal[i][3]);
        }
    }

    // c. Cari berdasarkan hari
    public static void cariHari(String[][] jadwal, int n) {
        System.out.print("\nMasukkan hari yang dicari: ");
        String hari = input.nextLine();
        boolean ditemukan = false;

        for (int i = 0; i < n; i++) {
            if (jadwal[i][2].equalsIgnoreCase(hari)) {
                System.out.println(jadwal[i][0] + " | " +
                                   jadwal[i][1] + " | " +
                                   jadwal[i][2] + " | " +
                                   jadwal[i][3]);
                ditemukan = true;
            }
        }

        if (!ditemukan) {
            System.out.println("Tidak ada jadwal pada hari tersebut.");
        }
    }

    // d. Cari berdasarkan nama mata kuliah
    public static void cariMatkul(String[][] jadwal, int n) {
        System.out.print("\nMasukkan nama mata kuliah yang dicari: ");
        String matkul = input.nextLine();
        boolean ditemukan = false;

        for (int i = 0; i < n; i++) {
            if (jadwal[i][0].equalsIgnoreCase(matkul)) {
                System.out.println(jadwal[i][0] + " | " +
                                   jadwal[i][1] + " | " +
                                   jadwal[i][2] + " | " +
                                   jadwal[i][3]);
                ditemukan = true;
            }
        }

        if (!ditemukan) {
            System.out.println("Mata kuliah tidak ditemukan.");
        }
    }

    public static void main(String[] args) {

        System.out.print("Masukkan jumlah jadwal kuliah: ");
        int n = Integer.parseInt(input.nextLine());

        String[][] jadwal = new String[n][4];

        inputJadwal(jadwal, n);

        tampilSemua(jadwal, n);

        cariHari(jadwal, n);

        cariMatkul(jadwal, n);
    }
}
