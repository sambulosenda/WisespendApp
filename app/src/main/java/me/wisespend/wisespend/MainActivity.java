package me.wisespend.wisespend;



import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;

import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import java.util.ArrayList;

import android.app.ListActivity;
import android.widget.ListView;
import android.widget.TextView;

import java.util.List;

import me.wisespend.wisespend.Data.DataCollection;
import me.wisespend.wisespend.Data.Debtor;

import static android.view.View.OnClickListener;


public class MainActivity extends ListActivity{
    static DataCollection dataCollection = null;

    EditText nameTxt;
    Button contact;
    int counter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        if(savedInstanceState == null && dataCollection == null){
            dataCollection=new DataCollection();
            Log.w(null,"Aasdfas");
        }
        else if(dataCollection == null){
            dataCollection = (DataCollection)savedInstanceState.getSerializable("debtors");
            Log.w(null,"Basdfasdf");
        }
        super.onCreate(savedInstanceState);

        Intent intent = getIntent();
        Uri data = intent.getData();
        Log.d(null,"Jakob1234: "+data)


    }
    protected void onResume(){
        super.onResume();

        List<Debtor> debtors = dataCollection.getDebtors();
        int totalAmount = dataCollection.getTotal();


        // get data and display to the main list
        DetailArrayAdaptor adaptor = new DetailArrayAdaptor(this,android.R.layout.simple_list_item_1
        ,debtors);
        setListAdapter(adaptor);

        setContentView(R.layout.activity_main);

        if(totalAmount>0){
            TextView tv = (TextView) findViewById(R.id.textView);
            tv.setText("They owe");
        }

        TextView money = (TextView) findViewById(R.id.textView2);

        money.setText(""+totalAmount);

        contact = (Button) findViewById(R.id.Contact);
        contact.setOnClickListener(new OnClickListener() {


            public void onClick(View v) {
                AlertDialog.Builder builder = new AlertDialog.Builder(MainActivity.this);
                builder.setTitle(R.string.choose)
                        .setItems(R.array.options_array, new DialogInterface.OnClickListener() {
                            public void onClick(DialogInterface dialog, int which) {
                                if(which==2)
                                    return; //cancel
                                else if(which==1){
                                    Intent intent = new Intent(MainActivity.this,OrganizationActivity.class);
                                    startActivity(intent);
                                }
                                else{
                                    Intent intent = new Intent(MainActivity.this,NewContactActivity.class);
                                    startActivity(intent);
                                }
                            }
                        });
                AlertDialog dialog = builder.create();
                dialog.show();


            }

        });


    }

    @Override
    protected void onListItemClick(ListView l, View v, int position, long id) {
        super.onListItemClick(l, v, position, id);
        //get debtor position
        Debtor debtor = dataCollection.getDebtors().get(position);
        Intent intent =  new Intent(MainActivity.this, DetailActivities.class);
        intent.putExtra("name",debtor.getName());

        intent.putExtra("img",debtor.getImage());
        intent.putExtra("transaction",debtor.getTransactionHistory());
        intent.putExtra("MoneyOwe",debtor.toString());

        startActivity(intent);
    }

    @Override
    protected void onSaveInstanceState (Bundle outState)
    {
        super.onSaveInstanceState(outState);
        outState.putSerializable("debtors",dataCollection);
    }

}
