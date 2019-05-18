package com.example.andrei.bitmasters;

import android.graphics.Color;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.github.mikephil.charting.charts.RadarChart;
import com.github.mikephil.charting.data.RadarData;
import com.github.mikephil.charting.data.RadarDataSet;
import com.github.mikephil.charting.data.RadarEntry;
import com.github.mikephil.charting.formatter.ValueFormatter;
import com.github.mikephil.charting.interfaces.datasets.IRadarDataSet;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

import com.example.andrei.bitmasters.MusicGenres;

public class PersonalityItem extends Fragment {

    RadarChart rc;
    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);


        // hello hi
        return inflater.inflate(R.layout.personality_item, container, false);

    }

    protected void addGenres(){
        ArrayList<MusicGenres> musicGenress = new ArrayList<>();
        MusicGenres genre = new MusicGenres();
        genre.setPersonality("Analyst");
        genre.addGenre("rock/ metal/ indie",0.41);
        genre.addGenre("blues/ soul",0.0);
        genre.addGenre("world/ ambient",0.0);
        genre.addGenre("electronic/ hip-hop/ pop",0.0);
        genre.addGenre("raggae",0.0);
        genre.addGenre("classical",0.76);
        genre.addGenre("jazz",0.54);
        genre.addGenre("punk",0.46);
        genre.addGenre("country",0.0);
        genre.addGenre("religion music",0.0);
        musicGenress.add(genre);

        genre.setPersonality("Diplomat");
        genre.addGenre("rock/ metal/ indie",0.28);
        genre.addGenre("blues/ soul",0.48);
        genre.addGenre("world/ ambient",0.54);
        genre.addGenre("electronic/ hip-hop/ pop",0.0);
        genre.addGenre("raggae",0.0);
        genre.addGenre("classical",0.0);
        genre.addGenre("jazz",0.54);
        genre.addGenre("punk",0.0);
        genre.addGenre("country",0.0);
        genre.addGenre("religion music",0.0);
        musicGenress.add(genre);

        genre.setPersonality("Sentinel");
        genre.addGenre("rock/ metal/ indie",0.0);
        genre.addGenre("blues/ soul",0.0);
        genre.addGenre("world/ ambient",0.0);
        genre.addGenre("electronic/ hip-hop/ pop",0.0);
        genre.addGenre("raggae",0.0);
        genre.addGenre("classical",0.0);
        genre.addGenre("jazz",0.0);
        genre.addGenre("punk",0.0);
        genre.addGenre("country",0.43);
        genre.addGenre("religion music",0.4);
        musicGenress.add(genre);

        genre.setPersonality("Explorer");
        genre.addGenre("rock/ metal/ indie",0.0);
        genre.addGenre("blues/ soul",0.0);
        genre.addGenre("world/ ambient",0.0);
        genre.addGenre("electronic/ hip-hop/ pop",0.64);
        genre.addGenre("raggae",0.35);
        genre.addGenre("classical",0.0);
        genre.addGenre("jazz",0.0);
        genre.addGenre("punk",0.0);
        genre.addGenre("country",0.0);
        genre.addGenre("religion music",0.0);
        musicGenress.add(genre);

        genre.setPersonality("People Mastery");
        genre.addGenre("rock/ metal/ indie",0.0);
        genre.addGenre("blues/ soul",0.53);
        genre.addGenre("world/ ambient",0.0);
        genre.addGenre("electronic/ hip-hop/ pop",0.0);
        genre.addGenre("raggae",0.38);
        genre.addGenre("classical",0.76);
        genre.addGenre("jazz",0.6);
        genre.addGenre("punk",0.0);
        genre.addGenre("country",0.4);
        genre.addGenre("religion music",0.0);
        musicGenress.add(genre);

        genre.setPersonality("Constant Improver");
        genre.addGenre("rock/ metal/ indie",0.54);
        genre.addGenre("blues/ soul",0.0);
        genre.addGenre("world/ ambient",0.0);
        genre.addGenre("electronic/ hip-hop/ pop",0.0);
        genre.addGenre("raggae",0.0);
        genre.addGenre("classical",0.0);
        genre.addGenre("jazz",0.0);
        genre.addGenre("punk",0.46);
        genre.addGenre("country",0.0);
        genre.addGenre("religion music",0.0);
        musicGenress.add(genre);

        genre.setPersonality("Social Engagement");
        genre.addGenre("rock/ metal/ indie",0.0);
        genre.addGenre("blues/ soul",0.0);
        genre.addGenre("world/ ambient",0.53);
        genre.addGenre("electronic/ hip-hop/ pop",0.69);
        genre.addGenre("raggae",0.0);
        genre.addGenre("classical",0.0);
        genre.addGenre("jazz",0.0);
        genre.addGenre("punk",0.0);
        genre.addGenre("country",0.0);
        genre.addGenre("religion music",0.35);
        musicGenress.add(genre);

        genre.setPersonality("Logician");
        genre.addGenre("rock/ metal/ indie",0.43);
        genre.addGenre("blues/ soul",0.0);
        genre.addGenre("world/ ambient",0.0);
        genre.addGenre("electronic/ hip-hop/ pop",0.0);
        genre.addGenre("raggae",0.0);
        genre.addGenre("classical",0.0);
        genre.addGenre("jazz",0.0);
        genre.addGenre("punk",0.51);
        genre.addGenre("country",0.0);
        genre.addGenre("religion music",0.0);
        musicGenress.add(genre);

        genre.setPersonality("Mediator");
        genre.addGenre("rock/ metal/ indie",0.56);
        genre.addGenre("blues/ soul",0.0);
        genre.addGenre("world/ ambient",0.0);
        genre.addGenre("electronic/ hip-hop/ pop",0.0);
        genre.addGenre("raggae",0.0);
        genre.addGenre("classical",0.0);
        genre.addGenre("jazz",0.0);
        genre.addGenre("punk",0.49);
        genre.addGenre("country",0.0);
        genre.addGenre("religion music",0.0);
        musicGenress.add(genre);

        genre.setPersonality("Virtuos");
        genre.addGenre("rock/ metal/ indie",0.0);
        genre.addGenre("blues/ soul",0.0);
        genre.addGenre("world/ ambient",0.0);
        genre.addGenre("electronic/ hip-hop/ pop",0.0);
        genre.addGenre("raggae",0.0);
        genre.addGenre("classical",0.0);
        genre.addGenre("jazz",0.0);
        genre.addGenre("punk",0.48);
        genre.addGenre("country",0.0);
        genre.addGenre("religion music",0.0);
        musicGenress.add(genre);

        genre.setPersonality("Commander");
        genre.addGenre("rock/ metal/ indie",0.0);
        genre.addGenre("blues/ soul",0.0);
        genre.addGenre("world/ ambient",0.0);
        genre.addGenre("electronic/ hip-hop/ pop",0.23);
        genre.addGenre("raggae",0.0);
        genre.addGenre("classical",0.79);
        genre.addGenre("jazz",0.64);
        genre.addGenre("punk",0.0);
        genre.addGenre("country",0.0);
        genre.addGenre("religion music",0.0);
        musicGenress.add(genre);

        genre.setPersonality("Protagonist");
        genre.addGenre("rock/ metal/ indie",0.0);
        genre.addGenre("blues/ soul",0.26);
        genre.addGenre("world/ ambient",0.26);
        genre.addGenre("electronic/ hip-hop/ pop",0.0);
        genre.addGenre("raggae",0.0);
        genre.addGenre("classical",0.0);
        genre.addGenre("jazz",0.64);
        genre.addGenre("punk",0.0);
        genre.addGenre("country",0.0);
        genre.addGenre("religion music",0.0);
        musicGenress.add(genre);

        genre.setPersonality("Compaigner");
        genre.addGenre("rock/ metal/ indie",0.0);
        genre.addGenre("blues/ soul",0.55);
        genre.addGenre("world/ ambient",0.59);
        genre.addGenre("electronic/ hip-hop/ pop",0.25);
        genre.addGenre("raggae",0.42);
        genre.addGenre("classical",0.0);
        genre.addGenre("jazz",0.62);
        genre.addGenre("punk",0.0);
        genre.addGenre("country",0.0);
        genre.addGenre("religion music",0.0);
        musicGenress.add(genre);

        genre.setPersonality("Architect");
        genre.addGenre("rock/ metal/ indie",0.14);
        genre.addGenre("blues/ soul",0.0);
        genre.addGenre("world/ ambient",0.0);
        genre.addGenre("electronic/ hip-hop/ pop",0.0);
        genre.addGenre("raggae",0.0);
        genre.addGenre("classical",0.78);
        genre.addGenre("jazz",0.0);
        genre.addGenre("punk",0.0);
        genre.addGenre("country",0.0);
        genre.addGenre("religion music",0.0);
        musicGenress.add(genre);

        genre.setPersonality("Debater");
        genre.addGenre("rock/ metal/ indie",0.57);
        genre.addGenre("blues/ soul",0.0);
        genre.addGenre("world/ ambient",0.0);
        genre.addGenre("electronic/ hip-hop/ pop",0.0);
        genre.addGenre("raggae",0.0);
        genre.addGenre("classical",0.76);
        genre.addGenre("jazz",0.0);
        genre.addGenre("punk",0.0);
        genre.addGenre("country",0.0);
        genre.addGenre("religion music",0.0);
        musicGenress.add(genre);

        genre.setPersonality("Advocate");
        genre.addGenre("rock/ metal/ indie",0.28);
        genre.addGenre("blues/ soul",0.0);
        genre.addGenre("world/ ambient",0.23);
        genre.addGenre("electronic/ hip-hop/ pop",0.0);
        genre.addGenre("raggae",0.0);
        genre.addGenre("classical",0.0);
        genre.addGenre("jazz",0.0);
        genre.addGenre("punk",0.0);
        genre.addGenre("country",0.0);
        genre.addGenre("religion music",0.0);
        musicGenress.add(genre);

        genre.setPersonality("Adventurer");
        genre.addGenre("rock/ metal/ indie",0.0);
        genre.addGenre("blues/ soul",0.0);
        genre.addGenre("world/ ambient",0.32);
        genre.addGenre("electronic/ hip-hop/ pop",0.26);
        genre.addGenre("raggae",0.46);
        genre.addGenre("classical",0.0);
        genre.addGenre("jazz",0.0);
        genre.addGenre("punk",0.0);
        genre.addGenre("country",0.0);
        genre.addGenre("religion music",0.0);
        musicGenress.add(genre);

        genre.setPersonality("Entrepreneur");
        genre.addGenre("rock/ metal/ indie",0.17);
        genre.addGenre("blues/ soul",0.0);
        genre.addGenre("world/ ambient",0.0);
        genre.addGenre("electronic/ hip-hop/ pop",0.46);
        genre.addGenre("raggae",0.42);
        genre.addGenre("classical",0.0);
        genre.addGenre("jazz",0.0);
        genre.addGenre("punk",0.0);
        genre.addGenre("country",0.0);
        genre.addGenre("religion music",0.0);
        musicGenress.add(genre);

        genre.setPersonality("Entertainer");
        genre.addGenre("rock/ metal/ indie",0.0);
        genre.addGenre("blues/ soul",0.28);
        genre.addGenre("world/ ambient",0.31);
        genre.addGenre("electronic/ hip-hop/ pop",0.48);
        genre.addGenre("raggae",0.0);
        genre.addGenre("classical",0.0);
        genre.addGenre("jazz",0.0);
        genre.addGenre("punk",0.0);
        genre.addGenre("country",0.52);
        genre.addGenre("religion music",0.0);
        musicGenress.add(genre);

        genre.setPersonality("Consul");
        genre.addGenre("rock/ metal/ indie",0.0);
        genre.addGenre("blues/ soul",0.52);
        genre.addGenre("world/ ambient",0.0);
        genre.addGenre("electronic/ hip-hop/ pop",0.27);
        genre.addGenre("raggae",0.0);
        genre.addGenre("classical",0.0);
        genre.addGenre("jazz",0.0);
        genre.addGenre("punk",0.0);
        genre.addGenre("country",0.53);
        genre.addGenre("religion music",0.39);
        musicGenress.add(genre);

        genre.setPersonality("Executive");
        genre.addGenre("rock/ metal/ indie",0.0);
        genre.addGenre("blues/ soul",0.0);
        genre.addGenre("world/ ambient",0.0);
        genre.addGenre("electronic/ hip-hop/ pop",0.19);
        genre.addGenre("raggae",0.0);
        genre.addGenre("classical",0.0);
        genre.addGenre("jazz",0.0);
        genre.addGenre("punk",0.0);
        genre.addGenre("country",0.0);
        genre.addGenre("religion music",0.48);
        musicGenress.add(genre);

        genre.setPersonality("Defender");
        genre.addGenre("rock/ metal/ indie",0.0);
        genre.addGenre("blues/ soul",0.0);
        genre.addGenre("world/ ambient",0.0);
        genre.addGenre("electronic/ hip-hop/ pop",0.0);
        genre.addGenre("raggae",0.0);
        genre.addGenre("classical",0.0);
        genre.addGenre("jazz",0.0);
        genre.addGenre("punk",0.0);
        genre.addGenre("country",0.0);
        genre.addGenre("religion music",0.42);
        musicGenress.add(genre);


    }
    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);

        rc = getView().findViewById(R.id.radar_chart);
        ArrayList<Integer> elems = new ArrayList<>(Arrays.asList(1, 5, 4, 5, 3));
        setData(elems);
    }

    private void setData(ArrayList<Integer> input) {

        ArrayList<RadarEntry> entries1 = new ArrayList<>();

        float x = Collections.min(input) / 2f;

        for (int i = 0; i < input.size(); i++) {
            entries1.add(new RadarEntry(input.get(i)));
            entries1.add(new RadarEntry((
                    Math.min(input.get(i), input.get(i + 1 == input.size() ? 0 : i + 1))
            ) / 2f));
        }

        RadarDataSet set1 = new RadarDataSet(entries1, "Personality");


        //set1.setColor(R.color.colorPrimary);
        set1.setColor(getResources().getColor(R.color.colorPrimary));
        //set1.setColor(Color.WHITE);
        set1.setFillColor(getResources().getColor(R.color.colorPrimaryDark));


        //set1.setFillColor(Color.rgb(103, 110, 129));
        //set1.setFillColor(R.color.colorPrimaryDark);
        set1.setDrawFilled(true);
        set1.setFillAlpha(90);
        set1.setLineWidth(5f);
        set1.setDrawHighlightCircleEnabled(false);
        set1.setDrawHighlightIndicators(false);


        ArrayList<IRadarDataSet> sets = new ArrayList<>();
        sets.add(set1);

        RadarData data = new RadarData(sets);
        data.setValueTextSize(8f);
        data.setDrawValues(false);
        data.setValueTextColor(Color.WHITE);

        rc.setDrawWeb(true);
        rc.setDrawMarkers(true);
        //rc.getXAxis().setEnabled(!rc.getXAxis().isEnabled());
        rc.getYAxis().setEnabled(!rc.getYAxis().isEnabled());
        rc.getLegend().setEnabled(false);
        rc.getDescription().setEnabled(false);

        rc.getXAxis().setValueFormatter(new ValueFormatter() {

            private final String[] mActivities = new String[]{"Moody", "", "Happy", "", "Tired", "", "Curious", "", "Anxious", ""};

            @Override
            public String getFormattedValue(float value) {
                return mActivities[(int) value % mActivities.length];
            }
        });

        rc.getYAxis().setAxisMinimum(0);

        rc.getXAxis().setTextColor(Color.WHITE);


        rc.setData(data);
        rc.invalidate();
        rc.animateXY(1000, 1000);
    }
}