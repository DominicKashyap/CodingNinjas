package com.CodingNinJas.OOPsUser;

import com.CodingNinJas.OOPs.Fraction;

public class FractionUse {
    public static void main(String[] args) {
        Fraction obj1 = new Fraction(10,30);
        obj1.print();

        Fraction f2 = new Fraction(3,4);
        obj1.add(f2);
        obj1.print();
        f2.print();

        Fraction f3 = new Fraction(4,5);
        f3.multiply(f2);
        f3.print();
        f2.print();

        Fraction f4 = Fraction.add(f2,f3);
        f4.print();
    }
}
