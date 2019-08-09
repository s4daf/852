package com.chart.informationapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class UserInformation extends AppCompatActivity {

    private TextView txt1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_user_information);

        TextView Txtname = (TextView) findViewById(R.id.TxtFisrtname);
        TextView Txtfamily = (TextView) findViewById(R.id.TxtSeondName);
        TextView TxtAge = (TextView) findViewById(R.id.TxtTagAge);
        TextView TxtPhone = (TextView) findViewById(R.id.TxtPhoneNumber);
        TextView TxtAddress = (TextView) findViewById(R.id.TxtTagAddress);

        Intent intent = getIntent();
        String name  = intent.getStringExtra("name");
        String family   = intent.getStringExtra("family");
        String age = intent.getStringExtra("age");
        String phone = intent.getStringExtra("phone");
        String address = intent.getStringExtra("address");


        Txtname.setText(name);
        Txtfamily.setText(family);
        TxtAge.setText(age);
        TxtPhone.setText(phone);
        TxtAddress.setText(address);


        Button btnVerifyPhoneNumber = (Button) findViewById(R.id.btnEdit);

        btnVerifyPhoneNumber.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(UserInformation.this, profile.class);
                startActivity(i);
                finish();
            }
        });

        Button btnConfirm = (Button) findViewById(R.id.btnConfirm);
        btnConfirm.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });




    }
}