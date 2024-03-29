package com.example.tutorfinder;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.widget.ImageView;
import android.widget.TextView;

public class Avtivity2_1_1_1 extends AppCompatActivity {


TextView Name;
TextView PhoneNumber;
TextView Address;
ImageView imageView;
TextView TeachingExperience;
TextView PastResults;
ImageView imageView1;
ImageView imageView2;




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_avtivity2111);
        Intent intent = getIntent();
        Bundle bundle = getIntent().getExtras();
        Name = findViewById(R.id.Name);
        PhoneNumber = findViewById(R.id.PhoneNumber);
        Address = findViewById(R.id.Address);
        TeachingExperience = findViewById(R.id.TeachingExperience);
        PastResults = findViewById(R.id.PastResults);
        imageView = findViewById(R.id.imageView);
        imageView1 = findViewById(R.id.imageView1);
        imageView2 = findViewById(R.id.imageView2);


        Name.setText(bundle.getString("Name"));
        PhoneNumber.setText(bundle.getString("PhoneNumber"));
        Address.setText(bundle.getString("Address"));
        System.out.println(bundle.getString("TeachingExperience"));
        TeachingExperience.setText(bundle.getString("TeachingExperience"));
        PastResults.setText(bundle.getString("PastResults"));
        Log.d("hi",bundle.getString("Image1"));
        new ImageLoadTask(bundle.getString("Image1"), imageView).execute();
        new ImageLoadTask(bundle.getString("Image2"), imageView1).execute();
        new ImageLoadTask(bundle.getString("Image3"), imageView2).execute();

        }
    }