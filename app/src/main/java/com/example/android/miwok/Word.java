package com.example.android.miwok;

public class Word {

    private String mMiwokTranslation;

    private String mDefaultTranslation;

    private int mImageResourceId = NO_IMAGE_REQUIRED;

    private int mMusicResourceId = NO_MUSIC_REQUIRED;

    public static final int NO_IMAGE_REQUIRED =-1;

    public static final int NO_MUSIC_REQUIRED = -1;

    public Word(String defaultTranslation , String miwokTranslation)
    {
        mMiwokTranslation = miwokTranslation;
        mDefaultTranslation = defaultTranslation;


    }

    public Word(String defaultTranslation , String miwokTranslation, int musicResourceId)
    {
        mMiwokTranslation = miwokTranslation;
        mDefaultTranslation = defaultTranslation;
        mMusicResourceId = musicResourceId;

    }

    public Word(String defaultTranslation , String miwokTranslation, int imageResourceId, int musicResourceId)
    {
        mMiwokTranslation = miwokTranslation;
        mDefaultTranslation = defaultTranslation;
        mImageResourceId = imageResourceId;
        mMusicResourceId = musicResourceId;
    }

    public String getMiwokTranslation()
    {
        return mMiwokTranslation;
    }

    public String getDefaultTranslation()
    {
        return mDefaultTranslation;
    }

    public int getImageResourceId()
    {
        return mImageResourceId;
    }

    public boolean hasImage()
    {
        return mImageResourceId != NO_IMAGE_REQUIRED;
    }

    public int getMusicResourceId()
    {
        return mMusicResourceId;
    }

    @Override
    public String toString() {
        return "Word{" +
                "mMiwokTranslation='" + mMiwokTranslation + '\'' +
                ", mDefaultTranslation='" + mDefaultTranslation + '\'' +
                ", mImageResourceId=" + mImageResourceId +
                ", mMusicResourceId=" + mMusicResourceId +
                '}';
    }
}
