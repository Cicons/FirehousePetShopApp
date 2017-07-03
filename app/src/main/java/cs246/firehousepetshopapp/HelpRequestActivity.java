package cs246.firehousepetshopapp;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

/**
 * Created by cutlerhollist on 6/10/17.
 */

public class HelpRequestActivity extends AppCompatActivity {

    Button mSubmitRequest;
    EditText _subject;
    EditText _body;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_help_request);

        mSubmitRequest = (Button) findViewById(R.id.button13);
        final Context contextHelpRequest = this;

        mSubmitRequest.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                _subject = (EditText) findViewById(R.id.editText7);
                _body    = (EditText) findViewById(R.id.editText8);

                String subject = _subject.getText().toString();
                String body    = _body.getText().toString();

                // update Firebase with the new help request
                writeHelpRequest(subject, body);

                // take us back to the Customer activity
                Intent openCustomerMainIntent = new Intent(contextHelpRequest, CustomerMainActivity.class);
                startActivity(openCustomerMainIntent);
            }

        });
    }

    private void writeHelpRequest(String subject, String body) {
//        User user = new User(name, email);
//        DatabaseReference mDatabase = FirebaseDatabase.getInstance().getReference();
//
//        mDatabase.child("users").child(userId).setValue(user);
    }
}
