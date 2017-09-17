import org.apache.commons.lang3.builder.ToStringBuilder;
import org.joda.time.DateTime;

import java.lang.reflect.Field;

public class Augalas {

    String pavadinimas;
    String tipas;
    Sodininkas sodininkas;
    Vazonas vazonas;
    String pasodinimoData;
    String zydejimoLaikas;

    public Augalas(){
        new Sodininkas();
    }

    @Override
    public String toString()
    {
        return "Informacija apie augala: " + "Pavadinimas: " + this.pavadinimas
                + ", Tipas: " + this.tipas
                + ", Sodininko vardas: " + this.sodininkas.vardas
                + ", Sodininko pavarde: " + this.sodininkas.pavarde
                + ", Pasodinimo data: " + this.pasodinimoData.toString();
    }

    public Vazonas addToVazonas(Augalas augalas, Sodininkas sodininkas, String pavadinimas, String vieta){
        Vazonas vazonas = new Vazonas(pavadinimas, vieta, augalas, sodininkas);
        return vazonas;
    }
}
