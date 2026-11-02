package DompetDigital;

public class PembayaranTagihan implements LayananBayar{
    private String jenisTagihan;

    public PembayaranTagihan(String jenisTagihan) {
        this.jenisTagihan = jenisTagihan;
    }

    @Override
    public boolean bayar(Transaksi sumberDana, double jumlah) {
        if(jumlah <= 0) return false;
        if(sumberDana.tarik(jumlah)){
            System.out.println("Pembayaran " + jenisTagihan + " berhasil\nSenilai: " + jumlah);
            return true;
        }
        System.out.println("Pembayaran gagal");
        return false;
    }
}
