package com.chart.informationapp;

import androidx.appcompat.app.AppCompatActivity;

import android.Manifest;
import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.Toast;

import java.security.Permission;

public class dial extends AppCompatActivity {

    private EditText editText_num;
    private ImageButton imageButton_dialer;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dial);
        editText_num =(EditText) findViewById(R.id.EdtNumber);
        imageButton_dialer  = (ImageButton) findViewById(R.id.BtnCall);
        imageButton_dialer . setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Intent.ACTION_DIAL);
                intent.setData (Uri.parse("tel:" + editText_num.getText().toString() ));
                startActivity(intent);
            }
        });


    }
}