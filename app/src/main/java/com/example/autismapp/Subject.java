package com.example.autismapp;

public class Subject extends Word
{
    private int type;
    //1-yo, 2-tu, 3-el/ella/usted, 4-ellos/ellas/ustedes, 5-nosotros
    //ir[yo]
    public Subject (String input)
    {
        super(input);
        switch(input){
            case "Yo":
                type=1;
                break;

            case "Tu":
                type=2;
                break;

            case "El":
            case "Ella":
            case "Usted":
                type=3;
                break;

            case "Ellos":
            case "Ellas":
            case "Ustedes":
                type=4;
                break;

            case "Nosotros":
                type=5;
                break;
        }
    }

    public int get_Type(){
        return type;
    }
    public String toString(){
        return super.text;
    }

}