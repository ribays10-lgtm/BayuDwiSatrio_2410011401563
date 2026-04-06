public class inputdata {
    public static void main(String args[]){
        String nama = "BayuSatrio";
        Integer angka = 20;
        Boolean status = false;

        System.out.println("Tipe data: " +nama.getClass().getSimpleName());
        System.out.println("Tipe data Integer / int: " +angka.getClass().getSimpleName());
        System.out.println("Tipe data bool: " +status.getClass().getSimpleName());
    }
}