package DompetDigital;

public class DataBank {
    public Bank initializeBank() {
        // Mendapatkan Bank Mandiri
        Bank bank = Bank.getInstance();

        // Membuat cabang
        Cabang surabaya = new Cabang("SBY001", "Surabaya");

        Cabang jakarta = new Cabang("JKT001", "Jakarta");

        Cabang bandung = new Cabang("BDG001", "Bandung");

        Cabang tokyo = new Cabang("TKY001", "tokyo");

        // Menambahkan cabang ke Bank
        bank.tambahCabang(surabaya);
        bank.tambahCabang(jakarta);
        bank.tambahCabang(bandung);
        bank.tambahCabang(tokyo);

        Nasabah intan = new Nasabah("N001", "Intan");

        Rekening tabIntan = new Tabungan("T001", 1000000);

        Rekening depIntan = new Deposito("D001", 100000);

        intan.bukaRekening(tabIntan);

        intan.bukaRekening(depIntan);

        surabaya.tambahNasabah(intan);

        // Intan menabung
        tabIntan.setor(500000);

        Nasabah budi = new Nasabah("N002", "Budi");

        Rekening tabBudi = new TabunganAnak("T002", 2000000, "ortubudi");

        budi.bukaRekening(tabBudi);

        jakarta.tambahNasabah(budi);

        tabBudi.setor(1000000);

        Nasabah ani = new Nasabah("N003", "Ani");

        Rekening tabAni = new Deposito("T003", 3000000);

        ani.bukaRekening(tabAni);

        bandung.tambahNasabah(ani);

        tabAni.setor(750000);

        System.out.println(bank.toString());

        return bank;

    }
}
