package week_5.day_2;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

// Class to represent a single Question fromm the list every time
class Question {
    private String question;
    private String[] options;
    private int correctAnswer; // 0-based index for the correct answer

    //constructor of the class
    public Question(String questionText, String[] options, int correctAnswerIndex) {
        this.question = questionText;
        this.options = options;
        this.correctAnswer = correctAnswerIndex;
    }

    //getters
    public String getQuestionText() {
        return question;
    }

    public String[] getOptions() {
        return options;
    }

    public int getCorrectAnswerIndex() {
        return correctAnswer;
    }

    // method to check  user's answer is correct or incorrect
    public boolean isCorrect(int userAnswer) {
        return userAnswer - 1 == correctAnswer; // Adjusting for 1-based user input
    }
}

// Main class to run the Quiz Application
public class code_104 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        // list of Question type class
        // which will contain 1-->question  2-->option  3-->answer
        List<Question> quizBank = new ArrayList<>();

        // 1. Add questions to the quiz bank
        quizBank.add(new Question(
                "Which programming language is known as the 'write once, run anywhere' language?",
                new String[]{"C++", "Python", "Java", "JavaScript"},
                2 // correct answer's index
        ));

        quizBank.add(new Question(
                "What is the size of an int data type in Java?",
                new String[]{"1 byte", "2 bytes", "4 bytes", "8 bytes"},
                2 // correct answer's index
        ));

        quizBank.add(new Question(
                "Which component is responsible for executing Java bytecode?",
                new String[]{"JDK", "JVM", "JRE", "Compiler"},
                1 // correct answer's index
        ));
        quizBank.add(new Question(
                "who is the lyricist of Volume 1 ?",
                new String[]{"Raftaar", "Badshah", "Honey singh", "all of the above"},
                4 // correct answer's index
        ));
        quizBank.add(new Question(
                "kya rapper paisa kama paa rhe hai ?",
                new String[]{"yes", "no ", "maybe", "don't know"},
                3 // correct answer's index
        ));

        // 2. Start the Quiz
        //intializing score with zero
        int score = 0;
        System.out.println();
        System.out.println("   WELCOME TO THE ATPATA QUIZ  ");
        System.out.println();

        for (int i = 0; i < quizBank.size(); i++) {
            Question currentQuestion = quizBank.get(i);

            // Display Question
            System.out.println("Question " + (i + 1) + ": " + currentQuestion.getQuestionText());

            // Display Options
            String[] options = currentQuestion.getOptions();
            for (int j = 0; j < options.length; j++) {
                System.out.println("  " + (j + 1) + ". " + options[j]);
            }

            // Get User Input with validation
            int userChoice = 0;
            while (true) {
                System.out.print("Your answer (1-" + options.length + "): ");
                if (input.hasNextInt()) {
                    userChoice = input.nextInt();
                    if (userChoice >= 1 && userChoice <= options.length) {
                        break;
                    }
                } else {
                    input.next(); // Clear invalid input
                }
                System.out.println("Invalid input. Please enter a number between 1 and " + options.length + ".");
            }

            // Check Answer
            if (currentQuestion.isCorrect(userChoice)) {
                System.out.println("Correct!\n");
                score++;
            } else {
                //
                int correctIdx = currentQuestion.getCorrectAnswerIndex();
                System.out.println("Wrong! The correct answer was: " + (correctIdx + 1) + ". " + options[correctIdx] + "\n");
            }
            System.out.println();
        }

        // Final Results
        System.out.println("              QUIZ OVER!                ");
        System.out.println("Your Final Score: " + score + " / " + quizBank.size());

        double percentage = ((double) score / quizBank.size()) * 100;
        System.out.printf("Percentage: %.2f%%\n", percentage);

        if (percentage >= 70) {
            System.out.println("Great job! You passed.");
        } else {
            System.out.println("you didn't passed ");
        }
    }
}