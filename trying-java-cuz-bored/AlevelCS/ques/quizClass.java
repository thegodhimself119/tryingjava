package AlevelCS.ques;
public class quizClass {
    questionClass[] questions = new questionClass[20];
    private int nq;

   public quizClass(){
       nq = 0 ;
    }

   public void addquestion(questionClass question){
            questions[nq] = question;
            nq = nq +1;}

    

public String getquestion(){
      return "hello";

  }  

public boolean checkanswer(String answer){
      return true;

  }
 
}
