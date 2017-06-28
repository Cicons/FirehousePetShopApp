package cs246.firehousepetshopapp;

/**
 * Created by sam on 6/9/2017.
 */

public class Customer extends User {
    private Points points;
    private String phone;

    public Customer() {
        super();
        points = new Points();
        phone = null;
        this.setManager(false);
    }

    public Customer(String n) {
        super(n);
        points = new Points();
        phone = null;
        this.setManager(false);
    }

    //public void setPoints(int p){}

    public void setPoints(int p, boolean posValue) {
        if(posValue){
            points.addPoints(p);
        }
        else if(posValue == false){
            points.subtractPoints(p);
        }
    }

    public int getPoints() {
        return points.getPoints();
    }


    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }
}
