package com.example.andrei.bitmasters;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.ImageView;

import java.util.ArrayList;

public class bluesPicker extends AppCompatActivity {

    private void goToNextPicker() {

        ArrayList<Integer> visitedGenres = getIntent().getIntegerArrayListExtra("data");

        for (int i = 0; i < visitedGenres.size(); i++) {
            if (visitedGenres.get(i) == 0) { // need to visit

                visitedGenres.set(i, 1);

                Intent intent = null;
                switch (i) {
                    case 0:
                        intent = new Intent(this, rockPicker.class);
                        break;
                    case 1:
                        intent = new Intent(this, bluesPicker.class);
                        break;
                    case 2:
                        intent = new Intent(this, worldPicker.class);
                        break;
                    case 3:
                        intent = new Intent(this, electronicPicker.class);
                        break;
                    case 4:
                        intent = new Intent(this, reggaePicker.class);
                        break;
                    case 5:
                        intent = new Intent(this, classicalPicker.class);
                        break;
                    case 6:
                        intent = new Intent(this, jazzPicker.class);
                        break;
                    case 7:
                        //intent = new Intent(this, punkPicker.class);
                        break;
                    case 8:
                        //intent = new Intent(this, countryPicker.class);
                        break;
                    case 9:
                        //intent = new Intent(this, religionPicker.class);
                        break;
                    case 10:
                        intent = new Intent(this, MainActivity.class);
                        break;

                }
                if (intent != null) {
                    ArrayList<Integer> sliderValues = getIntent().getIntegerArrayListExtra("sliderValues");
                    intent.putExtra("sliderValues", sliderValues);
                    intent.putExtra("data", visitedGenres);
                    startActivity(intent);
                    finish();
                    return;
                }
            }
        }
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_blues_picker);
        Toolbar toolbar = findViewById(R.id.toolbarBlues);
        setSupportActionBar(toolbar);
        toolbar.setTitle(R.string.title_activity_blues_picker);

        FloatingActionButton fab = findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                goToNextPicker();
            }
        });


        ArrayList<Integer> arrayList = new ArrayList<>();

        arrayList.add(R.id.imageBlues1);
        arrayList.add(R.id.imageBlues2);
        arrayList.add(R.id.imageBlues3);
        arrayList.add(R.id.imageBlues4);
        arrayList.add(R.id.imageBlues5);
        arrayList.add(R.id.imageBlues6);

        addClickListeners(arrayList);

    }

    private void addClickListeners(ArrayList<Integer> arrayList) {

        for (Integer id : arrayList) {
            final ImageView imageView = findViewById(id);
            imageView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    if (imageView.getAlpha() == .5f)
                        imageView.setAlpha(1f);
                    else
                        imageView.setAlpha(.5f);
                }
            });
        }
    }
}
