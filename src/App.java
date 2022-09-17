public class App {

    public static void main(String args[]) {
        int tmp;
        boolean status;
        Nasabah agus = new Nasabah("Agus", "Daryanto");
        System.out.println("Nasabah atas nama : " + agus.getNamaAwal() + " " + agus.getNamaAkhir() + "\n");
        agus.setTabungan(new Tabungan(5000));
        tmp = agus.getTabungan().getSaldo();

        System.out.println("Saldo awal : " + tmp + "\n");
        agus.getTabungan().simpanUang(3000);
        System.out.println("Jumlah uang yang disimpan : 3000" + "\n");
        status = agus.getTabungan().ambilUang(6000);
        System.out.print("Jumlah uang yang diambil : 6000" + "\n");

        if (status) {
            System.out.println(" ok");
        } else {
            System.out.println(" gagal");
        }
        agus.getTabungan().simpanUang(3500);
        System.out.println("Jumlah uang yang disimpan : 3500" + "\n");
        status = agus.getTabungan().ambilUang(4000);
        System.out.print("Jumlah uang yang diambil : 4000" + "\n");

        if (status) {
            System.out.println(" ok" + "\n");
        } else {
            System.out.println(" gagal" + "\n");
        }

        status = agus.getTabungan().ambilUang(1600);
        System.out.print("Jumlah uang yang diambil : 1600" + "\n");

        if (status) {
            System.out.println(" ok" + "\n");
        } else {
            System.out.println(" gagal" + "\n");
        }
        agus.getTabungan().simpanUang(2000);
        System.out.println("Jumlah uang yang disimpan : 2000" + "\n");
        tmp = agus.getTabungan().getSaldo();
        System.out.println("Saldo sekarang = " + tmp);

        Nasabah budi = new Nasabah("Budi", "Hartono");
        budi.setTabungan(new Tabungan(10000));
        System.out.println(budi.toString());
        System.out.println(agus.toString());

        System.out.println("Budi akan transfer Agus 5000" + "\n");
        budi.getTabungan().transfer(agus.getTabungan(), 5000);
        System.out.println(budi.toString());
        System.out.println(agus.toString());

        System.out.println("Agus akan transfer Budi 1000" + "\n");
        agus.getTabungan().transfer(budi.getTabungan(), 1000);
        System.out.println(budi.toString());
        System.out.println(agus.toString());

    }
}