package com.example.android.mymusic;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ListView;

import java.util.ArrayList;

public class RelaxActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_relax);

        ArrayList<Song> songs = new ArrayList<Song>();

        songs.add(new Song("Just the Way You Are","Bruno Mars", "3:42"));
        songs.add(new Song("Wherever You Will Go","Charlene Soraial", "3:19"));
        songs.add(new Song("Cannonball","Damien Rice", "3:28"));
        songs.add(new Song("Jar of Hearts","Christina Perri", "4:07"));
        songs.add(new Song("Nothing's Real but Love","Rebecca Ferguson", "2:55"));

        SongAdapter adapter = new SongAdapter(this, songs);

        ListView listView = (ListView) findViewById(R.id.list);

        listView.setAdapter(adapter);

    }
}
