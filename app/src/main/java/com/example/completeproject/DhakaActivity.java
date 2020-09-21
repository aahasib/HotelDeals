package com.example.completeproject;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class DhakaActivity extends AppCompatActivity {
    public Button hotelinter;
    public Button panpacific;
    public Button tropical;
    public Button radission;
    public Button eastern;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dhaka);
        hotelinter = (Button) findViewById(R.id.hotelinter_bt);
        panpacific = (Button) findViewById(R.id.panpacific_bt);
        tropical = (Button) findViewById(R.id.tropical_bt);
        radission = (Button) findViewById(R.id.radission_bt);
        eastern = (Button) findViewById(R.id.eastern_bt);

        hotelinter.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(DhakaActivity.this, Dhaka_1st_hotelActivity.class);
                startActivity(intent);

            }
        });

        panpacific.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(DhakaActivity.this, Dhaka_2nd_hotelActivity.class);
                startActivity(intent);

            }
        });

        tropical.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(DhakaActivity.this, Dhaka_3rd_hotelActivity.class);
                startActivity(intent);

            }
        });

        radission.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(DhakaActivity.this,Dhaka_4th_hotelActivity.class);
                startActivity(intent);

            }
        });
        eastern.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(DhakaActivity.this, Dhaka_5th_hotelActivity.class);
                startActivity(intent);

            }
        });

    }
}