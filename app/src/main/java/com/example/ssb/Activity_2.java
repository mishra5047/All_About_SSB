package com.example.ssb;

import android.app.Activity;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.res.Configuration;
import android.os.Bundle;
import android.preference.PreferenceManager;
import android.util.DisplayMetrics;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatDelegate;
import androidx.core.app.NotificationCompat;

import com.blogspot.atifsoftwares.animatoolib.Animatoo;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;
import com.google.android.gms.ads.MobileAds;
import com.google.android.gms.ads.initialization.InitializationStatus;
import com.google.android.gms.ads.initialization.OnInitializationCompleteListener;

public class Activity_2 extends Activity {
 LinearLayout layout1,layout2,layout3,layout4;
 TextView view1,view2,view3,view4;
 ImageView logo;
 AdView m_adview;
 String size;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);


        ScreenSize size_check = new ScreenSize();
        size = size_check.screenCheck(Activity_2.this);

        if (size.equalsIgnoreCase("Small"))
            setContentView(R.layout.activity_2_small);
        else
            setContentView(R.layout.activity_2);


        MobileAds.initialize(this, new OnInitializationCompleteListener() {
           @Override
           public void onInitializationComplete(InitializationStatus initializationStatus) {

           }
       });

       m_adview = findViewById(R.id.adView);
       AdRequest adRequest = new AdRequest.Builder().build();
       m_adview.loadAd(adRequest);

        //layout's
        layout1 = findViewById(R.id.linearlayout_1_large);
        layout2 = findViewById(R.id.linearlayout_2_large);
        layout3 = findViewById(R.id.linearlayout_3_large);
        layout4 = findViewById(R.id.linearlayout_4_large);

        logo = findViewById(R.id.logo_info);
        view1 = findViewById(R.id.text_1);
        view2 = findViewById(R.id.schedule);
       view3 = findViewById(R.id.infoaboutcenter);

       logo.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View v) {
               addNotification();
           }
       });

       layout1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(Activity_2.this,"Opening What's SSB",Toast.LENGTH_LONG).show();
                Intent intent = new Intent(Activity_2.this, Olq_first_screen.class);
                startActivity(intent);
                Animatoo.animateDiagonal(Activity_2.this);
            }
        });

        layout2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(Activity_2.this,"Opening Schedule",Toast.LENGTH_LONG).show();
                Intent intent = new Intent(Activity_2.this,Ssb_details.class);
                startActivity(intent);
                Animatoo.animateZoom(Activity_2.this);
            }
        });

        layout3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(Activity_2.this,"Opening Info About Centers",Toast.LENGTH_LONG).show();
                Intent intent = new Intent(Activity_2.this, Info_about_centers.class);
                startActivity(intent);
                Animatoo.animateSwipeRight(Activity_2.this);
            }
        });

        layout4.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            Toast.makeText(Activity_2.this,"Opening Contact us",Toast.LENGTH_LONG).show();
            Intent intent = new Intent(Activity_2.this, Contact_activity.class);
            startActivity(intent);
            Animatoo.animateSwipeLeft(Activity_2.this);
        }
    });

    }

    @Override
    public void onBackPressed() {
        Intent intent = new Intent(Intent.ACTION_MAIN);
        intent.addCategory(Intent.CATEGORY_HOME);
        startActivity(intent);
        Animatoo.animateSlideLeft(Activity_2.this);
    }


    private void addNotification() {
        NotificationCompat.Builder builder =
                new NotificationCompat.Builder(this)
                        .setSmallIcon(R.drawable.info)
                        .setContentTitle("Notifications Example")
                        .setContentText("This is a test notification");

        Intent notificationIntent = new Intent(this, MainActivity.class);
        PendingIntent contentIntent = PendingIntent.getActivity(this, 0, notificationIntent,
                PendingIntent.FLAG_UPDATE_CURRENT);
        builder.setContentIntent(contentIntent);

        // Add as notification
        NotificationManager manager = (NotificationManager) getSystemService(Context.NOTIFICATION_SERVICE);
        manager.notify(0, builder.build());
    }

}