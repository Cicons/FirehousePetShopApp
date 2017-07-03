package cs246.firehousepetshopapp;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ExpandableListView;
import android.widget.ImageButton;
import android.widget.Spinner;

/**
 * Created by cutlerhollist on 6/10/17.
 */

public class CustomerMainActivity extends AppCompatActivity {

    Button mScanQR;
//    Spinner mDropDown; gotta us a "Menu", not a spinner
    ExpandableListView expListView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
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
