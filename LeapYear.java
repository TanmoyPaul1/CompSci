import java.util.Scanner;
public class LeapYear{
  public static boolean isLeapLear(int year){
    if (year%4==0 && year%100>0 || year%400==0){
      return true;}
    else{
      return false;}
  }
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter the year ");
    int year= sc.nextInt();
    if (isLeapLear( year))
      System.out.print("The year " + year + " is a leap year");
    else
      System.out.print("The year " + year + " is not a leap year");
  }
}
