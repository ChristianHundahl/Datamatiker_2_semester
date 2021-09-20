package Programmering_17_09_21_JDBC;

import java.util.ArrayList;

public class RSSUrl {//Hver instans af klassen 0 repræsenterer en fil på nettet og dens id
    private int id;
    private String resurl;

    public static ArrayList<RSSUrl> getNews(){
        ArrayList<RSSUrl> rss = new ArrayList<>();
        rss.add(new RSSUrl(1,"https://ekstrabladet.dk/rssfeed/kendte/"));
        rss.add(new RSSUrl(2, "https://politiken.dk/rss/mad.rss"));
        rss.add(new RSSUrl(3, "https://www.bbcgoodfood.com/feed/rss"));
        rss.add(new RSSUrl(4, "https://www.theguardian.com/tone/recipes/rss"));
        rss.add(new RSSUrl(5, "https://ekstrabladet.dk/rssfeed/tv_rss/"));
        return rss;
    }

    public RSSUrl(int id, String resurl) {
        this.id = id;
        this.resurl = resurl;
    }

    public String getRssurl() {
        return resurl;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}
