package com.example.mediaapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void toVideo(View view) {
        Intent intent = new Intent(this, VideoActivity.class);
        startActivity(intent);
        finish();
    }

    public void toAudio(View view) {
        Intent intent = new Intent(this, AudioActivity.class);
        startActivity(intent);
        finish();
    }

}
