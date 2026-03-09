// Tiedoston nimi: TestJUnitSetup.java

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class abc {

    // Testattava metodi
    static int add(int a, int b) {
        return a + b;
    }

    // Yksinkertainen testi
    @Test
    void testAdd() {
        assertEquals(5, add(2, 3), "2 + 3 pitäisi olla 5");
        assertEquals(0, add(0, 0), "0 + 0 pitäisi olla 0");
        assertEquals(-2, add(-1, -1), "-1 + -1 pitäisi olla -2");
    }
}