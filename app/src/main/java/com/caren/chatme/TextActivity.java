package com.caren.chatme;

import android.app.Activity;
import android.app.PendingIntent;
import android.content.Intent;
import android.os.Bundle;
import android.telephony.SmsManager;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import com.caren.chatme.R;

public class TextActivity extends Activity {

    TextView tvName;
    TextView tv1;
    TextView tv2;
    TextView tv3;
    TextView tv4;
    TextView tv5;
    TextView tv6;
    String phoneNo = "6262571325";


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_text);

        tvName = (TextView) findViewById(R.id.tvName);
        tv1 = (TextView) findViewById(R.id.tv1);
        tv2 = (TextView) findViewById(R.id.tv2);
        tv3 = (TextView) findViewById(R.id.tv3);
        tv4 = (TextView) findViewById(R.id.tv4);
        tv5 = (TextView) findViewById(R.id.tv5);
        tv6 = (TextView) findViewById(R.id.tv6);

        setUpClickListners();
    }

    public void setUpClickListners() {
        setClickListener(tv1);
        setClickListener(tv2);
        setClickListener(tv3);
        setClickListener(tv4);
        setClickListener(tv5);
        setClickListener(tv6);

    }

    public void setClickListener(final TextView tv) {
        tv.setOnClickListener(new View.OnClickListener()
        {
            public void onClick(View v)
            {
                String message = tv.getText().toString();
                sendSMS(phoneNo, message);
                Toast.makeText(getBaseContext(), "Sent text: " + message, Toast.LENGTH_SHORT).show();
            }
        });
    }



    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.text, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();
        if (id == R.id.action_settings) {
            return true;
        }
        return super.onOptionsItemSelected(item);
    }

    private void sendSMS(String phoneNumber, String message) {
//        PendingIntent pi = PendingIntent.getActivity(this, 0,
//                new Intent(this, TextActivity.class), 0);
        SmsManager sms = SmsManager.getDefault();
//        sms.sendTextMessage(phoneNumber, null, message, pi, null);
        sms.sendTextMessage(phoneNumber, null, message, null, null);
    }
}
