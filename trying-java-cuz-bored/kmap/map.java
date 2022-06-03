package kmap;

import java.util.Arrays;
import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;

public class map {
    static boxinfo[] infoclass = new boxinfo[16];// array to stores objects which contain info of each box
    static int[][] map={{0,0,0,0},
                        {0,0,0,0},//matrix for output
                        {0,0,0,0},
                        {0,0,0,0}};

    static void operations(char a, char b , char c, char d){//compares each value and adds in locatoin
       // System.out.println(a);
        int A = Character.getNumericValue(a);  //System.out.println(A);
        int B = Character.getNumericValue(b);  
        int C = Character.getNumericValue(c);  
        int D = Character.getNumericValue(d);  
        
        //System.out.println("OPERATIONS IS RUNNING");
        for(int i=0; i<infoclass.length; i++){// loops throught each infoclass array
            if(infoclass[i].a==A && infoclass[i].b==B && infoclass[i].c==C && infoclass[i].d==D){//compare with each object vals
               String m= infoclass[i].loc[0];//if true extract the location of the box
               
               int mint = Integer.valueOf(m);
               String k = infoclass[i].loc[1];
               int kint = Integer.valueOf(k);

               map[mint][kint]=1;//put 1 in that location
                
            }
            
            else{
                //System.out.println(j);
                //System.out.println("Not found");

            }
        
        }


    }
    static void input(){// inputs the data from a file and initializes it
        try {
            File myObj = new File("input.txt");
            if (myObj.createNewFile()) {
              System.out.println("File created: " + myObj.getName());//create file if it doesnt exist for input
            } 
            else
             {
                try  {
                    File obj = new File("input.txt");
                    Scanner readfile = new Scanner(obj);
                    while (readfile.hasNextLine()) {//read each line
                        String data = readfile.nextLine();
                        char out= data.charAt(8);
                        
                        if(out=='1'){// if the output or the X of the line is one extract individual vals
                            char a = data.charAt(0);// sequential
                            char b = data.charAt(2);
                            char c = data.charAt(4);
                            char d = data.charAt(6);
                           
                            //System.out.println("this is running");
                            operations(a, b, c, d);//call operatoins for comparisions
                        }
                        else{
                            continue;
                        }
                    }
                readfile.close();
            }
                
                catch (FileNotFoundException e) {
                    // TODO Auto-generated catch block
                    e.printStackTrace();
                }
              
            }
          } catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
          }
        
       
     
        




    }

    public static void initializevals(){
        // initiliazing the value of each box of k map
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
        initializevals();// initialize the box info
        input();// call for input
        

        for (int i = 0; i < map.length; i++)
        {
          // length returns number of rows
          for (int j = 0; j < map[i].length; j++)
          {
           
          System.out.print( map[i][j]  + "\t");
           }
           System.out.println();
         }
      
    }




        
        
    }
    

