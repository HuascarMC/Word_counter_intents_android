package com.codeclan.example.wordcounter;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

/**
 * Created by sandy on 26/10/2016.
 */
public class MainActivity extends AppCompatActivity {

    EditText editText;
    TextView textView;
    Button buttonWordCount;
    Button buttonConcordance;
    WordCounter wordCounter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        editText = (EditText)findViewById(R.id.text_to_scan);
        buttonWordCount = (Button)findViewById(R.id.button_scan);
        buttonConcordance = (Button)findViewById(R.id.button_concordance);
        textView = (TextView)findViewById(R.id.text_result);

        wordCounter = new WordCounter();
    }

    public void onWordCountButtonClick(View view) {
//        String textToScan = editText.getText().toString();
//        Log.d("WordCounter", "Counting words in : '" + textToScan + "'");
//
//        int numberOfWords = WordCounter.getCount(textToScan);
//
//        textView.setText(Integer.toString(numberOfWords) + " words entered");
        String textToScan = editText.getText().toString();
        int numberOfWords = WordCounter.getCount(textToScan);


        Intent intent = new Intent(this, CountActivity.class);
        intent.putExtra("answer", numberOfWords);
        startActivity(intent);


    }

    public void onConcordanceButtonClick(View view) {
//        String textToScan = editText.getText().toString();
//        Log.d("WordCounter", "Creating concordance for : '" + textToScan + "'");
//
//        WordCounterExtended wordCounter = new WordCounterExtended(textToScan);
//        textView.setText(wordCounter.toString());

        String textToScan = editText.getText().toString();
        WordCounterExtended wordCounter = new WordCounterExtended(textToScan);

        Intent intent = new Intent(this, ConcordanceActivity.class);
        intent.putExtra("answer", wordCounter.toString());

        startActivity(intent);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater menuInflater = getMenuInflater();
        menuInflater.inflate(R.menu.activity_menu, menu);
        return true;
    }

}
