package Array_case;

import java.util.Arrays;

public class Predictout {
    public static void main(String[] args) {
        int [] data = {1,2,3,4,5};
        int [] original = data.clone();

        for (int i = 0; i< data.length;i++) {
            data[i] = original [i] + original[data.length-1-i];

        }
        System.out.print(Arrays.toString (data));
    }
    
}
