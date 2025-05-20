package pertemuan6;

public class MataKuliah {
	private String kode;
    private String namaMatkul;
    private String nilaiHuruf;
    private int sks;

    public MataKuliah(String kode, String namaMatkul, String nilaiHuruf, int sks) {
        this.kode = kode;
        this.namaMatkul = namaMatkul;
        this.nilaiHuruf = nilaiHuruf;
        this.sks = sks;
    }

    // Getter & Setter
    public String getKode() { return kode; }
    public void setKode(String kode) { this.kode = kode; }

    public String getNamaMatkul() { return namaMatkul; }
    public void setNamaMatkul(String namaMatkul) { this.namaMatkul = namaMatkul; }

    public String getNilaiHuruf() { return nilaiHuruf; }
    public void setNilaiHuruf(String nilaiHuruf) { this.nilaiHuruf = nilaiHuruf; }

    public int getSks() { return sks; }
    public void setSks(int sks) { this.sks = sks; }

    public void tampilkanInfo() {
        System.out.println(kode + " - " + namaMatkul + " - " + nilaiHuruf + " - " + sks);
    }
}