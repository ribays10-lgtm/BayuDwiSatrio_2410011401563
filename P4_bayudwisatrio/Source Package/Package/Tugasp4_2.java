import java.util.Scanner;

public class Tugasp4_2 {
  public static void main(String[] args){
    Scanner input = new Scanner(System.in);

    int jumlahBarang;
    String namaBarang;
    int harga, jumlah;
    int total = 0;
    int subtotal;
    System.out.print("Masukan jumlah barang: ");
    jumlahBarang = input.nextInt();
        input.nextLine();

        for (int i = 1; i <= jumlahBarang; i++) {
            System.out.println("\nBarang ke-" + i);

            System.out.print("Nama Barang : ");
            namaBarang = input.nextLine();

            System.out.print("Harga Barang : ");
            harga = input.nextInt();

            System.out.print("Jumlah Barang : ");
            jumlah = input.nextInt();
            input.nextLine();

            subtotal = harga * jumlah;

            total += subtotal;

            System.out.println("Subtotal : " + subtotal);
        }
         System.out.println("\n=== TOTAL PEMBAYARAN ===");
        System.out.println("Total Bayar : " + total);
  }  
}
