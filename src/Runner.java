import java.util.Scanner;
public class Runner {
    public static void main(String[] args){
        QuestionGroup p = new QuestionGroup();
        Scanner sc = new Scanner(System.in);
        for(int i = 0; i< p.gameLength; i++){
            Question z = p.determineQuestion();
            System.out.println(z.text);
            z.answeredCorrectly = (z.answer == sc.nextInt());

            //for testing!!!
            System.out.println(z.answeredCorrectly);
        }
        //p.computeResult();
    }
}