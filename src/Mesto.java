public class Mesto {
    String jmeno;
    int pocetObyvatel;

    @Override
    public String toString() {
        return "Mesto " + jmeno + ", pocet obyvatel " + pocetObyvatel;
    }

    public Mesto(String jmeno, int pocetObyvatel) {
        this.jmeno = jmeno;
        this.pocetObyvatel = pocetObyvatel;
    }

    public String getJmeno() {
        return jmeno;
    }

    public void setJmeno(String jmeno) {
        this.jmeno = jmeno;
    }

    public int getPocetObyvatel() {
        return pocetObyvatel;
    }

    public void setPocetObyvatel(int pocetObyvatel) {
        this.pocetObyvatel = pocetObyvatel;
    }
}
