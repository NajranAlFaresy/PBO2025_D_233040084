package pertemuan3;

public class mahasiswa {
    String nim;
    double ipk;
    boolean statusPerwalian;

    // Ini namanya konstruktor
    public mahasiswa (String nim, duble ipk, boolean statusPerwalian) {
        this.nim = nim;
        this.ipk = ipk;
        this.statusPerwalian = statusPerwalian;
    }

    public void perwalian() {
        statusPerwalian = true;
    }
}