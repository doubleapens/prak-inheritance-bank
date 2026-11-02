package DompetDigital;

public class MainMobileBanking {
    public static void main(String[] args) {
        DataBank dataBank = new DataBank();
        Bank bank = dataBank.initializeBank();

        Nasabah intan = bank.getDaftarCabang().get(0).getDaftarNasabah().get(0);
        Nasabah budi = bank.getDaftarCabang().get(1).getDaftarNasabah().get(0);

        MobileBanking mb = new MobileBanking(intan, bank);

        System.out.println("Nama Nasabah: " + mb.getNasabah().getNama());
        System.out.println("Cabang Nasabah: " + mb.getCabangNasabah().getNama());

        DompetDigital dompetOvo = new DompetDigital("D001", "OVO");
        mb.getNasabah().bukaDompet(dompetOvo);

        DompetDigital dompetDana = new DompetDigital("D002", "DANA");
        mb.getNasabah().bukaDompet(dompetDana);

        mb.cekSaldo(intan.getDaftarRekening().get(0));

        mb.topUp(intan.getDaftarRekening().get(0), dompetOvo, 100000);
        mb.cekSaldo(intan.getDaftarRekening().get(0));
        System.out.println(dompetOvo);
        mb.topUp(intan.getDaftarRekening().get(0), dompetDana, 300000);
        mb.cekSaldo(intan.getDaftarRekening().get(0));
        System.out.println(dompetDana);

        LayananBayar listrik = new PembayaranTagihan("Listrik");
        mb.bayar(listrik, intan.getDaftarRekening().get(0), 200000);
        mb.cekSaldo(intan.getDaftarRekening().get(0));
        LayananBayar pulsa = new PembelianPulsa("08123123123");
        mb.bayar(pulsa, dompetOvo, 50000);
        System.out.println(dompetOvo);

        mb.transfer(intan.getDaftarRekening().get(0), budi.getDaftarRekening().get(0), 50000);
        mb.cekSaldo(intan.getDaftarRekening().get(0));
        mb.cekSaldo(budi.getDaftarRekening().get(0));
    }
}
