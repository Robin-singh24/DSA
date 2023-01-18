package ARRAYS;

import java.util.*;

public class Arraylist {
    public static void main(String[] args) {

        try (Scanner in = new Scanner(System.in)) {
            //creating an arraylist
            ArrayList<Integer> list = new ArrayList<>(10);

            //adding values in the array list
            // list.add(1);
            // list.add(2);
            // list.add(4);
            // list.add(5);
            // list.add(7);
            // list.add(54);
            // list.add(454);

            for (int i = 0; i < 5; i++) {
                list.add(in.nextInt());
            }
            
            //printing the array list
      System.out.println(list);
      //OR
            for (int i = 0; i < 5; i++) {
                System.out.println(list.get(i));
            }

      
      //MAKING 2D ARRAY USING ARRAY LIST
      ArrayList<ArrayList<Integer>> num = new ArrayList<>();

      //initialisation
      for(int i = 0; i< 3;i++){
              num.add(new ArrayList<>());
      }

      //adding elements
      for (int i = 0; i < 3; i++) {
                for (int j = 0; j < 3; j++) {
                    num.get(i).add(in.nextInt());
                }
      }
      System.out.println(num);
        }

        /*syntax
        ArrayList<DataType> variable_name = new ArrayList<Datatype(Not Mandatory)>();
        */

    }

}
