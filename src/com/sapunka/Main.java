package com.sapunka;
//Program Passing Array Argument
public class Main {
    public static class TestPassArrayArgument {
        public static void main(String[] args) {
            int[] a = {1, 2};

//  Swap elements using the swap method
            System.out.println("SWAP OPERATION ACTIVATED");
            System.out.println("Before invoking swap");
            System.out.println("The array is {" + a[0] + ", " + a[1] + "}");
            swap();
            System.out.println("After invoking swap");
            System.out.println("The array is {" + a[0] + ", " + a[1] + "}");

//  Swap element using the  method
            System.out.println("Before invoking swapFirstTwoArray");
            System.out.println("The array is {" + a[0] + ", " + a[1] + "}");
            System.out.println("After invoking swapFirstTwoArray");
            System.out.println("The array is {" + a[0] + ", " + a[1] + "}");
            System.out.println("End of swap:.................");
        }
//         swap two variable
        public static void swap()
        {

        }
    }
}
