import java.util.Scanner;
import java.util.ArrayList;
public class PascalTriangle{
  public static void pascal(int n, ArrayList<Integer> p, ArrayList<Integer> q){
    int x=0;
    for(int i=1; i<p.size()+1; i++){
      x=p.get(i)+p.get(i-1);
      p.add(i,x);
    }
    System.out.println(p);
    int b=p.size();
    if(b!=n){
      pascal(n,p,q);
    }
  }
  public static void main(String[] args){
    Scanner sc= new Scanner(System.in);
    System.out.println("Enter the number of lines");
    int n=sc.nextInt();
    while(n<1){
      System.out.println("Enter the number of lines");
      n=sc.nextInt();
    }
    ArrayList<Integer> p = new ArrayList<Integer>();
    ArrayList<Integer> q = new ArrayList<Integer>();
    p.add(1); p.add(1);
    pascal(n,p,q);
    sc.close();
  }
}
    