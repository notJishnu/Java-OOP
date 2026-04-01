class Fraction {
    int num;
    int denum;

    // 1. Default Constructor
    Fraction() {
        num = 0;
        denum = 1;
    }

    // 2. One Argument Constructor
    Fraction(int n) {
        num = n;
        denum = 1;
    }

    // 3. Two Argument Constructor
    Fraction(int n, int d) {
        if (d != 0) {
            num = n;
            denum = d;
        } else {
            System.out.println("Denominator cannot be zero. Setting to 1.");
            num = n;
            denum = 1;
        }
    }

    // 4. Copy Constructor
    Fraction(Fraction f) {
        num = f.num;
        denum = f.denum;
    }

    // Method to display fraction
    void show() {
        System.out.println(num + "/" + denum);
    }

    // Method to reduce fraction
    Fraction reduce() {
        int gcd = gcd(Math.abs(num), Math.abs(denum));
        return new Fraction(num / gcd, denum / gcd);
    }

    // GCD method
    int gcd(int a, int b) {
        if (b == 0)
            return a;
        return gcd(b, a % b);
    }

    // Addition
    Fraction add(Fraction f) {
        int n = this.num * f.denum + f.num * this.denum;
        int d = this.denum * f.denum;
        return new Fraction(n, d).reduce();
    }

    // Subtraction
    Fraction subtract(Fraction f) {
        int n = this.num * f.denum - f.num * this.denum;
        int d = this.denum * f.denum;
        return new Fraction(n, d).reduce();
    }

    // Multiplication
    Fraction multiply(Fraction f) {
        int n = this.num * f.num;
        int d = this.denum * f.denum;
        return new Fraction(n, d).reduce();
    }

    // Division
    Fraction div(Fraction f) {
        int n = this.num * f.denum;
        int d = this.denum * f.num;
        return new Fraction(n, d).reduce();
    }

    // Compare two fractions
    int compare(Fraction f) {
        int lhs = this.num * f.denum;
        int rhs = f.num * this.denum;

        if (lhs == rhs)
            return 0;
        else if (lhs > rhs)
            return 1;
        else
            return -1;
    }

    // Convert to mixed fraction
    Fraction mixed() {
        int whole = num / denum;
        int remainder = num % denum;
        System.out.println("Mixed Form: " + whole + " " + remainder + "/" + denum);
        return this;
    }
}

// Main Class
public class A9Q1 {
    public static void main(String[] args) {

        // Creating objects using different constructors
        Fraction f1 = new Fraction();           // Default
        Fraction f2 = new Fraction(5);          // One argument
        Fraction f3 = new Fraction(3, 4);       // Two argument
        Fraction f4 = new Fraction(f3);         // Copy constructor

        System.out.println("Fractions:");
        f1.show();
        f2.show();
        f3.show();
        f4.show();

        System.out.println("\nAddition:");
        Fraction result1 = f2.add(f3);
        result1.show();

        System.out.println("\nSubtraction:");
        Fraction result2 = f3.subtract(f2);
        result2.show();

        System.out.println("\nMultiplication:");
        Fraction result3 = f3.multiply(f2);
        result3.show();

        System.out.println("\nDivision:");
        Fraction result4 = f3.div(f2);
        result4.show();

        System.out.println("\nComparison:");
        int cmp = f3.compare(f4);
        if (cmp == 0)
            System.out.println("Fractions are Equal");
        else if (cmp > 0)
            System.out.println("First is Greater");
        else
            System.out.println("Second is Greater");

        System.out.println("\nMixed Fraction:");
        Fraction f5 = new Fraction(7, 3);
        f5.mixed();

        System.out.println("\nReduced Form:");
        Fraction f6 = new Fraction(8, 4);
        f6.reduce().show();
    }
}