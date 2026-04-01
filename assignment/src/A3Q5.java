import java.util.Scanner;

public class A3Q5 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first side: ");
        int a = sc.nextInt();

        System.out.print("Enter second side: ");
        int b = sc.nextInt();

        System.out.print("Enter third side: ");
        int c = sc.nextInt();

        if (a + b > c && a + c > b && b + c > a) {

            if (a == b && b == c) {
                System.out.println("Triangle is Equilateral");
            }
            else if (a == b || b == c || a == c) {
                System.out.println("Triangle is Isosceles");
            }
            else {
                System.out.println("Triangle is Scalene");
            }

            if ((a * a == b * b + c * c) ||
                    (b * b == a * a + c * c) ||
                    (c * c == a * a + b * b)) {
                System.out.println("It is also a Right-angled Triangle");
            }

        } else {
            System.out.println("Triangle is not possible");
        }

        sc.close();
    }
}

