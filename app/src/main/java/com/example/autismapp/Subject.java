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
            case "yo":
                type=1;
                break;

            case "tu":
                type=2;
                break;

            case "el":
            case "ella":
            case "usted":
                type=3;
                break;

            case "ellos":
            case "ellas":
            case "ustedes":
                type=4;
                break;

            case "nosotros":
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