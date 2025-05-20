package Pertemuan11.Tugas;

//Kelas TransferBank mewarisi Pembayaran dan mengimplementasikan Bonus
public class TransferBank extends Pembayaran implements Bonus {
    private String namaBank; // nama bank untuk transfer

    // Konstruktor untuk inisialisasi jumlah dan nama bank
    public TransferBank(double jumlah, String namaBank) {
        super(jumlah); // memanggil konstruktor dari kelas Pembayaran
        this.namaBank = namaBank;
    }

    // Implementasi method proses dari kelas abstrak Pembayaran
    @Override
    public void proses() {
        System.out.println("Memproses pembayaran melalui bank " + namaBank + " sebesar Rp " + jumlah);
    }

    // Implementasi method dari interface Bonus
    @Override
    public void tambahBonus() {
        System.out.println("Bonus transfer bank ditambahkan!");
    }

    // Method toString untuk menampilkan informasi objek TransferBank
    @Override
    public String toString() {
        return "TransferBank ke " + namaBank + " sejumlah Rp " + jumlah;
    }
}
