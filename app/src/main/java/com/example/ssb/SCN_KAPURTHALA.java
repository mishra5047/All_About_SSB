package com.example.ssb;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import android.app.Activity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;

import org.w3c.dom.Text;

public class SCN_KAPURTHALA extends Activity {
    //2 textviews per tab
    TextView name,view1,view2,view3,view4,view5,view6,view7,view8;
ImageView imageView,logo1,logo2,logo3,logo4;
RelativeLayout layout1,layout2,layout3,layout4;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_scn__kapurthal);
     //declaring
      imageView = (ImageView) findViewById(R.id.logo);
    name = (TextView) findViewById(R.id.centername);
    logo1 = (ImageView) findViewById(R.id.info_logo);
        logo2 = (ImageView) findViewById(R.id.hotel_logo);
        logo3 = (ImageView) findViewById(R.id.howtoreach_logo);
    logo4 = (ImageView) findViewById(R.id.places_logo);
        //layouts
        layout1 = (RelativeLayout) findViewById(R.id.info_tab);
        layout2 = (RelativeLayout) findViewById(R.id.hotel_tab);
        layout3 = (RelativeLayout) findViewById(R.id.howtoreach_tab);
        layout4 = (RelativeLayout) findViewById(R.id.places_tab);

        //textviews
        view1 = (TextView) findViewById(R.id.info_intro);
        view2 = (TextView) findViewById(R.id.hotel_intro);
        view3 = (TextView) findViewById(R.id.places_intro);
        view4 = (TextView) findViewById(R.id.transport_intro);
        //details
        view5 = (TextView) findViewById(R.id.hotel_detail);
        view6 = (TextView) findViewById(R.id.info_details);
        view7 = (TextView) findViewById(R.id.places_details);
        view8 = (TextView) findViewById(R.id.transport_details);
    }
}
