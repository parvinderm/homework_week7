package homework;/*Write a java program to print the numbers between 1 to 100 which can be divided by 3
and 5 separately*/

public class Answer_13 {   //Declare Class


    public static void main(String[] args) {     //Declare main method or predefined method

        System.out.println("\nDivided by 3:");
        for (int i = 1; i < 100; i++) {      //Using for loop to print the numbers divided by 3
            if (i % 3 == 0)
                System.out.println(i + ", ");
        }
        System.out.println("\n\nDivided by 5: ");
        for (int i = 1; i < 100; i++) {        //Using for loop to print the numbers divided by 5
            if (i % 5 == 0)
                System.out.println(i + ", ");
        }
    }
}

