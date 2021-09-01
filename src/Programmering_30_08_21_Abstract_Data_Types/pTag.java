package Programmering_30_08_21_Abstract_Data_Types;

public class pTag extends htmlTag {
    private int number;
    public pTag() {
    }

    public pTag(String id, String text, int number) {
        super(id, text);
        this.number = number;
    }

    @Override
    String toHTMLString() {
        return "<p>" + this.getText() + "</p>";
    }

    @Override
    void print() {
        System.out.println(this.toHTMLString());
    }
}
