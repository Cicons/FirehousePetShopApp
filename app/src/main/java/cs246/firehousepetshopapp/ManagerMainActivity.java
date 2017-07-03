package cs246.firehousepetshopapp;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

/**
 * Created by cutlerhollist on 6/10/17.
 */


public class ManagerMainActivity extends AppCompatActivity {

    Button mManageRewards;
    Button mAdjustPoints;
    Button mViewHelpRequests;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_manager_main);

        mManageRewards    = (Button) findViewById(R.id.button5);
        mAdjustPoints     = (Button) findViewById(R.id.button7);
        mViewHelpRequests = (Button) findViewById(R.id.button8);
        final Context contextManagerMain = this;

        mManageRewards.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {

                // take us to the ManageRewards activity
                Intent openManagerRewardsIntent = new Intent(contextManagerMain, ManageRewardsActivity.class);
                startActivity(openManagerRewardsIntent);
            }
        });

        mAdjustPoints.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {

                // take us to the AdjustPoints activity
                Intent openAdjustPointsIntent = new Intent(contextManagerMain, AdjustPointsActivity.class);
                startActivity(openAdjustPointsIntent);
            }
        });

        mViewHelpRequests.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {

                // take us to the ManageRewards activity
                Intent openViewHelpRequestsIntent = new Intent(contextManagerMain, ViewHelpRequestActivity.class);
                startActivity(openViewHelpRequestsIntent);
            }
        });
    }
}
