package KelasGuru;
import java.util.Scanner;
public class KelasGuruTerbarukan {
    public static void main(String[] args) {
        //String-->int-->String-->String
        Scanner input = new Scanner(System.in);
        System.out.println("Name : ");
        String name = input.nextLine();
        
        System.out.println("Mapel : ");
        String mapel = input.nextLine();
        System.out.println("Status : ");
        String status = input.nextLine();
        System.out.println("NIP : ");
        int nip = input.nextInt();
        input.close();    

        KelasGuru dimas = new KelasGuru(name, nip, mapel, status);
        dimas.setId();
        //membuat Object
        //namaClass namaObject = new
        //Constructor;"BuPasha"
        KelasGuru BuPasha = new KelasGuru("BuPasha", 1, "RPL", "Tetap");
        KelasGuru PakThoriq = new KelasGuru("PakThoriq", 2, "TKJ", "Tetap");
        KelasGuru BuAul = new KelasGuru("BuAul", 3, "RPL", "Tetap");
        KelasGuru PakFalah = new KelasGuru("PakFalah", 4, "Bahasa Indonesia", "Tetap");
        KelasGuru BuJevi = new KelasGuru("BuJevi", 5, "Bahasa Inggris", "Tetap");

        BuPasha.name = "BuPasha";
        BuPasha.nip = 1;
        BuPasha.mapel = "RPL";
        BuPasha.status = "Tetap";

        PakThoriq.name = "PakThoriq";
        PakThoriq.nip = 2;
        PakThoriq.mapel = "TKJ";
        PakThoriq.status = "Tetap";

        BuAul.name = "BuAul";
        BuAul.nip = 3;
        BuAul.mapel = "RPL";
        BuAul.status = "Tetap";

        PakFalah.name = "PakFalah";
        PakFalah.nip = 4;
        PakFalah.mapel = "Bahasa Indonesia";
        PakFalah.status = "Tetap";

        BuJevi.name = "BuJevi";
        BuJevi.nip = 5;
        BuJevi.mapel = "Bahasa Inggris";
        BuJevi.status = "Tetap";

        //mengakses method
        BuPasha.setId();
        System.out.println("--------------------------");
        PakThoriq.setId();
        System.out.println("--------------------------");
        BuAul.setId();
        System.out.println("--------------------------");
        PakFalah.setId();
        System.out.println("--------------------------");
        BuJevi.setId();
        System.out.println("--------------------------");
    }

}