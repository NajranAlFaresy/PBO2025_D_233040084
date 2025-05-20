package Pertemuan11.Tugas;

//Kelas DompetDigital juga merupakan turunan Pembayaran dan implementasi Bonus
public class DompetDigital extends Pembayaran implements Bonus {
    private double saldo; // saldo dompet digital

    // Konstruktor untuk inisialisasi jumlah dan saldo
    public DompetDigital(double jumlah, double saldo) {
        super(jumlah); // memanggil konstruktor dari Pembayaran
        this.saldo = saldo;
    }

    // Implementasi method proses
    @Override
    public void proses() {
        if (saldo >= jumlah) {
            // Jika saldo cukup, lakukan pengurangan saldo
            saldo -= jumlah;
            System.out.println("Pembayaran berhasil menggunakan dompet digital sebesar Rp " + jumlah);
        } else {
            // Jika saldo tidak cukup, tampilkan pesan error
            System.out.println("Saldo tidak cukup.");
        }
    }

    // Implementasi method dari interface Bonus
    @Override
    public void tambahBonus() {
        System.out.println("Bonus dompet digital ditambahkan!");
    }

    // Method untuk menampilkan informasi objek DompetDigital
    @Override
    public String toString() {
        return "Pembayaran DompetDigital: Rp " + jumlah + ", Sisa saldo: Rp " + saldo;
    }
}
