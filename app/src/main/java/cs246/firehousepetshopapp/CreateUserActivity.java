package cs246.firehousepetshopapp;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

/**
 * Created by cutlerhollist on 6/10/17.
 */




/** Called when the activity is first created. */


public class CreateUserActivity extends AppCompatActivity {

    Button mButton;
    EditText username;
    EditText password;
    EditText email;
//read text in and convert to string

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_create_user);
        mButton = (Button) findViewById(R.id.button3);

        mButton.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                username = (EditText) findViewById(R.id.editText3);
                password = (EditText) findViewById(R.id.editText4);
                email = (EditText) findViewById(R.id.editText5);
            }
        });
    }

    private void writeNewUser(String userId, String name, String email) {
    User user = new User(name, email);
        DatabaseReference mDatabase = FirebaseDatabase.getInstance().getReference();

        mDatabase.child("users").child(userId).setValue(user);
    }
}
