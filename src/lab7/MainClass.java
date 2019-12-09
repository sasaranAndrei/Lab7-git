package lab7;

public class MainClass {
    public static void main (String[] args) {
        Complex c = new Complex(1.0, 2.0);
        Complex d = new Complex(0.0, 1.0);
        Fraction f = new Fraction(2,3);
        Fraction g = new Fraction(4,7);

        MatrixNumeric mn = new MatrixNumeric(2,2);
        mn.addElement(c, 0, 0);
        mn.addElement(d, 0, 1);
        mn.addElement(f, 1, 0);
        mn.addElement(g, 1, 1);
        System.out.println(mn);
        System.out.println();
        mn.addElement(c.mulComplex(d),1,0);
        System.out.println(mn);
    }
}
