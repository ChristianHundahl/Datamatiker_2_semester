package Programmering_30_08_21_Abstract_Data_Types;

import java.util.ArrayList;
import java.util.Iterator;

public class Misc {
    /*headerTag ht = new headerTag("h1-1", "Jeg er et h1 tag",1);
    headerTag ht2 = new headerTag("h1-1", "Jeg er et andet h1 tag", 1);

        ht.print();
        ht2.print();

        pTag pt1 = new pTag("p1", "p1 tag", 1);
        pTag pt2 = new pTag("p2", "p2 tag", 2);
        pTag pt4 = new pTag("p3", "p3 tag", 3);
        ArrayList<htmlTag> lst2 = new ArrayList<>();
        lst2.add(pt1);
        lst2.add(pt2);

        var obj = lst2.indexOf(pt2);//var obj viser variabel type, indexOf(x) viser placering i Arraylist
        int ix = lst2.indexOf(pt2);
        System.out.println(ix);

        lst2.add(pt4);
        System.out.println(ix);

        boolean b = lst2.contains(pt2); //Find et objekt i en liste gennem .contains
        System.out.println(b);

        lst2.remove(pt2); //Fjerner objektet
        lst2.remove(2); //Fjerner hvad der ligger på placeringen (int x)
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
