package com.example.android.mymusic;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ListView;

import java.util.ArrayList;

public class HiphopActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hiphop);

        ArrayList<Song> songs = new ArrayList<Song>();

        songs.add(new Song("God's Plan","Drake", "5:57"));
        songs.add(new Song("Freaky Friday","Lil Dicky", "5:21"));
        songs.add(new Song("Psycho","Post Malone", "3:57"));
        songs.add(new Song("Walk It Talk It","Migos ATL feat. Drake", "5:28"));
        songs.add(new Song("Esskeetit [Explicit]","Lil pump", "3:03"));
        songs.add(new Song("Gucci Flip Flops","Bhad Bhabie feat. Lil Yachty", "2:25"));

        SongAdapter adapter = new SongAdapter(this, songs);

        ListView listView = (ListView) findViewById(R.id.list);

        listView.setAdapter(adapter);

    }
}
