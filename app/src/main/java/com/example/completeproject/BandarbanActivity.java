package com.example.completeproject;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
public class BandarbanActivity extends AppCompatActivity {
    public Button holiday;
    public Button hillcrown;
    public Button hillview;
    public Button hillton;
    public Button cloudheaven;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bandarban);
        holiday = (Button) findViewById(R.id.holiday_bt);
        hillcrown = (Button) findViewById(R.id.hillcrown_bt);
        hillview = (Button) findViewById(R.id.hillview_bt);
        hillton = (Button) findViewById(R.id.hillton_bt);
        cloudheaven = (Button) findViewById(R.id.cloudheaven_bt);

        holiday.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(BandarbanActivity.this, HolidayInnActivity.class);
                startActivity(intent);

            }
        });

        hillcrown.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(BandarbanActivity.this, HolidayInnActivity.class);
                startActivity(intent);

            }
        });

        hillview.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(BandarbanActivity.this, HolidayInnActivity.class);
                startActivity(intent);

            }
        });

        hillton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(BandarbanActivity.this, HolidayInnActivity.class);
                startActivity(intent);

            }
        });
        cloudheaven.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(BandarbanActivity.this, HolidayInnActivity.class);
                startActivity(intent);

            }
        });

    }
}