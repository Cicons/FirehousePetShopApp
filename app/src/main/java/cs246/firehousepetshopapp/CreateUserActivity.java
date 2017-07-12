package cs246.firehousepetshopapp;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.gms.tasks.Task;
import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
/**
 * Created by cutlerhollist on 6/10/17.
 */


/** Called when the activity is first created. */


public class CreateUserActivity extends AppCompatActivity {

    Button btnSubmit;
    EditText username;
    EditText password;
    EditText email;
    //read text in and convert to string

    private FirebaseAuth Auth;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_create_user);

        Auth = FirebaseAuth.getInstance();
        btnSubmit = (Button) findViewById(R.id.submit);
        final Context contextCreateUser = this;

        btnSubmit.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                username = (EditText) findViewById(R.id.editText3);
                password = (EditText) findViewById(R.id.editText4);
                email = (EditText) findViewById(R.id.editText5);

                if(TextUtils.isEmpty(email.getText().toString())){
                    Toast.makeText(CreateUserActivity.this,"Empty email",Toast.LENGTH_LONG).show();
                return;
                }

                if(TextUtils.isEmpty(password.getText().toString().trim())){
                    Toast.makeText(CreateUserActivity.this,"Empty password",Toast.LENGTH_LONG).show();
                    return;
                }
                // create the user
                //writeNewUser(password.getText().toString(), username.getText().toString(), email.getText().toString());
                Auth.createUserWithEmailAndPassword(email.getText().toString().trim(), password.getText().toString().trim())
                .addOnCompleteListener(CreateUserActivity.this, new OnCompleteListener<AuthResult>() {
                @Override
                public void onComplete(Task<AuthResult> task) {
                //checking if success
                    Toast.makeText(CreateUserActivity.this,"Enter onclick",Toast.LENGTH_LONG).show();
                if(task.isSuccessful()){
                //display some message here
                Toast.makeText(CreateUserActivity.this,"Successfully registered",Toast.LENGTH_LONG).show();
                    Intent openCustomerMainIntent = new Intent(contextCreateUser, CustomerMainActivity.class);
                    startActivity(openCustomerMainIntent);
                }else{
                //display some message here
                Toast.makeText(CreateUserActivity.this,"Registration Error",Toast.LENGTH_LONG).show();
                    Intent openCustomerMainIntent = new Intent(contextCreateUser, SignInActivity.class);
                    startActivity(openCustomerMainIntent);
                    }
                    Toast.makeText(CreateUserActivity.this,"Skip else",Toast.LENGTH_LONG).show();
                }
                });
                // take us to the Customer activity
                Intent openCustomerMainIntent = new Intent(contextCreateUser, SignInActivity.class);
                startActivity(openCustomerMainIntent);
            }
        });

    }



}
