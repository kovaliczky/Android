package com.example.android.mymusic;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ListView;

import java.util.ArrayList;

public class PopActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pop);

        ArrayList<Song> songs = new ArrayList<Song>();

        songs.add(new Song("Shape of You","Ed Sheeran", "3:53"));
        songs.add(new Song("Bye Bye Bye","NSYNC", "3:20"));
        songs.add(new Song("Don't Speak","No Doubt", "4:23"));
        songs.add(new Song("All That She Wants","Ace of Base", "3:30"));
        songs.add(new Song("Hey Ya!","OutKast", "3:55"));
        songs.add(new Song("Born This Way","Lady Gaga", "4:20"));
        songs.add(new Song("Shake It Off","Taylor Swift", "3:39"));

        SongAdapter adapter = new SongAdapter(this, songs);

        ListView listView = (ListView) findViewById(R.id.list);

        listView.setAdapter(adapter);

    }
}
