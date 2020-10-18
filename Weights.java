import java.util.ArrayList;
import java.util.Scanner;
public class Weights{
  public static ArrayList<Double> getWeightChanges(ArrayList<Double> a){
    ArrayList<Double> b=new ArrayList<Double>();
    for(int i=0; i<a.size()-1; i++){
      b.add(a.get(i+1)-a.get(i));
    }
    return b;
  }
  public static ArrayList<Double> getWeights(ArrayList<Double> a, double n){
    ArrayList<Double> c=new ArrayList<Double>();
    c.add(n);
    for(double x: a){
      n+=x;
      c.add(n);
    }
    return c;
  }
  public static ArrayList<Double> getWeightRuns(ArrayList<Double> a){
    ArrayList<Double> d=new ArrayList<Double>();
    int t=0;
    for(int i=0; i<a.size()-1; i++){
      if(t==a.size()-1){
        return d;
      }
      for(int j=t; j<a.size()-1; j++){
        if(a.get(j+1)-a.get(j)<0){
          d.add(a.get(j)-a.get(t));
          t=j+1;
          break;
        }
      }
      for(int k=t; k<a.size()-1; k++){
        if(a.get(k+1)-a.get(k)>0){
          d.add(a.get(k)-a.get(t));
          t=k+1;
          break;
        }
      }
    }
    return d;
  }
  public static void main(String[] args){
    Scanner sc= new Scanner(System.in);
    ArrayList<Double> weights=new ArrayList<Double>();
    System.out.println("How many weights are there?");
    int w= sc.nextInt();
    System.out.println("Enter the weights");
    for(int i=0; i<w; i++){
      double n=sc.nextDouble();
      weights.add(n);
    }
    ArrayList<Double> b= getWeightChanges(weights);
    System.out.println("How many weight changes are there?");
    int ch= sc.nextInt();
    ArrayList<Double> changes=new ArrayList<Double>();
    System.out.println("Enter the weight changes");
    for(int i=0; i<ch; i++){
      double m=sc.nextDouble();
      changes.add(m);
    }
    System.out.println("Give an initial weight");
    int weight= sc.nextInt();
    ArrayList<Double> c= getWeights(changes, weight);
    ArrayList<Double> d= getWeightRuns(weights);
    System.out.println(b);
    System.out.println(c);
    System.out.println(d);
    sc.close();
  }
}