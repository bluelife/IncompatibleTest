package com.bluelife.mm.incompatibletest;

import android.app.Activity;

import android.os.Bundle;
import android.os.Handler;

import java.io.IOException;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        runTest();
    }

    private void runTest(){
        Handler handler=new Handler();
        handler.post(new Runnable() {
            @Override
            public void run() {
                try {
                    ((java.io.Closeable) new java.net.Socket()).close();
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });

    }
}
