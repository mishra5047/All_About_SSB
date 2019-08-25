package com.example.ssb;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Adapter;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

public class info_about_centers extends Activity implements AdapterView.OnItemSelectedListener {
Button button;
Spinner spinner;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_info_about_centers);

        spinner = (Spinner) findViewById(R.id.spinner_centers);
        final ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(this,R.array.centers_array, android.R.layout.simple_spinner_item);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner.setAdapter(adapter);
        spinner.setOnItemSelectedListener(this);


        button = (Button) findViewById(R.id.share);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
               Toast.makeText(info_about_centers.this,"Shareing",Toast.LENGTH_LONG).show();
            }
        });
    }

    @Override
    public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
        final String text = adapterView.getItemAtPosition(i).toString();
        Toast.makeText(adapterView.getContext(), text, Toast.LENGTH_LONG).show();

      if (text == "SCN KAPURTHALA,PUNJAB"){
          Intent intent= new Intent(info_about_centers.this,activity_2.class);
          startActivity(intent);
      }
    }



    @Override
    public void onNothingSelected(AdapterView<?> adapterView) {

    }
}




