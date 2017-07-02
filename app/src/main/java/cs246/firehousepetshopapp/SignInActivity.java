package cs246.firehousepetshopapp;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.widget.Toast;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;

import static cs246.firehousepetshopapp.R.string.email;

/**
 * Created by cutlerhollist on 6/10/17.
 */

public class SignInActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_in);

        //Luke's code
        final FirebaseAuth mAuth;
// ...
        mAuth = FirebaseAuth.getInstance();
        final String TAG = "Stuff";

        mAuth.signInWithEmailAndPassword(email, password)
        .addOnCompleteListener(this, new OnCompleteListener<AuthResult>() {
            @Override
            public void onComplete(@NonNull Task<AuthResult> task) {
                if (task.isSuccessful()) {
                 // Sign in success, update UI with the signed-in user's information
                 Log.d(TAG, "signInWithEmail:success");
                 FirebaseUser user = mAuth.getCurrentUser();
                 //updateUI(user);
                } else {
                 // If sign in fails, display a message to the user.
                     Log.w(TAG, "signInWithEmail:failure", task.getException());
                    Toast.makeText(SignInActivity.this, "Authentication failed.",
                                    Toast.LENGTH_SHORT).show();
                //updateUI(null);
                }

             // ...
            }
        });
        //end of Luke's code
    }
    @Override
    public void onStart() {
        super.onStart();
        final FirebaseAuth mAuth;
// ...
        mAuth = FirebaseAuth.getInstance();
        final String TAG = "Stuff";
        // Check if user is signed in (non-null) and update UI accordingly.
        FirebaseUser currentUser = mAuth.getCurrentUser();
        //updateUI(currentUser);
    }

}
