package Week1.ExamProctor;
import java.util.*;

class ExamProctor {

    Stack<Integer> navigationStack = new Stack<>();
    HashMap<Integer, String> answers = new HashMap<>();

    // Visit a question
    void visitQuestion(int questionId) {
        navigationStack.push(questionId);
        System.out.println("Visited Question: " + questionId);
    }

    // Go back to previous question
    void goBack() {
        if (navigationStack.isEmpty()) {
            System.out.println("No previous question.");
            return;
        }

        int lastQuestion = navigationStack.pop();
        System.out.println("Going back from Question: " + lastQuestion);
    }

    // Save answer
    void saveAnswer(int questionId, String answer) {
        answers.put(questionId, answer);
        System.out.println("Saved Answer for Q" + questionId);
    }

    // Evaluate score
    int evaluateScore(HashMap<Integer, String> correctAnswers) {
        int score = 0;

        for (int qid : correctAnswers.keySet()) {
            if (answers.containsKey(qid) &&
                answers.get(qid).equals(correctAnswers.get(qid))) {
                score++;
            }
        }
        return score;
    }
}

public class Main {
	public static void main(String[] args) {

        ExamProctor exam = new ExamProctor();

        // Student navigation
        exam.visitQuestion(1);
        exam.saveAnswer(1, "A");

        exam.visitQuestion(2);
        exam.saveAnswer(2, "B");

        exam.visitQuestion(3);
        exam.saveAnswer(3, "C");

        exam.goBack(); // back from Q3

        // Correct answers
        HashMap<Integer, String> correctAnswers = new HashMap<>();
        correctAnswers.put(1, "A");
        correctAnswers.put(2, "C");
        correctAnswers.put(3, "C");

        // Score evaluation
        int score = exam.evaluateScore(correctAnswers);
        System.out.println("Final Score: " + score);
    }


}
