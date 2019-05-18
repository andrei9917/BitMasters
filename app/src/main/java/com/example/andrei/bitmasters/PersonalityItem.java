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
import java.util.Collections;


public class PersonalityItem extends Fragment {

    RadarChart rc;
    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);


        // hello hi
        return inflater.inflate(R.layout.personality_item, container, false);

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