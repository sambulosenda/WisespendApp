package me.wisespend.wisespend;

import android.app.Activity;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import me.wisespend.wisespend.Data.Friend;


public class NewContactActivity extends Activity{

    protected void onCreate(Bundle savedInstanceState) {


        super.onCreate(savedInstanceState);
        EditText nameTxt = (EditText)findViewById(R.id.txtFriendName);

        final Button addBtn = (Button) findViewById(R.id.btnAdd);
        nameTxt.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {
                addBtn.setEnabled(!s.equals(""));

            }

            @Override
            public void afterTextChanged(Editable s) {

            }
        });
        addBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                MainActivity.contacts.add(new Friend(
                        ((EditText)findViewById(R.id.txtFriendName)).getText().toString()
                        ,R.drawable.ic_launcher,0,
                        ((EditText)findViewById(R.id.txtEmail)).getText().toString(),
                        ((EditText)findViewById(R.id.txtPhone)).getText().toString()));
                Toast.makeText(getApplicationContext(), "Your Contact has been created!", Toast.LENGTH_SHORT).show();
            }
        });

    }


}


