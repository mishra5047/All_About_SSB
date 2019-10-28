package com.example.ssb;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Spinner;
import android.widget.TextView;

import com.example.ssb.Kapurthala.Slide;
import com.example.ssb.Allahabad.Allahabad_Slide;

public class Info_about_centers extends Activity {
Button button;
TextView Info;
ImageView logo_punjab, logo_allahabd,logo_bhopal,bangalore_img;
Spinner spinner;
ImageView punjab_image;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_info_about_centers);

        logo_punjab = (ImageView) findViewById(R.id.logo_new);
        punjab_image = (ImageView) findViewById(R.id.punjab_logo);
        punjab_image.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Info_about_centers.this, Slide.class);
                startActivity(intent);
            }
        });

        logo_allahabd = (ImageView) findViewById(R.id.allahabad_logo);
        logo_allahabd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent allahabad = new Intent(Info_about_centers.this, Allahabad_Slide.class);
                startActivity(allahabad);
            }
        });
         logo_bhopal = (ImageView) findViewById(R.id.Bhopal_logo);
         logo_bhopal.setOnClickListener(new View.OnClickListener() {
             @Override
             public void onClick(View v) {
                 Intent bhopal = new Intent(Info_about_centers.this, Bhopal_Slide.class);
                 startActivity(bhopal);
             }
         });

         bangalore_img = (ImageView) findViewById(R.id.bangalore_logo);
         bangalore_img.setOnClickListener(new View.OnClickListener() {
             @Override
             public void onClick(View v) {
                 Intent bangalore = new Intent(Info_about_centers.this,Bangalore_Slide.class);
                 startActivity(bangalore);
             }
         });
    }
}




