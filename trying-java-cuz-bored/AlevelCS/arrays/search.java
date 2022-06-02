package AlevelCS.arrays;



public class search {
   
    
   

    public static int[] bubblesort(int[] arr, int maxindex){
    
    int n = maxindex-1;
    for(int i=0; i<maxindex; i++){
        for(int j=0; j<n ; j++){
            if(arr[j] > arr[j+1]){
                int temp = arr[j];
                arr[j]= arr[j+1];
                arr[j+1] =temp;
            
            }
        }
        
    n = n-1;
   
        }
        return arr;
    }

    public int binarySearch(int item,int[] arr,int maxindex){
        //of ascending order
        int first = 0;
        int last = maxindex;//set constraints for search
        boolean found = false;
        int md=0;
        while(found == false){
        int midIndex = (first +last)/2;//finding the middle of the array

        if(arr[midIndex]== item){
           
            
            found = true;
             md = midIndex;
            
        }
        else{
            if (arr[midIndex]<item){
                first = midIndex +1;// on second half
            }

            else if(arr[midIndex]>item){
                last = midIndex -1;//decreasing since its in the first half
            }
            else{
                System.out.println("no item in array");
                break;
                //not found since its over bounds
               

            }

         
        }
    
        
    }
return md;

}  

} 

