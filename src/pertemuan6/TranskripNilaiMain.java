package pertemuan6;

public class TranskripNilaiMain {
	public static void main(String[] args) {
        // Membuat Mahasiswa
        Mahasiswa mhs = new Mahasiswa("233040047", "hilmy");

        // Membuat Mata Kuliah dengan Nilai Huruf
        MataKuliah matkul1 = new MataKuliah("001", "Algoritma Pemrograman 1", "A", 3);
        MataKuliah matkul2 = new MataKuliah("002", "Algoritma Pemrograman 2", "BC", 3);
        MataKuliah matkul3 = new MataKuliah("003", "Pemrograman Berorientasi Objek", "B", 3);

        // Membuat Transkrip Nilai
        TranskripNilai transkrip = new TranskripNilai(mhs);

        // Menambahkan Mata Kuliah ke Kartu Hasil Studi
        transkrip.getKartuHasilStudi().tambahMatakuliah(matkul1);
        transkrip.getKartuHasilStudi().tambahMatakuliah(matkul2);
        transkrip.getKartuHasilStudi().tambahMatakuliah(matkul3);

        // Menampilkan Transkrip Nilai
        transkrip.tampilkanTranskrip();
    }
}