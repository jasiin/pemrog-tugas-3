public class Tabungan {

    private String idTabungan;
    private String password;
    private int saldo;

    public Tabungan(int saldo) {
        this.saldo = saldo;
    }

    public Tabungan(String idT, String pass, int saldo) {
        this.idTabungan = idT;
        this.password = pass;
        this.saldo = saldo;
    }

    public void simpanUang(int jumlah) {
        saldo += jumlah;
    }

    public boolean ambilUang(int jumlah) {
        if ((saldo - jumlah) < 0) {
            return false;
        } else {
            saldo -= jumlah;
            return true;
        }
    }

    public int getSaldo() {
        return saldo;
    }

    public void setSaldo(int saldo) {
        this.saldo = saldo;
    }

    public boolean transfer(Tabungan tabunganTujuan, int jumlahTransfer) {
        if (this.saldo > jumlahTransfer) {
            int saldoSaya = getSaldo();
            int saldoTujuan = tabunganTujuan.getSaldo();

            setSaldo(saldoSaya -= jumlahTransfer);
            tabunganTujuan.setSaldo(saldoTujuan += jumlahTransfer);
            return true;
        } else {
            return false;
        }
    }

    @Override
    public String toString() {
        return "Tabungan {\n" + "idTabungan=" + idTabungan + ",\npassword=" + password + ",\nsaldo=" + saldo + "\n}";
    }

}
