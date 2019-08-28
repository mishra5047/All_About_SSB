package com.example.ssb;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

import org.w3c.dom.Text;

public class activity_2 extends Activity {
LinearLayout layout1,layout2,layout3,layout4;
TextView view1,view2,view3,view4;
ImageView logo,Image1,Image2,Image3,Image4;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_2);

        //layout's
        layout1 = (LinearLayout) findViewById(R.id.linearlayout_1);
        layout2 = (LinearLayout) findViewById(R.id.linearlayout_2);
        layout3 = (LinearLayout) findViewById(R.id.linearlayout_3);
        layout4 = (LinearLayout) findViewById(R.id.linearlayout_4);

        logo = (ImageView) findViewById(R.id.logo_info);
        view1 = (TextView) findViewById(R.id.text_1);
        view2 = (TextView) findViewById(R.id.schedule);
       view3 = (TextView) findViewById(R.id.infoaboutcenter);
        view4 = (TextView) findViewById(R.id.contact);

       logo.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View view) {
               Toast.makeText(activity_2.this,"DEVELOPED BY MISHRA",Toast.LENGTH_LONG).show();
           }
       });

        view1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(activity_2.this,"Opening What's SSB",Toast.LENGTH_LONG).show();
            }
        });

        view2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(activity_2.this,"Opening Schedule",Toast.LENGTH_LONG).show();
            }
        });

        view3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(activity_2.this,"Opening Info About Centers",Toast.LENGTH_LONG).show();
                Intent intent = new Intent(activity_2.this, info_about_centers.class);
                startActivity(intent);
            }
        });

    view4.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            Toast.makeText(activity_2.this,"Opening Contact us",Toast.LENGTH_LONG).show();
        }
    });

    }

    }

