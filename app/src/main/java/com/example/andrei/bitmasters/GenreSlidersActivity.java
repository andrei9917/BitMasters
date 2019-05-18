package com.example.andrei.bitmasters;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.SeekBar;

import java.util.ArrayList;

public class GenreSlidersActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_genre_sliders);

        Button b = findViewById(R.id.button2);
        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // TODO: EDIT THIS PLS

                SeekBar seekBar = findViewById(R.id.seekBar1);
                seekBar.getProgress();
                Intent intent = new Intent(GenreSlidersActivity.this, FututiMortiiMatii.class);

                ArrayList<Integer> arrayList = new ArrayList<>();

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

                for (int i = 0; i < seekBarArray.size(); i++) {
                    SeekBar seekBar1 = findViewById(seekBarArray.get(i));
                    arrayList.add(seekBar1.getProgress());
                }

                intent.putExtra("data", arrayList);
                startActivity(intent);
            }
        });
    }


}
