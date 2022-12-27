package homework;/*WAP to input employee id, name, basic salary then find HRA, TA, DA, PF and Gross
salary
HRA = basic salary 10%
DA = Basic salary 8%
TA = Basic salary 9%
PF= Basic salary 20%
Gross salary = basic salary + HRA + TA + DA –PF
Print in following format*/

import java.util.Scanner;

public class Salary_Slip {                 //Declare Class

    public static void main(String[] args) {        //Declare main method or predefined method
        Scanner sc = new Scanner(System.in);       //Using scanner
        int empid;
        int basic;
        String empname;
        System.out.println("           Salary Slip          ");
        System.out.println("---------------------------------");
        System.out.println("Enter Employee ID                |");
        int id = sc.nextInt();
        System.out.println("Enter Employee name ");
        String name = sc.next();
        System.out.println("----------------------------------|");
        System.out.println("Enter the Basic Salary");
        basic = sc.nextInt();
        double HRA = basic *10/100;
        double DA = basic*8/100;
        double TA = basic *9/100;
        double PF = basic*20/100;
        double GS = basic+HRA+TA+DA-PF;
        System.out.println("employee name = "+name              );
        System.out.println("hra ="+HRA);
        System.out.println("ta = "+TA);
        System.out.println("da = "+DA);
        System.out.println("pf = "+PF);
        System.out.println("------------------------------------ |");
        System.out.println("Gross Salary = "+GS);
        System.out.println("-------------------------------------|");


    }
}
