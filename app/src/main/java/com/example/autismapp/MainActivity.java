package com.example.autismapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

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
            }
        });
        ImageButton tuButton = (ImageButton) findViewById(R.id.tuButton);
        tuButton.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                subjectImg.setImageResource(R.drawable.tu);
                subjectImg.setVisibility(View.VISIBLE);
                subjectTextView.setText("Tu");
            }
        });
        ImageButton elButton = (ImageButton) findViewById(R.id.elButton);
        elButton.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                subjectImg.setImageResource(R.drawable.el_1);
                subjectImg.setVisibility(View.VISIBLE);
                subjectTextView.setText("Él");
            }
        });
        ImageButton ellaButton = (ImageButton) findViewById(R.id.ellaButton);
        ellaButton.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                subjectImg.setImageResource(R.drawable.ella);
                subjectImg.setVisibility(View.VISIBLE);
                subjectTextView.setText("Ella");
            }
        });
        ImageButton ellosButton = (ImageButton) findViewById(R.id.ellosButton);
        ellosButton.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                subjectImg.setImageResource(R.drawable.ellos);
                subjectImg.setVisibility(View.VISIBLE);
                subjectTextView.setText("Ellos/Ellas");
            }
        });

    }
}