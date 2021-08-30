import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Sortering {
    public static void main(String[] args) {
        //Skriv en metode, der indlæser 5 tekststrenge fra tastaturet og udskriver dem på skærmen i alfabetisk
        //faldende orden på skærmen.

        //Modtag tekststrenge
        ArrayList<String> femStrenge = new ArrayList<String>();
        Scanner input = new Scanner(System.in);
        System.out.println("Indtast fem emner:");
        for (int i = 0; i < 5; i++){ //Efter 5 strenge modtaget
            String j = input.nextLine();
            femStrenge.add(j);
        }

        System.out.println("\nFør sorting:");
        for(String str: femStrenge){
            System.out.println(str);
        }
        //Sætte arraylists indhold i omvendt alfabetisk rækkefølge
        Collections.sort(femStrenge, Collections.reverseOrder());

        //Printe arraylist i alfabetisk omvendt orden
        System.out.println("\nEfter sortering:");
        for(String str: femStrenge){
            System.out.println(str);
            //løsning inspireret af: https://stackoverflow.com/questions/13779643/sorting-an-array-of-strings-in-reverse-alphabetical-order-in-java/13780341
        }
    }
}
