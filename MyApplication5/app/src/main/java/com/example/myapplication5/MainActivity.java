package com.example.myapplication5;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private TextView textView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        textView = findViewById(R.id.textView);
        findViewById(R.id.startAty).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //startActivity(new Intent(MainActivity.this,AtyActivity.class));
                Intent intent = new Intent(MainActivity.this, second.class);
//                intent.putExtra("User",new User("tiansong",23));
////                Bundle bundle = new Bundle();
////                bundle.putString("name","tiansong");
////                bundle.putInt("age",23);
////                intent.putExtras(bundle);
//                //intent.putExtra("name", "tiansong");
//                //startActivities(new Intent(MainActivity.this, AtyActivity.class));
//                startActivity(intent);
                startActivityForResult(intent,0);
            }
        });
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        textView.setText(data.getStringExtra("data"));
    }
}
