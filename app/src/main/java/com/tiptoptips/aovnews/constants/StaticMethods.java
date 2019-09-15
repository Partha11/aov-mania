package com.tiptoptips.aovnews.constants;

import android.content.Context;

public class StaticMethods {

    public static int getDrawableFromName(Context context, String name) {

        return context.getResources().getIdentifier(name, "drawable", context.getPackageName());
    }
}
