package homework;/*Write a java program that tells us that Input number is odd or even?
HINT: use ternary operator (? :)*/

import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

import java.util.Scanner;

public class Practice_1 {     //Declare Class

    public static void main(String[] args) {       //Declare main method or Predefined method
        Scanner rt = new Scanner(System.in);
        System.out.println("Enter a number:");
        int num = rt.nextInt();

        String evenOdd = (num % 4 == 0)  ? "even": "odd ";
        System.out.println(num + " is "+ evenOdd);




    }

}
