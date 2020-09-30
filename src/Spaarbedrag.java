import java.util.Scanner;

public class Spaarbedrag {

    public static void main(String[] args) {
        //variabele s voor gebruikersinvoer getal
        var s = new Scanner(System.in);
        System.out.println("Voer een bedrag in");
        //koppel de variabele getal aan het ingevoerde getal
        var getal = s.nextDouble();

        //string voor weergeven ingevoerde getal (nog zonder uitkomst)
        String zin = "Met een rente van 5,5% per jaar is het bedrag na 10 jaar: ";
        //zin weergeven
        System.out.println(zin);
        //variabele rente
        double r = 0.055;

        //variabele aanmaken voor output tafel
        String output;

        // getallen van een tot tien in lus aanmaken
        for (int x = 1; x <= 10; x++) {
            //getal wordt elk jaar vermeerderd met rente r
            getal = getal + getal * r;
            //string weergeven voor tafel
            output = "Jaar " + x + ": " + getal;
            //output weergeven
            System.out.println(output);

        }


    }


}
