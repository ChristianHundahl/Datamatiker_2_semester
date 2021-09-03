package Programmering_30_08_21_Abstract_Data_Types;

import java.util.ArrayList;
import java.util.Iterator;

public class Misc {

    /*
    public static String getWovels(String str){//Metode til at returnere vokaler
        String res = "";

        ArrayList<Character> vokaler = new ArrayList<>(Arrays.asList('i', 'y', 'e', 'æ', 'ø', 'a', 'u', 'o', 'å'));

        char[] charr = str.toCharArray();

        Set<Character> chset = new HashSet<>();
        for (char c : charr){
            //System.out.println(c);
            boolean b = vokaler.contains(c);
            if (b) {
                //res += c;
                chset.add(c);
            }
        }

        res = chset.toString();
        return res;
    }Map<String, htmlTag> map = new HashMap<>(); //Map er som en ordbog: Du kan slå
        //Map<key, object> <--key = hvad man afleverer, object = hvad returneres
        pTag pt1 = new pTag("p1", "Jeg er et pTag", 1);
        pTag pt2 = new pTag("p1", "Jeg er et pTag", 1);
        map.put(pt1.getId(), pt1);//Tastes object id=pt1 returneres object pt1
        map.put(pt2.getId(), pt2);
        htmlTag ht1 = map.get("pt1");
        //ht1.print(); Bliver ved med at sige 'ht1 null'?


        String vv = getWovels("Ole så en å");//Returnerer et array[] med alle vokaler i "str"
        System.out.println(vv);

        Set<String> strset = new HashSet<>();

        strset.add("Erik");
        strset.add("Jan");
        System.out.println(strset.size());
        boolean b = strset.contains("Erik");
        System.out.println(b);

        System.out.println("Erik".compareTo("Jan"));

        Set<htmlTag> htmlTagSet = new HashSet<>();
        pTag p1 = new pTag("p1", "Jeg er pTag", 1);
        pTag p2 = new pTag("p1", "Jeg er pTag", 2);
        pTag p3 = new pTag("p1", "Jeg er pTag", 3);
        htmlTagSet.add(p1);
        htmlTagSet.add(p2);
        htmlTagSet.add(p3);

        System.out.println(htmlTagSet.size());

        htmlTagSet.clear();//Fjerner alt i listen

        for (int i = 0; i <100; i++){
            pTag pny = new pTag("p"+i,"jeg er pTag id=p" +i, i);
            htmlTagSet.add(pny);
        } //Loopet tildeler alt til set, hvor der tilfældigt tildeles numre.
        for (htmlTag t : htmlTagSet){
            t.print();
        }

        Set<htmlTag> sortSet = new TreeSet<>(htmlTagSet);
        System.out.println("3".compareTo("2"));//Siger 2 er større end 11 - fordi primitiver != sammenlignes ved @Override

        //Du kan tilføje til et set, men kan ikke få ting ud af det.
        //Så set kan bruges til at sammenligne (man kan se om noget er i set) men ikke til at hente ud fra*/
    /*headerTag ht = new headerTag("h1-1", "Jeg er et h1 tag",1);
    headerTag ht2 = new headerTag("h1-1", "Jeg er et andet h1 tag", 1);

    String test = "Hello world!";

        headerTag h1 = new headerTag("","",1);

        aTag a1 = new aTag("r","e", "t");

        aTag a2 = new aTag("a1-1", "Jeg er en aTag", "");
        ArrayList<String> urlList = aTag.urls;
        for (int i = 1; i <= 10; i++) {
            aTag a3 = new aTag("a" + i, "Jeg er en aTag", "");
            a2.setUrl(urlList.get(i - 1));
            a2.print();
        }

        for (int i = 1; i <= 5; i++){
            headerTag h2 = new headerTag("h1-" + i, "Jeg er en headerTag", 1);
            ArrayList<String> colorList = htmlStyling.colors;
            h2.setColor(colorList.get(i-1));
            h2.print();
        }
    }
     */


        //ht.print();
        //ht2.print();

        //pTag pt1 = new pTag("p1", "p1 tag", 1);
        //pTag pt2 = new pTag("p2", "p2 tag", 2);
        //pTag pt4 = new pTag("p3", "p3 tag", 3);
        //ArrayList<htmlTag> lst2 = new ArrayList<>();
        //lst2.add(pt1);
        //lst2.add(pt2);

        //var obj = lst2.indexOf(pt2);//var obj viser variabel type, indexOf(x) viser placering i Arraylist
        //int ix = lst2.indexOf(pt2);
        //System.out.println(ix);

        //lst2.add(pt4);
        //System.out.println(ix);

        //boolean b = lst2.contains(pt2); //Find et objekt i en liste gennem .contains
        //System.out.println(b);

        //lst2.remove(pt2); Fjerner objektet
        //lst2.remove(2); Fjerner hvad der ligger på placeringen (int x)
        /*ArrayList<htmlTag> lst = new ArrayList<>();
        lst.add(ht);
        lst.add(ht2);
        System.out.println("Size: " + lst.size());*/

    /*pTag p1 = new pTag();
        lst.add(p1);

        for (int i = 1; i <= 4; i++){
        headerTag ht3 = new headerTag("h" + i, "Jeg er en h" + i + " tag", i);
        lst.add(ht3);
        ArrayList<String> colorList = htmlStyling.colors;
        ht3.setColor(colorList.get(i-1));
        for (int j = 1; j <= 4; j++){
            aTag a3 = new aTag("p"+j, "Jeg er et p" +j + " tag", "");
            lst.add(a3);
        }
    }

        for (htmlTag htt : lst){ //(type) (valgfri variabelnavn) : (listen man vil gennemgå)
        htt.print();
    }

    //Fjern alle objekter af typen fra listen:
        for (int i = lst.size()-1; i >=0; i--){
        htmlTag htt = lst.get(i);
        if (htt instanceof pTag){
            lst.remove(i);
        }
    }

    Iterator<htmlTag> ite = lst.iterator();//Iterator for at gå gennem liste og fjerne objekt
        while (ite.hasNext()){
        htmlTag tg = ite.next();
        if (tg instanceof pTag){
            ite.remove(); //.remove fjerner det objekt, iterator har foran sig på ethvert givent tidspunkt
            System.out.println("Removed");
        }
    }

     */
}
