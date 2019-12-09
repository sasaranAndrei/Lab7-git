package lab7;

public class MainClass {
    public static void main (String[] args){
        Complex c = new Complex(1.0,2.0);
        Complex d = new Complex (0.0,1.0);

        c.printComplex();
        System.out.println();
        d.printComplex();
        System.out.println();

        Numeric w = c.multiply(d);
        if (w instanceof Complex){
            ((Complex) w).printComplex();
            System.out.println();
        }
        System.out.println();

        Fraction f = new Fraction(2,3);
        Fraction g = new Fraction(4,7);
        Numeric result = ((Fraction)f).multiply((Fraction)g);
        System.out.println(((Fraction)result).toString());

        System.out.println();
    }
}
