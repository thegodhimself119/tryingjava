package kmap;

public class boxinfo {
    int a;
    int b;
    int c;
    int d;
    String[] loc= new String[2];


    boxinfo(int A, int B , int C, int D,String location){
        a = A;
        b = B;
        c = C;
        d = D;

        loc[0] = location.substring(0, 1);
        loc[1] = location.substring(1, 2);



    }




    
}
