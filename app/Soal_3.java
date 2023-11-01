package app;

import data.Dosen;
import data.Matkul;
import data.Siswa;

public class Soal_3 {
    public static void main(String[] args) {
        Dosen ErdhiW = new Dosen("Erdhi W", "202301");
        Dosen AndreK = new Dosen("Andre K", "202302");
        Dosen YogaD = new Dosen("Yoga D", "202303");
        Dosen Sapto = new Dosen("Sapto", "202304");
        Dosen Sthepani = new Dosen("Sthepani", "202305");
        Dosen Cahyo = new Dosen("Cahyo", "202306");

        // Siswa
        Siswa Saturo = new Siswa("Saturo", "29.06.0001");
        Siswa Gojo = new Siswa("Gojo", "29.06.0002");
        Siswa Boruto = new Siswa("Boruto", "29.06.0003");
        Siswa Naruto = new Siswa("Naruto", "29.06.0004");
        Siswa Sasuke = new Siswa("Sasuke", "29.06.0005");
        Siswa Kakashi = new Siswa("Kakashi", "29.06.0006");
        Siswa Ino = new Siswa("Ino", "29.06.0007");
        Siswa Bard = new Siswa("Ezra Natanael", "22.N4.0008");

        // Matkul
        Matkul oop = new Matkul("OOP", new Dosen[]{ErdhiW, AndreK}, new Siswa[]{Saturo, Gojo, Boruto}, 3);
        Matkul jaringanKomputer = new Matkul("Jaringan Komputer", new Dosen[]{YogaD, Sapto}, new Siswa[]{Naruto, Sasuke, Kakashi}, 3);
        Matkul implementasiSistemInformasi = new Matkul("Implementasi Sistem Informasi", new Dosen[]{Sthepani, Cahyo}, new Siswa[]{Ino, Bard}, 2);

        System.out.println(oop);
        System.out.println(jaringanKomputer);
        System.out.println(implementasiSistemInformasi);
    }
}
