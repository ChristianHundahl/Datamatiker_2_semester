package Programmering_17_09_21_JDBC;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        JDBC_Writer myWriter = new JDBC_Writer();
        boolean hasCon = myWriter.setConnection(); //hasCon = Has connection
        System.out.println("Vi fik res=" + hasCon);

        int count = myWriter.countTable("feedmessages");

        ArrayList<RSSUrl> news = RSSUrl.getNews();

        if (hasCon){
            for (RSSUrl rssUrl : news){
                String url = rssUrl.getRssurl();
                System.out.println(url);
                RSSFeedParser parser = new RSSFeedParser(url);
                Feed feed = parser.readFeed();
                System.out.println(feed);

                myWriter.writeFeed(rssUrl, feed);

                for (FeedMessage msg : feed.getMessages()){
                    System.out.println(msg);
                    myWriter.writeMessages(rssUrl, msg);
                }

            }
        }
        System.out.println(count);
    }
}
