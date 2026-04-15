package com.example.cakev2;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class IcingPage extends  SizePage{

    ImageView cchocoGanache, chocoGanace, cbutterCream, butterCream, ccreamCheese, creamCheese, cube, ube, nextBtn, backBtn;
    TextView total;

    int numTotal;
    int totalnum3;
    String summaryI ="";

    String totalSum3 ="";

    final int CHOCOGANACE = 250;
    final int CREAMCHEESE = 300;
    final int BUTTERCREAM = 350;
    final int UBE = 400;
    int IBase = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.icing_page);

        cchocoGanache = findViewById(R.id.cchocoganace);
        chocoGanace = findViewById(R.id.chocoGanache);
        cbutterCream = findViewById(R.id.cbutterCream);
        butterCream = findViewById(R.id.butterCream);
        ccreamCheese = findViewById(R.id.ccreamCheese);
        creamCheese = findViewById(R.id.creamCheese);
        cube = findViewById(R.id.cube);
        ube = findViewById(R.id.ube);
        nextBtn = findViewById(R.id.nextBtn);
        backBtn = findViewById(R.id.backBtn);
        total = findViewById(R.id.total);

        backBtn.setOnClickListener(view -> {
            Intent intent = new Intent(IcingPage.this, SizePage.class);
            startActivity(intent);
        });


        nextBtn.setOnClickListener(view -> {
            Intent intent = new Intent(IcingPage.this, ToppingPage.class);
            intent.putExtra("SUMMARY2", summaryI);
            intent.putExtra("TOTAL2", totalSum3);
            intent.putExtra("TOTALNUM2", totalnum3);

            startActivity(intent);
        });

        Intent intent = getIntent();
        String summary = intent.getStringExtra("SUMMARY2");
        String Uptotal = intent.getStringExtra("TOTAL2");
        int totalInnum = intent.getIntExtra("TOTALNUM2", totalnum2);





        numTotal = totalInnum;

        summaryI = summary;

        total.setText(Uptotal);


        chocoGanace.setOnClickListener(view -> {
            resetImageI();
            IBase = CHOCOGANACE;

            summaryI = summary + "ICING: CHOCOLATE GANACHE \n";
            chocoGanace.setVisibility(View.GONE);
            cchocoGanache.setVisibility(View.VISIBLE);

            totalUpdaterI();
        });

        creamCheese.setOnClickListener(view -> {
            resetImageI();
            IBase = CREAMCHEESE;

            summaryI = summary + "ICING: CREAM CHEESE \n";
            creamCheese.setVisibility(View.GONE);
            ccreamCheese.setVisibility(View.VISIBLE);

            totalUpdaterI();
        });

        butterCream.setOnClickListener(view -> {
            resetImageI();
            IBase = BUTTERCREAM;

            summaryI = summary + "ICING: BUTTER CREAM \n";
            butterCream.setVisibility(View.GONE);
            cbutterCream.setVisibility(View.VISIBLE);

            totalUpdaterI();
        });

        ube.setOnClickListener(view -> {
            resetImageI();
            IBase = CHOCOGANACE;

            summaryI = summary + "ICING: UBE \n";
            ube.setVisibility(View.GONE);
            cube.setVisibility(View.VISIBLE);

            totalUpdaterI();
        });


}

    public void totalUpdaterI(){
        int totalInI = numTotal + IBase;

        totalnum3 = totalInI;


        total.setText("TOTAL: "+ totalInI);

        totalSum3 = total.getText().toString();




    }


    public void resetImageI(){
        chocoGanace.setVisibility(View.VISIBLE);
        butterCream.setVisibility(View.VISIBLE);
        creamCheese.setVisibility(View.VISIBLE);
        ube.setVisibility(View.VISIBLE);

        ccreamCheese.setVisibility(View.GONE);
        cchocoGanache.setVisibility(View.GONE);
        cbutterCream.setVisibility(View.GONE);
        cube.setVisibility(View.GONE);

    }
}


