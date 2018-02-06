package com.example.android.ancientegyptmythology;

import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.RadioButton;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void getResult(View view) {

        int result = 0;

        RadioButton firstQ = (RadioButton) findViewById(R.id.firstGood);
        if (firstQ.isChecked()) result++;

        RadioButton secondQ = (RadioButton) findViewById(R.id.secondGood);
        if (secondQ.isChecked()) result++;

        RadioButton thirdQ = (RadioButton) findViewById(R.id.thirdGood);
        if (thirdQ.isChecked()) result++;

        RadioButton fourthQ = (RadioButton) findViewById(R.id.fourthGood);
        if (fourthQ.isChecked()) result++;

        RadioButton fifthQ = (RadioButton) findViewById(R.id.fifthGood);
        if (fifthQ.isChecked()) result++;

        RadioButton sixthQ = (RadioButton) findViewById(R.id.sixthGood);
        if (sixthQ.isChecked()) result++;

        RadioButton seventhQ = (RadioButton) findViewById(R.id.seventhGood);
        if (seventhQ.isChecked()) result++;

        RadioButton eighthQ = (RadioButton) findViewById(R.id.eighthGood);
        if (eighthQ.isChecked()) result++;

        Context context = getApplicationContext();
        CharSequence text = "You have " + result + " good answer!\n Have a nice day! :)";
        int duration = Toast.LENGTH_LONG;

        Toast toast = Toast.makeText(context, text, duration);
        toast.show();
    }
}
