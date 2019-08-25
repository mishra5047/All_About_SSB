package com.example.ssb;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends Activity {
ImageView options;
TextView welcome;
Button button,next_button,contact;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    welcome = (TextView) findViewById(R.id.textview1);
    next_button = (Button) findViewById(R.id.startButton);
    contact = (Button) findViewById(R.id.contactButton);



    contact.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            Toast.makeText(MainActivity.this,"OPENING THE SAME",Toast.LENGTH_LONG).show();
            Intent intent = new Intent(MainActivity.this,Contact_us.class);
            startActivity(intent);

        }
    });
    button = (Button) findViewById(R.id.options_button);
    button.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View view) {


             Intent intent = new Intent(MainActivity.this,activity_2.class);
            startActivity(intent);

        }
    });
    }
}
