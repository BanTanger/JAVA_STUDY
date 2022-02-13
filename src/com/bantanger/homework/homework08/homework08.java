package com.bantanger.homework.homework08;

/**
 * @author Bantanger 半糖先生
 * @version 1.0
 */
public class homework08 {
    public static void main(String[] args) {
        Color[] color = Color.values();
        for (Color i : color){
            System.out.println(i+i.show());
        }
    }
}
interface ID {
    String show();
}
enum Color implements ID{
    RED(255,0,0),
    BLUE(0,0,255),
    BLACE(0,0,0),
    YELLOW(255,255,0),
    GREEN(0,255,0);
    private int redValue;
    private int greenValue;
    private int blueValue;

    private Color(int redValue, int greenValue, int blueValue) {
        this.redValue = redValue;
        this.greenValue = greenValue;
        this.blueValue = blueValue;
    }

    public int getRedValue() {
        return redValue;
    }

    public int getGreenValue() {
        return greenValue;
    }

    public int getBlueValue() {
        return blueValue;
    }

    @Override
    public String show() {
        return "("+getRedValue()+","+getGreenValue()+","+getBlueValue()+")";
    }

}