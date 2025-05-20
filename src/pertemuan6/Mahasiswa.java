package pertemuan6;

public class Mahasiswa {
	private String nrp;
    private String nama;

    public Mahasiswa(String nrp, String nama) {
        this.nrp = nrp;
        this.nama = nama;
    }

    // Getter & Setter
    public String getNrp() { return nrp; }
    public void setNrp(String nrp) { this.nrp = nrp; }

    public String getNama() { return nama; }
    public void setNama(String nama) { this.nama = nama; }

    public void tampilkanInfo() {
        System.out.println("NRP: " + nrp + ", Nama: " + nama);
    }
}