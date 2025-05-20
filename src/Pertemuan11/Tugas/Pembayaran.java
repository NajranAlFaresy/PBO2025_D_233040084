package Pertemuan11.Tugas;

//Kelas abstrak Pembayaran berisi atribut umum dan method abstrak
public abstract class Pembayaran {

	    protected double jumlah; // atribut jumlah pembayaran

	    // Konstruktor untuk menginisialisasi jumlah
	    public Pembayaran(double jumlah) {
	        this.jumlah = jumlah;
	    }

	    // Method abstrak yang harus diimplementasikan di kelas turunan
	    public abstract void proses();
}
