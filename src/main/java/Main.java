import jdk.management.resource.internal.inst.SocketOutputStreamRMHooks;
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
        }
        catch (IOException e) {
            e.printStackTrace();
        }

        System.out.println(augalas.toString());


    }

}
