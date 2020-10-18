import java.util.Arrays; 
import java.util.Random;
import java.util.Scanner;
public class BinarySearch{
  public static void main(String[] args){
    Random r = new Random();
    Scanner sc= new Scanner(System.in);
    int[] array= new int[100];
    array[0]=r.nextInt(199)+1;
    for(int i=1; i<100; i++){ 
      array[i]=r.nextInt(199)+1;
      Arrays.sort(array);
      if(array[i]==array[i-1])
        array[i]=r.nextInt(199)+1;
    }
    System.out.println("Enter a number between 1 and 200 that you would like to search: ");
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
  public static int check(int[] array, int mid, int num, int count){
    if(array[mid]==num)
      return count+1;
    else if(array[mid]<num)
      return check(array, ((mid+1)/2), num, (count+1));
    else if(array[mid]>num)
      return check(array, ((mid+(array.length-1))/2), num, (count+1));
    else
      return -1;
  }
}