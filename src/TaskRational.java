public class TaskRational {
    public static void main(String[] args) {
        Rational number1 = new Rational(5, 3);

        Rational number2 = new Rational(1, 3);

        Rational number3 = number1.add(number2);
        System.out.println(number3.toString());

        Rational number4 = number1.deduct(number2);
        System.out.println(number4.toString());

        Rational number5 = number1.multiply(number2);
        System.out.println(number5.toString());

        Rational number6 = number1.divide(number2);
        System.out.println(number6.toString());
    }
}

class Rational {
    private int numerator;
    private int denominator;

    public Rational(int numerator, int denominator) {

        if (denominator == 0) {
            System.out.println("error, denominator = 0");
        } else {
            this.numerator = numerator / nod(numerator, denominator);
            this.denominator = denominator / nod(numerator, denominator);
        }
    }

    private int nod(int numerator, int denominator) {
        while (denominator != 0 && numerator != 0) {
            if (numerator > denominator) numerator = numerator % denominator;
            else denominator = denominator % numerator;
        }
        return numerator + denominator;
    }

    public Rational(int numerator) {
        this.numerator = numerator;
        denominator = 1;
    }

    public void setNumerator(int numerator) {
        this.numerator = numerator;
    }

    public int getNumerator() {
        return numerator;
    }

    public void setDenominator(int denominator) {
        this.denominator = denominator;
    }

    public int getDenominator() {
        return denominator;
    }


    public Rational add(Rational that) {

        int num = (numerator * that.denominator) + (denominator * that.numerator);
        int den = denominator * that.denominator;
        return new Rational(num, den);
    }


    public Rational deduct(Rational that) {
        int num = (numerator * that.denominator) - (denominator * that.numerator);
        int den = denominator * that.denominator;
        return new Rational(num, den);
    }

    public Rational multiply(Rational that) {
        int num = numerator * that.numerator;
        int den = denominator * that.denominator;
        return new Rational(num, den);
    }


    public Rational divide(Rational that) {
        int num = numerator * that.denominator;
        int den = denominator * that.numerator;
        return new Rational(num, den);
    }


    @Override
    public String toString() {
        if (denominator == 1) return "" + numerator;
        else return numerator + "/" + denominator;

    }

}
