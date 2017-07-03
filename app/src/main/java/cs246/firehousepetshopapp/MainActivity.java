package cs246.firehousepetshopapp;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.preference.PreferenceManager;
import android.support.annotation.NonNull;
import android.support.v4.content.SharedPreferencesCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.Toast;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;
import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;

import static cs246.firehousepetshopapp.R.string.email;

public class MainActivity extends AppCompatActivity {


    private static final String TAG = "MyActivity";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        //
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_main);

        // Practice setting up SharedPreferences with a fake Customer - this just follows the same
        //   code as in our reading quiz. I have no idea if it works.
        // THIS SHOULD BE USED in onDestroy() for the sign in activity

        // SharedPreferences saved at end of SignInActivity, need a static "key" and "value", I think
//        String key = "Bob";
//        Customer bob = new Customer(key);
//        final Context context = this;
//
//        SharedPreferences pref = PreferenceManager.getDefaultSharedPreferences(context);
//        SharedPreferences.Editor prefEditor = pref.edit();
//        prefEditor.apply();
//        prefEditor.putString(key, bob.getUserName());
//        prefEditor.commit();

        // THIS will determine if there is a Username already saved and will then bring up the
        //   screen for sign in or the specific user's main activity.
        final Thread myThread = new Thread() {
            @Override
            public void run() {
                try{
                    sleep(3000);


                    //SharedPreferences sharedPref = context.getPreferences(Context.MODE_PRIVATE));

                    if (sharedPref.getString(key, bob.getUserName()) != null) {
                        //use Firebase to determine if the person is a manager or customer

                        // and then open their specific main activity
                        if(!(bob.isManager())) {
                            Intent openCustomerMainIntent = new Intent(context, CustomerMainActivity.class);
                            startActivity(openCustomerMainIntent);
                            finish();
                        }
                        else if(bob.isManager()) {
                            Intent openManagerMainIntent = new Intent(context, ManagerMainActivity.class);
                            startActivity(openManagerMainIntent);
                            finish();
                        }

                    }
                    else
                    {
                        Intent openSignInIntent = new Intent(context, SignInActivity.class);
                        startActivity(openSignInIntent);
                        finish();
                    }



                    /* I think the following code needs to be tested in another activity, that way
                    *  we can test the above code and finish the activity, then move to the next
                    *  activity and try sending something up in that one.*/

                    // Write a message to the database
                    FirebaseDatabase database = FirebaseDatabase.getInstance();
                    DatabaseReference myRef = database.getReference("message");

                    myRef.setValue("Hello, World!");
                    // Read from the database
                    myRef.addValueEventListener(new ValueEventListener() {
                        @Override
                        public void onDataChange(DataSnapshot dataSnapshot) {
                            // This method is called once with the initial value and again
                            //    whenever data at this location is updated.
                            String value = dataSnapshot.getValue(String.class);
                            Log.d(TAG, "Value is: " + value);
                        }

                        @Override
                        public void onCancelled(DatabaseError error) {
                            // Failed to read value
                            Log.w(TAG, "Failed to read value.", error.toException());
                        }
                    });


                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        };

        myThread.start();

    }
}




//        int defaultValue = getResources().getInteger(R.string.saved_high_score_default);
//        long highScore = sharedPref.getInt(getString(R.string.saved_high_score), defaultValue);

