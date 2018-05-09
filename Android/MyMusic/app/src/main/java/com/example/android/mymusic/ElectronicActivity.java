package com.example.android.mymusic;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ListView;

import java.util.ArrayList;

public class ElectronicActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_electronic);

        ArrayList<Song> songs = new ArrayList<Song>();

        songs.add(new Song("Flames (Extended)","David Guetta & Sia", "4:52"));
        songs.add(new Song("I Wanna Know","Alesso ft. Nico & Vinz", "4:39"));
        songs.add(new Song("Make It Bun Dem","Skrillex & Damian Jr. Gong Marley - ", "3:39"));
        songs.add(new Song("Game Over","Martin Garrix & Loopers", "2:39"));
        songs.add(new Song("Wake Me Up","Avicii", "4:12"));
        songs.add(new Song("One Kiss","Calvin Harris, Dua Lipa", "3:44"));

        SongAdapter adapter = new SongAdapter(this, songs);

        ListView listView = (ListView) findViewById(R.id.list);

        listView.setAdapter(adapter);
    }
}
