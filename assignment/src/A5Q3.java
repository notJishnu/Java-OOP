public class A5Q3 {
    public static void main(String[] args) {

        int a = 10;
        int b = 20;

        System.out.println("Before swapping:");
        System.out.println("a = " + a + ", b = " + b);

        // Swapping using XOR (^)
        a = a ^ b;
        b = a ^ b;
        a = a ^ b;

        System.out.println("\nAfter swapping using XOR:");
        System.out.println("a = " + a + ", b = " + b);

        // Restoring original values using + and -
        a = a + b;
        b = a - b;
        a = a - b;

        System.out.println("\nAfter restoring using + and -:");
        System.out.println("a = " + a + ", b = " + b);
    }
}
