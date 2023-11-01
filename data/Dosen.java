package data;

public class Dosen {

    private String nama;
    private String nidk;

    public Dosen(String name, String nidk) {
        this.nama = name;
        this.nidk = nidk;
    }

    @Override
    public String toString() {
        return nama + " " + nidk;
    }
}
