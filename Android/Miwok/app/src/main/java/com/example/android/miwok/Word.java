package com.example.android.miwok;

public class Word {
    private String mDefaultTranslation;
    private String mMiwokTranslation;

    public Word(String DefaultTranslation, String MiwokTranslation) {
        mDefaultTranslation = DefaultTranslation;
        mMiwokTranslation = MiwokTranslation;
    }

    public String getTranslation() {
        return mDefaultTranslation;
    }

    public String getMiwok() {
        return mMiwokTranslation;
    }
}

