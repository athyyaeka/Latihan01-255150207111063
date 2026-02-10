package LATIHAN;
public class App {
    public static void main(String[] args) {
        BujurSangkar bs = new BujurSangkar("Bujur Sangkar", 6);
        bs.info();
        System.out.println("Luas: " + bs.luas());

        Lingkaran ling = new Lingkaran("Lingkaran", 9);
        ling.info();
        System.out.println("Luas: " + ling.luas());
    }
}

