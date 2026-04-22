import java.util. Scanner;
public class latihan2{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        String Nama; String Nim; String tempatTinggal; int usia;
        
        System.out.print("Input nama: ");
        Nama=input.nextLine();

        System.out.print("Input usia: ");
        usia=input.nextInt();
        input.nextLine();

        System.out.print("Input nim: ");
        Nim=input.nextLine();

        System.out.print("Input tempat tinggal: ");
        tempatTinggal=input.nextLine();

        System.out.print("Nama "+ Nama);
        System.out.print(" Usia "+ usia +" tahun ");
        System.out.print("nim "+ Nim );
        System.out.print(" tempat tinggal "+ tempatTinggal);
    }
}