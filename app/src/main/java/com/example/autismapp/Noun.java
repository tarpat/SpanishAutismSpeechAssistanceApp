package com.example.autismapp;

public class Noun extends Word
{
    private boolean male;

    public Noun (String input, boolean gender)
    {
        super(input);
        male = gender;
    }

    public String toString(){
        return super.text;
    }



}
