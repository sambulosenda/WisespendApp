package me.wisespend.wisespend;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.ImageView;
import android.widget.TextView;

import me.wisespend.wisespend.Data.TransactionHistory;


public class DetailActivities extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail_activities);

        getActionBar().setDisplayHomeAsUpEnabled(true);
        Bundle extras = getIntent().getExtras();

        String name = extras.getString("name");
        int image = extras.getInt("img",0);
        String moneyOwe = extras.getString("MoneyOwe");


        TextView tv = (TextView) findViewById(R.id.textView);
        tv.setText(name);

        ImageView img = (ImageView) findViewById((R.id.imageView));
        img.setImageResource(image);
//
        TextView info = (TextView) findViewById(R.id.textView1);
        info.setText(moneyOwe);
//        Log.d("name", ""+name);
//
//        Log.d("money", ""+moneyOwe);

    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.detail_activities, menu);
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
}
