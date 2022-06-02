package AlevelCS.ques;
//9608/41/19 q.no 5
import java.util.Scanner;
public class lesson {

    
    String lessontype;
    String instructor;

    public lesson(String lt,String i){
        lessontype = lt;
        instructor = i;

    }

    public String getlessontype(){
        return lessontype;
    }

    public String getinstructor(){
        return instructor;
    }

    public int getfee(Character val){

    
        if (val=='B'){
            
            return 45;
        }

        else if(val =='I'){
            
            return 50;
        }

        else if(val=='A'){
            
            return 55;

        }

        else{
            return -1;
        }



    }




    public static void main(String[]args){
        lesson[] lessons = new lesson[9];
        lesson newlesson = new lesson("improve your service", "me");
        lesson lesson2 = new lesson("hello", "hi");
        Scanner input = new Scanner(System.in);
        lessons[0] = newlesson;
        lessons[1] = lesson2;
        System.out.println(lessons[1].instructor);

        

    }

}
