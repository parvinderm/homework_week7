package homework;

public class Answer_20 {    //Declare class
    public static void main(String[] args) {         //Declare main method or predefined method
        int array[] ={20,10,15,26,34,28,34,18,17,26};
        int sum = 0;

        for (int i : array)
            sum +=i;
        System.out.println("Sum values of an array " +sum);
    }
}
