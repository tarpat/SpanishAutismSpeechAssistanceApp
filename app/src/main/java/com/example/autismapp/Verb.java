package com.example.autismapp;

public class Verb extends Word {
    // yo, tu, el/ella, ellos/ellas, nosotros
    private String[] conjugations;
    private String conjugated;
    public Verb (String input, String[] conjugationArr) {
        super(input);
        conjugations = conjugationArr;
    }

    public void addConjugation(String[] conjugation_array){
        conjugations = conjugation_array;
    }

    public void conjugate(int subject_type){
        conjugated = conjugations[subject_type-1];
    }

    public String toString(){
        return conjugated;
    }
}
