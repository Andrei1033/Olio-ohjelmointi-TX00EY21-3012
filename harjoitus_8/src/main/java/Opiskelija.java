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