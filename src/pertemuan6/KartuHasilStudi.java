package pertemuan6;

import java.util.ArrayList;
import java.util.List;

public class KartuHasilStudi {
	private ArrayList<MataKuliah> daftarMatakuliah = new ArrayList<>();

    public void tambahMatakuliah(MataKuliah matkul) {
        daftarMatakuliah.add(matkul);
    }

    public void tampilkanKHS() {
        for (MataKuliah matkul : daftarMatakuliah) {
            matkul.tampilkanInfo();
        }
    }
	
}