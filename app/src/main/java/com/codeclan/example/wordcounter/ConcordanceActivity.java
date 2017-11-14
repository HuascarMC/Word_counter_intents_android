package com.codeclan.example.wordcounter;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import java.util.HashMap;

public class ConcordanceActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_concordance);

        Intent intent = getIntent();

        Bundle extra = intent.getExtras();
        String wordHashCount = extra.getString("answer");

        TextView textView = (TextView) findViewById(R.id.textView);
        textView.setText(wordHashCount);
    }
}
