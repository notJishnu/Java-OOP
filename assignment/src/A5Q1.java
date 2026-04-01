import java.util.Scanner;
public class A5Q1 {
    public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);

            System.out.print("Enter first number: ");
            int a = sc.nextInt();

            System.out.print("Enter second number: ");
            int b = sc.nextInt();

            int greater = (a > b) ? a : b;
            int smaller = (a < b) ? a : b;

            System.out.println("Greater number: " + greater);
            System.out.println("Smaller number: " + smaller);
        }
    }


