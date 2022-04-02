package com.example.week4_mission;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.ScrollView;

public class MainActivity extends AppCompatActivity {

    Button button1, button2;//button1 = up, button2 = down
    ImageView img1, img2; // img1 = up, img2 = down
    ScrollView scrollview1, scrollview2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        scrollview1 = (ScrollView) findViewById(R.id.scrollview1);
        scrollview2 = (ScrollView) findViewById(R.id.scrollview2);

        scrollview1.setVerticalScrollBarEnabled(true);
        scrollview2.setVerticalScrollBarEnabled(true);
        scrollview1.setHorizontalScrollBarEnabled(true);
        scrollview2.setHorizontalScrollBarEnabled(true);

        button1 = (Button) findViewById(R.id.button1);
        button2 = (Button) findViewById(R.id.button2);
        img1 = (ImageView) findViewById(R.id.img1);
        img2 = (ImageView) findViewById(R.id.img2);

    }

    public void onClick(View view){
        switch (view.getId()){
            case R.id.button1:
                img1.setImageResource(R.drawable.web);
                img2.setImageResource(0);
                break;
            case R.id.button2:
                img1.setImageResource(0);
                img2.setImageResource(R.drawable.web);
                break;
        }
    }
}