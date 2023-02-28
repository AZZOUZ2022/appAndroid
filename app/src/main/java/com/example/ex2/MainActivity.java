package com.example.ex2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        String w=getResources().getString(R.string.welcome);
        String l=getResources().getString(R.string.login);
        String p=getResources().getString(R.string.password);
        String u=getResources().getString(R.string.username);
        String lg=getResources().getString(R.string.language);

    }
}