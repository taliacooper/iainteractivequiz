import java.util.Scanner;
public class Runner {
    public static void main(String[] args){
        QuestionGroup p = new QuestionGroup();
        Scanner sc = new Scanner(System.in);
        int score = 0;
        boolean lastQuestionCorrect = false;
        for(int i = 0; i< p.gameLength; i++){

            Question z = p.determineQuestion(lastQuestionCorrect);
            System.out.println(z.text);
            z.answeredCorrectly = (z.answer == sc.nextInt());
            lastQuestionCorrect = z.answeredCorrectly;
            System.out.println(z.answeredCorrectly);
            if(z.answeredCorrectly){
                score++;

            }
        }

        System.out.println("your score was" + score + "/" + p.gameLength);
        //p.computeResult();
    }
}
