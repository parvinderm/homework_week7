package homework;/*Write a java program to input any number and find out if it’s odd or even*/

import java.util.Scanner;

public class Answer_7 {   //Declare Class

    public static void main(String[] args) {    //Declare Main Method or predefined method

        Scanner sc = new Scanner(System.in);  //Declare scanner class
        System.out.println("Enter a number :");
        int number = sc.nextInt();

        String evenOdd  = (number % 2 == 0) ? "even": "Odd";
        System.out.println(number +  " is " +evenOdd);

    }
}
