public class MahasiswaSarjana extends Mahasiswa{

    private int JumlahPublikasi;
    public MahasiswaSarjana(String nama, String nim, int tahunMasuk) {
        super(nama, nim, tahunMasuk);
        jumlahSks = 0;
        ipk = 0;
        JumlahPublikasi = 0;
    }

    public void tambahPublikasi(int jumlah) {
        JumlahPublikasi += jumlah;
    }

    public int getJumlahPublikasi() {
        return JumlahPublikasi;
    }


    @Override
    public String getNama() {
        return super.getNama();
    }

    @Override
    public void setJumlahSks(int jumlahSks) {
        super.setJumlahSks(jumlahSks);
    }



}
