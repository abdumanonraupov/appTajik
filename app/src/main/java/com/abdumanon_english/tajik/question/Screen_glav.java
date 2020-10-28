package com.abdumanon_english.tajik.question;

import android.content.Intent;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class Screen_glav extends AppCompatActivity {
    private static int SPLASH_TIME_OUT = 10000;
    TextView text_wel, text_wel_en;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_screen_glav);
        text_wel = (TextView)findViewById(R.id.text_wel);
        text_wel_en = (TextView)findViewById(R.id.text_wel_en);

        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent home = new Intent(Screen_glav.this, menu_app.class);
                startActivity(home);
                finish();
            }
        }, SPLASH_TIME_OUT);
    }
}