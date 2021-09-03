package Programmering_30_08_21_Abstract_Data_Types;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.URL;
import java.util.*;

public class Main {

    public static Map<String, Integer> readURL (String URL, ArrayList<String> words) throws Exception {
        //Modtager en URL og en liste med ord og kigger URL igennem for ordene på listen
        URL url1 = new URL("");
        BufferedReader br = new BufferedReader(new InputStreamReader(url1.openStream()));

        String afg = "Afghanistan";
        String h1 = "h1";
        String kvinde = "kvinde";
        String urlStr = "";
        int sum = 0;

        Map<String, Integer> mpOrd = new HashMap<>();
        mpOrd.put(afg, 0);
        mpOrd.put(h1, 0);
        mpOrd.put(kvinde, 0);

        int li1 = urlStr.indexOf(h1);
        int li2 = urlStr.indexOf(afg);
        int li3 = urlStr.indexOf(kvinde);

        while (urlStr != null) {
            for (String s : words){
                mpOrd.put(s, 0);
                if (li1 > 0) {
                    Integer i2 = mpOrd.get(words);
                    i2++;
                    mpOrd.put(h1,i2);

                    sum++;
                    System.out.println(urlStr);
                }
            urlStr = br.readLine();
            }
        }
        br.close();
        System.out.println("Sum = " + sum);

        System.out.println(mpOrd);
        return mpOrd;
    }

    public static void main(String[] args) throws Exception{
        ArrayList<String> words = new ArrayList<>();
        Map<String, Integer> map = readURL("hej", words);
        Set<String>  sset = map.keySet();

        words.add("abe");
        words.add("hare");
        words.add("fugl");
        words.add("elefant");
        words.add("kanin");

        Map<String, Map<String, Integer>> nyheder = getNyheder(words);
        Set<String> set3 = nyheder.keySet();
        for (String s : set3){
            System.out.println(s);
            Map<String, Integer> nyhed = nyheder.get(s);
            Set<String> set4 = nyhed.keySet();
            for (String s2 : set4){
                int n = nyhed.get(s);
                String sn = "Her står" + s + " " + n + " gange";
                System.out.println(sn);
            }

        }

        for (String s : sset){
            int n = map.get(s);
            String sn = "Der står: " + s + " " + n +" gange";
            System.out.println(sn);
        }

    }

    public static Map<String, Map<String, Integer>> getNyheder (ArrayList<String> ord) throws Exception {
        ArrayList<String> urls = new ArrayList<>();
        urls.add("https://www.google.com/");
        urls.add("https://tv2.dk/");
        urls.add("https://politiken.dk/");

        Map<String, Map<String, Integer>> mapNyheder = new HashMap<>();

        for (String s : urls) {
            Map<String, Integer> mp = readURL(s, ord);
            mapNyheder.put(s, mp);
        }

        return mapNyheder;
        }
    }
