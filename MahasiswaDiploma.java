public class MahasiswaDiploma extends Mahasiswa{
    private int jumlahSertifikat;
    private int jumlahProdukHki;

    public MahasiswaDiploma(String nama, String nim, int tahunMasuk) {
        super(nama, nim, tahunMasuk);
        jumlahSks = 0;
        ipk = 0;
        jumlahSertifikat = 0;
        jumlahProdukHki = 0;
    }

    public void tambahSertifikat(int jumlah) {
        jumlahSertifikat += jumlah;
    }

    public void tambahProdukHki(int jumlah) {
        jumlahProdukHki += jumlah;
    }

    public int getJumlahSertifikat() {
        return jumlahSertifikat;
    }

    public int getJumlahProdukHki() {
        return jumlahProdukHki;
    }

    @Override
    public void setJumlahSks(int jumlahSks) {
        super.setJumlahSks(jumlahSks);
    }

    @Override
    public String getNama() {
        return super.getNama();
    }

    @Override
    public String getNim() {
        return super.getNim();
    }

    @Override
    public int getTahunMasuk() {
        return super.getTahunMasuk();
    }

    @Override
    public int getJumlahSks() {
        return super.getJumlahSks();
    }

    @Override
    public double getIpk() {
        return super.getIpk();
    }
}
