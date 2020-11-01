package com.abdumanon_english.tajik.question;

import android.content.Intent;
import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.CardView;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import android.widget.Toast;

public class menu_app extends AppCompatActivity {
    CardView click_fruit, click_animals, click_school, click_aboutme;
    MediaPlayer mediaPlayer;
    Animation smalltobig;
    ImageView imageview_1, imageview_2, imageview_3, imageview_4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu_app);

        //Animathion
        smalltobig = AnimationUtils.loadAnimation(this, R.anim.smalltobig);
        //Суратҳо
        imageview_1 = (ImageView) findViewById(R.id.imageview_1);
        imageview_2 = (ImageView) findViewById(R.id.imageview_2);
        imageview_3 = (ImageView) findViewById(R.id.imageview_3);
        imageview_4 = (ImageView) findViewById(R.id.imageview_4);


        //Animation to photo
        imageview_1.startAnimation(smalltobig);
        imageview_2.startAnimation(smalltobig);
        imageview_3.startAnimation(smalltobig);
        imageview_4.startAnimation(smalltobig);


        //Суратҳо

        final MediaPlayer mediaPlayer = MediaPlayer.create(menu_app.this, R.raw.hello_menu);
        mediaPlayer.start();


        click_fruit = (CardView) findViewById(R.id.click_fruit);
        click_animals = (CardView) findViewById(R.id.click_animals);
        click_aboutme = (CardView) findViewById(R.id.click_aboutme);
        click_school = (CardView) findViewById(R.id.click_school);

        //fruitttttttttt
        click_fruit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent a = new Intent(menu_app.this, MainActivity.class);
                mediaPlayer.stop();
                startActivity(a);


                //sound
                final MediaPlayer media = MediaPlayer.create(menu_app.this, R.raw.button2);
                media.start();

                Toast.makeText(menu_app.this, "Саволҳо оиди Хӯроквори", Toast.LENGTH_SHORT).show();

            }
        });


        //Abput meeeeeeeeeeeeee
        click_aboutme.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent с = new Intent(menu_app.this, MainActivity.class);
                mediaPlayer.stop();
                startActivity(с);


                //sound
                final MediaPlayer med = MediaPlayer.create(menu_app.this, R.raw.button2);
                med.start();

                Toast.makeText(menu_app.this, "Саволҳо оиди аъзои одам", Toast.LENGTH_SHORT).show();


            }
        });


        //animalssssssssss
        click_animals.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent b = new Intent(menu_app.this, MainActivity.class);
                mediaPlayer.stop();
                startActivity(b);

                //sound
                final MediaPlayer me = MediaPlayer.create(menu_app.this, R.raw.button2);
                me.start();

                Toast.makeText(menu_app.this, "Саволҳо оиди Ҳайвонҳо", Toast.LENGTH_SHORT).show();
            }
        });

        //schoooolllllll
        click_school.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent d = new Intent(menu_app.this, pen.class);
                mediaPlayer.stop();
                startActivity(d);

                //sound
                final MediaPlayer medi = MediaPlayer.create(menu_app.this, R.raw.button2);
                medi.start();



                Toast.makeText(menu_app.this, "Саволҳо оиди Лавозимоти Мактаби", Toast.LENGTH_SHORT).show();
            }
        });
    }

    }