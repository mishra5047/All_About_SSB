package com.example.ssb;

import android.app.Activity;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.app.TaskStackBuilder;
import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.graphics.Point;
import android.os.Bundle;
import android.os.Handler;
import android.util.DisplayMetrics;
import android.util.Log;
import android.view.Display;
import android.widget.ImageView;
import android.widget.Toast;

import androidx.core.app.NotificationCompat;

import com.blogspot.atifsoftwares.animatoolib.Animatoo;
import com.mikhaellopez.circularimageview.CircularImageView;

public class MainActivity extends Activity {
    ImageView circularImageView;
    String size;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        ScreenSize size_check = new ScreenSize();
        size = size_check.screenCheck(MainActivity.this);

//        this.size = checkScreen();

        if (size.equalsIgnoreCase("Small"))
            setContentView(R.layout.activity_main_small);
        else
            setContentView(R.layout.activity_main);

        addNotification();

        // notification
        NotificationCompat.Builder mBuilder = new NotificationCompat.Builder(this);
        mBuilder.setSmallIcon(R.drawable.icon);
        mBuilder.setContentTitle("Welcome To All About SSB");
        mBuilder.setContentText("Find the answer to all your queries");

        NotificationManager notificationManager = (NotificationManager) getSystemService(Context.NOTIFICATION_SERVICE);
        assert notificationManager != null;
        notificationManager.notify(NotificationManager.IMPORTANCE_HIGH,mBuilder.build());


        Intent resultIntent = new Intent(this, Activity_2.class);
        TaskStackBuilder stackBuilder = TaskStackBuilder.create(this);
        stackBuilder.addParentStack(Activity_2.class);

        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent intent = new Intent(MainActivity.this, Activity_2.class);
                startActivity(intent);
                Animatoo.animateSlideUp(MainActivity.this);

            }
        }, 500);


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

//    public String checkScreen(){
//
//    DisplayMetrics dm = new DisplayMetrics();
//    getWindowManager().getDefaultDisplay().getMetrics(dm);
//
//    String screenSize = null;
//    int width = dm.widthPixels;
//    int height = dm.heightPixels;
//    int dens = dm.densityDpi;
//    double wi = (double)width / (double)dens;
//    double hi = (double)height / (double)dens;
//    double x = Math.pow(wi, 2);
//    double y = Math.pow(hi, 2);
//    double screenInches = Math.sqrt(x+y);
//
//    if (screenInches <= 5.2)
//        screenSize = "small";
//    else if (screenInches > 5.2 && screenInches < 6.5)
//        screenSize = "normal";
//
//    return screenSize;
//}}
