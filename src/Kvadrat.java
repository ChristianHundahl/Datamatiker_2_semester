public class Kvadrat {
    //Modtag heltal
    //Print * i rækker og kolonner svarende til heltal
    //for (input)
    //sout(*)
    public static void main(String[] args) {
        drawBox(3, "!");
    }

    public static void drawBox(int x, String sign) {
        //public: Kan tilgås af alle klasser
        //static: Kan ikke ændres fra andre
        //void: returnerer ikke noget - her f.eks. ingen værdi retur, kun noget printet ud
        for (int i = 0; i < x; i++) { //Ydre loop - antal rækker
            for (int j = 0; j < x; j++) { //Indre loop - antal kolonner
                System.out.print(sign + " "); //Print statement - angiver modtaget String til print
            }
            System.out.println();
        }
    }
}