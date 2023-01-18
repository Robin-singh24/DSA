package practice.arrays;

import java.util.Scanner;

public class add {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = in.nextInt();
        }
        double pos = 0;
        double neg = 0;
        double zeros = 0;


        for(int i =0;i<arr.length;i++){
            if(arr[i]>0){
                pos +=1; 
            }else if(arr[i]<0){
                neg +=1;
            }else{
                zeros +=1;
            }
        }

        double posRatio = pos/n;
        double negRatio = neg/n;
        double zerosRatio = zeros/n;
        System.out.println(posRatio);
        System.out.println(negRatio);
        System.out.println(zerosRatio);
    }
}
