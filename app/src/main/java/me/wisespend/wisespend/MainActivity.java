package me.wisespend.wisespend;



import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.app.ListActivity;
import android.widget.ListView;

import java.util.List;

import me.wisespend.wisespend.Data.DataCollection;
import me.wisespend.wisespend.Data.Debtor;

import static android.view.View.OnClickListener;


public class MainActivity extends ListActivity{


    Button contact;
    int counter;
    List<Debtor> Debtors = new DataCollection().getDebtors();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);


        // get data and display to the main list
        ArrayAdapter<Debtor> adapter = new ArrayAdapter<Debtor>(this,android.R.layout.simple_list_item_1
        ,Debtors);
        setListAdapter(adapter);


        setContentView(R.layout.activity_main);

        contact = (Button) findViewById(R.id.Contact);
        contact.setOnClickListener(new OnClickListener() {


            public void onClick(View v) {
                AlertDialog.Builder builder = new AlertDialog.Builder(MainActivity.this);
                builder.setTitle(R.string.choose)
                        .setItems(R.array.options_array, new DialogInterface.OnClickListener() {
                            public void onClick(DialogInterface dialog, int which) {
                                if(which==2)
                                    return; //cancel
                                else {

                                    Intent intent;
                                    intent = new Intent(MainActivity.this,NewContactActivity.class);
                                    intent.putExtra("type",which);
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
        Debtor debtor = Debtors.get(position);
        Intent intent =  new Intent(MainActivity.this, DetailActivities.class);
        intent.putExtra("name",debtor.getName());

        intent.putExtra("img",debtor.getImage());
        intent.putExtra("MoneyOwe",debtor.getMoneyOwe());
        startActivity(intent);
    }
}
