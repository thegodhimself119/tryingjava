package AlevelCS.arrays;

import java.util.Arrays;

public class test {
    public static void main (String[]args){
        int[] hello = {1,2,3,4,12};
        int[] hi = {4,5,6,7,1};
        q2 obj = new q2();
        
        System.out.println(Arrays.toString(hello));
        int[] h= obj.mergeTwoArray(hello,hi);
        int length = h.length;

        double median = obj.median(h, length);
        System.out.println(median);
        search sear = new search();

        int hel= sear.binarySearch(12 ,hello, 5);
        System.out.println(hel);

        obj.replace(12, hello, 20);

    }
  
    
}
