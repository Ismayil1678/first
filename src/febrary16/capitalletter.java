package febrary16;

import java.util.Scanner;
public class capitalletter {
    public static void main(String[] args) {
       /* char letter = 'z';
        System.out.println(letter < 90);*/
       String sentence="bootcamp atttendees rocks";
       char letter;
       for(int i=0;i<sentence.length();i++){
           letter=sentence.charAt(i);
           if(letter>=65 && letter<=90){

               System.out.println(sentence.charAt(i));
           }
       }
    }
}
