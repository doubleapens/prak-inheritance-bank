
public class Deposito extends Rekening {
    private static double bunga;
    private int jangkaWaktu;
    private int bulanBerjalan;

    public Deposito(String nomorRekening, double saldo) {
        super(nomorRekening, saldo);
    }

    public static void setBunga(double bunga) {
        Deposito.bunga = bunga;
    }

    public void setBulanBerjalan(int bulanBerjalan) {
        this.bulanBerjalan = bulanBerjalan;
    }

    public void setJangkaWaktu(int jangkaWaktu) {
        this.jangkaWaktu = jangkaWaktu;
    }

    public void tambahBulan() {
        bulanBerjalan++;
    }

    public void resetBulan() {
        bulanBerjalan = 0;
    }

    public boolean isJatuhTempo() {
        if (bulanBerjalan >= jangkaWaktu) {
            return true;
        }

        return false;
    }

    @Override
    public boolean tarik(double jumlah) {
        if (isJatuhTempo()) {
            saldo -= jumlah;
            return true;
        }

        return false;
    }

    @Override
    public double hitungBunga() {
        // TODO Auto-generated method stub
        if (isJatuhTempo()) {
            return super.getSaldo() * bunga * jangkaWaktu / 12;
        }

        return 0;
    }

    @Override
    public String toString() {
        // TODO Auto-generated method stub
        return super.toString() + "Bunga: " + bunga + "\n" + "Jangka waktu: " + jangkaWaktu + "\n" + "Bulan berjalan: " + bulanBerjalan + "\n";
    }
}
