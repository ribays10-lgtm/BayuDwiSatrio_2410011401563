import java.util.Scanner;
public class tugas3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        char ulang;
        int total = 0;
        int jumlah = 0;

        do {
            System.out.print("Masukkan nilai mahasiswa: ");
            int nilai = input.nextInt();
            input.nextLine();

            total += nilai;
            jumlah++;

            System.out.print("Input lagi? (y/t): ");
            ulang = input.next().charAt(0);
            input.nextLine();

        } while (ulang == 'y' || ulang == 'Y');

        if (jumlah > 0) {
            double rataRata = (double) total / jumlah;
            System.out.println("Rata-rata nilai: " + rataRata);
        } else {
            System.out.println("Tidak ada nilai yang diinput.");
        }
    }
}