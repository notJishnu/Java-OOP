import java.util.Scanner;

class A5Q2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Define v and n
        System.out.print("Enter the value of v: ");
        int v = sc.nextInt();

        System.out.print("Enter the shifting value n: ");
        int n = sc.nextInt();

        // Left shift
        int leftShift = v << n;

        // Right shift (signed)
        int rightShift = v >> n;

        // Right shift (unsigned)
        int unsignedRightShift = v >>> n;

        // Print results
        System.out.println("Original value (v): " + v);
        System.out.println("Left shift (v << n): " + leftShift);
        System.out.println("Right shift (v >> n): " + rightShift);
        System.out.println("Unsigned right shift (v >>> n): " + unsignedRightShift);
    }
}

