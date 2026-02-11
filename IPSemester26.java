import java.util.Scanner;

public class IPSemester26 {
     // Fungsi konversi nilai huruf ke nilai setara
    public static double konversiNilai(String huruf) {
        switch (huruf.toUpperCase()) {
            case "A":  return 4.0;
            case "B+": return 3.5;
            case "B":  return 3.0;
            case "C+": return 2.5;
            case "C":  return 2.0;
            case "D":  return 1.0;
            case "E":  return 0.0;
            default:   return -1; 
        }
    }

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Program Menghitung IP Semester");
        System.out.println("================================");

        System.out.print("Masukkan jumlah mata kuliah: ");
        int n = input.nextInt();
        input.nextLine();

        String[] namaMK = new String[n];
        int[] sks = new int[n];
        String[] nilaiHuruf = new String[n];
        double[] nilaiSetara = new double[n];

        double totalBobot = 0;
        int totalSKS = 0;

        for (int i = 0; i < n; i++) {
            System.out.println("\nMata Kuliah ke-" + (i + 1));

            System.out.print("Nama MK     : ");
            namaMK[i] = input.nextLine();

            System.out.print("Bobot SKS   : ");
            sks[i] = input.nextInt();
            input.nextLine();

            System.out.print("Nilai Huruf : ");
            nilaiHuruf[i] = input.nextLine();

            nilaiSetara[i] = konversiNilai(nilaiHuruf[i]);

            if (nilaiSetara[i] == -1) {
                System.out.println("Nilai huruf tidak valid!");
                return;
            }

            totalBobot += nilaiSetara[i] * sks[i];
            totalSKS += sks[i];
        }

        double ip = totalBobot / totalSKS;

        // Output tabel
        System.out.println("\nHasil Konversi Nilai");
        System.out.println("==============================================================");
        System.out.printf("%-30s %-10s %-12s %-12s%n",
                "MK", "SKS", "Nilai Huruf", "Nilai Setara");

        for (int i = 0; i < n; i++) {
            System.out.printf("%-30s %-10d %-12s %-12.2f%n",
                    namaMK[i], sks[i], nilaiHuruf[i].toUpperCase(), nilaiSetara[i]);
        }

        System.out.println("==============================================================");
        System.out.println("Total SKS : " + totalSKS);
        System.out.printf("IP Semester : %.2f%n", ip);
    }
}