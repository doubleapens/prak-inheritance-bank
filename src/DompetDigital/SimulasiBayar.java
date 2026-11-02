package DompetDigital;

public class SimulasiBayar {
    public static void main(String[] args) {
        Tabungan tabungan = new Tabungan("T001", 2000000);
        DompetDigital dompet = new DompetDigital("D001", "OVO");

        MobileBankingSimple mb = new MobileBankingSimple();
        mb.topUp(tabungan, dompet, 100000);
        System.out.println(tabungan);
        System.out.println(dompet);

        mb.topUp(tabungan, dompet, 300000);
        System.out.println(tabungan);
        System.out.println(dompet);

        LayananBayar listrik = new PembayaranTagihan("Listrik");
        mb.bayar(listrik, tabungan, 200000);
        System.out.println(tabungan);

        LayananBayar pulsa = new PembelianPulsa("08123123123");
        mb.bayar(pulsa, dompet, 50000);
        System.out.println(dompet);
    }
}
