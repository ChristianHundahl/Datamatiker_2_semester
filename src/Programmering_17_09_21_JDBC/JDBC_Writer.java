package Programmering_17_09_21_JDBC;

import java.sql.*;
import java.util.ArrayList;

public class JDBC_Writer {
    String tableName = "";
    int thisCounter = 0;

    private Connection connection = null;
    public boolean setConnection(){
        final String URL = "jdbc:mysql://localhost:3306/rss_feed";//evt. ?serverTimezone=UTC (el. hvilken tidszone man nu bruger)
        //jdbc:mysql://127.0.0.1:3306/?user=Christian
        boolean res = false;

        try {
            connection = DriverManager.getConnection(URL, "Christian", "baldur03");
            res = true;
        } catch (SQLException ioerr) {
            System.out.println("Vi fik IKKE forbindelse err=" + ioerr);
        }
        return res;
    }

    public int countTable(String tableName){//Unit test metode der sikre vi får noget fra databasen
        String counter = "select count(*) from " + tableName;
        PreparedStatement preparedStatement;
        int res = -1;
        try {
            preparedStatement = connection.prepareStatement(counter);
            ResultSet resultSet = preparedStatement.executeQuery();//kontakter databasen
            if (resultSet.next()) {
                String str = "" + resultSet.getObject(1);
                res = Integer.parseInt(str);
            }
        } catch (SQLException err) {
            System.out.println("FEJL i count=" + err.getMessage());
        }
        return res;
    }

    public int writeFeed(RSSUrl rssUrl, Feed feed){
        String insertStr = "INSERT INTO feeds(feedid, feedURL, title, link, description, langauge, copyright, pubdate) values (?, ?, ?, ?, ?, ?, ?, ?), ON DUPLICATE KEY UPDATE *";
        PreparedStatement preparedStatement;
        int rowcount = 0;
        try {
            preparedStatement = connection.prepareStatement(insertStr);
            preparedStatement.setInt(1,rssUrl.getId());
            preparedStatement.setString(2, rssUrl.getRssurl());
            preparedStatement.setString(3, feed.getTitle());
            preparedStatement.setString(4, feed.getLink());
            preparedStatement.setString(5, feed.getDescription());
            preparedStatement.setString(6, feed.getLanguage());
            preparedStatement.setString(7, feed.getCopyright());
            preparedStatement.setString(8, feed.getPubDate());
            int ii = preparedStatement.executeUpdate();
            rowcount += ii;

        } catch (SQLException err){
            System.out.println("sql FEJL i writefeed=" + err.getMessage());
        }
        System.out.println("Færdig med at skrive feed");
        return rowcount;
    }

    public int writeMessages(RSSUrl rssUrl, FeedMessage feedMessage){
        String insertStr = "INSERT INTO feedmessages(feedid, title, description, guid, author, link) values (?, ?, ?, ?, ?, ?)";
        PreparedStatement preparedStatement;
        int rowcount = 0;
        try {
            preparedStatement = connection.prepareStatement(insertStr);
            preparedStatement.setInt(1,rssUrl.getId());
            preparedStatement.setString(2, feedMessage.getTitle());
            preparedStatement.setString(3, feedMessage.getDescription());
            preparedStatement.setString(4, feedMessage.getGuid());
            preparedStatement.setString(5, feedMessage.getAuthor());
            preparedStatement.setString(6, feedMessage.getLink());
            int ii = preparedStatement.executeUpdate();
            rowcount += ii;

        } catch (SQLException err){
            System.out.println("sql FEJL i writeMessage=" + err.getMessage());
        }
        System.out.println("Færdig med at skrive feed");
        return rowcount;
    }

    /*public ArrayList<FeedTo> getFeeds(String aWord){
        String searchString = "select feedid, msg1.title, ,sg1.description, msg1.link from feeds f1";
        searchString += "join feedmessages msg1 using(feedid)";
        System.out.println("Sqlstring=" + searchString);

        PreparedStatement preparedStatement;
        ArrayList<FeedTo> feeds = new ArrayList<>();
        try {
            preparedStatement = connection.prepareStatement(searchString);
            preparedStatement.setString(1,"%" + aWord + "%");
            preparedStatement.setString(2,"%" + aWord + "%");

            ResultSet resset = preparedStatement.executeQuery();
            while(resset.next()){
                FeedTo feed = new FeedTo();
                int feedid = resset.getInt(1);
                feed.setFeedid(feedid);
                String s1 = resset.getInt(1);
                feed.
                feeds.add(feed);
            }
        } catch (SQLException err) {
            System.out.println("Error in getFeeds:" + err.getMessage());
        }
        return feeds;
    }*/
}
