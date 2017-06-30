package cs246.firehousepetshopapp;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

/**
 * Created by cutlerhollist on 6/10/17.
 */

public class CustomerMainActivity extends AppCompatActivity {



    @Override
    protected void onCreate(Bundle savedInstanceState) {

        // call for array of rewards from firebase
        // Convert array of Rewards to array of Strings

        Reward[] rewArray = {};

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
    }
}
