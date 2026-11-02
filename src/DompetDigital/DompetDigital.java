package DompetDigital;

public class DompetDigital implements Transaksi {
    private double saldo;
    private String id;
    private String nama;

    public DompetDigital(String id, String nama) {
        this.id = id;
        this.nama = nama;
    }

    @Override
    public boolean setor(double jumlah) {
        if (jumlah > 0) {
            saldo += jumlah;
        }
        return true;
    }

    @Override
    public boolean tarik(double jumlah) {
        if (jumlah > 0 && jumlah <= saldo) {
            saldo -= jumlah;
            return true;
        }
        return false;
    }

    @Override
    public String toString() {
        return "Dompet Digital: " + id + "\nSaldo: " + saldo + "\n";
    }
}
