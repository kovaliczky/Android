package com.example.android.mymusic;

public class Song {
    private String mSongName;
    private String mArtistName;
    private String mTime;

    public Song(String SongName, String ArtistName, String Time) {
        mSongName = SongName;
        mArtistName = ArtistName;
        mTime = Time;
    }

    public String getSongName() { return mSongName;}

    public String getArtistName() { return mArtistName;}

    public String getTime() { return mTime;}
}
