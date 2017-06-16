package cs246.firehousepetshopapp;

/**
 * Created by sam on 6/9/2017.
 */

public class Manager extends User{

    public Manager() {
        super();
        this.setManager(true);
    }

    public Manager(String n) {
        super(n);
        this.setManager(true);
    }

    public void addReward(Reward reward){

    }
    public void deleteReward(Reward reward){

    }
    public void incUser(String name, int amount){

    }
    public void decUser(String name, int amount){

    }
}
