package AlevelCS.ques;
public class questionClass {
    private String question;
    private String answer;
    private int difficulty;

    public questionClass(String questionp,String answerp,int difficultyp){
        question = questionp;
        answer = answerp;
        difficulty = difficultyp;

    }

    public String getQuestion() {
        return question;
    }

    public String getAnswer() {
        return answer;
    }

    public int getDifficulty() {
        return difficulty;
    }
    
}
