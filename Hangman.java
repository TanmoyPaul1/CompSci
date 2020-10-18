import java.util.Scanner; 
public class Hangman{
  public static String word(){
    String w3= "pig";
    String w4= "toad";
    String w5= "sheep";
    String w6= "rabbit";
    String w7= "octopus";
    String[] words={w3,w4,w5,w6,w7};
    int n=(int)(Math.random()*5);
    return words[n];
  }
  public static Boolean checkWin(String a){
    for(int i=0; i<a.length(); i++){
      if(a.charAt(i)=='_'){
        return false;
      }
    }
    return true;
  }
  public static int playGame(String word,String ans, int tries){
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter a letter");
    char input=sc.next().charAt(0);
    String ans1=ans;
    for(int i=0; i<word.length(); i++){
      if(word.charAt(i)==input){
        ans=ans.substring(0,i)+input+ans.substring(i+1);
      }
    }
    if(ans==ans1){
      System.out.println("The letter is not in the word");
      tries--;
      System.out.println("You have "+tries+" tries left");
    }
    sc.close();
    return tries;
  }
  public static void giveHint(String ans){
    switch (ans.length()){
      case 3: System.out.println("Hint: ___, egg, and cheese"); break;
      case 4: System.out.println("Hint: Princesses shouldn't kiss ____"); break;
      case 5: System.out.println("Hint: He cried WOLF"); break;
      case 6: System.out.println("Hint: Carrots"); break;
      case 7: System.out.println("Hint: So squishy and delicious"); break;
      default: break;
    }
  }
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    String word= word();
    String ans= "";
    int tries=6;
    for(int i=0; i<word.length(); i++){
      ans+="_";
    }
    System.out.println(ans);
    tries=playGame(word,ans,tries);
    while(checkWin(ans)==false && tries>0){
      giveHint(ans);
      tries=playGame(word,ans,tries);
      System.out.println(ans);
    }
    if(tries==0){
      System.out.println("YOU LOSE!!");
    }
    if(checkWin(ans)==true){
      System.out.println("YOU WIN!!");
    }
    sc.close();
  }
}