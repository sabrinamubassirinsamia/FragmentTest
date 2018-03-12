package com.example.sabrina.myapplication;

import android.support.v4.app.Fragment;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void fuckIrfan(View view){
       Fragment fragment = null;
        if(view == findViewById(R.id.button1)){
            fragment = new FirstFragment();
        }
        else if(view == findViewById(R.id.button2)){
            fragment= new SecondFragment();

        }

        getSupportFragmentManager().beginTransaction().replace(R.id.fragment_view,fragment).commit();
    }
}

