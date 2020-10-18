import java.util.Scanner;
import java.util.ArrayList;

public class Polynomial{
  public static ArrayList Add(int num, ArrayList<Integer> list1, ArrayList<Integer> list2){
    ArrayList<Integer> list = new ArrayList<Integer>(); 
    for (int i = 0; i < num; i++){ 
      list.add(list1.get(i)+list2.get(i));
    }
    return list;
  }
  public static void Print(int num, ArrayList<Integer> list, int finNum){
    for (int i = 0; i < num; i++){ 
      System.out.print(list.get(i) + "x" + "^" + (num-i));
      if(i != (num-1));
      System.out.print("+");
    }
    System.out.println(finNum);
  }
  public static void main(String[] args){
    Scanner scan = new Scanner(System.in);
    ArrayList<Integer> list = new ArrayList<Integer>(); 
    
    System.out.println("Enter highest variable degree: "); 
    int num = scan.nextInt(); 
    System.out.println("Enter coefficients from highest to lowest variable degree: "); 
    for (int i = 0; i < num; i++){ 
      list.add(scan.nextInt());
    }
    System.out.println("Enter the ending number: ");
    int fin= scan.nextInt();
    
    System.out.println("Do you want to add a polynomial to the first one?(true/false)");
    boolean a = scan.nextBoolean(); 
    if (a == true){
      ArrayList<Integer> list2 = new ArrayList<Integer>(); 
      System.out.println("Enter coefficients from highest to lowest variable degree: "); 
      for (int i = 0; i < num; i++){ 
        list2.add(scan.nextInt());
      }
      System.out.println("Enter the ending number: ");
      int fin2= scan.nextInt();
      ArrayList<Integer> list3 = new ArrayList<Integer>(); 
      list3 = Add(num, list, list2);
      int fin3= fin + fin2;
      Print(num, list3, fin3);
    }
    if (a == false){
      Print(num, list, fin);
    }
    scan.close();
  }
}