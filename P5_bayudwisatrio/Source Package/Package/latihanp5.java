import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class latihanp5 {
    public static void main(String[] args) {
        BufferedReader dataIn = new BufferedReader(new InputStreamReader(System.in));
        String BacaInput = "";
        int JmlData = 0;
        int DataArray[];

        System.out.print("Jumlah data : ");
        try {
            BacaInput = dataIn.readLine();
            JmlData = Integer.parseInt(BacaInput);
        } catch (IOException e) {
            System.out.println("Ada kesalahan input!");
        }

        DataArray = new int[JmlData];

        System.out.println();
        for (int i = 0; i < JmlData; i++) {
            System.out.print("DataArray[" + i + "] = ");
            try {
                BacaInput = dataIn.readLine();
                DataArray[i] = Integer.parseInt(BacaInput);
            } catch (IOException e) {
                System.out.println("Ada kesalahan input!");
            }
        }

        System.out.println();
        for (int i = 0; i < JmlData; i++) {
            System.out.println("DataArray[" + i + "] = " + DataArray[i]);
        }
    }
}
