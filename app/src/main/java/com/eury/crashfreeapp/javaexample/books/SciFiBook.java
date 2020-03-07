package com.eury.crashfreeapp.javaexample.books;

import android.content.res.Resources;
import android.graphics.drawable.Drawable;

import androidx.core.content.res.ResourcesCompat;

import com.eury.crashfreeapp.R;

public class SciFiBook extends AbstBook {

    private String videoUrl;

    @Override
    Drawable getIcon(Resources resources) {
        return ResourcesCompat.getDrawable(resources, R.drawable.ic_scifi, null);
    }

    public String getVideoUrl() {
        return videoUrl;
    }
}
