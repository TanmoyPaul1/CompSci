import java.util.Scanner;
public class Quadratic
{
  public static void main(String[] args)
  {
    Scanner sc= new Scanner(System.in);
    System.out.println("Enter the value of a:");
    double a= sc.nextDouble();
    System.out.println("Enter the value of b:");
    double b= sc.nextDouble();
    System.out.println("Enter the value of c:");
    double c= sc.nextDouble();
    double h= b*b-4*a*c;
    double s= Math.sqrt(h);
    double x1= (-b+s)/2*a;
    double x2= (-b-s)/2*a;
    System.out.println("The first root is " + x1 + " and the second root is " + x2);
    sc.close();
  }
}
