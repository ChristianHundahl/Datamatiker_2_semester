package Programmering_30_08_21_Abstract_Data_Types;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
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
}