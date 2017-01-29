package com.elementary.model;

import java.util.List;
import java.util.ArrayList;
/**
 * Created by ejanicas on 29/01/17.
 */
public class SongBook {
    private List<Song> mSongs;

    public SongBook() {
        mSongs = new ArrayList<Song>();
    }

    public void addSong(Song song) {
        mSongs.add(song);
    }

    public int getSongCount() {
        return mSongs.size();
    }
}
