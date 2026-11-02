package DompetDigital;

public class PembelianPulsa implements LayananBayar {
    private String nomorTelepon;

    public PembelianPulsa(String nomorTelepon) {
        this.nomorTelepon = nomorTelepon;
    }

    @Override
    public boolean bayar(
            Transaksi sumberDana, double jumlah) {
        if (jumlah <= 0)
            return false;

        if (sumberDana.tarik(jumlah)) {
            System.out.println(
                    "Pulsa berhasil untuk " + nomorTelepon + "\nSenilai: " + jumlah);
            return true;
        }
        System.out.println("Pembelian pulsa gagal");
        return false;
    }
}
