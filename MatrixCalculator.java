import java.util.Scanner; 
public class MatrixCalculator
{   
  public static void main (String [] args) {
    Scanner sc = new Scanner(System.in);
    int row1=1, row2=2, col1=3, col2=4;
    int f=askF();
    row1=askR1(row1);
    col1=askC1(col1);
    row2=askR2(row2);
    col2=askC2(col2);
    if(f==1 || f ==2){
      while(row1!=row2 || col1!=col2){
        System.out.println("You didn't submit equally sized matrices. Try again"); 
        row1=askR1(row1);
        col1=askC1(col1);
        row2=askR2(row2);
        col2=askC2(col2);
      }
    }
    else{
      while(row1!=col2 || row2!=col1){
        System.out.println("You didn't submit legally sized matrices. Try again."); 
        System.out.println("The first row has to equal the second column and the first column has to equal the second row");
        row1=askR1(row1);
        col1=askC1(col1);
        row2=askR2(row2);
        col2=askC2(col2);
      }
    }
    int [][] x = new int [row1] [col1];
    int [][] y = new int [row2] [col2];
    for (int l = 0; l<x.length; l++){ 
      for (int p= 0; p<x[l].length; p++){   
        System.out.println("Please enter the number in row " + (l+1)+ " column " + (p+1) +" for the first matrix");
         x[l][p] = sc.nextInt();
       }
    }
    for (int l = 0; l<y.length; l++){ 
      for (int p= 0; p<y[l].length; p++){
        System.out.println("Please enter the number in row " + (l+1) + " column " + (p+1) + " for the second matrix");
        y[l][p] = sc.nextInt();
      }
    }
    int[][] arr=new int[0][0];
    if(row1>row2){
      arr=new int[row1][col2];
    }
    else{
      arr=new int[row2][col1];
    }
    calc(f, arr, x, y);
    sc.close();
  }
  public static int askF(){
    Scanner sc = new Scanner(System.in);
    System.out.println ("Enter 1 for addition, 2 for subtraction, or 3 for multiplication");
    int f = sc.nextInt();
    while(f!=1 && f!=2 && f!=3){
      System.out.println ("Enter 1 for addition, 2 for subtraction, or 3 for multiplication");
      f = sc.nextInt();
    }
    sc.close();
    return f;
  }
  public static int askR1(int row1){
    Scanner sc = new Scanner(System.in);
    System.out.println ("Enter the number of rows for the first matrix: ");
    row1= sc.nextInt();
    sc.close();
    return row1;
  }
  public static int askC1(int col1){
    Scanner sc = new Scanner(System.in);
    System.out.println ("Enter the number of columns for the first matrix: ");
    col1= sc.nextInt();
    sc.close();
    return col1;
  }
  public static int askR2(int row2){
    Scanner sc = new Scanner(System.in);
    System.out.println ("Enter the number of rows for the second matrix: ");
    row2= sc.nextInt();
    sc.close();
    return row2;
  }
  public static int askC2(int col2){
    Scanner sc = new Scanner(System.in);
    System.out.println ("Enter the number of columns for the second matrix:  ");
    col2= sc.nextInt();
    sc.close();
    return col2;
  }
  public static void calc(int f,int[][] a,int [][] x,int [][] y){
    if (f ==1) {
       a= add(x,y);
       for (int k = 0; k<a.length; k++) {
         for (int h = 0; h<a[k].length; h++) {
           System.out.print(a[k][h] + " ");
         }
         System.out.println(); 
       }
     }
     else if (f ==2) {
       a= subtract(x,y);
       for (int k = 0; k<a.length; k++) {
         for (int h = 0; h<a[k].length; h++) {
           System.out.print(a[k][h] +" ");
         }
         System.out.println();
       }
     }
     else if (f ==3) {
       a= multiply(x,y);
       for (int k = 0; k<a.length; k++) {
         for (int h = 0; h<a[k].length; h++) {
           System.out.print(a[k][h] + " ");
         }
         System.out.println();
       }
     }
     else{
       
     }
  }
  public static int [][] add( int [][] array1, int [][] array2) {
    int [][] x = new int [array1.length] [array1[0].length];
    for (int k = 0; k<array1.length; k++){
      for (int i = 0; i<array1[k].length; i++) {
      x[k][i]= array1[k][i] + array2[k][i];
      }
    }
    return x;
  }
  public static int [][] subtract( int [][] array1, int [][] array2 ) {
    int[][] x = new int [array1.length] [array1[0].length];
    for (int k = 0; k<array1.length; k++){  
      for (int i = 0; i<array1[k].length; i++) { 
        x[k][i]= array1[k][i] - array2[k][i];
      }
    }
    return x;
  }
  public static int [][] multiply(int[][] array1, int[][] array2 ) {
    int [][] x = new int [array1.length] [array2[0].length];   
    for (int k =0; k<x.length; k++) {
      for (int w=0; w<x[k].length; w++) {
        x[k][w] = 0;
      }
    }
    for (int k = 0; k<x.length; k++){
      for (int i = 0; i<x[0].length; i++){
        for (int d= 0; d<array1[0].length; d++){
          x[k][i]+= array1[k][d] * array2[d][i];
        }
      }
    }
    return x;
  }
}