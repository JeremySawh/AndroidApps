package com.example.owner.myapplication;

import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }


    public void testing(View view)
    {
        view.setBackground(new ColorDrawable(Color.GREEN));
        getSupportActionBar().setBackgroundDrawable(new ColorDrawable(Color.GREEN));
        System.out.println("testing");

    }
}
