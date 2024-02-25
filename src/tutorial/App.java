package tutorial;

// memuat class sebagai template
class Mahasiswa {
    String nama;
    String nim;
    String jurusan;
    double ipk;
    int umur;
}

public class App {
    public static void main(String[] args) throws Exception {
        Mahasiswa mahasiswa1 = new Mahasiswa();
        mahasiswa1.nama = "Dinda";
        mahasiswa1.nim = "2022";
        mahasiswa1.jurusan = "Informatika";
        mahasiswa1.ipk = 4.0;
        mahasiswa1.umur = 19;

        System.out.println(mahasiswa1.nama);
        System.out.println(mahasiswa1.nim);
        System.out.println(mahasiswa1.jurusan);
        System.out.println(mahasiswa1.ipk);
        System.out.println(mahasiswa1.umur);

        Mahasiswa mahasiswa2 = new Mahasiswa();
        mahasiswa2.nama = "Indriana";
        mahasiswa2.nim = "2022";
        mahasiswa2.jurusan = "Informatika";
        mahasiswa2.ipk = 4.0;
        mahasiswa2.umur = 19;

        System.out.println(mahasiswa2.nama);
        System.out.println(mahasiswa2.nim);
        System.out.println(mahasiswa2.jurusan);
        System.out.println(mahasiswa2.ipk);
        System.out.println(mahasiswa2.umur);
    }
}
