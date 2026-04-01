import java.util.Scanner;
public class A2Q3 {
    public static void main(String[] args) {
        double cuboid, l, h, w;
        double cylinder, r;
        double time, remain;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter length:");
        l=sc.nextDouble();
        System.out.println("Enter height:");
        h=sc.nextDouble();
        System.out.println("Enter width:");
        w=sc.nextDouble();
        cuboid=l*h*w;
        System.out.println("The volume of cuboid:" +cuboid);
        System.out.println("Enter radius:");
        r=sc.nextDouble();
        cylinder=3.14*r*r*h;
        System.out.println("The volume of cylinder is:" +cylinder);
        time=cylinder/cuboid;
        remain=cylinder%cuboid;
        System.out.println("The no of times we can take water from cylinder:" +time);
        System.out.println("The remaining water in cylinder:" +remain);
    }
}