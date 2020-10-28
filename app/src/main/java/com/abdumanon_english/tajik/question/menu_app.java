package com.abdumanon_english.tajik.question;

import android.app.Activity;
import android.content.Intent;
import android.media.AudioAttributes;
import android.media.AudioManager;
import android.media.MediaPlayer;
import android.media.SoundPool;
import android.os.Build;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.CardView;
import android.view.View;
import android.widget.ImageButton;
import android.widget.Toast;

public class menu_app extends AppCompatActivity {
    CardView click_fruit;
    MediaPlayer mediaPlayer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu_app);
       //sound

        final  MediaPlayer mediaPlayer = MediaPlayer.create(menu_app.this, R.raw.hello_menu);
        mediaPlayer.start();


        click_fruit = (CardView)findViewById(R.id.click_fruit);

        click_fruit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent in = new Intent (menu_app.this, MainActivity.class);
                mediaPlayer.stop();
                startActivity(in);

                Toast.makeText(menu_app.this, "" , Toast.LENGTH_SHORT).show();
            }
        });
    }
}