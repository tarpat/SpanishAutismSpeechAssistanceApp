package com.example.autismapp;

import static android.view.View.VISIBLE;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    ArrayList<Word> sentence;
    int numChars;
    TextView mainTextView;
    ImageView imageView1;
    ImageView imageView2;
    ImageView imageView3;
    ImageView imageView4;
    ImageView imageView5;
    ImageView imageView6;
    ImageView imageView7;
    ImageView imageView8;
    ImageView imageView9;
    ImageView imageView10;
    ArrayList<ImageView> imageViews;
    //d
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Sentence Building
        sentence = new ArrayList<>();
        numChars = 0;

        // Max 100 chars in sentence, otherwise it will overflow
        mainTextView = (TextView)findViewById(R.id.mainTextView);


        // Images
        imageViews = new ArrayList<>();
        imageView1 = (ImageView)findViewById(R.id.imageView1);
        imageView1.setVisibility(View.INVISIBLE);
        imageViews.add(imageView1);

        imageView2 = (ImageView)findViewById(R.id.imageView2);
        imageView2.setVisibility(View.INVISIBLE);
        imageViews.add(imageView2);

        imageView3 = (ImageView)findViewById(R.id.imageView3);
        imageView3.setVisibility(View.INVISIBLE);
        imageViews.add(imageView3);

        imageView4 = (ImageView)findViewById(R.id.imageView4);
        imageView4.setVisibility(View.INVISIBLE);
        imageViews.add(imageView4);

        imageView5 = (ImageView)findViewById(R.id.imageView5);
        imageView5.setVisibility(View.INVISIBLE);
        imageViews.add(imageView5);

        imageView6 = (ImageView)findViewById(R.id.imageView6);
        imageView6.setVisibility(View.INVISIBLE);
        imageViews.add(imageView6);

        imageView7 = (ImageView)findViewById(R.id.imageView7);
        imageView7.setVisibility(View.INVISIBLE);
        imageViews.add(imageView7);

        imageView8 = (ImageView)findViewById(R.id.imageView8);
        imageView8.setVisibility(View.INVISIBLE);
        imageViews.add(imageView8);

        imageView9 = (ImageView)findViewById(R.id.imageView9);
        imageView9.setVisibility(View.INVISIBLE);
        imageViews.add(imageView9);

        imageView10 = (ImageView)findViewById(R.id.imageView10);
        imageView10.setVisibility(View.INVISIBLE);
        imageViews.add(imageView10);

        //Subject Buttons and Text
        ImageButton yoButton = (ImageButton) findViewById(R.id.yoButton);
        yoButton.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                if(addImage(R.drawable.yo)) {
                    addWord("Yo", new String[1],"Subject", false);
                }
            }
        });
        ImageButton tuButton = (ImageButton) findViewById(R.id.tuButton);
        tuButton.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                if(addImage(R.drawable.tu)) {
                    addWord("Tú", new String[1],"Subject", false);
                }
            }
        });
        ImageButton elButton = (ImageButton) findViewById(R.id.elButton);
        elButton.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                if(addImage(R.drawable.el_1)) {
                    addWord("Él", new String[1],"Subject", false);
                }
            }
        });
        ImageButton ellaButton = (ImageButton) findViewById(R.id.ellaButton);
        ellaButton.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                if(addImage(R.drawable.ella)) {
                    addWord("Ella", new String[1],"Subject", false);
                }
            }
        });
        ImageButton ellosButton = (ImageButton) findViewById(R.id.ellosButton);
        ellosButton.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                if(addImage(R.drawable.ellos)) {
                    addWord("Ellos", new String[1],"Subject", false);
                }
            }
        });

        ImageButton nosotrosButton = (ImageButton) findViewById(R.id.nosotrosButton);
        nosotrosButton.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                if(addImage(R.drawable.nosotros)) {
                    addWord("Nosotros", new String[1],"Subject", false);
                }
            }
        });

        ImageButton backspaceButton = (ImageButton) findViewById(R.id.backspaceButton);
        backspaceButton.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                removeLastWord();
                removeLastImage();
            }
        });

        // Verb Buttons
        ImageButton irButton = (ImageButton) findViewById(R.id.irButton);
        irButton.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
//                System.out.println(getSubject());
                if(addImage(R.drawable.ir)) {
                    String[] conjugations = {"voy", "vas", "va", "van", "vamos"};
                    addWord("ir", conjugations, "Verb", false);
                }
            }
        });

    }
    public void addWord(String word, String[] arr, String type, boolean gender) {
        if(numChars + word.length() < 101) {
            numChars += word.length();
            if (type.equals("Subject")) {
                sentence.add(new Subject(word));
            } else if (type.equals("Noun")) {
                sentence.add(new Noun(word, gender));
            } else if (type.equals("Verb")) {
                Verb verb = new Verb(word, arr);
                if(getSubject() > -1) {
                    verb.conjugate(getSubject());
                    sentence.add(verb);
                } else {
                    removeLastImage();
                }
            }
        }
        printSentence();
    }

    public void printSentence() {
        String temp = "";
        for(Word word : sentence) {
            temp += word.toString() + " ";
        }
        mainTextView.setText(temp);
    }

    public void removeLastWord() {
        if(sentence.size() > 0)
            sentence.remove(sentence.size()-1);
        printSentence();
    }

    private void removeLastImage() {
        for(int i = imageViews.size()-1; i >= 0; i--) {
            if(imageViews.get(i).getVisibility() == VISIBLE) {
                imageViews.get(i).setVisibility(View.INVISIBLE);
                break;
            }
        }
    }

    public boolean addImage(int resId) {
        for(ImageView iv : imageViews) {
            if(iv.getVisibility() == View.INVISIBLE) {
                iv.setImageResource(resId);
                iv.setVisibility(VISIBLE);
                return true;
            }
        }
        return false;
    }

    public int getSubject() {
        for(Word word : sentence) {
            if(word instanceof Subject) {
                return ((Subject) word).get_Type();
            }
        }
        return -1;
    }
}