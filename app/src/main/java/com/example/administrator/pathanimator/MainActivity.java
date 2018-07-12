package com.example.administrator.pathanimator;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        findViewById(R.id.btn_1).setOnClickListener(this);
        findViewById(R.id.btn_2).setOnClickListener(this);
        findViewById(R.id.btn_3).setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        Intent intent = new Intent();
        switch (v.getId()){
            case R.id.btn_1:
                intent.setClass(MainActivity.this,PathActivity.class);
                break;
            case R.id.btn_2:
                intent.setClass(MainActivity.this,CircleActivity.class);
                break;
            case R.id.btn_3:
                intent.setClass(MainActivity.this,ChartActivity.class);
                break;
        }
        MainActivity.this.startActivity(intent);
    }
}
