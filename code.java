import java.util.*;
class Employee 
{
  private String firstName;
  private String lastName;
  private double salary;

  public Employee(String fName, String lName, double sal) 
  {
    //write your code here
    firstName=fName;
    lastName=lName;
    salary=sal+(sal*0.1);
    
  }
  public void printDetails()
  {
    System.out.printf("%s %s %.0f\n",firstName,lastName,salary);
  }
  public static void main (String args[])
  {
    Scanner sc = new Scanner(System.in); 
    String fname = sc.nextLine(); 
    String lname = sc.nextLine(); 
    String lname2 = sc.nextLine(); 
    String fname1 = sc.nextLine(); 
    String lname1 = sc.nextLine(); 
    String lname3 = sc.nextLine(); 
    double r1=Double.parseDouble(lname2);
    double r2=Double.parseDouble(lname3);

    Employee employee1=new Employee (fname,lname,r1);
    Employee employee2=new Employee (fname1,lname1, r2);
	employee1.printDetails();
    employee2.printDetails();
  }
}