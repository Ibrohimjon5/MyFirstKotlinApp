package com.ibrohimjon.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Toast;

public class Uchinchi extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_uchinchi);

        Toast.makeText(getApplicationContext(),"Saloma qa",Toast.LENGTH_SHORT).show();
    }
}