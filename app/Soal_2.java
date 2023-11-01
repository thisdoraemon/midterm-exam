package app;

import data.Dosen;
import data.Matkul;
import data.Siswa;

public class Soal_2 {
    public static void main(String[] args) {
        Dosen[] dosenoop = new Dosen[2];
        dosenoop[0] = new Dosen("Erdhi W", "202301");
        dosenoop[1] = new Dosen("Andre K", "202302");

        System.out.println(dosenoop[0]);
        System.out.println(dosenoop[1]);

        Siswa[] siswa = new Siswa[3];
        siswa[0] = new Siswa("Saturo", "29.N6.0001");
        siswa[1] = new Siswa("Gojo", "29.N6.0002");
        siswa[2] = new Siswa("Boruto", "29.N6.0003");

        System.out.println(siswa[0]);
        System.out.println(siswa[1]);
        System.out.println(siswa[2]);

        Matkul matkul = new Matkul("OOP", dosenoop, siswa, 30);
        System.out.println(matkul);

    }
}
