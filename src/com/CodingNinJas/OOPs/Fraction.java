package com.CodingNinJas.OOPs;

public class Fraction {
    private int numerator;
    private int denominator;

    public Fraction(int numerator,int denominator){
        if(denominator<=0){
            System.out.println("Error");
            return;
        }
        this.numerator = numerator;
        this.denominator = denominator;
        simpliyFraction();
    }

    public void simpliyFraction(){
        int min = Math.min(numerator,denominator);
        int divisor = 1;
        for(int i=2;i<=min;i++){
            if(numerator%i == 0 && denominator%i == 0){
                divisor = i;
            }
        }
        this.numerator = numerator/divisor;
        this.denominator = denominator/divisor;
    }

    public void print(){
        if(denominator!=1) {
            System.out.println(numerator + "/" + denominator);
        }else {
            System.out.println(numerator);
        }
    }

    public void add(Fraction f){
        if(denominator!=f.denominator){
            numerator = (numerator*f.denominator)+(f.numerator*denominator);
            denominator = denominator*f.denominator;
        }else {
            numerator = numerator+f.numerator;
        }
    }

    public static Fraction add(Fraction f1, Fraction f2){
        Fraction temp = new Fraction(1,1);
        if(f1.denominator!=f2.denominator){
            temp.numerator = (f1.numerator*f2.denominator) + (f2.numerator*f1.denominator);
            temp.denominator = f1.denominator*f2.denominator;
        }else{
            temp.numerator = f1.numerator+ f2.numerator;
        }
        return temp;
    }

    public void multiply(Fraction f){
        numerator = numerator*f.numerator;
        denominator = denominator*f.denominator;
    }

    public void setNumerator(int numerator){
        this.numerator = numerator;
    }

    public int getNumerator(){
        return this.numerator;
    }

    public void setDenominator(int denominator){
        this.denominator = denominator;
    }

    public int getDenominator(){
        return this.denominator;
    }
}
