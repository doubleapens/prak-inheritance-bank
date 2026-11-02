
package DompetDigital;

import java.util.ArrayList;

public class Nasabah {
    private String noIdentitas;
    private String nama;
    private ArrayList<Rekening> daftarRekening;
    private ArrayList<DompetDigital> daftarDompet;

    public Nasabah(String noIdentitas, String nama) {
        this.noIdentitas = noIdentitas;
        this.nama = nama;
        daftarRekening = new ArrayList<Rekening>();
        daftarDompet = new ArrayList<DompetDigital>();
    }

    public void bukaRekening(Rekening rek) {
        daftarRekening.add(rek);
    }

    public void bukaDompet(DompetDigital dompet) {
        daftarDompet.add(dompet);
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
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Nasabah)) {
            return false;
        }

        Nasabah nasabah = (Nasabah) obj;
        return noIdentitas != null
                ? noIdentitas.equals(nasabah.noIdentitas)
                : nasabah.noIdentitas == null;
    }

    @Override
    public int hashCode() {
        return noIdentitas != null ? noIdentitas.hashCode() : 0;
    }

    @Override
    public String toString() {
        String S = noIdentitas + " " + nama + "\n";
        for (int i = 0; i < daftarRekening.size(); i++) {
            S += daftarRekening.get(i) + "\n";
        }
        return S;
    }
}
