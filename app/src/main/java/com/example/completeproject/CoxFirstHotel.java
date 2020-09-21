package com.example.completeproject;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;

public class CoxFirstHotel extends AppCompatActivity {

    private Button royaltulip;


    FirebaseDatabase database;
    DatabaseReference reference;
    Member member;
    int i = 0;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cox_first_hotel);

        reference = database.getInstance().getReference().child("Room");

        member = new  Member();


        royaltulip=findViewById(R.id.royaltulip_book_Button_id);



        reference.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot snapshot) {
                if (snapshot.exists()){
                    i= (int)snapshot.getChildrenCount();
                }
            }

            @Override
            public void onCancelled(@NonNull DatabaseError error) {

            }
        });

        royaltulip.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                member.setCoxhotel("Royal Tulip");
                reference.child(String.valueOf(i+1)).setValue(member);

                Intent intent = new Intent(CoxFirstHotel.this,LastActivity.class);
                startActivity(intent);



            }
        });



    }
}