package com.chart.informationapp;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.preference.PreferenceManager;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class profile extends AppCompatActivity {

    private Button button_review;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profile);
        Button btnVerifyPhoneNumber = (Button) findViewById(R.id.BtnReview);

        final EditText EdtName = (EditText) findViewById(R.id.EdtName);
        final EditText EdtFamily = (EditText) findViewById(R.id.EdtFamily);
        final EditText EdtAge = (EditText) findViewById(R.id.EdtAge);
        final EditText EdtPHONE = (EditText) findViewById(R.id.EdtPhone);
        final EditText EdtAddress = (EditText) findViewById(R.id.EdtAdress);

        btnVerifyPhoneNumber.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
               String name = EdtName.getText().toString();
                String family = EdtFamily.getText().toString();
                String age= EdtAge.getText().toString();
                String phone= EdtPHONE.getText().toString();
                String address = EdtAddress.getText().toString();

                Intent intent = new Intent(profile.this, UserInformation.class);
                intent.putExtra("name",name);
                intent.putExtra("family",family);
                intent.putExtra("age",age);
                intent.putExtra("phone",phone);
                intent.putExtra("address",address);


             // String = PreferenceManager.getDefaultSharedPreferences(Activity.this).getString("name" , "Unknown");


               // .setText( " Hello " + name);


                startActivityForResult(intent, 150);


            }
        });
    }


}