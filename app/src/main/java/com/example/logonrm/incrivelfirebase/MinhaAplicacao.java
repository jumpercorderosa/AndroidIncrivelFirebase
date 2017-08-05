package com.example.logonrm.incrivelfirebase;

import android.app.Application;

import com.crashlytics.android.Crashlytics;

import io.fabric.sdk.android.Fabric;

public class MinhaAplicacao extends Application {

    public void onCreate() {
        super.onCreate();
        Fabric.with(this, new Crashlytics());
    }
}
