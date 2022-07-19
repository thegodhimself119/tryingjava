package AlevelCS.arrays;

import java.util.Arrays;

public class insertionsort {
    public static void main(String []args){
        int currentval;
        int key;
        int[] array = {2,1,9,100,81,200,5};
        for(int i =1 ;i<array.length;i++){
            currentval = i-1;
            key = array[i];
            while(array[currentval]>key ){
                array[currentval +1] = array[currentval];
                currentval = currentval -1;
                if (currentval==-1){
                    break;
                }
            }
        array[currentval+1]=key;


        }
    System.out.print(Arrays.toString(array));

    }
    
}
