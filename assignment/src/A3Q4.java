
public class A3Q4 {
        public static void main(String[] args) {

            int a = 2, b = 6, c = 1;   // Change values as per Table-1

            if (a == 0) {
                System.out.println("Not a quadratic equation");
            } else {
                int d = (b * b) - (4 * a * c);
                System.out.println("Discriminant (d) = " + d);

                if (d < 0) {
                    System.out.println("Root is imaginary.");
                }
                else if (d == 0) {
                    System.out.println("Roots are equal so only one root.");
                }
                else {
                    int sqrt = (int)Math.sqrt(d);

                    if (sqrt * sqrt == d) {
                        System.out.println("Roots are rational and squared.");
                    } else {
                        System.out.println("Roots are rational but not squared.");
                    }
                }
            }
        }


}
