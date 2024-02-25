package tutorial;

// memuat class sebagai template
class Polos {
   String dataString = "polos";
   int dataInteger = 0;
}

// class dengan constructor
class Mahasiswa{
    String nama;
    String nim;
    String jurusan;

    // constructor di panggil saat object pertama kali dibuat
    // Mahasiswa() {
    //     System.out.println("ini adalah constructor");
    // }

    // constructor dengan parameter
        Mahasiswa(String inputNama, String inputNim, String inputJurusan) {
            nama = inputNama;
            nim = inputNim;
            jurusan = inputJurusan;

            System.out.println(nama);
            System.out.println(nim);
            System.out.println(jurusan);
    }
}

public class App {
    public static void main(String[] args) throws Exception {

        Mahasiswa mahasiswa1 = new Mahasiswa("rachel","4", "informatika");
        Mahasiswa mahasiswa2 = new Mahasiswa("didna","4", "informatika");
        Mahasiswa mahasiswa3 = new Mahasiswa("ginting","4", "informatika");



        // Polos objecPolos = new Polos();
        // // objecPolos.dataString = "polos";
        // // objecPolos.dataInteger = 4;

        // System.out.println(objecPolos.dataString);
        // System.out.println(objecPolos.dataInteger);
    }
}
