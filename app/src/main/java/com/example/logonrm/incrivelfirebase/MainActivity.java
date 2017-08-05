package com.example.logonrm.incrivelfirebase;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import com.google.firebase.analytics.FirebaseAnalytics;
import com.google.firebase.messaging.FirebaseMessaging;

/*
* Faço o download do google-services.json e abro a visão project e
* */
public class MainActivity extends AppCompatActivity {

    private FirebaseAnalytics mFirebaseAnalytics;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mFirebaseAnalytics = FirebaseAnalytics.getInstance(this);

        //quando eu mardar o device vai receber
        //mandar msg para um tópico específico
        FirebaseMessaging.getInstance().subscribeToTopic("mob");
    }

    public void clickMe(View w) {
        Bundle params = new Bundle();
        params.putString("NOME", "Danielle");
        mFirebaseAnalytics.logEvent("clickMe", params);
    }

    /*
    public void forcarCrash(View v) {
        int r = 2 / 0;
    }
    */

}
