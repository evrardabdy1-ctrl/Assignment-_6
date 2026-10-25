package Array_case;

import java.util.Arrays;


public class Reverse {
    public static void main(String[] args) {
        int [] numbers = {2,4,6,8,10,12};

        int left =0;
        int right = numbers.length-1;

        while (left < right) {
            int temp = numbers[left];
            numbers[left]=numbers[right];
            numbers[right] = temp;

            left++;
            right--;
            
            
        }
System.out.println(Arrays.toString(numbers));


    }
    
}
