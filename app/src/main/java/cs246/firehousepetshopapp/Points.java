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
        value -= n;

        if (n < 0) {
            n = 0;
        }
    }


}
