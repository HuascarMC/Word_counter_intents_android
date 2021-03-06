package com.codeclan.example.wordcounter;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

/**
 * Created by huascar on 14/11/2017.
 */

public class CountActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_count);

        Intent intent = getIntent();

        Bundle extra = intent.getExtras();
        int wordCount = extra.getInt("answer");

        TextView textView = (TextView) findViewById(R.id.textView);
        textView.setText(Integer.toString(wordCount));
    }
}
