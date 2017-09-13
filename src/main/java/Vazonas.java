import java.util.ArrayList;
import java.util.List;

public class Vazonas {

    String pavadinimas;
    String salis;
    String miestas;
    Sodininkas priziuretojas;
    Augalas augalas;

    public Vazonas(String pavadinimas, String salis, String miestas, Augalas augalas, Sodininkas sodininkas){
        this.pavadinimas = pavadinimas;
        this.salis = salis;
        this.miestas = miestas;
        this.augalas = augalas;
        this.priziuretojas = sodininkas;

    }

}
