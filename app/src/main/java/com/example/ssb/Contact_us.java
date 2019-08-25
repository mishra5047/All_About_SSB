package com.example.ssb;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.os.Bundle;
import android.widget.TextView;

public class Contact_us extends Activity {
TextView contact_textview;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_contact_us);
        contact_textview = (TextView) findViewById(R.id.contact);
    }
}
