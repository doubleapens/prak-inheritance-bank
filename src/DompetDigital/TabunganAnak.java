package DompetDigital;

public class TabunganAnak extends Rekening {
    private static double bunga;
    private String namaWali;
    private static double saldoMinimum;
    private static double batasTanpaAcc;

    public TabunganAnak(String nomerRekening, double saldo, String namaWali) {
        super(nomerRekening, saldo);
        this.namaWali = namaWali;
    }

    public static void setBunga(double bunga) {
        TabunganAnak.bunga = bunga;
    }

    public static void setSaldoMinimum(double saldoMinimum) {
        TabunganAnak.saldoMinimum = saldoMinimum;
    }

    public static void setBatasTanpaAcc(double batasTanpaAcc) {
        TabunganAnak.batasTanpaAcc = batasTanpaAcc;
    }

    public String getNamaWali() {
        return namaWali;
    }

    @Override
    public double hitungBunga() {
        // TODO Auto-generated method stub
        return super.getSaldo() * bunga;
    }

    @Override
    public boolean tarik(double jumlah) {
        // TODO Auto-generated method stub
        if ((super.getSaldo() - jumlah > saldoMinimum) && (jumlah < batasTanpaAcc)){
            saldo -= jumlah;
            return true;
        }else {
            return false;
        }
    }

    public boolean tarik(double jumlah, boolean disetujuiWali) {
        if (!tarik(jumlah)) {
            if (disetujuiWali == true) {
                saldo -= jumlah;
                return true;
            }
        }

        return false;
    }

    @Override
    public String toString() {
        // TODO Auto-generated method stub
        return super.toString() + "Bunga: " + bunga + "\n" + "Saldo minimum: " + saldoMinimum + "\n" + "Nama wali: " + namaWali + "\n";
    }
}
