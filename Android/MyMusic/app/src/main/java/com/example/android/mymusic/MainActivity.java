package com.example.android.mymusic;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView rock = (TextView) findViewById(R.id.rock);
        TextView pop = (TextView) findViewById(R.id.pop);
        TextView electronic = (TextView) findViewById(R.id.electronic);
        TextView hiphop = (TextView) findViewById(R.id.hiphop);
        TextView relax = (TextView) findViewById(R.id.relax);

        rock.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                Intent numbersIntent = new Intent(MainActivity.this, RockActivity.class);
                startActivity(numbersIntent);
            }
        });

        pop.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                Intent numbersIntent = new Intent(MainActivity.this, PopActivity.class);
                startActivity(numbersIntent);
            }
        });

        electronic.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                Intent numbersIntent = new Intent(MainActivity.this, ElectronicActivity.class);
                startActivity(numbersIntent);
            }
        });

        hiphop.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                Intent numbersIntent = new Intent(MainActivity.this, HiphopActivity.class);
                startActivity(numbersIntent);
            }
        });

        relax.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                Intent numbersIntent = new Intent(MainActivity.this, RelaxActivity.class);
                startActivity(numbersIntent);
            }
        });

    }
}
