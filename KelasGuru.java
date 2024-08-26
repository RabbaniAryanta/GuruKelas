package KelasGuru;

public class KelasGuru {
    //Variable
    String name;
    int nip;
    String mapel;
    String status;

    //Constructor
    public KelasGuru() {
        name = "Kosong";
        nip = 0;
        mapel = "Kosong";
        status = "Kosong";
    }

    //Constructor
    public KelasGuru(String name, int nip, String mapel, String status) {
        name = name;
        nip = nip;
        mapel = mapel;
        status = status;
    }

    //Getter
    //Setter
    //method
    public void setId() {
        System.out.println("Name = " + name);
        System.out.println("NIP = " + nip);
        System.out.println("Mapel = " + mapel);
        System.out.println("Status = " + status);
    }
}
