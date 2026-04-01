class Complex {
    int real;
    int imag;

    // a. Default Constructor
    Complex() {
        real = 0;
        imag = 0;
    }

    // b. Parameterized Constructor
    Complex(int r, int i) {
        real = r;
        imag = i;
    }

    // c. Copy Constructor
    Complex(Complex c) {
        real = c.real;
        imag = c.imag;
    }

    // d. Display Method
    void showComplex() {
        if (imag >= 0)
            System.out.println(real + " + " + imag + "i");
        else
            System.out.println(real + " - " + (-imag) + "i");
    }

    // e. Addition
    Complex addComplex(Complex c) {
        int r = this.real + c.real;
        int i = this.imag + c.imag;
        return new Complex(r, i);
    }

    // f. Subtraction
    Complex substractComplex(Complex c) {
        int r = this.real - c.real;
        int i = this.imag - c.imag;
        return new Complex(r, i);
    }

    // g. Multiplication
    Complex multiplyComplex(Complex c) {
        int r = this.real * c.real - this.imag * c.imag;
        int i = this.real * c.imag + this.imag * c.real;
        return new Complex(r, i);
    }
}

// Main Class
public class A9Q2 {
    public static void main(String[] args) {

        // Creating objects using different constructors
        Complex c1 = new Complex();              // Default constructor
        Complex c2 = new Complex(3, 4);          // Parameterized constructor
        Complex c3 = new Complex(c2);            // Copy constructor

        System.out.println("Complex Numbers:");
        c1.showComplex();
        c2.showComplex();
        c3.showComplex();

        // Addition
        System.out.println("\nAddition:");
        Complex add = c2.addComplex(c3);
        add.showComplex();

        // Subtraction
        System.out.println("\nSubtraction:");
        Complex sub = c2.substractComplex(c3);
        sub.showComplex();

        // Multiplication
        System.out.println("\nMultiplication:");
        Complex mul = c2.multiplyComplex(c3);
        mul.showComplex();
    }
}