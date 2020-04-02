package com.example.ssb;

import android.app.Activity;
import android.content.Intent;
import android.media.Image;
import android.os.Bundle;
import android.util.DisplayMetrics;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

import com.blogspot.atifsoftwares.animatoolib.Animatoo;
import com.example.ssb.centers.Bangalore_Slide;
import com.example.ssb.centers.Dehradun_Slide;
import com.example.ssb.centers.Allahabad_Slide;
import com.example.ssb.centers.Bhopal_Slide;
import com.example.ssb.centers.Coiambatore_Slide;
import com.example.ssb.centers.Gandhinagar_Slide;
import com.example.ssb.centers.Mysore_Slide;
import com.example.ssb.centers.Kapurthala_slide;
import com.example.ssb.centers.Varanasi_Slide;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;
import com.google.android.gms.ads.InterstitialAd;

public class Info_about_centers extends Activity {

    ImageView logo;
    LinearLayout punjab, allahabd, bhopal,bangalore;
    LinearLayout bhopal_navy, bangalore_navy;
    LinearLayout dehradun, mysore, gandhinagar, varanasi,coiambatore,vishakhapatnam;
    String size;
    AdView m_adview;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);


        ScreenSize size_check = new ScreenSize();
        size = size_check.screenCheck(Info_about_centers.this);


        if (size.equalsIgnoreCase("Small"))
            setContentView(R.layout.activity_info_about_centers_small);
        else
            setContentView(R.layout.activity_info_about_centers);


        m_adview = findViewById(R.id.adView);
        AdRequest adRequest = new AdRequest.Builder().build();
        m_adview.loadAd(adRequest);


        //logo
        logo = findViewById(R.id.logo_new);
        logo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(Info_about_centers.this,"For detials open Contact Us on Home Screen",Toast.LENGTH_LONG).show();

            }
        });
        // SCN KAPURTHALA
        punjab = findViewById(R.id.lin_1);
        punjab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(Info_about_centers.this, Kapurthala_slide.class);
                startActivity(intent);
                Animatoo.animateZoom(Info_about_centers.this);
            }
        });

          // ALLAHABAD
        allahabd = findViewById(R.id.lin_2);
        allahabd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent allahabad = new Intent(Info_about_centers.this, Allahabad_Slide.class);
                startActivity(allahabad);
                Animatoo.animateZoom(Info_about_centers.this);
            }
        });
         // BHOPAL
        bhopal = findViewById(R.id.lin_3);
         bhopal.setOnClickListener(new View.OnClickListener() {
             @Override
             public void onClick(View v) {
                 Intent bhopal = new Intent(Info_about_centers.this, Bhopal_Slide.class);
                 startActivity(bhopal);
                 Animatoo.animateZoom(Info_about_centers.this);
             }
         });
          // BANGALORE
         bangalore = findViewById(R.id.lin_4);
         bangalore.setOnClickListener(new View.OnClickListener() {
             @Override
             public void onClick(View v) {
                 Intent bangalore = new Intent(Info_about_centers.this, Bangalore_Slide.class);
                 startActivity(bangalore);
                 Animatoo.animateZoom(Info_about_centers.this);
             }
         });

         // DEHRADUN
        dehradun = findViewById(R.id.lin_5);
        dehradun.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
              Intent Dehradun = new Intent(Info_about_centers.this, Dehradun_Slide.class);
              startActivity(Dehradun);
                Animatoo.animateZoom(Info_about_centers.this);
            }
        });

        mysore = findViewById(R.id.lin_6);
        mysore.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent mysore = new Intent(Info_about_centers.this, Mysore_Slide.class);
                startActivity(mysore);
                Animatoo.animateZoom(Info_about_centers.this);
            }
        });

        gandhinagar = findViewById(R.id.lin_7);
        gandhinagar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent gandhinagar = new Intent(Info_about_centers.this, Gandhinagar_Slide.class);
                startActivity(gandhinagar);
                Animatoo.animateZoom(Info_about_centers.this);
            }
        });

        varanasi = findViewById(R.id.lin_8);
        varanasi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent varanasi = new Intent(Info_about_centers.this, Varanasi_Slide.class);
                startActivity(varanasi);
                Animatoo.animateZoom(Info_about_centers.this);
            }
        });

        coiambatore = findViewById(R.id.lin_9);
        coiambatore.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent coiambatore = new Intent(Info_about_centers.this, Coiambatore_Slide.class);
                startActivity(coiambatore);
                Animatoo.animateZoom(Info_about_centers.this);
            }
        });

        bangalore_navy = findViewById(R.id.lin_10);
        bangalore_navy.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent bangalore = new Intent(Info_about_centers.this, Bangalore_Slide.class);
                startActivity(bangalore);
                Animatoo.animateZoom(Info_about_centers.this);
            }
        });

        bhopal_navy = findViewById(R.id.lin_11);
        bhopal_navy.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Info_about_centers.this, Bhopal_Slide.class);
                startActivity(intent);
                Animatoo.animateZoom(Info_about_centers.this);
            }
        });

        vishakhapatnam = findViewById(R.id.lin_12);
        vishakhapatnam.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(Info_about_centers.this,"Under Development",Toast.LENGTH_LONG).show();
            }
        });
    }

    @Override
    public void onBackPressed() {
        Intent intent = new Intent(Info_about_centers.this, Activity_2.class);
        startActivity(intent);
        Animatoo.animateCard(Info_about_centers.this);
    }

}




