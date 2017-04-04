package ua.kpi.model;

/**
 * Created by Bohdan on 25.03.2017.
 */
public class Fraction implements Cloneable{
    private int denominator;
    private int numerator;

    public Fraction(){}

    public Fraction(int denominator, int numerator){
        this.denominator = denominator;
        this.numerator = numerator;
    }

    public void setDenominator(int denominator){
        this.denominator = denominator;
    }

    public void setNumerator(int numerator){
        this.numerator = numerator;
    }

    public int getDenominator(){
        return denominator;
    }

    public int getNumerator(){
        return numerator;
    }

    @Override
    public int hashCode(){
        final int prime = 31;
        int result = 1;
        result = prime*result + this.denominator;
        result = prime*result + this.numerator;
        return result;
    }

    @Override
    public boolean equals(Object obj){
        if(this == obj)
            return true;
        if(obj == null)
            return false;
        if(getClass() != obj.getClass())
            return false;
        Fraction other = (Fraction) obj;
        if(this.numerator != other.getNumerator())
            return false;
        if(this.denominator != other.getDenominator())
            return false;
        return true;
    }

    @Override
    public String toString(){
        String result = this.numerator + "/" + this.denominator;
        return result;
    }

    public Object clone(){
        try{
            Fraction copy = (Fraction)super.clone();
            return copy;
        }catch (CloneNotSupportedException e){
            throw new AssertionError("There is no Cloneable");
        }
    }

}
