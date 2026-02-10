package LATIHAN;

public abstract class BidangDuaDimensi {
    private String nama;

    public BidangDuaDimensi(String nama) {
        this.nama = nama;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public void info() {
        System.out.println("Nama: " + nama);
    }

    public abstract double luas();
}
