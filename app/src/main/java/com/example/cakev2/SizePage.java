package com.example.cakev2;

import android.os.Bundle;
import android.widget.ImageView;

public class SizePage extends FlavorPage {

    ImageView backBtn, Csmall, small, Cmedium, medium, Clarge, large, CXLarge, XLarge, nextBtn;

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
        CXLarge = findViewById(R.id.CXLarge);
        XLarge = findViewById(R.id.XLarge);
        nextBtn = findViewById(R.id.nextBtn);

    }
}
