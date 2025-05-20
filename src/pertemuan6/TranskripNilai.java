package pertemuan6;

import java.util.List;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;

public class TranskripNilai {
	private Mahasiswa mahasiswa;
    private KartuHasilStudi kartuHasilStudi;
    private double ipk;
    private String tanggalCetak;

    public TranskripNilai(Mahasiswa mahasiswa) {
        this.mahasiswa = mahasiswa;
        this.kartuHasilStudi = new KartuHasilStudi();
        this.ipk = 0.0;

        // Format tanggal cetak sesuai contoh (WIB dengan jam, menit, detik)
        LocalDateTime now = LocalDateTime.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("EEE MMM dd HH:mm:ss 'WIB' yyyy");
        this.tanggalCetak = now.format(formatter);
    }

    // Getter & Setter
    public String getTanggalCetak() { return tanggalCetak; }

    public void tampilkanTranskrip() {
        mahasiswa.tampilkanInfo();
        System.out.println("Tanggal Cetak: " + tanggalCetak);
        System.out.println("IPK: " + ipk);
        kartuHasilStudi.tampilkanKHS();
    }

    public KartuHasilStudi getKartuHasilStudi() { return kartuHasilStudi; }
}