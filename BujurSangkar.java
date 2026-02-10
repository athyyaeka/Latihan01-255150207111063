package LATIHAN;

public class BujurSangkar extends BidangDuaDimensi {
    private double sisi;

    public BujurSangkar(String nama, double sisi) {
        super(nama);
        this.sisi = sisi;
    }

    public double getSisi() {
        return sisi;
    }

    public void setSisi(double sisi) {
        this.sisi = sisi;
    }

    @Override
    public double luas() {
        return sisi * sisi;
    }
}
