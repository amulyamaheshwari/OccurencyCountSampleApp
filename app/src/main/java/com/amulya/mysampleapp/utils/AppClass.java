package com.amulya.mysampleapp.utils;

import android.app.Application;
import android.content.Context;

public class AppClass extends Application {
    public static Context context;

    @Override
    public void onCreate() {
        super.onCreate();
        context = getApplicationContext();
    }
}