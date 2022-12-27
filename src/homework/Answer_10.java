package homework;/*Input any alphabet from “A" to “F” and print their city name accordingly (use if else) if
any other alphabet should be invalid entry*/

import java.util.Scanner;

public class Answer_10 {    //Declare Class
    public static void main(String[] args) {     //Declare main method or predefined method

        Scanner sc = new Scanner(System.in);       //Using scanner class
        System.out.println("Enter any Alphabet from : A to F");
        String city = sc.nextLine();


        if(city.equals("A")){           //Using Nested if else statement
            System.out.println("Ahemdabad");
        }else if(city.equals("B")){
            System.out.println("Baroda");
        }else if(city.equalsIgnoreCase("C")){
            System.out.println("Calcutta");
        }else if(city.equals("D")){
            System.out.println("Dehradun");
        }else if(city.endsWith("E")){
            System.out.println("Eugene");
        }else if(city.equals("F")){
            System.out.println("Farmington");
        }else{
            System.out.println("Invalid entry");

        }


    }

}
