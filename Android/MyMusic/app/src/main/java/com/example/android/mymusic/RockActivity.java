package com.example.android.mymusic;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ListView;

import java.util.ArrayList;

public class RockActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_rock);

        ArrayList<Song> songs = new ArrayList<Song>();

        songs.add(new Song("The Habbit","Linkin Park", "3:18"));
        songs.add(new Song("All Along the Watchtower","Jimi Hendrix", "2:30"));
        songs.add(new Song("Bohemian Rhapsody","Queen", "5:55"));
        songs.add(new Song("Cocaine","Eric Clapton", "2:48"));
        songs.add(new Song("Black Dog","Led Zeppelin", "4:55"));
        songs.add(new Song("Have a Cigar","Pink Floyd", "5:08"));
        songs.add(new Song("Hotel California","Eagles", "6:30"));

        SongAdapter adapter = new SongAdapter(this, songs);

        ListView listView = (ListView) findViewById(R.id.list);

        listView.setAdapter(adapter);

    }
}
