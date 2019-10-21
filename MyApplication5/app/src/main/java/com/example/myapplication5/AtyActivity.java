package com.example.myapplication5;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Parcelable;
import android.widget.TextView;

public class AtyActivity extends AppCompatActivity {

    private TextView tv;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_aty);
        Intent i = getIntent();
        tv=findViewById(R.id.aty);
        User user = i.getParcelableExtra("User");
        String name = user.getName();
        int age = user.getAge();
//        Bundle bundle = i.getExtras();
//        String name = bundle.getString("name");
//        int age = bundle.getInt("age");
        //String name = i.getStringExtra("name");
        tv.setText(name+","+age);
    }
}
