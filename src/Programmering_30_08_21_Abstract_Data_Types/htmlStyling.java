package Programmering_30_08_21_Abstract_Data_Types;

import java.util.ArrayList;

public abstract class htmlStyling extends htmlTag{
    private String color;
    public static ArrayList<String> colors;

    public htmlStyling() {
    }

    public htmlStyling(String id, String text) {
        super(id, text);
        colors = new ArrayList<>();
        colors.add("red");
        colors.add("blue");
        colors.add("green");
        colors.add("yellow");
        colors.add("coral");
        colors.add("cyan");
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String toStyle(){
        return "style=" +'"' + "color:" + this.getColor()+ '"';
    }

}
