package homework;/*Write a java program input sales id, seller's name, sales amount, and salary basic and
then fined this sales
Commission
Sales amount >= 50,000 35%
Sales amount >= 30,000 20%
>= 20,000 10%
>= 10,000 5%
< 10,000 2%*/

import java.util.Scanner;

public class Answer_9 {    //Declare Class

    public static void main(String[] args) {    //Declare main method or predefined method
        double commission =0.0;
        double  sales = 0;
        int rate=0;
        Scanner sc = new Scanner(System.in);     //Using scanner class

        System.out.println("Input sales id");
        int id = sc.nextInt();
        System.out.println("Enter seller's name");
        String name = sc.next();
        System.out.println("Enter sales amount");
        int b = sc.nextInt();
        System.out.println("Enter basic salary");
        int c = sc.nextInt();
        System.out.println("Enter Sales Commission ");
        double d = sc.nextDouble();

        if(sales>=50000){          //Using if else statement
            rate = 35;
            commission = sales*0.35;

        } else if (sales>=30000) {
            rate = 20;
            commission=sales*0.20;

        }  if (sales>=20000) {
            rate = 10;
            commission=sales*0.10;

        }  if (sales>=10000) {
            rate = 5;
            commission = sales*0.5;

        } if(sales<10000){
            rate = 2;
            commission=sales*0.2;
        }else{
            System.out.println("invalid");
        }
        System.out.println("Commission amount ="+commission);
        System.out.println("Commission rate: "+rate+"%");


    }

}
