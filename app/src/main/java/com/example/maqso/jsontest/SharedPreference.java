package com.example.maqso.jsontest;


import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toolbar;

public class SharedPreference extends AppCompatActivity {


    Button red, blue;
    Toolbar tb;
    SharedPreferences sf;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        red = (Button) findViewById(R.id.red);
        blue = (Button) findViewById(R.id.blue);
        tb = (Toolbar) findViewById(R.id.toolbar);
        //  sf = getSharedPreferences("toolSetting", MODE_PRIVATE);
        //  toolbarSetting();

//        red.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                SharedPreferences.Editor ed = sf.edit();
//                ed.putInt("color", R.color.colorRed);
//                ed.apply();
//                tb.setBackgroundColor(getResources().getColor(R.color.colorRed));
//
//            }
//        });
//
//        blue.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                SharedPreferences.Editor ed = sf.edit();
//                ed.putInt("color",R.color.colorBlue);
//                ed.apply();
//                tb.setBackgroundColor(getResources().getColor(R.color.colorBlue));
//
//            }
//        });

    }

//    private void toolbarSetting() {
//      // int color = sf.getInt("color",R.color.colorDefault);
//      // tb.setBackgroundColor(color);
//
//    }
}
