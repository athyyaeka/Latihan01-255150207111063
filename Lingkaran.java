package LATIHAN;

public class Lingkaran extends BidangDuaDimensi {
    private double jariJari;

    public Lingkaran(String nama, double jariJari) {
        super(nama);
        this.jariJari = jariJari;
    }

    public double getJariJari() {
        return jariJari;
    }

    public void setJariJari(double jariJari) {
        this.jariJari = jariJari;
    }

    @Override
    public double luas() {
        return Math.PI * jariJari * jariJari;
    }
}
