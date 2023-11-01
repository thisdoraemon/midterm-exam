package data;

public class Matkul {

    private String namaMatkul;
    private int jumlahSiswa;
    Dosen[] dosen;
    Siswa[] siswa;

    public Matkul(String namaMatkul, Dosen[] dosenoop, Siswa[] siswa, int jumlahSiswa) {
        this.namaMatkul = namaMatkul;
        this.dosen = dosenoop;
        this.siswa = siswa;
        this.jumlahSiswa = jumlahSiswa;
    }

    @Override
    public String toString() {
        String dosenString = "";
        boolean adaDan = false;
        for (Dosen d : dosen) {
            if (adaDan) {
                dosenString += " dan ";
            } else {
                adaDan = true;
            }
            dosenString += d;
        }

        String siswaString = "";
        for (Siswa s : siswa) {
            siswaString += s + "\n";
        }

        return namaMatkul + " pengajar : " + dosenString + "\n" + "siswa: " + siswaString;
    }
}
