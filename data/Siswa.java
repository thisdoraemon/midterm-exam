package data;

public class Siswa {
    private String nama;
    private String nim;

    public Siswa(String name, String nim) {
        this.nama = name;
        this.nim = nim;
    }

    @Override
    public String toString() {
        return nama + " " + nim;
    }
}
