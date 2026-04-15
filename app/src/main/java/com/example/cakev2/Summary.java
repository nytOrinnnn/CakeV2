package com.example.cakev2;

import android.content.Intent;
import android.os.Bundle;

import android.widget.ImageView;
import android.widget.TextView;

public class Summary extends ToppingPage{

    ImageView backBtn;

    TextView sum, total;

    String finSum = "";
    String finTotal = "";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.summary_page);

        backBtn = findViewById(R.id.backBtn);
        sum = findViewById(R.id.sum);
        total = findViewById(R.id.total);


        backBtn.setOnClickListener(view -> {
            Intent intent = new Intent(Summary.this, ToppingPage.class);
            startActivity(intent);
        });

        Intent intent = getIntent();
        String summary = intent.getStringExtra("SUMMARY3");
        String Uptotal = intent.getStringExtra("TOTAL3");


       finSum = summary;



        sum.setText(finSum);
        total.setText(Uptotal);

    }
}