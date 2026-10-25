package Array_case;

import java.util.Scanner;

public class productserch {
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        int[] codes = {101, 105, 110, 115, 120,125};

        System.out.print("Enter the product code : ");
        int target = input.nextInt();

        int index = -1;
        int checked =0;
        for (int i = 0; i < codes.length; i++) {checked++;

            if ( codes [i]==target) {
                index = i;
                break;
            }
        }
        if (index!=-1) {
            System.out.println("Find at index :"+ index);
        }else{
            System.out.println("Product unavailable");
        }

        System.out.println(" Elements checked:"+ checked);
        input.close();
        
                
            }
            
        }
            
        

        
            
        
    

