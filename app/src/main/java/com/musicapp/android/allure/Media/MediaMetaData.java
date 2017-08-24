package com.musicapp.android.allure.Media;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;

/**
 * Created by MOJISOLA on 23/08/2017.
 */

public class MediaMetaData implements Parcelable {

    private Uri mMediaSourceUri = null;
    private String mMediaSourcePath;
    private String mMediaTitle;
    private String mMediaArtistName;
    private String mMediaAlbumName;
    private int mMediaAlbumArtResId;
    private String mMediaAlbumArtUrl;

    MediaMetaData(Uri mediaSourceUri, String mediaSourcePath, String mediaTitle,
                  String mediaArtistName, String mediaAlbumName, int mediaAlbumArtResId,
                  String mediaAlbumArtUrl) {
        mMediaSourceUri = mediaSourceUri;
        mMediaSourcePath = mediaSourcePath;
        mMediaTitle = mediaTitle;
        mMediaArtistName = mediaArtistName;
        mMediaAlbumName = mediaAlbumName;
        mMediaAlbumArtResId = mediaAlbumArtResId;
        mMediaAlbumArtUrl = mediaAlbumArtUrl;
    }
    public MediaMetaData() {
    }

    public MediaMetaData(Parcel in) {
        mMediaSourceUri = in.readParcelable(null);
        mMediaSourcePath = in.readString();
        mMediaTitle = in.readString();
        mMediaArtistName = in.readString();
        mMediaAlbumName = in.readString();
        mMediaAlbumArtResId = in.readInt();
        mMediaAlbumArtUrl = in.readString();
    }


    public Uri getMediaSourceUri() {
        return mMediaSourceUri;
    }

    public void setMediaSourceUri(Uri mediaSourceUri) {
        mMediaSourceUri = mediaSourceUri;
    }

    public String getMediaSourcePath() {
        return mMediaSourcePath;
    }

    public void setMediaSourcePath(String mediaSourcePath) {
        mMediaSourcePath = mediaSourcePath;
    }

    public String getMediaTitle() {
        return mMediaTitle;
    }

    public void setMediaTitle(String mediaTitle) {
        mMediaTitle = mediaTitle;
    }

    public String getMediaArtistName() {
        return mMediaArtistName;
    }

    public void setMediaArtistName(String mediaArtistName) {
        mMediaArtistName = mediaArtistName;
    }

    public String getMediaAlbumName() {
        return mMediaAlbumName;
    }

    public void setMediaAlbumName(String mediaAlbumName) {
        mMediaAlbumName = mediaAlbumName;
    }


    public int getMediaAlbumArtResId() {
        return mMediaAlbumArtResId;
    }

    public void setMediaAlbumArtResId(int mediaAlbumArtResId) {
        mMediaAlbumArtResId = mediaAlbumArtResId;
    }

    public String getMediaAlbumArtUrl() {
        return mMediaAlbumArtUrl;
    }

    public void setMediaAlbumArtUrl(String mediaAlbumArtUrl) {
        mMediaAlbumArtUrl = mediaAlbumArtUrl;
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeParcelable(mMediaSourceUri, flags);
        dest.writeString(mMediaSourcePath);
        dest.writeString(mMediaTitle);
        dest.writeString(mMediaArtistName);
        dest.writeString(mMediaAlbumName);
        dest.writeInt(mMediaAlbumArtResId);
        dest.writeString(mMediaAlbumArtUrl);
    }

    public static final Parcelable.Creator<MediaMetaData> CREATOR = new Creator<MediaMetaData>() {
        @Override
        public MediaMetaData createFromParcel(Parcel parcel) {
            return new MediaMetaData(parcel);
        }

        @Override
        public MediaMetaData[] newArray(int size) {
            return new MediaMetaData[size];
        }
    };
}
