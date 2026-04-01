import java.util.Scanner;
public class A2Q4 {
    public static void main(String[] args){
        double x1,x2,y1,y2,slope;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter x1:");
        x1=sc.nextDouble();
        System.out.println("Enter y1:");
        y1=sc.nextDouble();
        System.out.println("Enter x2:");
        x2=sc.nextDouble();
        System.out.println("Enter y2:");
        y2=sc.nextDouble();
        slope=(y2-y1)/(x2-x1);
        System.out.println("The slope of the line is:"+slope);
    }
}
