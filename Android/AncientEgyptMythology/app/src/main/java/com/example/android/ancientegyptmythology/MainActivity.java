package com.example.android.ancientegyptmythology;

import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;
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

        EditText firstQ = findViewById(R.id.name);
        String name = firstQ.getText().toString();
        if(name.compareToIgnoreCase("thot") == 0) result++;

        RadioButton secondQ = (RadioButton) findViewById(R.id.secondGood);
        if (secondQ.isChecked()) result++;

        RadioButton thirdQ = (RadioButton) findViewById(R.id.thirdGood);
        if (thirdQ.isChecked()) result++;

        CheckBox fourthQ_1 = (CheckBox) findViewById(R.id.fourthGood_1);
        CheckBox fourthQ_2 = (CheckBox) findViewById(R.id.fourthGood_2);
        CheckBox fourthQ_bad1 = (CheckBox) findViewById(R.id.fourthBad_1);
        CheckBox fourthQ_bad2 = (CheckBox) findViewById(R.id.fourthBad_2);
        if (fourthQ_1.isChecked() && fourthQ_2.isChecked() && !fourthQ_bad1.isChecked() && !fourthQ_bad2.isChecked()) result++;

        RadioButton fifthQ = (RadioButton) findViewById(R.id.fifthGood);
        if (fifthQ.isChecked()) result++;

        RadioButton sixthQ = (RadioButton) findViewById(R.id.sixthGood);
        if (sixthQ.isChecked()) result++;

        RadioButton seventhQ = (RadioButton) findViewById(R.id.seventhGood);
        if (seventhQ.isChecked()) result++;

        RadioButton eighthQ = (RadioButton) findViewById(R.id.eighthGood);
        if (eighthQ.isChecked()) result++;

        Context context = getApplicationContext();
        CharSequence text = "You have " + result + " good answer!";
        if(result == 8) text = text + "\nYou are the best! :)";
        else if(result == 7) text = text + "\nAlmost good!";
        else if(4 < result && result < 7) text = text + "\nNot bad!";
        else if(2 < result && result < 5) text = text + "\nIt will be better!";
        else if(result < 3) text = text + "\nTry again!";
        int duration = Toast.LENGTH_LONG;

        Toast toast = Toast.makeText(context, text, duration);
        toast.show();
    }
}
