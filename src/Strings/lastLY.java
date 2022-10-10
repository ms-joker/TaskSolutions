package Strings;

import java.util.Scanner;

public class lastLY {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("enter word");
        String word = input.next();
        int length = word.length() - 2;
        String last2 = word.substring(length);
        if (last2.equals("ly")){
            System.out.println("really???");
        }else {
            System.out.println("never mind");
        }
    }
}
/*
 2. ask the user to enter a word. if the word ends with "ly", print "really???" ,  otherwise, print "never mind"
 */