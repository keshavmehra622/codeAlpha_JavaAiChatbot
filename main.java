import java.util.Scanner;

public class main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        ChatBot bot = new ChatBot();

        System.out.println("==================================");
        System.out.println("      JAVA AI CHATBOT");
        System.out.println("Type 'exit' to quit.");
        System.out.println("==================================");

        while (true) {

            System.out.print("\nYou : ");
            String input = sc.nextLine();

            if (input.equalsIgnoreCase("exit")) {
                System.out.println("Bot : Goodbye! Happy Coding.");
                break;
            }

            System.out.println("Bot : " + bot.getResponse(input));
        }

        sc.close();
    }
}