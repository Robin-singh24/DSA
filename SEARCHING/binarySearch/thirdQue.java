package SEARCHING.binarySearch;
//smallest character in an array
//https://leetcode.com/problems/find-smallest-letter-greater-than-target/

public class thirdQue {
    public static void main(String[] args) {
        char[] arr = {'c','d','f','j'};
        char target = 'j';
        char ans = smalletLetter(arr, target);
        System.out.println(ans);
    }
    static char smalletLetter(char[] letter,char target){
        
        int start = 0;
        int end = letter.length - 1;

        while (start <= end) {
            int mid = start + (end - start) / 2; // middle element
            if (target < letter[mid]) {
                end = mid - 1;
            } else  {
                start = mid + 1;
            }
        }
        return letter[start % letter.length];
    }
    
}
