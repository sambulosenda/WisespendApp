package me.wisespend.wisespend;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import static android.view.View.OnClickListener;


public class MainActivity extends Activity {


    Button contact;
    int counter;

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

}