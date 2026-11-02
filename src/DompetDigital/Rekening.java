package DompetDigital;

public abstract class Rekening implements Transaksi{

    private String nomorRekening;
    protected double saldo;

    public Rekening (String nomorRekening, double saldo) {

        this.nomorRekening = nomorRekening;
        this.saldo = saldo;
    }

    public String getNomorRekening() {
        return nomorRekening;
    }

    public double getSaldo() {
        return saldo;
    }

    public boolean setor(double jumlah) {
        if (jumlah > 0) {
            saldo += jumlah;
        }else {
            System.out.println("jumlah uang harus lebih dari 0");
        }
        return false;
    }

    public abstract boolean tarik(double jumlah);

    public abstract double hitungBunga();

    public void prosesBunga() {
        double bunga = hitungBunga();
        saldo += bunga;
    }

    @Override
    public String toString() {
        return "Nomor rekening: " + nomorRekening + "\n" + "Saldo: " + saldo + "\n";

    }
}