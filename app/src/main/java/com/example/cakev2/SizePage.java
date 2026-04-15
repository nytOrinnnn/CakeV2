package com.example.cakev2;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class SizePage extends FlavorPage {


    final int s = 250;
    final int m = 300;
    final int l = 350;
    final int xl = 400;
    int sBase = 0;
    ImageView backBtn, Csmall, small, Cmedium, medium, Clarge, large, CXLarge, XLarge, nextBtn;

    TextView total;

    int numTotal;
    int totalnum2;
    String summaryS ="";

    String totalSum2 ="";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.size_page);

        backBtn = findViewById(R.id.backBtn);
        Csmall = findViewById(R.id.Csmall);
        small = findViewById(R.id.small);
        Cmedium = findViewById(R.id.Cmedium);
        medium = findViewById(R.id.medium);
        Clarge = findViewById(R.id.Clarge);
        large = findViewById(R.id.large);
        CXLarge = findViewById(R.id.CXlarge);
        XLarge = findViewById(R.id.Xlarge);
        nextBtn = findViewById(R.id.nextBtn);
        total = findViewById(R.id.total);



        backBtn.setOnClickListener(view -> {
            Intent intent = new Intent(SizePage.this, FlavorPage.class);
            startActivity(intent);
        });


        nextBtn.setOnClickListener(view -> {
            Intent intent = new Intent(SizePage.this, IcingPage.class);
            intent.putExtra("SUMMARY2", summaryS);
            intent.putExtra("TOTAL2", totalSum2);
            intent.putExtra("TOTALNUM2", totalnum2);

            startActivity(intent);
        });

        Intent intent = getIntent();

        String summary = intent.getStringExtra("SUMMARY");

        String Uptotal = intent.getStringExtra("TOTAL");

        int totalInNum = intent.getIntExtra("TOTALNUM", totalnum);

        numTotal = totalInNum;
        summaryS = summary;


        total.setText(Uptotal);


        small.setOnClickListener(view -> {
            resetImageS();
            sBase = s;
            summaryS = summary + "SIZE: SMALL \n";
            small.setVisibility(View.GONE);
            Csmall.setVisibility(View.VISIBLE);


            totalUpdaterS();


        });

        medium.setOnClickListener(view -> {
            resetImageS();
            sBase = m;
            summaryS = summary + "SIZE: MEDIUM \n";
            medium.setVisibility(View.GONE);
            Cmedium.setVisibility(View.VISIBLE);

            totalUpdaterS();


        });

        large.setOnClickListener(view -> {
            resetImageS();
            sBase = l;
            summaryS = summary + "SIZE: LARGE \n";

            large.setVisibility(View.GONE);
            Clarge.setVisibility(View.VISIBLE);
            totalUpdaterS();


        });

        XLarge.setOnClickListener(view -> {
            resetImageS();
            sBase = xl;
            summaryS = summary + "SIZE: EXTRA LARGE \n";
            XLarge.setVisibility(View.GONE);
            CXLarge.setVisibility(View.VISIBLE);
            totalUpdaterS();


        });








    }

    public void totalUpdaterS(){
        int totalInS = numTotal + sBase;

        totalnum2 = totalInS;


        total.setText("TOTAL: "+ totalInS);

        totalSum2 = total.getText().toString();




    }


    public void resetImageS(){
        small.setVisibility(View.VISIBLE);
        medium.setVisibility(View.VISIBLE);
        large.setVisibility(View.VISIBLE);
        XLarge.setVisibility(View.VISIBLE);

        Csmall.setVisibility(View.GONE);
        Cmedium.setVisibility(View.GONE);
        Clarge.setVisibility(View.GONE);
        CXLarge.setVisibility(View.GONE);

    }
}
