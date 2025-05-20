package org.example;

public class Weight {
    private int Kg;
    private int Grams;


    Weight(int Kg, int Grams) {
        this.Kg  = Kg += Grams / 1000;
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

    public Weight add(Weight other){
        if (other.Grams + this.Grams > 1000) {

           return  new Weight(this.Grams + other.Grams  % 1000,(this.Kg + other.Kg)+  this.Grams + other.Grams / 1000);


        }
        else return new Weight (other.Kg+ this.Kg , other.Grams + Grams);
    }


}
