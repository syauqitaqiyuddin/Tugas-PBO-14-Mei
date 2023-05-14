public class Main {
    public static void main(String[] args) {
            // Membuat objek mahasiswa diploma
            MahasiswaDiploma mhsDiploma = new MahasiswaDiploma("Sugeng Riyadin", "20225001/SV/212", 2022);
            mhsDiploma.setJumlahSks(144);
            mhsDiploma.tambahProdukHki(0);

            // Membuat objek mahasiswa sarjana
            MahasiswaSarjana mhsSarjana = new MahasiswaSarjana("Yudi Diesel", "20214301/SV/534", 2021);
            mhsSarjana.setJumlahSks(144);
            mhsSarjana.tambahPublikasi(0);

        //Syarat kelulusan untuk mahasiswa diploma
        SyaratKelulusan syaratDiploma = new SyaratKelulusan(mhsDiploma);
        if (syaratDiploma.cekKelulusan(mhsDiploma)) {
            System.out.println("Mahasiswa " + mhsDiploma.getNama() + " telah memenuhi syarat kelulusan diploma");
        } else {
            System.out.println("Mahasiswa " + mhsDiploma.getNama() + " belum memenuhi syarat kelulusan diploma");
        }

        // Syarat kelulusan untuk mahasiswa sarjana
        SyaratKelulusan syaratSarjana = new SyaratKelulusan(mhsSarjana);
        if (syaratSarjana.cekKelulusan(mhsSarjana)) {
            System.out.println("Mahasiswa " + mhsSarjana.getNama() + " telah memenuhi syarat kelulusan sarjana");
        } else {
            System.out.println("Mahasiswa " + mhsSarjana.getNama() + " belum memenuhi syarat kelulusan sarjana");
        }

        // Mencetak data mahasiswa
        System.out.println("\nData Mahasiswa:");
        System.out.println("Nama: " + mhsDiploma.getNama());
        System.out.println("NIM: " + mhsDiploma.getNim());
        System.out.println("Tahun Masuk: " + mhsDiploma.getTahunMasuk());
        System.out.println("Jumlah SKS: " + mhsDiploma.getJumlahSks());
        System.out.println("IPK: " + mhsDiploma.getIpk());
        System.out.println("Jumlah Sertifikat Kompetensi: " + mhsDiploma.getJumlahSertifikat());
        System.out.println("Jumlah Produk HKI: " + mhsDiploma.getJumlahProdukHki());

        System.out.println("\nNama: " + mhsSarjana.getNama());
        System.out.println("NIM: " + mhsSarjana.getNim());
        System.out.println("Tahun Masuk: " + mhsSarjana.getTahunMasuk());
        System.out.println("Jumlah SKS: " + mhsSarjana.getJumlahSks());
        System.out.println("IPK: " + mhsSarjana.getIpk());
        System.out.println("Jumlah Publikasi: " + mhsSarjana.getJumlahPublikasi());
    }
}
