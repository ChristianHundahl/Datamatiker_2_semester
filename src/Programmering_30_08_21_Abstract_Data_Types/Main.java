package Programmering_30_08_21_Abstract_Data_Types;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        String test = "Hello world!";

        aTag a1 = new aTag("a1-1", "Jeg er en aTag", "");
        ArrayList<String> urlList = aTag.urls;
        for (int i = 1; i <= 10; i++) {
            aTag a2 = new aTag("a" + i, "Jeg er en aTag", "");
            a2.setUrl(urlList.get(i - 1));
            a2.print();
        }
    }
}
