package kmap;

import java.util.Arrays;
import java.util.Scanner;

public class map {
    static boxinfo[] infoclass = new boxinfo[16];
    static int[][] map={{0,0,0,0},
                        {0,0,0,0},
                        {0,0,0,0},
                        {0,0,0,0}};

    public static void initializevals(){
        
        boxinfo box1 = new boxinfo(0, 0, 0, 0,"00");
        infoclass[0]= box1;
        boxinfo box2 = new boxinfo(0, 0, 0, 1,"01");
        infoclass[1]= box2;
        boxinfo box3 = new boxinfo(0, 0, 1, 1,"02");
        infoclass[2]= box3;
        boxinfo box4 = new boxinfo(0, 0, 1, 0,"03");//row 0 stops
        infoclass[3]= box4;

        boxinfo box5 = new boxinfo(0, 1, 0, 0,"10");
        infoclass[4]= box5;
        boxinfo box6 = new boxinfo(0, 1, 0, 1,"11");
        infoclass[5]= box6;
        boxinfo box7 = new boxinfo(0, 1, 1, 1,"12");
        infoclass[6]= box7;
        boxinfo box8 = new boxinfo(0, 1, 1, 0,"13");//row 1 stops
        infoclass[7]= box8;

        boxinfo box9 = new boxinfo(1, 1, 0, 0,"20");
        infoclass[8]= box9;
        boxinfo box10 = new boxinfo(1, 1, 0, 1,"21");
        infoclass[9]= box10;
        boxinfo box11 = new boxinfo(1, 1, 1, 1,"22");
        infoclass[10]= box11;
        boxinfo box12 = new boxinfo(1, 1, 1, 0,"23");//row 2 stops
        infoclass[11]= box12;

        boxinfo box13 = new boxinfo(1, 0, 0, 0,"30");
        infoclass[12]= box13;
        boxinfo box14 = new boxinfo(1, 0, 0, 1,"31");
        infoclass[13]= box14;
        boxinfo box15 = new boxinfo(1, 0, 1, 1,"32");
        infoclass[14]= box15;
        boxinfo box16 = new boxinfo(1, 0, 1, 0,"33");//row 3 stops
        infoclass[15]= box16;

    }
    public static void main(String[] args) {
        initializevals();
        

        System.out.print(Arrays.toString(infoclass[5].loc));
    




        
        
    }
    
}
