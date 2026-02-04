public class StaticVsInstance {

    // ===== static = LUOKKA =====
    static int sharedCounter = 0;

    // ===== ei-static = OLIO =====
    int personalCounter = 0;

    public StaticVsInstance() {
        sharedCounter++;     // sama kaikille
        personalCounter++;   // oma tälle oliolle
    }

    public void printValues() {
        System.out.println(
                "sharedCounter (static) = " + sharedCounter +
                        ", personalCounter (instance) = " + personalCounter
        );
    }

    public static void main(String[] args) {

        StaticVsInstance a = new StaticVsInstance();
        a.printValues();
        // static = luokka, sama arvo
        // instance = olio, oma arvo

        StaticVsInstance b = new StaticVsInstance();
        b.printValues();

        StaticVsInstance c = new StaticVsInstance();
        c.printValues();
    }
}
