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
     String totalSum = "";
     int base;

     int totalnum;

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
            intent.putExtra("SUMMARY", summary);
            intent.putExtra("TOTAL", totalSum);
            intent.putExtra("TOTALNUM", totalnum);

            startActivity(intent);
        });

        chocolate.setOnClickListener(view -> {

            base = choco;
            resetImage();

            chocolate.setVisibility(View.GONE);
            Cchocolate.setVisibility(View.VISIBLE);
            //summary += "FLAVOR: CHOCOLATE \n";


            totalUpdater();

        });

        strawberry.setOnClickListener(view -> {

            base = straw;

            resetImage();

            Cstrawberry.setVisibility(View.VISIBLE);
            strawberry.setVisibility(View.GONE);



           summary = "FLAVOR: STRAWBERRY \n";
            totalUpdater();

        });

        vanilla.setOnClickListener(view -> {
            base = van;

            resetImage();

            vanilla.setVisibility(View.GONE);
            Cvanilla.setVisibility(View.VISIBLE);

            summary = "FLAVOR: VANILLA \n";
            totalUpdater();


        });

        matcha.setOnClickListener(view -> {
            base = matc;

            resetImage();

            matcha.setVisibility(View.GONE);
            Cmatcha.setVisibility(View.VISIBLE);

            summary = "FLAVOR: MATCHA \n";
            totalUpdater();
        });







    }

    public void totalUpdater(){
        int totalUp = base;
        totalnum = totalUp;

       total.setText("TOTAL: " + totalUp);

       totalSum = total.getText().toString();

//       if (chocolate.isClickable()){
//           summary += "FLAVOR: CHOCOLATE \n";
//       } else if (strawberry.isClickable()) {
//           summary += "FLAVOR: STRAWBERRY \n";
//       } else if (vanilla.isClickable()){
//           summary += "FLAVOR: VANILLA \n";
//       } else if (matcha.isClickable()){
//           summary += "FLAVOR: MATCHA \n";
//       }

    }

    public void resetImage(){
        matcha.setVisibility(View.VISIBLE);
        chocolate.setVisibility(View.VISIBLE);
        vanilla.setVisibility(View.VISIBLE);
        strawberry.setVisibility(View.VISIBLE);

        Cmatcha.setVisibility(View.GONE);
        Cchocolate.setVisibility(View.GONE);
        Cvanilla.setVisibility(View.GONE);
        Cstrawberry.setVisibility(View.GONE);

    }
}