package ua.kpi.model;

import ua.kpi.model.Fraction;

/**
 * Created by Bohdan on 26.03.2017.
 */
public class Model {
    public Fraction add(Fraction fraction1, Fraction fraction2){
        int resultDenominator;
        int resultNumerator;
        if(fraction1.getDenominator() == fraction2.getDenominator()) {
            resultDenominator = fraction1.getDenominator();
            resultNumerator = fraction1.getNumerator() + fraction2.getNumerator();
        }else{
            resultDenominator = fraction1.getDenominator() * fraction2.getDenominator();
            resultNumerator = fraction1.getNumerator()*fraction2.getDenominator() +
                    fraction2.getNumerator()*fraction1.getDenominator();
        }
        Fraction resultFraction = new Fraction(resultDenominator, resultNumerator);
        return resultFraction;
    }

    public Fraction substract(Fraction fraction1, Fraction fraction2){
        int resultDenominator;
        int resultNumerator;
        if(fraction1.getDenominator() == fraction2.getDenominator()) {
            resultDenominator = fraction1.getDenominator();
            resultNumerator = fraction1.getNumerator() - fraction2.getNumerator();
        }else{
            resultDenominator = fraction1.getDenominator() * fraction2.getDenominator();
            resultNumerator = fraction1.getNumerator()*fraction2.getDenominator() -
                    fraction2.getNumerator()*fraction1.getDenominator();
        }
        Fraction resultFraction = new Fraction(resultDenominator, resultNumerator);
        return resultFraction;
    }

    public Fraction multiply(Fraction fraction1, Fraction fraction2){
        int resultDenominator = fraction1.getDenominator() * fraction2.getDenominator()
                 ;
        int resultNumerator = fraction1.getNumerator() * fraction2.getNumerator();
        Fraction resultFraction = new Fraction(resultDenominator, resultNumerator);
        return resultFraction;
    }

    public Fraction divide(Fraction fraction1, Fraction fraction2){
        int resultDenominator = fraction1.getDenominator() * fraction2.getNumerator();
        int resultNumerator = fraction1.getNumerator() * fraction2.getDenominator();
        Fraction resultFraction = new Fraction(resultDenominator, resultNumerator);
        return resultFraction;
    }
}
