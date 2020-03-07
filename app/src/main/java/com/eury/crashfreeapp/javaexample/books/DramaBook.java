package com.eury.crashfreeapp.javaexample.books;

import android.content.res.Resources;
import android.graphics.drawable.Drawable;

import androidx.core.content.res.ResourcesCompat;

import com.eury.crashfreeapp.R;

public class DramaBook extends AbstBook {

    private String summary;

    @Override
    Drawable getIcon(Resources resources) {
        return ResourcesCompat.getDrawable(resources, R.drawable.ic_drama, null);
    }

    public String getSummary() {
        return summary;
    }
}
