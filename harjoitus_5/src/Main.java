class Summaaja implements Runnable {
    private int[] taulukko;
    private int alku;
    private int loppu;
    private int tulos = 0;

    public Summaaja(int[] taulukko, int alku, int loppu) {
        this.taulukko = taulukko;
        this.alku = alku;
        this.loppu = loppu;
    }

    @Override
    public void run() {
        for (int i = alku; i < loppu; i++) {
            tulos += taulukko[i];
        }
    }

    public int getTulos() {
        return tulos;
    }
} // runnable luoka

public class Main {
    public static void main(String[] args) {
        int[] luvut = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        Summaaja s1 = new Summaaja(luvut, 0, 5);
        Summaaja s2 = new Summaaja(luvut, 5, 10);

        Thread t1 = new Thread(s1);
        Thread t2 = new Thread(s2);

        t1.start();
        t2.start();

        try {
            t1.join();
            t2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        int kokonaissumma = s1.getTulos() + s2.getTulos();
        System.out.println("Summa: " + kokonaissumma);
    }
}