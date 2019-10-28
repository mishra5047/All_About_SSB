package com.example.ssb;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.mikhaellopez.circularimageview.CircularImageView;

public class MainActivity extends Activity {
CircularImageView circularImageView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

       circularImageView = (CircularImageView) findViewById(R.id.logo_edited);
   new Handler().postDelayed(new Runnable() {
       @Override
       public void run() {
  Intent intent = new Intent(MainActivity.this,activity_2.class);
  startActivity(intent);

       }
   },2500);

}}
