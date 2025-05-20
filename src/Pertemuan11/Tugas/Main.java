package Pertemuan11.Tugas;

//Kelas utama untuk menjalankan program
public class Main {
    public static void main(String[] args) {
        // Membuat objek TransferBank dengan jumlah dan nama bank
        TransferBank tb = new TransferBank(500000, "BCA");

        // Membuat objek DompetDigital dengan jumlah dan saldo awal
        DompetDigital dd = new DompetDigital(200000, 300000);

        // Memanggil method proses dan bonus, lalu mencetak informasi objek
        tb.proses();
        tb.tambahBonus();
        System.out.println(tb);

        System.out.println(); // baris kosong untuk pemisah

        dd.proses();
        dd.tambahBonus();
        System.out.println(dd);
    }
}
