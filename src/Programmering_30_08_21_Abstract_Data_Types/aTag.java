package Programmering_30_08_21_Abstract_Data_Types;

import java.util.ArrayList;

public class aTag extends htmlTag{
    private String url;
    static ArrayList<String> urls = new ArrayList<>();

    public aTag() { //Eksisterer for muligheden for at fylde noget nyt på, f.eks. hvis værdier til constructor ukendte fra start
    }

    public ArrayList<String> getUrls() {
        return urls;
    }

    //Opret collection (Arraylist) med url (links)
    //<a href="https://www.dr.dk/">Link til DR</a> <-- eksempel
    public aTag(String id, String text, String url){
        super (id, text);
        this.url = url;
        //urls = new ArrayList<>();
        urls.add("https://www.dr.dk/");
        urls.add("https://tv2.dk/");
        urls.add("https://www.theguardian.com/international");
        urls.add("https://politiken.dk/");
        urls.add("https://www.information.dk/");
        urls.add("https://www.berlingske.dk/");
        urls.add("https://ekstrabladet.dk/");
        urls.add("https://www.telegraph.co.uk/");
        urls.add("https://fyens.dk/");
        urls.add("https://www.nytimes.com/");
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    //Main: Opret collection (Arraylist) med a-tags der alle har forskellige href (url links)
    @Override
    String toHTMLString() {
        return "<a href=" +'"' + this.getUrl() + '"' + ">" + this.getText() + "</a>";
    }

    @Override
    void print(){
        System.out.println(this.toHTMLString());
    }
}
