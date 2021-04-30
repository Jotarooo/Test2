package com.example.test2;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;


import androidx.appcompat.app.AppCompatActivity;

public class ChiffreAct extends AppCompatActivity {

    private ImageButton imageButton11;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.chiffreact);

        imageButton11 = findViewById(R.id.imageButton11);
        final MediaPlayer mediaplayer = MediaPlayer.create(this, R.raw.sample);

        imageButton11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                mediaplayer.start();
            }
        });
    }



}
