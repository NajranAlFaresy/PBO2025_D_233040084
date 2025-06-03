package TugasFinalDanStatic;

public class Mahasiswa { // Tugas 5
    private final String nim; // Tidak bisa diubah
    private String nama;
    private static int totalMahasiswa = 0;
    public static final int MAX_SKS = 24;

    public Mahasiswa(String nim, String nama) {
        this.nim = nim;
        this.nama = nama;
        totalMahasiswa++;
    }

    public void displayInfo() {
        System.out.println("NIM: " + nim);
        System.out.println("Nama: " + nama);
        System.out.println("Max SKS: " + MAX_SKS);
    }

    public static int getTotalMahasiswa() {
        return totalMahasiswa;
    }
}
