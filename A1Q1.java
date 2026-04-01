class A1Q1{
public static void main(String args[]){
double salary=12000;
double hra=0.15*12000;
double da=1.1*12000;
double pf=0.12*12000;
double gross=salary+hra+da;
double net=salary-pf;
System.out.println("Gross salary:" + gross);
System.out.println("Net salary:" + net);
}
}