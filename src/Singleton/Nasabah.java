
import java.util.ArrayList;

public class Nasabah {
    private String noIdentitas;
    private String nama;
    private ArrayList<Rekening> daftarRekening;

    public Nasabah(String noIdentitas, String nama) {
        this.noIdentitas = noIdentitas;
        this.nama = nama;
        daftarRekening = new ArrayList<Rekening>();
    }
    public void bukaRekening(Rekening rek) {
        daftarRekening.add(rek);
    }

    public String getNoIdentitas() {
        return noIdentitas;
    }

    public String getNama() {
        return nama;
    }

    public ArrayList<Rekening> getDaftarRekening() {
        return daftarRekening;
    }

    @Override
    public String toString() {
        String S=noIdentitas + " " + nama + "\n";
        for (int i = 0; i < daftarRekening.size(); i++) {
            S += daftarRekening.get(i) + "\n";
        }
        return S;
    }
}
