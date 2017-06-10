package cs246.firehousepetshopapp;

/**
 * Created by sam on 6/9/2017.
 */

public class User {
    private String userName;
    private String password;
    private String email;
    public User() {
        userName = null;
        password = null;
        email = null;
    }

    public String getUserName() {
        return userName;
    }
    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }
    public void setPassword(String password) {
        this.password = password;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
