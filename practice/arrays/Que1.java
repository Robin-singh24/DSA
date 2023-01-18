package practice.arrays;

import java.util.Arrays;
import java.util.Scanner;

//Build Array from Permutation

public class Que1 {
    
    public static void main(String[] args) {
        try (Scanner in = new Scanner(System.in)) {
            int[] nums = new int[6];
            for (int i = 0; i < nums.length; i++) {
                nums[i] = in.nextInt();
            }
            int[] ann = buildArray(nums);
            System.out.println(Arrays.toString(ann));
        }
    }

    static int[] buildArray(int[] nums) {
        int[] result = new int[nums.length];
        for(int i = 0; i < nums.length; i++) {
            result[i] = nums[nums[i]];
        }
        return result;
    }
}
