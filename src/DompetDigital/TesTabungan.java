package DompetDigital;

public class TesTabungan {
    public static void main() {
        Transaksi t;
        t = new Tabungan("T001", 1000000);
        t.setor(100000);

        t.setor(50000);

    }
}
