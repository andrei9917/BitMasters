package com.example.andrei.bitmasters;

import android.content.Intent;

import android.graphics.PorterDuff;
import android.media.MediaPlayer;
import android.net.Uri;
import android.os.Bundle;
import android.provider.MediaStore;
import android.support.annotation.NonNull;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.NavigationView;
import android.support.v4.app.Fragment;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.SeekBar;
import android.widget.TextView;
import android.widget.Toast;

import com.bumptech.glide.Glide;
import com.bumptech.glide.RequestBuilder;
import com.bumptech.glide.RequestManager;
import com.google.android.gms.auth.api.signin.GoogleSignIn;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.auth.api.signin.GoogleSignInClient;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;

import java.io.File;
import java.util.ArrayList;

public class MainActivity extends AppCompatActivity
        implements NavigationView.OnNavigationItemSelectedListener {

    ListView listViewForSongs;
    Button btn_next,btn_prev,btn_pause;
    TextView songTextLabel;
    SeekBar songSeekBar;

    static MediaPlayer myPlayer;
    Integer songIndex;
    String mood, genre, personality, sname, path;
    ArrayList<File> mySongs;
    Thread updateSeekBar;
    ArrayList<Integer> songsIdArr = new ArrayList<>();
    GoogleSignInClient signInClient;
    Integer itemSelected;
    @Override
    protected void onCreate(Bundle savedInstanceState) {


        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        toolbar.setTitle("Main Page");
        FloatingActionButton fab = findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                //        .setAction("Action", null).show();
                //startActivity(new Intent(MainActivity.this, GenreSlidersActivity.class));
                DrawerLayout drawer = findViewById(R.id.drawer_layout);
                if (drawer.isDrawerOpen(GravityCompat.START)) {
                    drawer.closeDrawer(GravityCompat.START);
                } else if (itemSelected == 1) {
                    itemSelected = 0;
                    MainActivity.super.onBackPressed();
                }
            }
        });

        DrawerLayout drawer = findViewById(R.id.drawer_layout);
        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(
                this, drawer, toolbar, R.string.navigation_drawer_open, R.string.navigation_drawer_close);
        drawer.addDrawerListener(toggle);
        toggle.syncState();
        NavigationView navigationView = findViewById(R.id.nav_view);
        navigationView.setNavigationItemSelectedListener(this);

        // Configure sign-in to request the user's ID, email address, and basic
        // profile. ID and basic profile are included in DEFAULT_SIGN_IN.
        GoogleSignInOptions gso = new GoogleSignInOptions.Builder(GoogleSignInOptions.DEFAULT_SIGN_IN)
                .requestEmail()
                .build();

        // Build a GoogleSignInClient with the options specified by gso.
        signInClient = GoogleSignIn.getClient(this, gso);

        GoogleSignInAccount acct = GoogleSignIn.getLastSignedInAccount(MainActivity.this);
        /*if (acct != null) {
            String personName = acct.getDisplayName();
            String personGivenName = acct.getGivenName();
            String personFamilyName = acct.getFamilyName();
            String personEmail = acct.getEmail();
            String personId = acct.getId();
            Uri personPhoto = acct.getPhotoUrl();

            TextView nameTV;
            TextView emailTV;
            TextView idTV;
            ImageView photoIV;

            nameTV.setText("Name: "+personName);
            emailTV.setText("Email: "+personEmail);
            idTV.setText("ID: "+personId);
            Glide.with(this).load(personPhoto).into(photoIV);
        }*/

        /*try {
            Uri personPhoto = acct.getPhotoUrl();
            ImageView img = findViewById(R.id.imageView);
            img.setImageURI(personPhoto);
        }
        catch(Exception e) {

        }
        try {
            TextView name = findViewById(R.id.nameTextView);
            name.setText(acct.getDisplayName());
        }
        catch(Exception e)
        {}
        TextView email = findViewById(R.id.emailTextView);
        email.setText(acct.getEmail());*/
        //getSupportFragmentManager().beginTransaction().replace(R.id.fragmentContainer,new MusicPlayer()).commit();


        btn_next = findViewById(R.id.nextbt);
        btn_pause = findViewById(R.id.pausebt);
        btn_prev = findViewById(R.id.prevbt);

        songTextLabel = findViewById(R.id.songNameTV);
        songSeekBar = findViewById(R.id.seekBarSong);



        if(myPlayer!=null){
            myPlayer.stop();
            myPlayer.release();
        }
        songsIdArr.add(R.raw.mindcontrol);
        songsIdArr.add(R.raw.here_for_more);
        songsIdArr.add(R.raw.higher);
        songsIdArr.add(R.raw.see_me_in_your_eyes);
        songsIdArr.add(R.raw.unreal_reality);
        myPlayer = MediaPlayer.create(this, songsIdArr.get(0));
        songTextLabel.setText(getResources().getResourceEntryName(songsIdArr.get(0)));
        songIndex=0;
        //myPlayer.start();
        if(myPlayer.isPlaying() == false){
            btn_pause.setBackgroundResource(R.drawable.ic_playbt);
        }

        songSeekBar.setMax(myPlayer.getDuration());
        songSeekBar.getProgressDrawable().setColorFilter(getResources().getColor(R.color.colorPrimary), PorterDuff.Mode.MULTIPLY);
        songSeekBar.getThumb().setColorFilter(getResources().getColor(R.color.colorPrimary), PorterDuff.Mode.SRC_IN);



        updateSeekBar = new Thread(){
            @Override
            public void run() {
                int totalDuration = myPlayer.getDuration();
                int crtPosition = 0;
                while (crtPosition < totalDuration){
                    try{
                        sleep(500);
                        crtPosition=myPlayer.getCurrentPosition();
                        songSeekBar.setProgress(crtPosition);
                    }catch (InterruptedException e ){
                        e.printStackTrace();
                    }
                }
            }
        };
        songSeekBar.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {

            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {

            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {
                myPlayer.seekTo(seekBar.getProgress());
            }
        });updateSeekBar.start();
        btn_pause.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                songSeekBar.setMax(myPlayer.getDuration());
                if (myPlayer.isPlaying()){
                    btn_pause.setBackgroundResource(R.drawable.ic_playbt);
                    myPlayer.pause();
                    try {
                        //updateSeekBar.wait();
                    }catch (Exception e){}
                }
                else {
                    btn_pause.setBackgroundResource(R.drawable.ic_pausebt);
                    myPlayer.start();
                    //updateSeekBar.start();
                }
            }
        });
        btn_next.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                myPlayer.stop();
                myPlayer.release();
                songsIdArr.size();
                songIndex = (songIndex + 1)%songsIdArr.size();
                myPlayer = MediaPlayer.create(getApplicationContext(), songsIdArr.get(songIndex));
                songTextLabel.setText(getResources().getResourceEntryName(songsIdArr.get(songIndex)));
                if (myPlayer.isPlaying()){
                    btn_pause.setBackgroundResource(R.drawable.ic_playbt);
                    myPlayer.pause();
                }
                else {
                    btn_pause.setBackgroundResource(R.drawable.ic_pausebt);
                    myPlayer.start();
                }
            }
        });
        btn_prev.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                myPlayer.stop();
                myPlayer.release();
                songIndex = ((songIndex - 1) < 0 )?(songsIdArr.size()-1):songIndex-1;
                myPlayer = MediaPlayer.create(getApplicationContext(), songsIdArr.get(songIndex));
                songTextLabel.setText(getResources().getResourceEntryName(songsIdArr.get(songIndex)));
                if (myPlayer.isPlaying()){
                    btn_pause.setBackgroundResource(R.drawable.ic_playbt);
                    myPlayer.pause();
                }
                else {
                    btn_pause.setBackgroundResource(R.drawable.ic_pausebt);
                    myPlayer.start();
                }
            }
        });

    }



    @Override
    public void onBackPressed() {
        DrawerLayout drawer = findViewById(R.id.drawer_layout);
        if (drawer.isDrawerOpen(GravityCompat.START)) {
            drawer.closeDrawer(GravityCompat.START);
        } else if (itemSelected == 1) {
            itemSelected = 0;
            MainActivity.super.onBackPressed();
        }
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        GoogleSignInOptions gso = new GoogleSignInOptions.Builder(GoogleSignInOptions.DEFAULT_SIGN_IN)
                .requestEmail()
                .build();

        // Build a GoogleSignInClient with the options specified by gso.
        signInClient = GoogleSignIn.getClient(this, gso);

        GoogleSignInAccount acct = GoogleSignIn.getLastSignedInAccount(MainActivity.this);

        try {


        } catch (Exception e) {

        }
        /*Uri personPhoto = acct.getPhotoUrl();
        ImageView img = findViewById(R.id.imageView);
        Glide.with(this).load(personPhoto).into(img);*/
        // Create glide request manager
        RequestManager requestManager = Glide.with(this);
// Create request builder and load image.

        RequestBuilder requestBuilder = requestManager.load(acct.getPhotoUrl());
// Show image into target imageview.
        ImageView imageView = findViewById(R.id.imageView);
        requestBuilder.into(imageView);
        try {
            TextView name = findViewById(R.id.nameTextView);
            name.setText(acct.getDisplayName());
        } catch (Exception e) {
        }
        TextView email = findViewById(R.id.emailTextView);
        email.setText(acct.getEmail());
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    @SuppressWarnings("StatementWithEmptyBody")
    @Override
    public boolean onNavigationItemSelected(MenuItem item) {
        // Handle navigation view item clicks here.
        int id = item.getItemId();
        Toolbar toolbar = findViewById(R.id.toolbar);
        itemSelected = 1;
        if (id == R.id.nav_alarma) {
            toolbar.setTitle("Alarm");
            getSupportFragmentManager().beginTransaction().replace(R.id.fragmentContainer, new AlarmItem()).commit();
        } else if (id == R.id.nav_calendar) {
            toolbar.setTitle("Calendar");
            //getSupportFragmentManager().beginTransaction().replace(R.id.fragmentContainer, new CalendarItem()).commit();
            openCalendarTab();
            finish();
        } else if (id == R.id.nav_mood) {
            toolbar.setTitle("Mood");
            getSupportFragmentManager().beginTransaction().replace(R.id.fragmentContainer, new MoodItem()).commit();
        } else if (id == R.id.nav_personality) {
            toolbar.setTitle("Personality");
            getSupportFragmentManager().beginTransaction().replace(R.id.fragmentContainer, new PersonalityItem()).commit();
        } else if (id == R.id.nav_about) {
            toolbar.setTitle("About");
            super.onOptionsItemSelected(null);
            getSupportFragmentManager().beginTransaction().replace(R.id.fragmentContainer, new AboutItem()).commit();
        } else if (id == R.id.nav_signout) {
            signOut();
        }

        DrawerLayout drawer = findViewById(R.id.drawer_layout);
        drawer.closeDrawer(GravityCompat.START);
        return true;
    }

    public void openCalendarTab() {
        //
        // startActivity(new Intent(MainActivity.this, CalendarActivity.class));
        Intent launchIntent = getPackageManager().getLaunchIntentForPackage("com.google.android.calendar");
        if (launchIntent != null) {
            startActivity(launchIntent);//null pointer check in case package name was not found
        } else {
            // Bring user to the market or let them choose an app?
            launchIntent = new Intent(Intent.ACTION_VIEW);
            launchIntent.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
            launchIntent.setData(Uri.parse("market://details?id=" + "com.google.android.calendar"));
            startActivity(launchIntent);
        }
    }

    private void signOut() {
        signInClient.signOut()
                .addOnCompleteListener(this, new OnCompleteListener<Void>() {
                    @Override
                    public void onComplete(@NonNull Task<Void> task) {
                        Toast.makeText(MainActivity.this,"Successfully signed out",Toast.LENGTH_SHORT).show();
                        startActivity(new Intent(MainActivity.this, LoginActivity.class));
                        finish();
                    }
                });
    }
}
