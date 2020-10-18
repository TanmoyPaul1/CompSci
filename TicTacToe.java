import java.util.Scanner;
public class TicTacToe{
  char[][] array = new char[3][3];
  Scanner sc= new Scanner();
  public void board(){
    System.out.println("-------");
    System.out.println("| "+ array[0][0]+ " | "+ array[0][1]+" | "+ array[0][2]+" |");
    System.out.println("-------");
    System.out.println("| "+ array[1][0]+ " | "+ array[1][1]+" | "+ array[1][2]+" |");
    System.out.println("-------");
    System.out.println("| "+ array[2][0]+ " | "+ array[2][1]+" | "+ array[2][2]+" |");
    System.out.println("-------");
  }
  public static void ask(){
    System.out.println("Enter the X and Y coordinates for your move: ");
    int a= sc.nextInt();
    int b= sc.nextInt();
  }
  public static void check(int a,int b){
    if(array[x][y]!='X' && array[x][y]!='O'){
      array[a][b]='X';
    }
    else{
      ask();
    }
    if((array[0][0] == 'X' && array[0][1] == 'X' && array[0][2] == 'X') ||
      (array[1][0] == 'X' && array[1][1] == 'X' && array[1][2] == 'X') ||
      (array[2][0] == 'X' && array[2][1] == 'X' && array[2][2] == 'X') ||
      (array[0][0] == 'X' && array[1][0] == 'X' && array[2][0] == 'X') ||
      (array[7][] == 'X' && array[4][] == 'X' && array[1][] == 'X') ||
      (array[8][] == 'X' && array[5][] == 'X' && array[2][] == 'X') ||
      (array[0][] == 'X' && array[4][] == 'X' && array[8][] == 'X') ||
      (array[2][] == 'X' && array[4][] == 'X' && array[6][] == 'X')){
     return 10;
   }
   if((array[6][] == 'O' && array[7][] == 'O' && array[8][] == 'O') ||
      (array[3][] == 'O' && array[4][] == 'O' && array[5][] == 'O') ||
      (array[0][] == 'O' && array[1][] == 'O' && array[2][] == 'O') ||
      (array[6][] == 'O' && array[3][] == 'O' && array[0][] == 'O') ||
      (array[7][] == 'O' && array[4][] == 'O' && array[1][] == 'O') ||
      (array[8][] == 'O' && array[5][] == 'O' && array[2][] == 'O') ||
      (array[0][] == 'O' && array[4][] == 'O' && array[8][] == 'O') ||
      (array[2][] == 'O' && array[4][] == 'O' && array[6][] == 'O')){
     return -10;
   }
   return 0;
  }
  public static void values(int a,int b){
    for(int x=0; x<3;x++){
      for(int y=0; y<3;y++){
        if(array[x][y]!='X' && array[x][y]!='O'){
          array[a][b]=O;
          
}