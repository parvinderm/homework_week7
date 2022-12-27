package homework;/*Write a Java program to sort a numeric array and a string array.*/

import java.util.Arrays;

public class Answer_19 {
    public static void main(String[] args) {
        int [] array1 = {23,45,46,76,65,48,87,35,27};
        String [] array2 = {"Apples","Oranges","Kiwi","Plum","Grapes"};

        System.out.println("Original numeric arary :"+ Arrays.toString(array1));
        Arrays.sort(array1);
        System.out.println("Sorted numeric array :"+Arrays.toString(array1));
        System.out.println("Origginal String array :"+Arrays.toString(array2));
        Arrays.sort(array2);
        System.out.println("Sorted String array :"+Arrays.toString(array2));

    }
}
