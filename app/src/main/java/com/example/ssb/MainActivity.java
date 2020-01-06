package com.example.ssb;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.widget.ImageView;

import com.blogspot.atifsoftwares.animatoolib.Animatoo;
import com.mikhaellopez.circularimageview.CircularImageView;

public class MainActivity extends Activity {
ImageView circularImageView;
Context context;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

       circularImageView = findViewById(R.id.logo_edited);

       new Handler().postDelayed(new Runnable() {
       @Override
       public void run() {
  Intent intent = new Intent(MainActivity.this, Activity_2.class);
  startActivity(intent);
  Animatoo.animateSlideUp(MainActivity.this);

       }
   },2500);

}}
