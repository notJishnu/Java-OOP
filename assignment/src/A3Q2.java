import java.util.Scanner;
public class A3Q2 {
    public static void main(String[] args){
        double hra,da,salary,gross;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the salary:");
        salary=sc.nextInt();
        if(salary<12000){
            hra=0.20*salary;
            da=1.15*salary;
        }else{
            hra=0.15*salary+salary;
            da=0.9*salary+salary;

        }
        gross=salary+hra+da;
        System.out.println("The basic salary:" +salary);
        System.out.println("The gross salary:" + gross);
    }
}
