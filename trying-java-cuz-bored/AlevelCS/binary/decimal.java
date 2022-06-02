package AlevelCS.binary;

import java.util.Arrays;

public class decimal {

    public  String posDecimalToBiniary(float binary){
    boolean found = false;
    int ibinary = (int)binary;
    float dec = (binary*10-ibinary*10)/10;

    float dec2 = dec;
    int n = 0;
    String ans ="";
    boolean binfound = false;
    String intbinary ="";
    String finalbinary = "";

    while(found==false){//extracts and converts the decimal part of the input
        float multindx= dec2*2;
        
        int imultindx = (int)multindx;
        dec2 = (multindx*10-imultindx*10)/10;
        
        ans = ans +imultindx;
       n=n+1;
        
        
        if(dec2==0||n==8){
            break;
        }}
        
    
    
    while(binfound==false){//convert integer part to binary
        int remainder = ibinary%2;
        int divident = ibinary/2;
        ibinary = divident;
        intbinary = intbinary + remainder;
        
        
        if(divident==0){
            
            break;
        }
    }
    
    String nstr ="";
    char ch;
    for (int i=0; i<intbinary.length(); i++)//reversing the string
    {
      ch= intbinary.charAt(i); 
      nstr= ch+nstr; 
    }
    
       
        
    finalbinary = nstr+"."+ans;
        
    return finalbinary;

    
}

static  String ifactive(char[] Array,int n){
    int newn= Array.length-n;//since in binary goes from right to left  and index from left to right the index has to start from length-1
    System.out.println(newn);
    String newstr="";
    for(int i=newn-1;i>-1;i--){//interchnnging  0 to one after the index where 1 is found
        //System.out.println(Array[i]);
        if(Array[i]=='0'){
            Array[i]='1';
        }

        else if (Array[i]=='1'){
            Array[i]='0';
        }
        
    }
    //System.out.println(Arrays.toString(Array));
    for(int i =0; i<Array.length;i++){//adding all the elements back from the arry
        newstr = newstr + Array[i];

    }
    System.out.println("new array is"+ Arrays.toString(Array));
    return newstr;

}

public String twocomplement(float binary){
    decimal conv = new decimal();
    String converted =conv.posDecimalToBiniary(binary);
    String ans ="";
    char ns;
    int n = 0;
    boolean active = false;

    char[] binArray = new char[converted.length()];//putting the binary to arry for twos complement
    for(int i =0;i<converted.length();i++){
        ns = converted.charAt(i);
        binArray[i] = ns;
        

    }

    System.out.println("old array is "+Arrays.toString(binArray));
    
    for(int i=binArray.length-1;i>-1;i--){//scanning for 1 from right to left
    
    
        n=n+1;//increaseing the index for when 1 is found
        if(binArray[i]=='1'|| active ==true){//when 1 is found
           // System.out.println("index is "+ n);
             ans = ifactive(binArray, n);
            System.out.println(ans);
            break;
         }
        
        }
        return ans;
    }



}

 
    
    
    

