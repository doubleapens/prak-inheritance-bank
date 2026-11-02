package DompetDigital;

public class MobileBankingSimple {
    public boolean topUp(Transaksi rekening, DompetDigital dompet, double jumlah) {
        if (rekening.tarik(jumlah)) {
            dompet.setor(jumlah);
            return true;
        }
        return false;
    }

    public boolean bayar(LayananBayar layanan, Transaksi sumberDana, double jumlah) {
        return layanan.bayar(sumberDana, jumlah);
    }
}
