package cs246.firehousepetshopapp;

import android.content.Context;
import android.content.SharedPreferences;
import android.preference.PreferenceManager;
import android.support.v4.content.SharedPreferencesCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;

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
        Customer bob = new Customer("Bob"); // look up "constructor chain" for Customer
        String key = "Customer Username";
        Context context = this; // you CAN just put "this" inside the parentheses in the line below,
                                //   but I want to show that "this" (MainActivity) is subclassed to Context
        SharedPreferences pref = PreferenceManager.getDefaultSharedPreferences(context);
        SharedPreferences.Editor prefEditor = pref.edit();
        prefEditor.apply();
        prefEditor.putString(key, bob.getUserName());
        prefEditor.commit();

        // THIS SHOULD BE USED in onCreate() in the MainEmptyActivity that will determine if there
        //   is a Username already saved and will then bring up the screen for sign in or the specific
        //   user's main activity.
        SharedPreferences sharedPref = this.getPreferences(Context.MODE_PRIVATE);
        if (sharedPref.getString(key, bob.getUserName()) != null)
        {
            // use Firebase to determine if the person is a manager or customer and then open their
            //   specific main activity
        }


//        int defaultValue = getResources().getInteger(R.string.saved_high_score_default);
//        long highScore = sharedPref.getInt(getString(R.string.saved_high_score), defaultValue);



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
    }
}
