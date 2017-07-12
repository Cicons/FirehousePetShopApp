package cs246.firehousepetshopapp;
import android.content.Context;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListAdapter;
import android.widget.ListView;

import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;

import java.util.ArrayList;

public class CustomerMainActivity extends AppCompatActivity {
    @Override    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_customer_main);
        String[] items1 = {"Free Treat: 10 Points", "Free Pet Toy: 50 Points", "Free Pet Wash: 100 Points"};
        String[] items2 = {"A", "B", "C"};
        ArrayList<String> combItems = new ArrayList<String>();
        for(int i = 0; i < items1.length; i++) {
            for (int c = 0; c < items2.length; c++) {
                combItems.add(items1[i] + ": " + items2[c]);
            }
        }
        ArrayAdapter adapter1 = new ArrayAdapter<String>(
            this, android.R.layout.simple_list_item_1, items1);
                 ListView theListView = (ListView) findViewById(R.id.mainListView);
                  theListView.setAdapter(adapter1);

        final Context contextCustomerMain = this;
        final Button button = (Button) findViewById(R.id.enterButton);
        button.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                // take us to the QrCodeScanner activity
                Intent openQrCodeScannerIntent = new Intent(contextCustomerMain, QrCodeScannerActivity.class);
                startActivity(openQrCodeScannerIntent);
            }
        });
        /*
        // connect UserName and Points to Firebase
        DatabaseReference mDatabase = FirebaseDatabase.getInstance().getReference();

        // I have no idea how to write to the app from Firebase :)
        mDatabase.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(DataSnapshot dataSnapshot) {
                //userNameTextView.setText("A User");
                //pointsTextView.setText("Some Points");
            }

            @Override
            public void onCancelled(DatabaseError databaseError) {
                //userNameTextView.setText("ERROR");
                //pointsTextView.setText("ERROR");
            }
        });*/
    }
}
