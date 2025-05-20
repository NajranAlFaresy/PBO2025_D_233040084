package Pertemuan11.Latihan1;

//Mendefinisikan kelas Lingkaran yang merupakan turunan (subclass) dari kelas abstrak Bentuk
public class Lingkaran extends Bentuk {
	
    public double jari2;

	 /* Konstruktor Lingkaran yang memanggil konstruktor superclass Bentuk
     * dengan parameter jari-jari
     */
    public Lingkaran(double jari2) {
        this.jari2 = jari2;
    }
    
    /*
     * Method luas di kelas Lingkaran override (ditulis ulang) dan diimplementasikan
     * dengan rumus PHI*r*r
     */
    @Override
    public double luas() {
        return PHI*jari2*jari2;
    }
}
