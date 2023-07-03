package com.example.autismapp;

public class Verb extends Word {
    // yo, tu, el/ella, ellos/ellas, nosotros
    private String[] conjugations;
    private String type;
    private String conjugated;
    public Verb (String input) {
        super(input);
        type = input.substring(input.length()-2);

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
