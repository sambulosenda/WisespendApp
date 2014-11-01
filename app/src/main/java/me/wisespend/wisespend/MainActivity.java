package me.wisespend.wisespend;

import android.app.Activity;
import android.app.DialogFragment;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;


public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_main);
        ListView lv = (ListView)findViewById(R.id.Listthings);

        List<String> monthsArray = new ArrayList<String>();
        monthsArray.add("moth");
        monthsArray.add("new");
        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(
                this,
                android.R.layout.simple_list_item_1,
                monthsArray);

            lv.setAdapter(arrayAdapter);

        Log.d("something happening", "onCreate");
        DialogFragment frag = new DialogFragment();

        getFragmentManager().beginTransaction()
                .add(R.id.myContainer, frag)
                .commit();
        //add referece to button 1
//        TextView button1 = (TextView)findViewById(R.id.textView);
//        button1.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                String url = "http://stackoverflow.com/questions/8698687/android-layout-width-layout-height-how-it-works";
////                Intent intent = new Intent(MainActivity.this, Another.class);
////                startActivity(intent);
//            }
//        });

        //get the person    // new might not be good
//        List<Debtor> Persons = new DataCollection().getPersons();
//        ListView PersonPLace = (ListView) findViewById(R.id.list);
//        //display the person
//        for(final Debtor person : Persons){
//            Button button = new Button(this);
//            button.setText(person.getName());
//            PersonPLace.addView(button);
//        }

    }




    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
