/**
 * Created by sam on 6/26/2017.
 */

public class QRObject {
    //QRCode data type
    int value;
    boolean posValue;

    public QRObject(int v, boolean pos) {
        //set QR code
        this.value = v;
        this.posValue = pos;
    }

    public QRObject() {
        this.value = 0;
        this.posValue = false;
    }
    //getters and setters for QR codes

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public boolean isPosValue() {
        return posValue;
    }

    public void setPosValue(boolean posValue) {
        this.posValue = posValue;
    }
}
