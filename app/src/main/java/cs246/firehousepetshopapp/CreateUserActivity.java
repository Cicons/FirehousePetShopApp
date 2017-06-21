package cs246.firehousepetshopapp;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import com.google.firebase.database.DataSnapshot;

/**
 * Created by cutlerhollist on 6/10/17.
 */

public class CreateUserActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_create_user);
    }
    private void writeNewUser(String userId, String name, String email) {
    User user = new User(name, email);
        DataSnapshot mDatabase;
        mDatabase.child("users").child(userId).setValue(user);
    }
}
