package com.example.myapplication8;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private TextView tv1;
    private TextView tv_six;
    private  TextView tv_eight;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        tv1 = findViewById(R.id.tv1);
        tv_six = findViewById(R.id.tv_six);
        tv_eight = findViewById(R.id.tv_eight);

        tv1.setText("你好，田松！");
        tv1.setTextColor(Color.RED);
        tv1.setTextSize(30);

        tv_six.setBackgroundColor(0xffff0000);
        tv_eight.setBackgroundColor(0xff00ff00);



    }
}
