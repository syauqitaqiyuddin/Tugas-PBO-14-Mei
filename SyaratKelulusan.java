import java.time.LocalDate;
public class SyaratKelulusan {
    private int sksMin = 144;
    private double MasaStudiMin = 3.5;
    private int PublikasiMin = 1;
    private int SertifikatMin = 1;
    private int ProdukHkiMin = 1;

    public SyaratKelulusan(Mahasiswa mahasiswa) {

    }

    //Cek syarat kelulusan
    public boolean cekKelulusan(Mahasiswa mahasiswa) {
        boolean lulus = true;

        // Pengecekan jumlah SKS
        if (mahasiswa.getJumlahSks() < sksMin) {
            lulus = false;
        }

        // Pengecekan masa studi
        if (hitungMasaStudi(mahasiswa) < MasaStudiMin) {
            lulus = false;
        }

        // Pengecekan publikasi (Untuk Sarjana)
        if (mahasiswa instanceof MahasiswaSarjana && ((MahasiswaSarjana) mahasiswa).getJumlahPublikasi() < PublikasiMin) {
            lulus = false;
        }

    // Pengecekan sertifikat atau produk HKI (Untuk Diploma)
            if (mahasiswa instanceof MahasiswaDiploma) {
        MahasiswaDiploma mhsDiploma = (MahasiswaDiploma) mahasiswa;
        if ((mhsDiploma.getJumlahSertifikat() < SertifikatMin) && (mhsDiploma.getJumlahProdukHki() < ProdukHkiMin)) {
            lulus = false;
        }
    }
            return lulus;
}

    // Metode untuk menghitung masa studi mahasiswa dalam tahun
    private double hitungMasaStudi(Mahasiswa mahasiswa) {
        int tahunSekarang = LocalDate.now().getYear();
        return (tahunSekarang - mahasiswa.getTahunMasuk()) + ((double) mahasiswa.getNomerUrut() / 1000);
    }
}

