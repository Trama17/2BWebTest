import java.util.Scanner;

public class SimonLogic{
  public static void main(String[] args) {
    Scanner key = new Scanner(System.in);
    int level = 20;
    int simonArray[] = new int[level];
    int userArray[] = new int[level];
    int l = 0;
    boolean play = true;
    boolean win = false;
    
    //populating the simonArray
    for(int i = 0; i < level; i++) {
      simonArray[i] = (int) (Math.random() * 4+1);
      System.out.print(simonArray[i] + " ");
    } //end for
    
    simonLogic:
    do {
      //userArray reset
      for(int n = 0; n < l; n++) {
        userArray[n] = 0;
        System.out.print(simonArray[n] + " ");
      } //end for
      
      //prints new number for the sequence
      System.out.println(simonArray[l]);
      
      
      //prints out the next sequence
      //checks for incorrect numbers
      for(int n = 0; n <= l; n++) {
        System.out.println("SA-level " + (n + 1));
        userArray[n] = key.nextInt();
        
        if(userArray[n] != simonArray[n]) {
          play = false;
          break simonLogic;
        } //end if
      } //end for
      
      //increments "level of play"
      l++;
      
      //end-game
      if(userArray[level-1] == simonArray[level-1]) {
        win = true;
        play = false;
      } //end if
    } while(play == true); //end do-while
    
    if(win == false) {
      System.out.println("You only passed " + l + " levels");
      System.out.println("GAME OVER");
      
      //trouble shooting for array comparison and/or cool endgame info
      for(int i = 0; i <= l; i++) {
        System.out.print(simonArray[i] + " ");
      } //end for
      
      System.out.println();
      
      for(int i = 0; i <= l; i++) {
        System.out.print(userArray[i] + " ");
      } //end for
    } else {
        System.out.println("Hurray you passed all " + level + " levels");
        System.out.println("GAME OVER");
    } //end if-else
    key.close();
    
  } //end main
} //end class
