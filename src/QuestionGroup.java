public class QuestionGroup {
    Question[] easy = new Question[10];
    Question[] medium = new Question[10];
    Question[] hard = new Question[10];
    int gameLength = 10;

    public void createQuestion() {
        easy[0] = new Question("what i 12 X 11?  \n(1)201\n(2)121\n(3)132\n", 3, 1);
//        easy[1] = new Question();
//        easy[2] = new Question();
//        easy[3] = new Question();
//        easy[4] = new Question();
//        easy[5] = new Question();
//        easy[6] = new Question();
//        easy[7] = new Question();
//        easy[8] = new Question();
//        easy[9] = new Question();
        medium[0] = new Question("what are the first 9 digits of pi?  \n(1)3.14159366\n(2)3.141592653\n(3)3.14167189\n", 3, 2);
//        medium[1] = new Question();
//        medium[2] = new Question();
//        medium[3] = new Question();
//        medium[4] = new Question();
//        medium[5] = new Question();
//        medium[6] = new Question();
//        medium[7] = new Question();
//        medium[8] = new Question();
//        medium[9] = new Question();
        hard[0] = new Question("What is the area of an equilateral triangle with side length 4?  \n(1)64\n(2)4 √ 2\n(3)4 √ 3\n", 2, 3);
//        hard[1] = new Question();
//        hard[2] = new Question();
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
    public Question determineQuestion(){
        return easy[0];
    }
}



