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
            if(type =="blitz"){
                games=3;
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

            for(int i=0; i<games;i++){
                win1 = rand.nextInt(2);
               
                if(win1 == 0){
                    count1 = count1 +1;
                }
                else{
                    count2 = count2 +1;
                }
                time = time + timegame+ (int)(Math.random()*(5));

            }
            if(count1>count2){
                System.out.println((tourneysiml.players[p1][0]+"won the game"));
                int rating = Integer.parseInt(obj.players[p1][1]);
                rating = rating + (int)(Math.random()*(10)+7);
                tourneysiml.players[p1+1][0] =tourneysiml.players[p1][0];
                tourneysiml.players[p1+1][1]= tourneysiml.players[p1][1];
             

            }
            else{
                System.out.println(obj.players[p2][0]+"won the game");
                int rating = Integer.parseInt(obj.players[p2][1]);
                rating = rating + (int)(Math.random()*(10)+7);

            }

            return time;



        }

       
    }