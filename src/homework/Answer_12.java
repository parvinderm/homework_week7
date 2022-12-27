package homework;/*Write a java program to input any two number and ask user to enter their symbol (+, -,
/, *) find addition, Subtraction, multiplication and division according to their symbol
(using if else)
*/

import java.util.Scanner;

public class Answer_12 {     //Declare class
    public static void main(String[] args) {    //Declare Main Method or predefined method

        char ch;
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the first number : ");
        int num1 = scan.nextInt();

        System.out.println("Enter the second number :  ");
        int num2 = scan.nextInt();

        System.out.println("Enter the operator( +, -, *, /): ");
        ch = scan.next().charAt(0);
         if (ch=='+'){
             System.out.println("\nAddition of"+num1+"+"+num2+" ="+(num1+num2));
         }
         else if(ch=='-'){
             System.out.println("Subtraction of "+num1+"-"+num2+"="+(num1=num2));
         }
         else if(ch=='*'){
             System.out.println("Multiplication of "+num1+"*"+num2+"="+(num1=num2));
         }
         else if (ch=='/'){
             System.out.println("Division of "+num1+"/"+num2+"="+(num1=num2));
         }
         else{
             System.out.println("Operator is not available");
         }

    }
}
