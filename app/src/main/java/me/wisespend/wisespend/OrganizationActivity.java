package me.wisespend.wisespend;

import android.app.Activity;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import me.wisespend.wisespend.Data.Company;
import me.wisespend.wisespend.Data.Friend;


public class OrganizationActivity extends Activity{

    protected void onCreate(Bundle savedInstanceState) {


        super.onCreate(savedInstanceState);
        setContentView(R.layout.organization);
        EditText nameTxt = (EditText)findViewById(R.id.txtCompanyName);

        final Button addBtn = (Button) findViewById(R.id.btnAddCompany);
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
                MainActivity.dataCollection.getDebtors().add(new Company(
                        ((EditText) findViewById(R.id.txtCompanyName)).getText().toString()
                        , R.drawable.ic_launcher,
                        Double.parseDouble(((EditText) findViewById(R.id.txtBill)).getText().toString()),
                        Integer.parseInt(((EditText) findViewById(R.id.txtDate)).getText().toString())));
                Toast.makeText(getApplicationContext(), "Recurring payment added.", Toast.LENGTH_SHORT).show();
            }
        });

    }


}


