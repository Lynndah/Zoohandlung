
package zoohandlung;


public class Ente extends Tier implements Laufen, Fliegen, Schwimmen {
    int anzahlBeine;
    double spannweite;
    
    @Override
    public void laufe() {
        System.out.println("Ich laufe.");
    }

    @Override
    public int getAnzahlBeine() {
        return anzahlBeine;
    }

    @Override
    public void setAnzahlBeine(int anzahlBeine) {
        this.anzahlBeine = anzahlBeine;
    }

    @Override
    public void fliegLos() {
        System.out.println("Ich flieg los.");
    }

    @Override
    public void lande() {
        System.out.println("Ich lande jetzt.");
    }

    @Override
    public void schwimme() {
        System.out.println("Ich schwimme.");
    }
    
}
