package ARRAYS;

import java.util.Arrays;
//import java.util.Scanner;

//taking input and printing arrays
public class arrayss {
    public static void main(String[] args) {

        //Scanner in = new Scanner(System.in);

        //array of primitives

        //int[] arr = new int[5];
        //taking input :-
        //for (int i = 0; i < arr.length; i++) {
        //    arr[i] = in.nextInt();
        //}

        //for loop to print array :-
        // for (int i = 0; i < arr.length; i++) {
        //     System.out.print(arr[i]+ " ");
        // }
        
        //for-each loop :-
        // for(int j : arr){
        //     System.out.print(j + " ");
        // }

        //Using arrays.tostring method
        //System.out.println(Arrays.toString(arr)); 


        //array of objects

        //String[] name = new String[4];
        //taking input
        // for (int i = 0; i < name.length; i++) {
        //     name[i] = in.nextLine();
        // }

        //printing using for loop
        // for (String j : name) {
        //     System.out.print(j + " ");
        // }

        //printong using toString method
       
       
        //modify an array
        String[] name = {"robin","ksi","harry","simon"};
        System.out.println(Arrays.toString(name));
        name[0] = "vikstar";
        System.out.println(Arrays.toString(name));
    }

}
