package DompetDigital;

public class MobileBanking {
    private Bank bank;
    private Nasabah nasabah;
    private Cabang cabangNasabah;

    public MobileBanking(Nasabah nasabah, Bank bank) {
        this.nasabah = nasabah;
        this.bank = bank;
        this.cabangNasabah = bank.getCabangNasabah(nasabah);
    }

    public Cabang getCabangNasabah() {
        return cabangNasabah;
    }

    public Nasabah getNasabah() {
        return nasabah;
    }

    public boolean setor(Rekening rekening, double jumlah) {
        return rekening.setor(jumlah);
    }

    public boolean tarik(Rekening rekening, double jumlah) {
        return rekening.tarik(jumlah);
    }

    public boolean transfer(Rekening rekeningAsal, Rekening rekeningTujuan, double jumlah) {
        if (rekeningAsal.tarik(jumlah)) {
            rekeningTujuan.setor(jumlah);
            return true;
        }
        return false;
    }

    public void cekSaldo(Rekening rekening) {
        System.out.println("Saldo Rekening " + rekening.getNomorRekening() + ": " + rekening.getSaldo());
    }

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
