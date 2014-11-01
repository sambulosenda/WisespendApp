package me.wisespend.wisespend;

import android.app.Activity;
import android.app.AlertDialog;
import android.app.Dialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.widget.TextView;


public class NewContactActivity extends Activity{

    protected void onCreate(Bundle savedInstanceState) {


        super.onCreate(savedInstanceState);
        this.setContentView(R.layout.newcontact);

        Bundle extras = getIntent().getExtras();
        int which = extras.getInt("which");
        if(which == 0){
            //friend
            ((TextView)findViewById(R.id.textView3)).append(" - Friend");
        }
        else{
            //company
            ((TextView)findViewById(R.id.textView3)).append(" - Company");
        }


    }


}
