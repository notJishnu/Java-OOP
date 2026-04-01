import java.util.Scanner;
public class A3Q1 {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int num;
        System.out.println("Enter the number:");
        num=sc.nextInt();
        if(num%2==0){
            System.out.println("even");
        }else{
            System.out.println("odd");
        }
    }
}
