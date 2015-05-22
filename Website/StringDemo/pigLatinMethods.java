import java.io.*;
import java.util.Scanner;

class pigLatin {
  public static void main(String[] args) {
    Scanner keyboard = new Scanner(System.in);
    System.out.print("Enter a word to translate to Pig Latin: ");
    System.out.println(makePig(keyboard.next()));
  }
  
  public static String makePig(String word) {
    int i=1;
    String result;
    String newWord = new String (word);
    if(word.charAt(0) == 'a' || 
       word.charAt(0) == 'e' || 
       word.charAt(0) == 'i' || 
       word.charAt(0) == 'o' ||
       word.charAt(0) == 'u') {
    System.out.print(word + "way ");
    } else if (newWord.charAt(0) == 'q' && newWord.charAt(1) == 'u') {
      System.out.print(newWord.substring(2) + "" + word.charAt(0) + word.charAt(1) + "ay ");
    } else {
      while (word.charAt(0) != 'a' &&
             word.charAt(0) != 'e' &&
             word.charAt(0) != 'i' &&
             word.charAt(0) != 'o' &&
             word.charAt(0) != 'u' &&
             i < 1000) {
        i++;
        if(i==1000) {
          System.out.print(newWord + "ay ");
        } else {
          word = (word.substring(1) + word.substring(0,1));
        }
      }
        if(i<1000) {
          System.out.print(word + "ay ");
        }
      } i = 1;
    result = "";
    return result;
  }
}


/*
import java.io.*;
import java.util.Scanner;

class pigLatin {
  public static void main(String[] args) {
    Scanner keyboard = new Scanner(System.in);
    System.out.print("Enter a word to translate to Pig Latin: ");
    System.out.println(makePig(keyboard.next()));
  }
  
  public static String makePig(String word) {
    String pygWord, result;
    pygWord = word.substring(0,1);
    if(pygWord.charAt(0) == 'a' || 
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
      
    
    result = word.substring(1) + pygWord + "ay";
    return result;
  }
}
*/




/*
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
*/