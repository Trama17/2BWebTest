import java.util.*;
import java.io.*;

public class guessingWhat {
  public static void main (String[] args) {
    String secretPhrase = "chicken butt";
    String secondPhrase = "what";
    Scanner key = new Scanner(System.in);
    System.out.println("Hey! Guess what!!!");
    String guess = key.nextLine();
    boolean result;
    do {
      if(result = guess.contentEquals(secretPhrase)) {
        System.out.println("Yay haha you got it!!!");
      } else if(result = guess.contentEquals(secondPhrase)) {
        System.out.println("CHICKEN BUTT!!!");
      } else {
        System.out.println("No! You have to guess what!");
        guess = key.nextLine();
      }
    } while(result =! guess.contentEquals(secretPhrase) && guess.contentEquals(secondPhrase));
  }
}