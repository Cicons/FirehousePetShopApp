package cs246.firehousepetshopapp;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ExpandableListView;
import android.widget.ImageButton;
import android.widget.ListView;
import android.widget.Spinner;

import java.util.ArrayList;

/**
 * Created by cutlerhollist on 6/10/17.
 */

public class CustomerMainActivity extends AppCompatActivity {

    Button mScanQR;
    //    Spinner mDropDown; gotta use a "Menu", not a spinner
    ExpandableListView expListView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        // call for array of rewards from firebase
        // Convert array of Rewards to array of Strings

        Reward rew1 = new Reward();
        rew1.setCost(0);
        rew1.setDescription("A basic description for reward 1");
        rew1.setTitle("Reward 1");

        Reward rew2 = new Reward();
        rew2.setCost(42);
        rew2.setDescription("A basic description for reward 2");
        rew2.setTitle("Reward 2");

        Reward rew3 = new Reward();
        rew3.setCost(100);
        rew3.setDescription("A description for reward 3");
        rew3.setTitle("Reward 3");

        Reward[] rewArray = {rew1, rew2, rew3};

        ArrayList<String> rewList = new ArrayList<String>();

        for(int i = 0; i < rewArray.length; i++)
        {
            String title = rewArray[i].getTitle();
            String cost = Integer.toString(rewArray[i].getCost());
            String description = rewArray[i].getDescription();

            rewList.add(title + " -- cost: " + cost + " points" + "\n" + description);
        }

        //sam's listView code:

        // basic listView set-up
        ArrayAdapter adapter1 = new ArrayAdapter<String>(
                this,  // Context for activity
                android.R.layout.simple_list_item_1,  // Layout to use
                rewList  // items to be displayed
        );
        ListView mainListView = (ListView) findViewById(R.id.expandableListView2);
        mainListView.setAdapter(adapter1);

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_customer_main);

        mScanQR = (Button) findViewById(R.id.button6);
        //mDropDown = (Spinner) findViewById(R.id.spinner);
        expListView = (ExpandableListView) findViewById(R.id.expandableListView2);
        final Context contextCustomerMain = this;

        mScanQR.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {


                // open the camera to scan (don't know how to implement this
//                Intent openCamera = new Intent(contextCustomerMain, something to do with a camera);
//                startActivity(openCamera);
            }
        });

//        mDropDown.setOnClickListener(new View.OnClickListener() {
//            public void onClick(View view) {


        // open the camera to scan (don't know how to implement this
//                Intent openCamera = new Intent(contextCustomerMain, something to do with a camera);
//                startActivity(openCamera);
//            }
//        });
    }
}