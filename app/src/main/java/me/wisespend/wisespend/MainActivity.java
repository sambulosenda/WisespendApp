package me.wisespend.wisespend;

import android.app.Activity;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import java.util.ArrayList;

import me.wisespend.wisespend.Data.Debtor;

import static android.view.View.OnClickListener;


public class MainActivity extends Activity {

    EditText nameTxt;
    Button contact;
    int counter;
    static ArrayList<Debtor> contacts = new ArrayList<Debtor>();
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

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
                                else if(which==1){
                                    Log.v(null,"Hello");
                                    Intent intent = new Intent(MainActivity.this,OrganizationActivity.class);
                                    Log.v(null,"Hello again");
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

}
