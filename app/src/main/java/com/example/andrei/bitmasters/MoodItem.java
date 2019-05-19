package com.example.andrei.bitmasters;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.design.widget.Snackbar;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.Spinner;
import android.widget.Toast;


public class MoodItem extends Fragment {

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        return inflater.inflate(R.layout.mood_item, container, false);

    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);

        final Spinner moodSpinner = getView().findViewById(R.id.yourMoodSpinner);
        final Spinner activitySpinner = getView().findViewById(R.id.yourActivitySpinner);

        Button button = getView().findViewById(R.id.generatePlaylistButton);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String moodSpinnerString = (String) moodSpinner.getSelectedItem(); // ce ii in primul combobox
                String activitySpinnerString = (String) activitySpinner.getSelectedItem(); // ce ii in al doilea

                // do something with them
                Snackbar.make(getView(), "Spinner 1 : "+ moodSpinnerString +
                        "\nSpinner 2 : "+ activitySpinnerString, Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });
    }
}