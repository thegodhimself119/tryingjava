package torsimulation;
import java.util.Arrays;
import java.util.Scanner;

public class tourneysiml extends Thread  {

    static int number;
    static String[][] players = new String[9182][2];
    static int time;
    static String type;
    static int sep;
  
   // player[name][rating]

    static void RandomInitPlayers(int n){
        int max = 3200;
        int min = 1000;
        int random;
        for (int i=0; i<n; i++){
            players[i][0]= "player"+i;
            random = (int)(Math.random()*(max-min+1)+min);
            
            players[i][1]= String.valueOf(random);


        }
       

        
    }
   
    static void input(){
        int rem;
        rem = 0;
        Scanner input = new Scanner(System.in);
        System.out.println("input the number of players");
        int n = input.nextInt();
        number = n;
        rem = n;
        while (rem%2 ==0 && rem != 1){
            rem = rem/2;
            if (n>102400){
                break;
            }
        
        }

        if (rem == 1){
          
            RandomInitPlayers(n);
        }
     
        else{
            System.out.println("invalid number");
        }





    }

    public static void main(String []arg){
       
    
    tourneysiml thread = new tourneysiml();
    input();
    //System.out.println(Arrays.deepToString(players));
    Scanner inp = new Scanner(System.in);
    System.out.println("which type of game is played");
    String type = inp.next();
    //System.out.println(Arrays.deepToString(players)); 
    sep = number/2; 


    thread.start();
    game obj = new game(type);
    
    for(int i=0; i<=sep-2;i++){
            int ti =obj.blitz(i, i+1);//passes index to game
            time = time +ti;
           }
    System.out.println(sep-1);
    int ti = obj.blitz(sep-1,number-1);

    

    }  



    

    public void run(){
        game obj = new game(type);
        for(int i=sep; i<number-1;i++){
                int ti =  obj.blitz(i, i+1);//passes index to game
               time = time +ti; 
               //System.out.println(Arrays.deepToString(players));
            }

    }
}


    

