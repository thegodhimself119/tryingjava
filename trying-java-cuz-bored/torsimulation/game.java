 package torsimulation;
 import java.util.concurrent.ThreadLocalRandom;
 import java.util.Arrays;
 import java.util.Random;

 public class game{
   String type;
        game(String t){
            type = t;
        }
    
        int blitz(int p1, int p2){
            int games =3;
            int time = 0;
            int timegame =0;    
            int win1;
          
            int count1 = 0;
            int count2 = 0;
            tourneysiml obj = new tourneysiml();
            Random rand = new Random();

            if(type =="blitz"){//checking if its blitz
                games=3;//setting number of games and time
                timegame = 10;
            }
            else if(type =="rapid"){
                games =5;
                timegame =1;
            }
            else{
                games = 5;
                timegame =14;
            }

            for(int i=0; i<games;i++){//running the games
                win1 = rand.nextInt(2);//generating random number between 1 and 0
               
                if(win1 == 0){
                    count1 = count1 +1;// if its 0 the p1 wins
                }
                else{
                    count2 = count2 +1;
                }
                time = time + timegame+ (int)(Math.random()*(5));

            }
            if(count1>count2){//if total number of p1 is more it wins
                System.out.println((tourneysiml.players[p1][0]+"won the game"));
                int rating = Integer.parseInt(obj.players[p1][1]);
                rating = rating + (int)(Math.random()*(10)+7);
                tourneysiml.players[p1+1][0] =tourneysiml.players[p1][0];//swapping the positoin if p1 wints to i+1 so that in can be compared in next
                //iteriation with another
                tourneysiml.players[p1+1][1]= tourneysiml.players[p1][1];
             

            }
            else{
                System.out.println(obj.players[p2][0]+"won the game");
                int rating = Integer.parseInt(obj.players[p2][1]);//not swapping position because it will be auto compared
                rating = rating + (int)(Math.random()*(10)+7);

            }

            return time;



        }

       
    }