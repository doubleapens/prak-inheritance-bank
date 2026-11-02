
import java.util.ArrayList;

public class Cabang {
    private String kode;
    private String nama;
    private ArrayList<Nasabah> daftarNasabah;

    public Cabang(String kode, String nama) {
        this.kode = kode;
        this.nama = nama;
        daftarNasabah = new ArrayList<Nasabah>();
    }

    public String getKode() {
        return kode;
    }

    public void setKode(String kode) {
        this.kode = kode;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public ArrayList<Nasabah> getDaftarNasabah() {
        return daftarNasabah;
    }

    public boolean tambahNasabah(Nasabah n) {
        return daftarNasabah.add(n);

    }

    @Override
    public String toString() {
        String S=kode + " " + nama + "\n";
        for (int i=0; i<daftarNasabah.size(); i++){
            S=S + daftarNasabah.get(i) + "\n";
        }
        return S;
    }
}


