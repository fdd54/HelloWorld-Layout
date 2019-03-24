package com.example.fjnu.fdd.helloworld;

import android.content.pm.ActivityInfo;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected  void onStart(){
        super.onStart();
        System.out.println("调用onStart()");
    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.linearlayout);
        setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_LANDSCAPE);
        System.out.println("调用onCreate()");
    }
    @Override
    protected void onResume()
    {
        super.onResume();
        System.out.println("调用onResume()");
    }
    @Override
    protected void onPause()
    {
        super.onPause();
        System.out.println("调用onPause()");
    }
    @Override
    protected void onStop()
    {
        super.onStop();
        System.out.println("调用onStop()");
    }
    @Override
    protected void onDestroy()
    {
        super.onDestroy();
        System.out.println("调用onDestroy()");
    }
    @Override
    protected void onRestart()
    {
        super.onRestart();
        System.out.println("调用onRestart()");
    }
}
