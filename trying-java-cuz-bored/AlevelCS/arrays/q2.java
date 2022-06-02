package AlevelCS.arrays;
import java.util.Arrays;
public class q2{

        public double median(int arr[],int length){
            double l = length+1;
            double medianindex = (l)/2;//median calc
         

            if(length%2==0){//check if odd or even
                double ceil = medianindex +0.5;
                double floor = medianindex -0.5;
                int iceil = (int)ceil;//convert from double to in
                int ifloor = (int)floor;
                double msum = arr[ifloor-1]+arr[iceil-1];
                double median = msum/2;// return median of even
             
                return median;


            }

            else{
                int imedian = (int)medianindex;
                double median = arr[imedian-1];
                return median;//return of odd
            }


        }


    //merges two array
        public int[] mergeTwoArray(int[] nums1, int[] nums2) {
            int merglength = nums1.length+nums2.length;// finding the length of merged array
            int[] mergedArray = new int[merglength];//declaring mreged array
            int index = 0;//index counter of elements
            for(int i=0; i<nums1.length;i++){//assigning elements of first array to the merged array
    
                mergedArray[i]=nums1[i];
                index =index +1;//index incrementation for second array
            }
    
            for (int i= 0;i<nums2.length;i++){//adding elements of second to merged using index
                mergedArray[index] = nums2[i];
                index = index +1;
            }
            search obj = new search();
            mergedArray = search.bubblesort(mergedArray,merglength);//returns sorted from search.java
            return mergedArray;
                
        }

        public void replace(int val,int[] arr,int newval){
            search find = new search();
            int maxindex = arr.length -1;
            int index = find.binarySearch(val, arr, maxindex);
            arr[index]= newval;
            System.out.println(Arrays.toString(arr));
        }
         
    
}
