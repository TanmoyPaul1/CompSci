import java.util.Random;
import java.util.Scanner;
public class LinearSearch{
  public static void main(String[] args){
    Random r = new Random();
    Scanner sc= new Scanner(System.in);
    int[] array= new int[100];
    for(int i=0; i<100; i++){
      int n = r.nextInt(199)+1;
      array[i]=n;
      for(int j=0; j<i; j++){
        if(array[i]==array[j])
          array[i]=r.nextInt(199)+1;
      }
    }
    System.out.println("Enter a number you would like to search: ");
    int num=sc.nextInt();
    while(num<1 || num>200)
      num=sc.nextInt();
    System.out.println("The user enters "+num);
    int x=-1;
    for(int k=0; k<array.length; k++){
      if(array[k]==num){
        System.out.println("Number of comparisons: "+k+" times");
        x=1;
        break;
      }
    }
    if(x==-1)
      System.out.println("Your number was not found");
  }
}