
package DompetDigital;

import java.util.ArrayList;

public class Bank {
    private String nama;
    private ArrayList<Cabang> daftarCabang;
    private static Bank instance;
    private int kapasitas;

    private Bank(String nama, int kapasitas) {
        this.nama = nama;
        this.kapasitas = kapasitas;
        daftarCabang = new ArrayList<Cabang>();
    }

    public boolean tambahCabang(Cabang cab) {
        if (daftarCabang.size() < kapasitas) {
            daftarCabang.add(cab);
            return true;
        }
        return false;
    }

    public ArrayList<Cabang> getDaftarCabang() {
        return daftarCabang;
    }

    public static Bank getInstance() {
        if (instance == null) {
            instance = new Bank("Bank PENS", 3);
        }
        return instance;
    }

    public String jumlahRekening() {
        int tab = 0, dep = 0, tabA = 0;
        for (Cabang c : daftarCabang) {
            for (Nasabah n : c.getDaftarNasabah()) {
                for (Rekening r : n.getDaftarRekening()) {
                    if (r instanceof Tabungan) {
                        tab++;

                    } else if (r instanceof TabunganAnak) {
                        tabA++;

                    } else {
                        dep++;
                    }

                }
            }

        }
        String s = "tabungan:" + tab + "\n";
        s += "tabunganAnak:" + tabA + "\n";
        s += "deposito:" + dep + "\n";

        return s;
    }

    public Cabang getCabangNasabah(Nasabah nasabah) {
        for (Cabang c : daftarCabang) {
            if (c.getDaftarNasabah().contains(nasabah)) {
                return c;
            }
        }
        return null;
    }

    public String getNama() {
        return nama;
    }

    @Override
    public String toString() {
        String str = "";
        str = str + this.nama + "\n" + jumlahRekening();
        for (int i = 0; i < daftarCabang.size(); i++) {
            str = str + daftarCabang.get(i);
        }

        return str;
    }
}
