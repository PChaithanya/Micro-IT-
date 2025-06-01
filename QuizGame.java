import java.util.Scanner;

public class QuizGame {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int score = 0;
        String answer;

        System.out.println("🎯 Welcome to the Java Quiz Game!");
        System.out.println("----------------------------------");

        // Question 1
        System.out.println("1. What is the capital of France?");
        System.out.println("A. Berlin");
        System.out.println("B. Madrid");
        System.out.println("C. Paris");
        System.out.println("D. Rome");
        System.out.print("Your answer: ");
        answer = scanner.nextLine().toUpperCase();
        if (answer.equals("C")) {
            score++;
        }

        // Question 2
        System.out.println("\n2. Who developed Java?");
        System.out.println("A. Microsoft");
        System.out.println("B. Sun Microsystems");
        System.out.println("C. Oracle");
        System.out.println("D. Apple");
        System.out.print("Your answer: ");
        answer = scanner.nextLine().toUpperCase();
        if (answer.equals("B")) {
            score++;
        }

        // Question 3
        System.out.println("\n3. What is 10 + 5?");
        System.out.println("A. 12");
        System.out.println("B. 15");
        System.out.println("C. 20");
        System.out.println("D. 25");
        System.out.print("Your answer: ");
        answer = scanner.nextLine().toUpperCase();
        if (answer.equals("B")) {
            score++;
        }

        // Final Score
        System.out.println("\n✅ Quiz Completed!");
        System.out.println("Your score: " + score + "/3");

        // Feedback
        if (score == 3) {
            System.out.println("Excellent! 🎉");
        } else if (score == 2) {
            System.out.println("Good job! 👍");
        } else {
            System.out.println("Better luck next time! 💪");
        }

        scanner.close();
    }
}
