import org.launchcode.*;

public class QuizRunner {
    private static final Quiz quiz = new Quiz();

    public static void main(String[] args) {
        //Create questions
        String q1 = "Which of the following is a New England state?";
        Choice[] q1Choices = new Choice[] {
                new Choice("Connecticut", true),
                new Choice("Virginia"),
                new Choice("Rhodes Island", true),
                new Choice("Pennsylvania")
        };

        Checkbox question1 = new Checkbox(q1, q1Choices);

        String q2 = "The winner of the 2022 FIFA world cup is Argentina.";
        Choice[] q2Choices = new Choice[] {
                new Choice("True", true),
                new Choice("False")
        };

        TrueOrFalse question2 = new TrueOrFalse(q2, q2Choices);

        String q3 = "What year did the United States gain her independence?";
        Choice[] q3Choices = new Choice[] {
                new Choice("1847"),
                new Choice("1799"),
                new Choice("1645"),
                new Choice("1776", true)
        };

        MultipleChoice question3 = new MultipleChoice(q3, q3Choices);

        //Add questions to the quiz
        quiz.addQuestions(new Question[]{question1, question2, question3});

        //Interact with user (run quiz, giving score)
        quiz.run();
        String newLine = System.lineSeparator();
        System.out.println(newLine + "You entered " + quiz.getNumCorrect() +
                " of " + quiz.getQuestions().size() +
                " questions correctly. Thanks for playing!" + newLine);
    }


}
