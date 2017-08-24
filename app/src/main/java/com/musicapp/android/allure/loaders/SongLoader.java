package com.musicapp.android.allure.loaders;

import android.content.Context;
import android.database.Cursor;
import android.provider.BaseColumns;
import android.provider.MediaStore;
import android.provider.MediaStore.Audio.AudioColumns;
import com.musicapp.android.allure.classes.Song;
import com.musicapp.android.allure.utils.Lists;
import com.musicapp.android.allure.utils.PreferenceUtils;

import java.util.ArrayList;
import java.util.List;

import static android.R.attr.duration;
import static java.security.AccessController.getContext;

/**
 * Created by MOJISOLA on 23/08/2017.
 */

public class SongLoader extends WrappedAsyncTaskLoader<ArrayList<Song>> {
    /**
     * The result
     */
    ArrayList<Song> songs = Lists.newArrayList();

    /**
     * The {@link Cursor} used to run the query.
     */
    private Cursor mCursor;

    /**
     * Constructor of <code>SongLoader</code>
     *
     * @param context The {@link Context} to use
     */
    public SongLoader( Context context) {
        super(context);
    }


    @Override
    public ArrayList<Song> loadInBackground() {
        // Create the Cursor
        mCursor = makeSongCursor(getContext());
        // Gather the data
        if (mCursor != null && mCursor.moveToFirst()) {
            do {

                // Copy the song name
                String songName = mCursor.getString(0);

                // Copy the artist name
                String artist = mCursor.getString(1);

                // Copy the album name
                String title = mCursor.getString(2);

                // Convert the duration into seconds
                int durationInSecs = (int) duration / 1000;

                // Create a new song
                Song song = new Song( title, artist, songName);

                // Add everything up
                songs.add(song);
            } while (mCursor.moveToNext());
        }
        // Close the cursor
        if (mCursor != null) {
            mCursor.close();
            mCursor = null;
        }
        return songs;
    }

    public static Cursor makeSongCursor(Context context) {
        final StringBuilder mSelection = new StringBuilder();
        mSelection.append(AudioColumns.IS_MUSIC + "=1");
        mSelection.append(" AND " + AudioColumns.TITLE + " != ''"); //$NON-NLS-2$
        return context.getContentResolver().query(MediaStore.Audio.Media.EXTERNAL_CONTENT_URI,
                new String[] {
                        /* 0 */
                        BaseColumns._ID,
                        /* 1 */
                        AudioColumns.TITLE,
                        /* 2 */
                        AudioColumns.ARTIST,
                        /* 3 */
                        AudioColumns.ALBUM,
                        /* 4 */
                        AudioColumns.DURATION
                }, mSelection.toString(), null,
                PreferenceUtils.getInstance(context).getSongSortOrder());
    }
}
