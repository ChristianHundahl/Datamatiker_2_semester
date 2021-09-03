package Programmering_30_08_21_Abstract_Data_Types;

import java.util.Comparator;
import java.util.Objects;

public abstract class htmlTag implements Comparable<htmlTag> {
    private String id;
    private String text;

    public htmlTag() {
    }

    public String getId() {
        return id;
    }
    public void setId(String id) {
        this.id = id;
    }

    public String getText() {
        return text;
    }
    public void setText(String text) {
        this.text = text;
    }

    abstract String toHTMLString(); //Klassen skal være abstrakt for at kunne oversættes

    public htmlTag(String id, String text) {
        this.id = id;
        this.text = text;
    }

    abstract void print();

    @Override
    public boolean equals(Object o) {//
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        htmlTag htmlTag = (htmlTag) o;
        return id.equals(htmlTag.id);
    }

    @Override
    public int hashCode() {
        //return 1;
        //return Objects.hash(System.nanoTime());//Laver nyt id på hvert object med nanosekunds mellemrum
        return Objects.hash(id);
    }

    @Override
    public int compareTo(htmlTag o) {
        //return this.id.compareTo(o.id);
        Integer i1 = this.hashCode();
        Integer i2 = o.hashCode();
        return i1.compareTo(i2);
        //return 0;
    }
}
