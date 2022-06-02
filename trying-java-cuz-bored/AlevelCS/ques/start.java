package AlevelCS.ques;
import java.util.Scanner;
public class start {
    public static void main(String[]args){
        quizClass firstquiz = new quizClass();
        questionClass question1 = new questionClass("what is 100/5?", "20", 1);
    
        firstquiz.addquestion(question1);
        System.out.print(firstquiz.questions[0].getQuestion());
}


}
