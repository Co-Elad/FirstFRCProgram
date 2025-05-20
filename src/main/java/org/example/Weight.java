package org.example;

public class Weight {
    private int Kg;
    private int Grams;


    Weight(int Kg, int Grams) {
        this.Kg = Kg = Kg += Grams / 1000;
        this.Grams = Grams = Grams % 1000;
    }

    public String toString() {
        return "Kg " + Kg + "and gr " + Grams;
    }

    public boolean equals(Weight other) {

        return other.Grams == Grams || other.Kg == Kg;
    }

    public boolean lessThen(Weight other) {

        return other.Grams > Grams && other.Kg == Kg || other.Grams == Grams && other.Kg > Kg || other.Grams > Grams && other.Kg > Kg;
    }


}
