class A2Q1{
    public static void main(String[] args){
        double f,c,fer;
        f=Double.parseDouble(args[0]);
        c=(5.0/9.0)*(f-32);
        fer=(c*9.0/5.0)+32;
        System.out.println("Celsius:" + c);
        System.out.println("Fahrenheit:" +fer);
    }
}