package lab7;

public class Fraction implements Numeric {

    private Integer numerator;
    private Integer denominator;

    public Fraction(Integer numerator, Integer denominator) {
        this.numerator = numerator;
        this.denominator = denominator;
    }

    public Integer getNumerator() {
        return numerator;
    }

    public void setNumerator(Integer numerator) {
        this.numerator = numerator;
    }

    public Integer getDenominator() {
        return denominator;
    }

    public void setDenominator(Integer denominator) {
        this.denominator = denominator;
    }

    public String toString(){
        return this.numerator + "/" + this.denominator + "\n";
    }

    @Override
    public Numeric multiply(Numeric n) {
        Numeric result = new Fraction(1,1);
        ((Fraction) result).numerator   = this.numerator * ((Fraction)n).numerator;
        ((Fraction) result).denominator = this.denominator * ((Fraction)n).denominator;
        return result;
    }
}
