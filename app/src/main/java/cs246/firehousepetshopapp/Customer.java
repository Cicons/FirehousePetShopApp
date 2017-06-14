package cs246.firehousepetshopapp;

/**
 * Created by sam on 6/9/2017.
 */

public class Customer extends User {
    private Points points;
    private String phone;

    public void setPoints(Points points) {
        this.points = points;
    }

    public Points getPoints() {
        return points;
    }


    public Customer() {
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }
}
