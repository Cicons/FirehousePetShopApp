package cs246.firehousepetshopapp;

/**
 * Created by Katheryn on 6/9/2017.
 */

public class Points {

    private int value;

    public Points() { this.value = 0; }
    public Points(int value) { this.value = value; }

    public int getPoints() { return value; }

    public void setPoints(int v) { value = v; }

    public void addPoints(int n){
        value += n;
    }

    public void subtractPoints(int n) {
        if ((value - n) < 0) {
            value = 0;
        }
        else if((value - n) > value) {
            value = 0;
        }
        else {
            value -= n;
        }
    }


}
