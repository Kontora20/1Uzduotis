

public class Vazonas {

    String pavadinimas;
    String vieta;
    Sodininkas priziuretojas;
    Augalas augalas;

    public Vazonas(String pavadinimas, String vieta, Augalas augalas, Sodininkas sodininkas){
        this.pavadinimas = pavadinimas;
        this.vieta = vieta;
        this.augalas = augalas;
        this.priziuretojas = sodininkas;
    }

    @Override
    public String toString()
    {
        return "Vazono informacija: " + "Pavadinimas: " + this.pavadinimas
                + ", Vieta: " + this.vieta
                + ", Sodininko vardas: " + this.priziuretojas.vardas
                + ", Sodininko pavarde: " + this.priziuretojas.pavarde;
    }

    public void addToVazonas(Augalas augalas, Sodininkas sodininkas, String pavadinimas, String vieta){
        Vazonas vazonas = new Vazonas(pavadinimas, vieta, augalas, sodininkas);
    }

}
