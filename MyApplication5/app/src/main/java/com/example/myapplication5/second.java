package com.example.myapplication5;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class second extends AppCompatActivity {

    private EditText et;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        findViewById(R.id.bt).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(second.this, MainActivity.class);
                et=findViewById(R.id.editText);
                i.putExtra("data",et.getText().toString());
                second.this.setResult(1, i);
                finish();
            }
        });
    }
}
