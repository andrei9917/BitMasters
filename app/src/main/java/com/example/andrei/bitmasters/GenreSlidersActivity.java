package com.example.andrei.bitmasters;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.SeekBar;

import java.util.ArrayList;

public class GenreSlidersActivity extends AppCompatActivity {

    private void goToNextPicker(ArrayList<Integer> visitedGenres, ArrayList<Integer> sliderValues) {

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
        setContentView(R.layout.activity_genre_sliders);

        Button b = findViewById(R.id.button2);
        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {



                ArrayList<Integer> seekBarArray = new ArrayList<>();
                seekBarArray.add(R.id.seekBar1);
                seekBarArray.add(R.id.seekBar2);
                seekBarArray.add(R.id.seekBar3);
                seekBarArray.add(R.id.seekBar4);
                seekBarArray.add(R.id.seekBar5);
                seekBarArray.add(R.id.seekBar6);
                seekBarArray.add(R.id.seekBar7);
                seekBarArray.add(R.id.seekBar8);
                seekBarArray.add(R.id.seekBar9);
                seekBarArray.add(R.id.seekBar10);

                ArrayList<Integer> visitedGenres = new ArrayList<>();
                ArrayList<Integer> sliderValues = new ArrayList<>();

                for (int i = 0; i < seekBarArray.size(); i++) {
                    SeekBar seekBar1 = findViewById(seekBarArray.get(i));
                    sliderValues.add(seekBar1.getProgress());
                    if (seekBar1.getProgress() > 2) {
                        visitedGenres.add(0);
                    } else {
                        visitedGenres.add(1);
                    }
                }

                // personality activity
                visitedGenres.add(0);

                goToNextPicker(visitedGenres, sliderValues);

            }
        });
    }


}
