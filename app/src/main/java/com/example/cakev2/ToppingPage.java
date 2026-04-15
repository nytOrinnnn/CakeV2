package com.example.cakev2;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class ToppingPage extends IcingPage {

    ImageView csprinkles, sprinkles, cchocoChips, chocoChips, cfruits, fruits, cvegetablse, vegetables, nextBtn, backBtn;
    TextView total;

    int numTotal;
    int totalnum4;
    String summaryT ="";

    String totalSum4 ="";

    final int SPRINKLES = 250;
    final int CHOCOCHIPS = 300;
    final int FRUITS = 350;
    final int VEGETABLES = 400;
    int TBase = 0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.toppings_page);

        csprinkles = findViewById(R.id.cspringkles);
        sprinkles = findViewById(R.id.sprinkles);
        cchocoChips = findViewById(R.id.cchocoChips);
        chocoChips = findViewById(R.id.chocoChips);
        cfruits = findViewById(R.id.cfruits);
        fruits = findViewById(R.id.fruits);
        cvegetablse = findViewById(R.id.cvegetables);
        vegetables = findViewById(R.id.vegetables);
        backBtn = findViewById(R.id.backBtn);
        nextBtn = findViewById(R.id.nextBtn);
        total = findViewById(R.id.total);


        backBtn.setOnClickListener(view -> {
            Intent intent = new Intent(ToppingPage.this, IcingPage.class);
            startActivity(intent);
        });


        nextBtn.setOnClickListener(view -> {
            Intent intent = new Intent(ToppingPage.this, Summary.class);
            intent.putExtra("SUMMARY3", summaryT);
            intent.putExtra("TOTAL3", totalSum4);
            intent.putExtra("TOTALNUM3", totalnum4);
            startActivity(intent);

        });

        Intent intent = getIntent();
        String summary = intent.getStringExtra("SUMMARY2");
        String Uptotal = intent.getStringExtra("TOTAL2");
        int totalInNum = intent.getIntExtra("TOTALNUM2", totalnum3);


        summaryT = summary;

        numTotal = totalInNum;
        total.setText(Uptotal);


        sprinkles.setOnClickListener(view -> {
            resetImageT();
            TBase = SPRINKLES;

            summaryT = summary + "TOPPING: SPRINKLES";

            sprinkles.setVisibility(View.GONE);
            csprinkles.setVisibility(View.VISIBLE);

            totalUpdaterT();
        });

        chocoChips.setOnClickListener(view -> {
            resetImageT();
            TBase = CHOCOCHIPS;

            summaryT = summary + "TOPPING: CHOCOLATE CHIPS";

            chocoChips.setVisibility(View.GONE);
            cchocoChips.setVisibility(View.VISIBLE);

            totalUpdaterT();
        });

        fruits.setOnClickListener(view -> {
            resetImageT();
            TBase = FRUITS;

            summaryT = summary + "TOPPING: FRUITS";

            fruits.setVisibility(View.GONE);
            cfruits.setVisibility(View.VISIBLE);

            totalUpdaterT();
        });

        vegetables.setOnClickListener(view -> {
            resetImageT();
            TBase = VEGETABLES;
            summaryT = summary + "TOPPING: VEGETABLES";

            vegetables.setVisibility(View.GONE);
            cvegetablse.setVisibility(View.VISIBLE);

            totalUpdaterT();
        });



    }

    public void totalUpdaterT(){
        int totalInT = numTotal + TBase;

        totalnum4 = totalInT;


        total.setText("TOTAL: "+ totalInT);

        totalSum4 = total.getText().toString();




    }


    public void resetImageT(){
        sprinkles.setVisibility(View.VISIBLE);
        chocoChips.setVisibility(View.VISIBLE);
        fruits.setVisibility(View.VISIBLE);
        vegetables.setVisibility(View.VISIBLE);

        csprinkles.setVisibility(View.GONE);
        cchocoChips.setVisibility(View.GONE);
        cfruits.setVisibility(View.GONE);
        cvegetablse.setVisibility(View.GONE);

    }

}