// Abstract class
abstract class Fruit {
    protected String colour;
    protected String taste;

    // Constructor
    Fruit(String colour, String taste) {
        this.colour = colour;
        this.taste = taste;
    }

    // Abstract method
    abstract void display();
}

// Apple class
class Apple extends Fruit {
    Apple(String colour, String taste) {
        super(colour, taste);
    }

    void display() {
        System.out.println("Fruit: Apple");
        System.out.println("Colour: " + colour);
        System.out.println("Taste: " + taste);
    }
}

// Banana class
class Banana extends Fruit {
    Banana(String colour, String taste) {
        super(colour, taste);
    }

    void display() {
        System.out.println("Fruit: Banana");
        System.out.println("Colour: " + colour);
        System.out.println("Taste: " + taste);
    }
}

// Orange class
class Orange extends Fruit {
    Orange(String colour, String taste) {
        super(colour, taste);
    }

    void display() {
        System.out.println("Fruit: Orange");
        System.out.println("Colour: " + colour);
        System.out.println("Taste: " + taste);
    }
}

// Strawberry class
class Strawberry extends Fruit {
    Strawberry(String colour, String taste) {
        super(colour, taste);
    }

    void display() {
        System.out.println("Fruit: Strawberry");
        System.out.println("Colour: " + colour);
        System.out.println("Taste: " + taste);
    }
}

// Main class
public class A15Q2 {
    public static void main(String[] args) {

        Fruit f1 = new Apple("Red", "Sweet");
        Fruit f2 = new Banana("Yellow", "Sweet");
        Fruit f3 = new Orange("Orange", "Citrus");
        Fruit f4 = new Strawberry("Red", "Sweet");

        f1.display();
        System.out.println();

        f2.display();
        System.out.println();

        f3.display();
        System.out.println();

        f4.display();
    }
}
