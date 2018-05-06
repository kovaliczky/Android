package com.example.android.tataobservatory;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.method.LinkMovementMethod;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView t2 = (TextView) findViewById(R.id.web);
        t2.setMovementMethod(LinkMovementMethod.getInstance());

        TextView map = (TextView) findViewById(R.id.where);
        map.setMovementMethod(LinkMovementMethod.getInstance());
    }

    public void bookTime(View view) {
        Intent intent = new Intent(Intent.ACTION_SENDTO);
        intent.setData(Uri.parse("mailto:tataicsillagda@gmail.com"));
        intent.putExtra(Intent.EXTRA_SUBJECT, "Visit observatory");
        intent.putExtra(Intent.EXTRA_TEXT, "Hello,\n\nI would like to visit the observatory on (date) at (hour).\n\nThanks,\n(your name)");
        if (intent.resolveActivity(getPackageManager()) != null) {
            startActivity(intent);
        }
    }

}
