package Programmering_30_08_21_Abstract_Data_Types;

import java.util.Objects;

public abstract class htmlTag {
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
        return Objects.equals(id, htmlTag.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }
}
