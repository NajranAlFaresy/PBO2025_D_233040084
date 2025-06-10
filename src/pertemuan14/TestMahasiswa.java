package TugasFinalDanStatic;

public class TestMahasiswa {
    public static void main(String[] args) {
        Mahasiswa m1 = new Mahasiswa("233040084", "Njan");
        Mahasiswa m2 = new Mahasiswa("233040004", "Surya");

        m1.displayInfo();
        m2.displayInfo();

        System.out.println("Total Mahasiswa Terdaftar: " + Mahasiswa.getTotalMahasiswa());
    }
}
