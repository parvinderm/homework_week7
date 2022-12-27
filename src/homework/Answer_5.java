package homework;/*Write a java program to input student Name, roll No, and three subjects Math, Science and
English marks (marks is between 0 to 100 and if it is out of range print error message “Invalid
Input, Marks should between 0 to 100”) and find out total, percentage and result.
If he is pass or fail on basis of percentage (pass>=35) and also give them grade if %> = 80 A+,
%> = 60 A, %> = 50 B, %> = 35 C And print Mark Sheet in following format*/

import java.util.Scanner;

public class Answer_5 {     //Declare class

    public static void main(String[] args) {     //Declare main method or predefined method

        Scanner sc = new Scanner(System.in);      //Declare scanner class
        System.out.println("             MarkSheet");
        int math,Science,English;
        System.out.println(" Student Name:");
        String name = sc.next();
        System.out.println("Roll No:");
        int no = sc.nextInt();
        System.out.println("Subjects      :    Marks");
        System.out.println("Enter marks in Math ");
        int Math = sc.nextInt();
        System.out.println("Enter marks in Science");
        int Sci = sc.nextInt();
        System.out.println("Enter marks in English");
        int Eng = sc.nextInt();


        float sum = Math+Sci+Eng;
        System.out.println(" Total marks  "+sum);
        int total = 300;

        float per = sum/total*100;
        System.out.println("Percentage"+per);

        if (per>=35){                     //Using if else method
            System.out.println("Result Pass");
        }

        if(per>=80){
            System.out.println("Grade A+");
        } else if (per>=60)
        {
            System.out.println("Grade A");

        } else if (per>=50) {
            System.out.println("Grade B");

        } else if (per>=35) {
            System.out.println("Grade C");

        }
        else {
            System.out.println("Fail");
        }


    }
}
