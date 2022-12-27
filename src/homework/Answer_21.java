package homework;/*Write a Java program to calculate the average value of array elements.*/

public class Answer_21 {       //Declare Class
    public static void main(String[] args) {     //Declare main method or user defined method

        int[] array = new int[]{15, 25, 30, 40, -18, 55, 84};  //Create an array

        int length = array.length;     //Getting array length

        int sum = 0;      //Default sum value
        for(int i = 0; i < array.length ; i++) {   //Sum of all values in array using for loop
            sum +=  array[i];}

        double average = sum / array.length;          //Calculate average value
        System.out.println("Average value of array elements :" + average);


    }
}
