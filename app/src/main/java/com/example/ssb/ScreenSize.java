package com.example.ssb;

import android.app.Activity;
import android.content.Context;
import android.util.DisplayMetrics;
import android.view.View;

import androidx.fragment.app.Fragment;

class ScreenSize {


    public String screenCheck(Activity activity){
    DisplayMetrics dm = new DisplayMetrics();
        activity.getWindowManager().getDefaultDisplay().getMetrics(dm);
    int width = dm.widthPixels;
    int height = dm.heightPixels;
    int dens = dm.densityDpi;
    double wi = (double)width / (double)dens;
    double hi = (double)height / (double)dens;
    double x = Math.pow(wi, 2);
    double y = Math.pow(hi, 2);
    double screenInches = Math.sqrt(x+y);

    String size;

        if (screenInches < 5.2)
        size = "Small";
        else
            size = "Large";

        return size;
    }

}

