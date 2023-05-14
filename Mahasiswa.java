public class Mahasiswa {
    private String nama;
    private String nim;
    private int tahunMasuk;
    private String fakultas;
    private int nomerUrut;
    public int jumlahSks;
    public double ipk;

    // Menampilkan Data
    public void tampilkanData() {
        System.out.println("Nama: " + nama);
        System.out.println("NIM: " + nim);
        System.out.println("IPK: " + ipk);
        System.out.println("Jumlah SKS: " + jumlahSks);
        System.out.println("Tahun Masuk: " + tahunMasuk);
        System.out.println("Fakultas: " + fakultas);
        System.out.println("Nomor Urut: " + nomerUrut);
    }

    //Mahasiswa Lama
    public Mahasiswa(String nama, String nim, double ipk, int jumlahSks, int tahunMasuk, String fakultas, int nomerUrut) {
        this.nama = nama;
        this.nim = nim;
        this.ipk = ipk;
        this.jumlahSks = jumlahSks;
        this.tahunMasuk = tahunMasuk;
        this.fakultas = fakultas;
        this.nomerUrut = nomerUrut;
    }
    //Mahasiswa Baru
    public Mahasiswa(String nama, String nim, int tahunMasuk) {
        this.nama = nama;
        this.nim = nim;
        this.tahunMasuk = tahunMasuk;
        this.jumlahSks = 0;
        this.ipk = 0;
    }
    public String getNama() {
        return nama;
    }

    public String getNim() {
        return nim;
    }

    public int getTahunMasuk() {
        return tahunMasuk;
    }

    public String getFakultas() {
        return fakultas;
    }

    public int getNomerUrut() {
        return nomerUrut;
    }

    public int getJumlahSks() {
        return jumlahSks;
    }

    public double getIpk() {
        return ipk;
    }

    public void setJumlahSks(int jumlahSks) {
        this.jumlahSks = jumlahSks;
    }
}
