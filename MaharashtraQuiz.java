import java.util.Scanner;

public class MaharashtraQuiz {
    public static void main(String[] args) {
        String[] questions = {
            "What is the capital of Maharashtra?",
            "Which festival is celebrated with great enthusiasm in Maharashtra, especially in Mumbai?",
            "Which city is famous for its cave temples and is often called the 'City of Caves'?",
            "What is the traditional attire worn by men in Maharashtra?"
        };

        String[] options = {
            "A) Mumbai\nB) Nagpur\nC) Pune",
            "A) Diwali\nB) Ganesh Chaturthi\nC) Holi",
            "A) Pune\nB) Mumbai\nC) Aurangabad",
            "A) Dhoti\nB) Sherwani\nC) Sari"
        };

        char[] answers = {'C', 'B', 'C', 'A'};
        int score = 0;

        Scanner scanner = new Scanner(System.in);

        for (int i = 0; i < questions.length; i++) {
            System.out.println(questions[i]);
            System.out.println(options[i]);
            System.out.print("Your answer (Enter A, B, or C): ");
            char userAnswer = Character.toUpperCase(scanner.next().charAt(0));

            if (userAnswer == answers[i]) {
                System.out.println("Correct!\n");
                score++;
            } else {
                System.out.println("Incorrect!\n");
            }
        }

        System.out.println("Quiz complete. Your score: " + score + "/" + questions.length);
        scanner.close();
    }
}
