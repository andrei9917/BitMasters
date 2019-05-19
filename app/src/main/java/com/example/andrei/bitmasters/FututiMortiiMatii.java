package com.example.andrei.bitmasters;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import java.util.ArrayList;

public class FututiMortiiMatii extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fututi_mortii_matii);
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        addData();

        LinearLayout linearLayout = findViewById(R.id.linearLayout);
    }

    private void addData() {

        Bundle extras = getIntent().getExtras();
        ArrayList<Integer> arrayList = extras.getIntegerArrayList("data");
        LinearLayout linearLayout = findViewById(R.id.linearLayout);


        MusicGenres musicGenres = new MusicGenres();
        String personality = musicGenres.getPersonality(arrayList);
        TextView textView1 = new TextView(this);
        textView1.setText(personality);
        linearLayout.addView(textView1);


        // for(int i=0; i<extras.getInt("data"); i++) {
        for (int i = 0; i < 5; i++) {
            TextView textView = new TextView(this);
            textView.setText(arrayList.toString());

            linearLayout.addView(textView);
            ImageView imageView = new ImageView(this);
            imageView.setImageResource(R.drawable.common_full_open_on_phone);
            linearLayout.addView(imageView);
        }
    }
}
