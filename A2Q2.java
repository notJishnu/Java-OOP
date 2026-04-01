class A2Q2{
    public static void main(String[] args){
        double volume,area,r;
	r=Double.parseDouble(args[0]);
        volume=(4.0/3.0)*3.14*r*r*r;
        area=4*3.14*r*r;
        System.out.println("Volume:" +volume);
        System.out.println("Area:" +area);
    }
}