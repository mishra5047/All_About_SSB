package com.example.ssb;

import androidx.appcompat.app.AppCompatActivity;

import android.content.ActivityNotFoundException;
import android.content.Intent;
import android.content.res.Configuration;
import android.net.Uri;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.view.Window;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Toast;

import com.blogspot.atifsoftwares.animatoolib.Animatoo;
import com.google.android.gms.ads.AdListener;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;
import com.google.android.gms.ads.InterstitialAd;

import static android.widget.Toast.LENGTH_SHORT;

public class Contact_activity extends AppCompatActivity {
    ImageView insta, gmail;
    Button ad;
    Uri uri = Uri.parse("https://www.instagram.com/mishra_abhishek_24/");
    Intent instagram  = new Intent(Intent.ACTION_VIEW, uri);
    Window window;
    AdView add;
    InterstitialAd m_interstitialAd;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_contact_activity);
        instagram.setPackage("com.instagram.android");

        //ad
        // ca-app-pub-9684827030039892/7179379927
//
//        m_interstitialAd.setAdUnitId("ca-app-pub-3940256099942544/1033173712");
//        m_interstitialAd.loadAd(new AdRequest.Builder().build());
//
//        m_interstitialAd.setAdListener(new AdListener() {
//            public void onAdLoaded(){
//                m_interstitialAd.show();
//            }
//        });


        add = findViewById(R.id.adView);
        AdRequest adRequest = new AdRequest.Builder().build();
        add.loadAd(adRequest);

        gmail = findViewById(R.id.gmail_image);
        insta = findViewById(R.id.insta_image);


        gmail.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent (Intent.ACTION_SEND);
                intent.setType("message/rfc822");
                intent.putExtra(Intent.EXTRA_EMAIL, new String[]{"mishra695047@gmail.com"});
                intent.putExtra(Intent.EXTRA_SUBJECT, "Support for All About SSB");
                intent.setPackage("com.google.android.gm");
                if (intent.resolveActivity(getPackageManager())!=null)
                    startActivity(intent);

            }
        });

        insta.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try {
                    startActivity(instagram);
                } catch (ActivityNotFoundException e) {
                    startActivity(new Intent(Intent.ACTION_VIEW,
                            Uri.parse("https://www.instagram.com/mishra_abhishek_24/")));
                }
            }
        });
}

    @Override
    public void onBackPressed() {
        super.onBackPressed();
        Animatoo.animateSlideLeft(Contact_activity.this);
    }

}
