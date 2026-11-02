package DompetDigital;

public class Tabungan extends Rekening {
    private static double bunga;
    private static double saldoMinimum;
    
    public Tabungan(String nomorRekening, double saldo) {
        super(nomorRekening, saldo);
    }

    public static void setSaldoMinimum(double saldoMinimum) {
        Tabungan.saldoMinimum = saldoMinimum;
    }

    public static void setBunga(double bunga) {
        Tabungan.bunga = bunga;
    }

    public double getBunga() {
        return bunga;
    }
    
    public double getSaldoMinimum() {
        return saldoMinimum;
    }

    @Override
    public String toString() {
        // TODO Auto-generated method stub
        return super.toString() + "Bunga: " + bunga + "\n" + "Saldo minimum: " + saldoMinimum + "\n";
    }

    @Override
    public double hitungBunga() {
        // TODO Auto-generated method stub
        return super.getSaldo() * bunga;
    }

    @Override
    public boolean tarik(double jumlah) {
        // TODO Auto-generated method stub
        if (super.getSaldo() - jumlah > saldoMinimum){
            saldo -= jumlah;
            return true;
        }else {
            return false;
        }
    }

}
