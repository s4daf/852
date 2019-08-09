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
        String name  = intent.getStringExtra("message_id");
        String family   = intent.getStringExtra("message_id");
        String age = intent.getStringExtra("message_id");
        String phone = intent.getStringExtra("message_id");
        String address = intent.getStringExtra("message_id");


         Txtname.setText(name);
        Txtname.setText(family);
        Txtname.setText(age);
        Txtname.setText(phone);
        Txtname.setText(address);

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