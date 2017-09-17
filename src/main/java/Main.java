import org.joda.time.DateTime;
import org.joda.time.format.DateTimeFormat;
import org.joda.time.format.DateTimeFormatter;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) {

        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        DateTimeFormatter fmt = DateTimeFormat.forPattern("yyyy-MM-d");
        DateTime dt = new DateTime();

        Augalas augalas = new Augalas();
        Sodininkas sodininkas = new Sodininkas();
        try {
            System.out.println("Iveskite augalo pavadinima: ");
            augalas.pavadinimas = in.readLine();
            System.out.println("Iveskite augalo tipa: ");
            augalas.tipas = in.readLine();
            augalas.pasodinimoData = fmt.print(dt);
            System.out.println("Iveskite augalo priziuretojo varda: ");
            sodininkas.vardas = in.readLine();
            System.out.println("Iveskite augalo priziuretojo pavarde: ");
            sodininkas.pavarde = in.readLine();

            augalas.sodininkas = sodininkas;
        } catch (IOException e) {
            e.printStackTrace();
        }

        System.out.println(augalas.toString());

        String vazonoPav = null;
        String vazonoVieta = null;


        try {
            System.out.println("Koks bus vazono pavadinimas kuriame bus auginamas augalas?: ");
            vazonoPav = in.readLine();
            System.out.println("Kur bus vazonas?: ");
            vazonoVieta = in.readLine();
        } catch (IOException e) {
            e.printStackTrace();
        }

        Vazonas vazonas = augalas.addToVazonas(augalas, sodininkas, vazonoPav, vazonoVieta);
        System.out.println("Augalas pridėtas į vazoną: " + vazonas.toString());

        System.out.println("Po kiek dienu turetu prazisti jusu augalas?:");
        Integer dienos = null;
        try {
            dienos = Integer.parseInt(in.readLine());
        } catch (IOException e) {
            e.printStackTrace();
        }
        augalas.zydejimoLaikas = fmt.print(dt.plusDays(dienos));
        System.out.println("Augalas turetu prazisti: " + augalas.zydejimoLaikas);
    }

}
