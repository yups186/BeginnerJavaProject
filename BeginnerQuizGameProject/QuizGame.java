// I should probably try to use methods with a few arguments to keep the code cleaner
// each new method is dependent on the previous method to simulate a new question after each answer

import java.util.Scanner;


public class Main {
    public static void main(String[] args) {

    Scanner scanner = new Scanner(System.in);

    String[] questions = {"Who invented Microsoft?", "Who invented Apple?", "Which country is the biggest?"};

    String[] answers = {"Bill Gates", "Steve Jobs", "Russia"};

    int score = 0;

    System.out.println("***********************************");
    System.out.println("Welcome to the Ninja Corp Quiz Game!");
    System.out.println("***********************************");


    questionOne(scanner, questions, answers, score);

        }

        static int questionOne(Scanner scanner, String[] questions, String[] answers, int score){

        System.out.println(questions[0]);

        String answerOne = scanner.nextLine();

        if (answerOne.equals(answers[0])) {
            score += 1;
            questionTwo(scanner, questions, answers, score);
            return score;
        }
        else {
            questionTwo(scanner, questions, answers, score);
            return score;}

    }

    static int questionTwo(Scanner scanner, String[] questions, String[] answers, int score){

        System.out.println(questions[1]);

        String answerTwo = scanner.nextLine();

        if (answerTwo.equals(answers[1])) {
            score += 1;
            questionThree(scanner, questions, answers, score);
            return score;
        }
        else {
            questionThree(scanner, questions, answers, score);
            return score;}

    }

    static int questionThree(Scanner scanner, String[] questions, String[] answers, int score){

        System.out.println(questions[2]);

        String answerThree = scanner.nextLine();

        if (answerThree.equals(answers[2])) {
            score += 1;
            System.out.println("Your Score is " + score);
            return score;
        }
        else {System.out.println("Your score is " + score);
            return score;
        }

    }



}
