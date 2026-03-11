import java.util.*;
import java.util.stream.*;
import org.junit.jupiter.api.*;
import static org.junit.jupiter.api.Assertions.*;

public class OpiskelijaKäsittelijä {

    private List<Opiskelija> opiskelijat;

    public OpiskelijaKäsittelijä() {
        this.opiskelijat = new ArrayList<>();
    }

    public void lisääOpiskelija(String nimi, int ikä, double keskiarvo) {
        opiskelijat.add(new Opiskelija(nimi, ikä, keskiarvo));
    }

    public List<Opiskelija> haeTäysiIkäiset() {
        return opiskelijat.stream()
                .filter(o -> o.getIkä() >= 18)
                .collect(Collectors.toList());
    }

    public OptionalDouble laskeKeskiarvojenKeskiarvo() {
        return opiskelijat.stream()
                .mapToDouble(Opiskelija::getKeskiarvo)
                .average();
    }

    public Map<Boolean, List<Opiskelija>> jaaIänMukaan(int ikäRaja){
        return opiskelijat.stream()
                .collect(Collectors.partitioningBy(o -> o.getIkä() >= ikäRaja));
    }

    public String haeNimet() {
        return opiskelijat.stream()
                .map(Opiskelija::getNimi)
                .collect(Collectors.joining(", "));
    }

    // Yksikkötestit
    @Test
    void testaaTäysiIkäiset() {
        OpiskelijaKäsittelijä käsittelijä = new OpiskelijaKäsittelijä();
        käsittelijä.lisääOpiskelija("Matti", 17, 8.5);
        käsittelijä.lisääOpiskelija("Liisa", 19, 9.0);
        käsittelijä.lisääOpiskelija("Pekka", 18, 7.5);

        List<Opiskelija> täysiIkäiset = käsittelijä.haeTäysiIkäiset();
        assertEquals(2, täysiIkäiset.size());
        assertTrue(täysiIkäiset.stream().anyMatch(o -> o.getNimi().equals("Liisa")));
        //assertTrue(täysiIkäiset.stream().anyMatch(o -> o.getNimi().equals("Matti")));
        assertTrue(täysiIkäiset.stream().anyMatch(o -> o.getNimi().equals("Pekka")));
    }

    @BeforeEach
    void setUp() {
        // Tämä metodi suoritetaan ennen jokaista testiä
        System.out.println("Aloitetaan uusi testi...");
    }
}