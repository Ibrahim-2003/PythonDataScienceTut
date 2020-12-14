package com.example.pythondatasciencetut;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


    }

    public void onClickWebCardview(View view) {
            startActivity(new Intent(MainActivity.this, websearch.class));
    }

    public void onClickDataCardview(View view){
        startActivity(new Intent(MainActivity.this, datascience.class));
    }
}