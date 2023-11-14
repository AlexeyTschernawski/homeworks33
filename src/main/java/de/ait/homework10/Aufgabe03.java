package de.ait.homework10;

public class Aufgabe03 {
    public static void main(String[] args) {
        /**
         Write a program that determines
         * whether the array is strictly increasing.
         */
        int[] numbers = new int[]{1, 2, 3, 4, 5, 6};
        //int[] numbers = new int[]{3,2,1};
        boolean result = false;  // Initialize the result as true
        for (int i = 0; i < numbers.length - 1; i++) {
            if (numbers[i] >= numbers[i + 1]) {
                // If the condition is met, continue with the loop
            } else {
                result = true;  // If any condition is not met, set result to false
                break;  // Exit the loop since the condition is not met
            }
        }
        if (result) {
            System.out.println(result);
        } else {
            System.out.println(result);
        }

    //#2
    int[] aray= new int[]{1, 2, 3, 4 ,5};
    int length=aray.length;
    boolean resultCheck=true;
        for(int i=1;i<=length-1;i++)
    {
        if((aray[i]-aray[i-1])<0)
        {
            resultCheck = false;
            break;
        }
    }
        System.out.println(resultCheck);
}
}
