package com.example.cakev2;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class FlavorPage extends MainActivity {

     ImageView backBtn, nextBtn, Cchocolate, chocolate, Cstrawberry, strawberry, Cvanilla, vanilla, Cmatcha, matcha;

     TextView total;

     String summary = "";
     int base;

     final int choco = 100;
     final int straw = 120;
     final  int van = 100;
     final int matc = 130;

    
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.flavor_page);

        backBtn = findViewById(R.id.backBtn);
        nextBtn = findViewById(R.id.nextBtn);
        Cchocolate = findViewById(R.id.Cchocolate);
        chocolate = findViewById(R.id.chocolate);
        Cstrawberry = findViewById(R.id.Cstrawberry);
        strawberry = findViewById(R.id.strawberry);
        Cvanilla = findViewById(R.id.Cvanilla);
        vanilla = findViewById(R.id.vanilla);
        Cmatcha = findViewById(R.id.Cmatcha);
        matcha = findViewById(R.id.matcha);
        total = findViewById(R.id.total);





        backBtn.setOnClickListener(view -> {
            Intent intent = new Intent(FlavorPage.this, MainActivity.class);
            startActivity(intent);
        });

        nextBtn.setOnClickListener(view -> {
            Intent intent = new Intent(FlavorPage.this, SizePage.class);
            startActivity(intent);
        });

        chocolate.setOnClickListener(view -> {

            base = choco;

            chocolate.setVisibility(View.GONE);
            Cchocolate.setVisibility(View.VISIBLE);
            Cvanilla.setVisibility(View.GONE);
            matcha.setVisibility(View.GONE);

            totalUpdater();

        });

        strawberry.setOnClickListener(view -> {

            base = straw;

            Cstrawberry.setVisibility(View.VISIBLE);
            strawberry.setVisibility(View.GONE);
            matcha.setVisibility(View.GONE);
            Cvanilla.setVisibility(View.GONE);


            summary += "FLAVOR: CHOCOLATE";
            totalUpdater();

        });

        vanilla.setOnClickListener(view -> {
            base = van;

            vanilla.setVisibility(View.GONE);
            Cchocolate.setVisibility(View.GONE);
            Cvanilla.setVisibility(View.VISIBLE);
            matcha.setVisibility(View.GONE);
            totalUpdater();


        });

        matcha.setOnClickListener(view -> {
            base = matc;

            matcha.setVisibility(View.GONE);
            Cmatcha.setVisibility(View.VISIBLE);
            Cchocolate.setVisibility(View.GONE);
            chocolate.setVisibility(View.GONE);
            totalUpdater();
        });







    }

    public void totalUpdater(){
        int totalUp = base;

        total.setText("TOTAL: " + totalUp);

    }
}