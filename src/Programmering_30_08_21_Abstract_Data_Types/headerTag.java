package Programmering_30_08_21_Abstract_Data_Types;

public class headerTag extends htmlStyling {
    private int number; //Indikerer type h1, h2 etc.

    public headerTag(String id, String text, int number) { //Læs op på hvad der foregår: Laver tags via. extension og id
        super(id, text);
        this.number = number;
    }

    public int getNumber() {
        return number;
    }
    public void setNumber(int number) {
        this.number = number;
    }

    @Override
    String toHTMLString() {
        return "<h" + this.getNumber() + " " + "id=" + '"' + this.getId() + '"' + " " + "style=" + '"' + "color:" + this.getColor() + '"' + ">" + this.getText() + "</h" + getNumber() + ">";
    }

    @Override
    void print() {
        System.out.println(this.toHTMLString());
    }
}
