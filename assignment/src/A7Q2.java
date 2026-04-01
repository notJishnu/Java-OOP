import java.util.Scanner;
class A7Q2{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int i,n,x;
        double sum=0.0;
        System.out.print("Enter n:");
        n=sc.nextInt();
        System.out.print("Enter x:");
        x=sc.nextInt();
        System.out.print("Series:");
        for(i=1;i<=n;i++){
            System.out.print("1/" + x +"^" +i+" + ");
        }
        for(i=1;i<=n;i++){
            sum=sum+(1.0/Math.pow(x,i));
        }
        System.out.println(" ");
        System.out.println("sum:" + sum);
    }
}
