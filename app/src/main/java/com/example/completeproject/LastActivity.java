package com.example.completeproject;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Adapter;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.Toast;

import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class LastActivity extends AppCompatActivity {
    private Button confirmButton,logoutButton;
   private CheckBox c1,c2;
   private Spinner Day,Month,Year;
   private EditText address,contactNumber;



    FirebaseDatabase database;
    DatabaseReference reference;
    Member member;
    int i = 0;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_last);


        reference = database.getInstance().getReference().child("Room");

        member = new  Member();


        confirmButton=findViewById(R.id.confirm_btn_id);
        logoutButton=findViewById(R.id.logout_btn_id);
        c1=findViewById(R.id.delux_Twin_id);
        c2=findViewById(R.id.delux_double_id);
        Day=findViewById(R.id.day_id);
        Month=findViewById(R.id.month_id);
        Year=findViewById(R.id.year_id);
        address=findViewById(R.id.address_id);
        contactNumber=findViewById(R.id.contract_number_id);



     final String d1="Delux Twin";
     final String d2="Delux Double";

        String [] day={"Day","1","2","3","4","5","6","7","8","9","10","11","12","13","14","15","16","17","18","19","20","21","22","23","24","25","26","27","28","29","30","31"};
        ArrayList<String> arrayList = new ArrayList<>(Arrays.asList(day));
        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<>(this,android.R.layout.simple_spinner_dropdown_item,arrayList);
        Day.setAdapter(arrayAdapter);

        String [] month={"Month","January","February","March","April","May","June","July","August","September","October","November","December","August","September","October","November", "December"};
        ArrayList<String> arrayList2 = new ArrayList<>(Arrays.asList(month));
        ArrayAdapter<String> arrayAdapter2 = new ArrayAdapter<>(this,android.R.layout.simple_spinner_dropdown_item,arrayList2);
        Month.setAdapter(arrayAdapter2);

        String [] year={"Year","2020","2021","2022"};
        ArrayList<String> arrayList3= new ArrayList<>(Arrays.asList(year));
        ArrayAdapter<String> arrayAdapter3 = new ArrayAdapter<>(this,android.R.layout.simple_spinner_dropdown_item,arrayList3);
        Year.setAdapter(arrayAdapter3);

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

        confirmButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (c1.isChecked()){
                    member.setRoom(d1);
                    reference.child(String.valueOf(i+1)).setValue(member);
                }
                else {

                }
                if (c2.isChecked()){
                    member.setRoom(d2);
                    reference.child(String.valueOf(i+1)).setValue(member);
                }
                else {

                }
                member.setDay(Day.getSelectedItem().toString());
                reference.child(String.valueOf(i+1)).setValue(member);

                member.setMonth(Month.getSelectedItem().toString());
                reference.child(String.valueOf(i+1)).setValue(member);

                member.setYear(Year.getSelectedItem().toString());
                reference.child(String.valueOf(i+1)).setValue(member);


                final String fulladdress =address.getText().toString().trim();
                final String phone = contactNumber.getText().toString().trim();

                if (TextUtils.isEmpty(fulladdress)) {

                    address.setError("Plz enter your Address");
                    return;
                }
                else{
                    member.setAddress(fulladdress);
                    reference.child(String.valueOf(i+1)).setValue(member);
                }

                if (TextUtils.isEmpty(phone)) {

                    contactNumber.setError("Plz enter your Phone Number");
                    return;
                }
                else{
                    member.setContractNumber(phone);
                    reference.child(String.valueOf(i+1)).setValue(member);
                }

                Toast.makeText(LastActivity.this, "Your book confirm", Toast.LENGTH_SHORT).show();



            }
        });
        logoutButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(LastActivity.this, MenuActivity.class);
                startActivity(intent);


            }
        });








    }
}










