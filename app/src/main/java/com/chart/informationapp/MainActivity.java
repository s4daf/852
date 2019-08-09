package com.chart.informationapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

public class MainActivity extends AppCompatActivity {

    private Button button_call;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button btnVerifyPhoneNumber = (Button) findViewById(R.id.btnCall);

        btnVerifyPhoneNumber.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(MainActivity.this, dial.class);
                startActivity(i);
            }
        });

            Button btnProfile = (Button) findViewById(R.id.btnProfile);

            btnProfile.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    Intent i = new Intent(MainActivity.this, profile.class);
                    startActivity(i);
                }
            });






    }


}



