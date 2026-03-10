import java.util.*;
import java.util.stream.*;

public class OpiskelijaKäsittelijä {

    private List<Opiskelija> opiskelijat;

    public OpiskelijaKäsittelijä() {
        this.opiskelijat = new ArrayList<>();
    }

    public void lisääOpiskelija(String nimi, int ikä, double keskiarvo) {
        // (1) Täydennä tähän koodi, joka lisää uuden opiskelijan listaan
        // Käytä Opiskelija-luokkaa (oletetaan että se on olemassa)

    }

    public List<Opiskelija> haeTäysiIkäiset() {
        // (2) Täydennä tämä metodi käyttämään Javan streameja
        // Metodin pitää palauttaa lista täysi-ikäisistä (ikä >= 18) opiskelijoista

    }

    public OptionalDouble laskeKeskiarvojenKeskiarvo() {
        // (3) Täydennä tämä metodi käyttämään streameja
        // Metodi laskee kaikkien opiskelijoiden keskiarvojen keskiarvon
        // Jos listassa ei ole opiskelijoita, palauta tyhjä OptionalDouble

    }
    
    public Map<Boolean, List<Opiskelija>>
            // (4) Täydennä metodin paluutyyppi ja nimi tähän
            (ikäRaja) {
        // (5) Täydennä tämä metodi käyttämään Collectors.partitioningBy
        // Metodi jakaa opiskelijat kahteen ryhmään:
        // - ne joiden ikä on vähintään ikäRaja
        // - ne joiden ikä on alle ikäRaja

    }

    public String haeNimet() {
        // (6) Täydennä tämä metodi käyttämään streameja
        // Metodi palauttaa kaikkien opiskelijoiden nimet pilkulla eroteltuna
        // Esimerkki: "Matti, Liisa, Pekka"

    }

    // Yksikkötestit
    @Test
    void testaaTäysiIkäiset() {
        OpiskelijaKäsittelijä käsittelijä = new OpiskelijaKäsittelijä();
        käsittelijä.lisääOpiskelija("Matti", 17, 8.5);
        käsittelijä.lisääOpiskelija("Liisa", 19, 9.0);
        käsittelijä.lisääOpiskelija("Pekka", 18, 7.5);

        List<Opiskelija> täysiIkäiset = käsittelijä.haeTäysiIkäiset();
        // (7) Täydennä assert-metodi, joka tarkistaa että täysi-ikäisiä on 2

        // (8) Täydennä assert-metodi, joka tarkistaa että Liisa on täysi-ikäisten joukossa
    }

    @BeforeEach
            // (9) Täydennä metodin nimi tähän
            () {
        // Tämä metodi suoritetaan ennen jokaista testiä
        System.out.println("Aloitetaan uusi testi...");
    }
}

// Oletetaan että Opiskelija-luokka on määritelty näin:
class Opiskelija {
    private String nimi;
    private int ikä;
    private double keskiarvo;

    public Opiskelija(String nimi, int ikä, double keskiarvo) {
        this.nimi = nimi;
        this.ikä = ikä;
        this.keskiarvo = keskiarvo;
    }

    public String getNimi() { return nimi; }
    public int getIkä() { return ikä; }
    public double getKeskiarvo() { return keskiarvo; }
}