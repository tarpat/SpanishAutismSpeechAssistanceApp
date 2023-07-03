package com.example.autismapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    ArrayList<Word> sentence;
    //d
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Sentence Building
        sentence = new ArrayList<>();

        //Subject Buttons and Text
        ImageView subjectImg = (ImageView)findViewById(R.id.subjectImageView);
        TextView subjectTextView = (TextView)findViewById(R.id.subjectTextView);
        subjectImg.setVisibility(View.INVISIBLE);

        ImageButton yoButton = (ImageButton) findViewById(R.id.yoButton);
        yoButton.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                subjectImg.setImageResource(R.drawable.yo);
                subjectImg.setVisibility(View.VISIBLE);
                subjectTextView.setText("Yo");
                addWord("Yo", "Subject", false);
            }
        });
        ImageButton tuButton = (ImageButton) findViewById(R.id.tuButton);
        tuButton.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                subjectImg.setImageResource(R.drawable.tu);
                subjectImg.setVisibility(View.VISIBLE);
                subjectTextView.setText("Tu");
                addWord("Tu", "Subject", false);
            }
        });
        ImageButton elButton = (ImageButton) findViewById(R.id.elButton);
        elButton.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                subjectImg.setImageResource(R.drawable.el_1);
                subjectImg.setVisibility(View.VISIBLE);
                subjectTextView.setText("Él");
                addWord("Él", "Subject", false);
            }
        });
        ImageButton ellaButton = (ImageButton) findViewById(R.id.ellaButton);
        ellaButton.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                subjectImg.setImageResource(R.drawable.ella);
                subjectImg.setVisibility(View.VISIBLE);
                subjectTextView.setText("Ella");
                addWord("Ella", "Subject", false);
            }
        });
        ImageButton ellosButton = (ImageButton) findViewById(R.id.ellosButton);
        ellosButton.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                subjectImg.setImageResource(R.drawable.ellos);
                subjectImg.setVisibility(View.VISIBLE);
                subjectTextView.setText("Ellos");
                addWord("Ellos", "Subject", false);
            }
        });

    }
    public void addWord(String word, String type, boolean gender) {
        if(type.equals("Subject")) {
            sentence.add(new Subject(word));
        } else if(type.equals("Noun")) {
            sentence.add(new Noun(word, gender));
        } else if(type.equals("Verb")) {
            sentence.add(new Verb(word));
        }
    }
}