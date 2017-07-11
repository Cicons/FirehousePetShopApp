package cs246.firehousepetshopapp;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListAdapter;
import android.widget.ListView;
import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    @Override    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_customer_main);
        String[] items1 = {"Item 1", "Item 2", "Item 3"};
        String[] items2 = {"A", "B", "C"};
        ArrayList<String> combItems = new ArrayList<String>();
        for(int i = 0; i < items1.length; i++) {
    }
    for (int c = 0; c < items2.length; c++) {
        combItems.add(items1[i] + ": " + items2[c]);
    }
    }
    ArrayAdapter adapter1 = new ArrayAdapter<String>(
            this, android.R.layout.simple_list_item_1, items1);
                 ListView theListView = (ListView) findViewById(R.id.mainListView);
                  theListView.setAdapter(adapter1);
               }}