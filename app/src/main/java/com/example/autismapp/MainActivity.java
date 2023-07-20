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

    boolean conjugatedVerb;
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
                if(sentence.size() > 0) {
                    removeLastWord();
                    removeLastImage();
                }
            }
        });

        // Verb Buttons
        ImageButton irButton = (ImageButton) findViewById(R.id.irButton);
        irButton.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                if(addImage(R.drawable.ir)) {
                    String[] conjugations = {"voy a", "vas a", "va a", "van a", "vamos a"};
                    addWord("ir a", conjugations, "Verb", false);
                }
            }
        });

        ImageButton quererButton = (ImageButton) findViewById(R.id.quererButton);
        quererButton.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                if(addImage(R.drawable.querer)) {
                    String[] conjugations = {"quiero", "quieres", "quiere", "quieren", "queremos"};
                    addWord("querer", conjugations, "Verb", false);
                }
            }
        });

        ImageButton necesitarButton = (ImageButton) findViewById(R.id.necesitarButton);
        necesitarButton.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                if(addImage(R.drawable.necesitar)) {
                    String[] conjugations = {"necesito", "necesitas", "necesita", "necesitan", " necesitamos"};
                    addWord("necesitar", conjugations, "Verb", false);
                }
            }
        });

        ImageButton llamarButton = (ImageButton) findViewById(R.id.llamarButton);
        llamarButton.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                if(addImage(R.drawable.llamar)) {
                    String[] conjugations = {"llamo", "llamas", "llama", "llaman", "llamamos"};
                    addWord("llamar", conjugations, "Verb", false);
                }
            }
        });

        ImageButton jugarButton = (ImageButton) findViewById(R.id.jugarButton);
        jugarButton.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                if(addImage(R.drawable.jugar)) {
                    String[] conjugations = {"juego", "juegas", "juega", "juegan", "jugamos"};
                    addWord("jugar", conjugations, "Verb", false);
                }
            }
        });

        ImageButton traerButton = (ImageButton) findViewById(R.id.traerButton);
        traerButton.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                if(addImage(R.drawable.traer)) {
                    String[] conjugations = {"traigo", "traes", "trae", "traen", "traemos"};
                    addWord("traer", conjugations, "Verb", false);
                }
            }
        });

        ImageButton elegirButton = (ImageButton) findViewById(R.id.elegirButton);
        elegirButton.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                if(addImage(R.drawable.elegir)) {
                    String[] conjugations = {"elijo", "eliges", "elige", "eligen", "elegimos"};
                    addWord("elegir", conjugations, "Verb", false);
                }
            }
        });

        ImageButton banarButton = (ImageButton) findViewById(R.id.banarButton);
        banarButton.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                if(addImage(R.drawable.banar)) {
                    String[] conjugations = {"baño", "bañas", "baña", "bañan", "bañamos"};
                    addWord("banar", conjugations, "Verb", false);
                }
            }
        });

        ImageButton comprarButton = (ImageButton) findViewById(R.id.comprarButton);
        comprarButton.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                if(addImage(R.drawable.comprar)) {
                    String[] conjugations = {"compro", "compras", "compra", "compran", "compramos"};
                    addWord("comprar", conjugations, "Verb", false);
                }
            }
        });


        // Nouns
        ImageButton casaAmigaButton = (ImageButton) findViewById(R.id.casaAmigaButton);
        casaAmigaButton.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                if(addImage(R.drawable.casa_amiga)) {
                    addWord("casa de mi amiga", new String[1], "Noun", false); //female is false
                }
            }
        });

        ImageButton casaAmigoButton = (ImageButton) findViewById(R.id.casaAmigoButton);
        casaAmigoButton.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                if(addImage(R.drawable.casa_amigo)) {
                    addWord("casa de mi amigo", new String[1], "Noun", false); //female is false
                }
            }
        });

        ImageButton casaButton = (ImageButton) findViewById(R.id.casaButton);
        casaButton.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                if(addImage(R.drawable.casa)) {
                    addWord("mi casa", new String[1], "Noun", false); //female is false
                }
            }
        });

        ImageButton escuelaButton = (ImageButton) findViewById(R.id.escuelaButton);
        escuelaButton.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                if(addImage(R.drawable.escuela)) {
                    addWord("escuela", new String[1], "Noun", false); //female is false
                }
            }
        });

        ImageButton parqueButton = (ImageButton) findViewById(R.id.parqueButton);
        parqueButton.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                if(addImage(R.drawable.parque_infantil)) {
                    addWord("parque infantil", new String[1], "Noun", false); //female is false
                }
            }
        });

        ImageButton abrigoButton = (ImageButton) findViewById(R.id.abrigoButton);
        abrigoButton.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                if(addImage(R.drawable.abrigo)) {
                    addWord("un abrigo", new String[1], "Noun", true);
                }
            }
        });

        ImageButton aguaButton = (ImageButton) findViewById(R.id.aguaButton);
        aguaButton.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                if(addImage(R.drawable.agua)) {
                    addWord("agua", new String[1], "Noun", true);
                }
            }
        });

        ImageButton amigoButton = (ImageButton) findViewById(R.id.amigoButton);
        amigoButton.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                if(addImage(R.drawable.amigo)) {
                    addWord("mi amigo", new String[1], "Noun", true);
                }
            }
        });

        ImageButton amigaButton = (ImageButton) findViewById(R.id.amigaButton);
        amigaButton.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                if(addImage(R.drawable.amiga)) {
                    addWord("mi amiga", new String[1], "Noun", false);
                }
            }
        });

        ImageButton barcoButton = (ImageButton) findViewById(R.id.barcoButton);
        barcoButton.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                if(addImage(R.drawable.barco)) {
                    addWord("un barco", new String[1], "Noun", true);
                }
            }
        });

        ImageButton bebeButton = (ImageButton) findViewById(R.id.bebeButton);
        bebeButton.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                if(addImage(R.drawable.bebe)) {
                    addWord("un bebe", new String[1], "Noun", true);
                }
            }
        });

        ImageButton cajaButton = (ImageButton) findViewById(R.id.cajaButton);
        cajaButton.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                if(addImage(R.drawable.caja)) {
                    addWord("una caja", new String[1], "Noun", false);
                }
            }
        });

        ImageButton camaButton = (ImageButton) findViewById(R.id.camaButton);
        camaButton.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                if(addImage(R.drawable.cama)) {
                    addWord("una cama", new String[1], "Noun", false);
                }
            }
        });

        ImageButton carroButton = (ImageButton) findViewById(R.id.carroButton);
        carroButton.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                if(addImage(R.drawable.carro)) {
                    addWord("un carro", new String[1], "Noun", true);
                }
            }
        });

        ImageButton chocolateButton = (ImageButton) findViewById(R.id.chocolateButton);
        chocolateButton.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                if(addImage(R.drawable.chocolate)) {
                    addWord("chocolate", new String[1], "Noun", true);
                }
            }
        });

        ImageButton diaButton = (ImageButton) findViewById(R.id.diaButton);
        diaButton.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                if(addImage(R.drawable.dia)) {
                    addWord("dia", new String[1], "Noun", true);
                }
            }
        });

        ImageButton espaldaButton = (ImageButton) findViewById(R.id.espaldaButton);
        espaldaButton.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                if(addImage(R.drawable.espalda)) {
                    addWord("la espalda", new String[1], "Noun", false);
                }
            }
        });

        ImageButton gatoButton = (ImageButton) findViewById(R.id.gatoButton);
        gatoButton.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                if(addImage(R.drawable.gato)) {
                    addWord("gato", new String[1], "Noun", true);
                }
            }
        });

        ImageButton hermanoButton = (ImageButton) findViewById(R.id.hermanoButton);
        hermanoButton.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                if(addImage(R.drawable.hermano)) {
                    addWord("hermano", new String[1], "Noun", true);
                }
            }
        });

        ImageButton jugoButton = (ImageButton) findViewById(R.id.jugoButton);
        jugoButton.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                if(addImage(R.drawable.jugo)) {
                    addWord("el jugo", new String[1], "Noun", true);
                }
            }
        });

        ImageButton libroButton = (ImageButton) findViewById(R.id.libroButton);
        libroButton.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                if(addImage(R.drawable.libro)) {
                    addWord("libro", new String[1], "Noun", true);
                }
            }
        });

        ImageButton madreButton = (ImageButton) findViewById(R.id.madreButton);
        madreButton.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                if(addImage(R.drawable.madre)) {
                    addWord("madre", new String[1], "Noun", false);
                }
            }
        });

        ImageButton maizButton = (ImageButton) findViewById(R.id.maizButton);
        maizButton.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                if(addImage(R.drawable.maiz)) {
                    addWord("el maiz", new String[1], "Noun", true);
                }
            }
        });

        ImageButton manzanaButton = (ImageButton) findViewById(R.id.manzanaButton);
        manzanaButton.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                if(addImage(R.drawable.manzana)) {
                    addWord("una manzana", new String[1], "Noun", false);
                }
            }
        });

        ImageButton osoButton = (ImageButton) findViewById(R.id.osoButton);
        osoButton.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                if(addImage(R.drawable.oso)) {
                    addWord("un oso", new String[1], "Noun", true);
                }
            }
        });

        ImageButton pajaroButton = (ImageButton) findViewById(R.id.pajaroButton);
        pajaroButton.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                if(addImage(R.drawable.pajaro)) {
                    addWord("un pajaro", new String[1], "Noun", true);
                }
            }
        });

        ImageButton panButton = (ImageButton) findViewById(R.id.panButton);
        panButton.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                if(addImage(R.drawable.pan)) {
                    addWord("el pan", new String[1], "Noun", true);
                }
            }
        });

        ImageButton sillaButton = (ImageButton) findViewById(R.id.sillaButton);
        sillaButton.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                if(addImage(R.drawable.silla)) {
                    addWord("una silla", new String[1], "Noun", false);
                }
            }
        });

        ImageButton polloButton = (ImageButton) findViewById(R.id.polloButton);
        polloButton.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                if(addImage(R.drawable.pollo)) {
                    addWord("el pollo", new String[1], "Noun", true);
                }
            }
        });

        ImageButton perroButton = (ImageButton) findViewById(R.id.perroButton);
        perroButton.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                if(addImage(R.drawable.perro)) {
                    addWord("un perro", new String[1], "Noun", true);
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
                if(!conjugatedVerb) {
                    Verb verb = new Verb(word, arr);
                    if (getSubject() > -1) {
                        verb.conjugate(getSubject());
                        sentence.add(verb);
                        conjugatedVerb = true;
                    } else {
                        removeLastImage();
                    }
                } else {
                    Verb verb = new Verb(word, arr);
                    verb.setInfinitiveConj(word);
                    sentence.add(verb);
                }
            }
        } else {
            removeLastImage();
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
        if(sentence.size() > 0) {
            numChars -= (sentence.remove(sentence.size() - 1)).toString().length();
            if(!verbPresent()) {
                conjugatedVerb = false;
            }
        }
        printSentence();
    }

    public boolean verbPresent() {
        for(Word word : sentence) {
            if(word instanceof Verb) {
                return true;
            }
        }
        return false;
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