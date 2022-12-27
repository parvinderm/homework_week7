package homework;/*Write a program that tells us input value is number or an alphabet or symbol*/

import java.util.Scanner;

public class Answer_14 {    //Declare class

    public static void main(String[] args) {    //Declare main method or predefined method



        char ch = '*';    //Declare input
        if (Character.isAlphabetic(ch)){
            System.out.println(ch + " is a Alphabet.");

        }else if(Character.isDigit(ch)){
            System.out.println(ch+ " is a Digit.");
        }else{
            System.out.println(ch + " is a symbol.");
        }




    }
}
