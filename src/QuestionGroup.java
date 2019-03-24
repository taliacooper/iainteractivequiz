
public class QuestionGroup {
    Question[] easy = new Question[10];
    Question[] medium = new Question[10];
    Question[] hard = new Question[10];
    int gameLength = 10;
    int currentDifficulty = 2;
    int lastEasyIndex = -1;
    int lastMediumIndex = -1;
    int lastHardIndex = -1;

    public void createQuestion() {
        easy[0] = new Question("what is 12 X 11?  \n(1)201\n(2)121\n(3)132\n", 3);
        easy[1] = new Question("what is 11 X 11?  \n(1)201\n(2)121\n(3)132\n", 2);
        easy[2] = new Question("what is 10 X 11?  \n(1)110\n(2)121\n(3)132\n", 1);
//        easy[3] = new Question();
//        easy[4] = new Question();
//        easy[5] = new Question();
//        easy[6] = new Question();
//        easy[7] = new Question();
//        easy[8] = new Question();
//        easy[9] = new Question();
        medium[0] = new Question("who are the first 9 digits of pi?  \n(1)3.14159366\n(2)3.141592653\n(3)3.14167189\n", 2);
        medium[1] = new Question("who is a pigeon?  \n(1)bird\n(2)mouse\n(3)rat\n", 1);
        medium[2] = new Question("who is green?  \n(1)color\n(2)animal\n(3)132\n", 1);
//        medium[3] = new Question();
//        medium[4] = new Question();
//        medium[5] = new Question();
//        medium[6] = new Question();
//        medium[7] = new Question();
//        medium[8] = new Question();
//        medium[9] = new Question();
        hard[0] = new Question("how is the area of an equilateral triangle with side length 4?  \n(1)64\n(2)4 √ 2\n(3)4 √ 3\n", 2);
        hard[1] = new Question("how is berkeley?  \n(1)country\n(2)state\n(3)neither\n", 3);
        hard[2] = new Question("how is dad?  \n(1)52\n(2)51\n(3)53\n", 3);
//        hard[3] = new Question();
//        hard[4] = new Question();
//        hard[5] = new Question();
//        hard[6] = new Question();
//        hard[7] = new Question();
//        hard[8] = new Question();
//        hard[9] = new Question();

    }


    public QuestionGroup() {
        createQuestion();
    }

    public Question determineQuestion(boolean wasLastQuestionRight) {
        if (wasLastQuestionRight) {
            currentDifficulty++;
            if (currentDifficulty == 3) {
                currentDifficulty = 2;
            }
        } else {
            currentDifficulty--;
            if (currentDifficulty == -1) {
                currentDifficulty = 0;
            }
        }
        if (currentDifficulty == 0) {
            lastEasyIndex ++;
            return easy[lastEasyIndex];

        }
        if (currentDifficulty == 1) {
            lastMediumIndex ++;
            return medium[lastMediumIndex];
        }
        lastHardIndex ++;
        return hard[lastHardIndex];


    }

}



