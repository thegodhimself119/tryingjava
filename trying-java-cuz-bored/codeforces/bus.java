package codeforces;
import java.util.Arrays;
import java.util.Scanner;

public class bus {

     public static void main(String[] args) {
         Scanner input = new Scanner(System.in);
         System.out.println("enter how many test values you have");
         int numbers = input.nextInt();
        int[] vals = new int[numbers];
        System.out.println("now enter");
        for(int i =0;i<vals.length;i++){
            int val = input.nextInt();
            System.out.println(i);

            vals[i] = val;

        }
        

        



        
    }
    

}
