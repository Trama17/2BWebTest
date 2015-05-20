import java.io.*;
import java.util.Scanner;


public class pygLattinApp{
  public static void main(String args[]) {
    Scanner keyboard = new Scanner(System.in);
    
    String phrase = keyboard.nextLine();
    for (String pygWord : phrase.split(" ")) {
      if(pygWord.charAt(0) == 'q' && pygWord.charAt(1) == 'u') {
        System.out.print(pygWord.substring(2) + "-" + pygWord.charAt(0) + pygWord.charAt(1) + "ay ");
      } else if (pygWord.charAt(0) == 'a' || 
                 pygWord.charAt(0) == 'e' || 
                 pygWord.charAt(0) == 'i' || 
                 pygWord.charAt(0) == 'o' ||
                 pygWord.charAt(0) == 'u') {
        System.out.print(pygWord.substring(0) + "-way ");
      } else if (pygWord.charAt(1) == 'a' || 
                 pygWord.charAt(1) == 'e' || 
                 pygWord.charAt(1) == 'i' || 
                 pygWord.charAt(1) == 'o' ||
                 pygWord.charAt(1) == 'u') {
        System.out.print(pygWord.substring(1) + "-" + pygWord.charAt(0) + "ay ");
      } else if (pygWord.charAt(2) == 'a' || 
                 pygWord.charAt(2) == 'e' || 
                 pygWord.charAt(2) == 'i' || 
                 pygWord.charAt(2) == 'o' ||
                 pygWord.charAt(2) == 'u') {
        System.out.print(pygWord.substring(2) + "-" + pygWord.charAt(0) + pygWord.charAt(1) + "ay ");
      } else {
        System.out.print(pygWord.substring(3) + "-" + pygWord.charAt(0) + pygWord.charAt(1) + pygWord.charAt(2) + "ay ");
      }
    }
  }
}