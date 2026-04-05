import java.util. Scanner;
public class P4Latihan {
    public static void main (String[] args){
        Scanner input = new Scanner(System.in);
        int presensi; int realisasi; int nilaiTugas; int nilaiUTS; int nilaiUAS; int jumlahPresensi; int jumlahNilaiTugas; int jumlahNilaiUTS; int jumlahNilaiUAS; int jumlahTotal;
        System.out.print("Masukan jumlah presensi = ");
        presensi = input.nextByte();
        System.out.print("Masukan nilai realisasi = ");
        realisasi = input.nextByte();
        System.out.print("Masukan nilai tugas = ");
        nilaiTugas = input.nextByte();
        System.out.print("Masukan nilai UTS = ");
        nilaiUTS = input.nextByte();
        System.out.print("Masukan nilai UAS = ");
        nilaiUAS = input.nextByte();

        jumlahPresensi = presensi/realisasi*10/100;
        jumlahNilaiTugas = nilaiTugas*20/100;
        jumlahNilaiUTS = nilaiUTS*30/100;
        jumlahNilaiUAS = nilaiUAS*40/100;
        jumlahTotal = jumlahPresensi+jumlahNilaiTugas+jumlahNilaiUTS+jumlahNilaiUAS;

        System.out.print("\nNilai prensi mahasiswa = "+jumlahPresensi+"\n");
        System.out.print("Nilai tugas mahasiswa = "+jumlahNilaiTugas+"\n");
        System.out.print("Nilai UTS mahasiswa = "+jumlahNilaiUTS+"\n");
        System.out.print("Nilai UAS mahasiswa = "+jumlahNilaiUAS+"\n");
        System.out.print("Total nilai mahasiswa = "+jumlahTotal);

        input.close();
    }
}