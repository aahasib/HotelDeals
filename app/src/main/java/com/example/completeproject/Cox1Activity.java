package com.example.completeproject;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Cox1Activity extends AppCompatActivity {
    private Button button1;
    private Button button2;
    private Button button3;
    private Button button4;
    private Button button5;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cox1);

        button1 = (Button) findViewById(R.id.hotelBookButton);
        button2 = (Button) findViewById(R.id.hotelBookButton2);
        button3 = (Button) findViewById(R.id.hotelBookButton3);
        button4 = (Button) findViewById(R.id.hotelBookButton4);
        button5 = (Button) findViewById(R.id.hotelBookButton5);

        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Cox1Activity.this, CoxFirstHotel.class);
                startActivity(intent);
            }
        });
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Cox1Activity.this, CoxSecondHotel.class);
                startActivity(intent);
            }
        });
        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Cox1Activity.this, CoxThirdHotel.class);
                startActivity(intent);
            }
        });
        button4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Cox1Activity.this, CoxFourthHotel.class);
                startActivity(intent);
            }
        });
        button5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Cox1Activity.this, CoxFirstHotel.class);
                startActivity(intent);
            }
        });
    }

}