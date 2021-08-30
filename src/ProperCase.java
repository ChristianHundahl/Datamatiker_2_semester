public class ProperCase {
    //Skriv en metode, der tager imod en sætning af ord med mellemrum imellem. Sætningen ændres efter
    //følgende regler:
    //• Ord, som udelukkende er skrevet med store bogstaver, skal ikke ændres.
    //• Ord på mere end 3 bogstaver skal skrives med småt, dog med stort begyndelsesbogstav.
    //• Ord på max. 3 bogstaver skal skrives med småt.

    //1. Del sætningen op i ord
    //2. Gem hvert ord fra sætningen i en variabel
    //3. Undersøg de gemte ord for vores parametre (3+ bogstaver, lille forbogstav)
    //4. Lav ordet om
    //5. Sæt ord sammen til en sætning igen
    String sentence;

    public static void main(String[] args) {
        System.out.println(properCase("Hello there bob"));
    }

    public static String properCase (String sentence){
        System.out.println("Original sentence: " + sentence); //prints sentence before changes
        //1. Del sætningen op i ord
        String[] wordsInText = sentence.split(" "); //regex at [space]
        //2. Gem hvert ord fra sætningen i en variabel
        String word = ""; //Creates String to store words from wordsInText
        for (int i = 0; i < wordsInText.length; i++)//Parse through String sentence
            if(!wordsInText[i].equals(wordsInText[i].toUpperCase()))
                if(wordsInText[i].length() > 3){
                    String newWord = wordsInText[i].substring(0, 1).toUpperCase() + word.substring(1);
                    wordsInText[i] = newWord;
                    word = word + newWord;
                }

        else
            ;
        //if current word != uppercase && word.length > 3:
            //Take letter at index 1 of each nexus to upper case
        //Add words to stringUppercased

        return word;
    }
}
