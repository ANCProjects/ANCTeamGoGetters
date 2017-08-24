package com.musicapp.android.allure.Media;

/**
 * Created by MOJISOLA on 23/08/2017.
 */

public class MediaUtils {
    public static final int MEDIA_STATE_PREPARING = 0;
    // If the media is currently playing
    public static final int MEDIA_STATE_PLAYING = 1;
    // If the media is currently paused
    public static final int MEDIA_STATE_PAUSED = 2;
    // If the entire playlist is finished playing (no repeat buttons are enabled in this case)
    public static final int MEDIA_STATE_MEDIALIST_COMPLETED = 3;
}
