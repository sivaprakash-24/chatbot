import java.util.Scanner;

public class ChatBot {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("🤖 ChatBot: Hello! I'm your Java ChatBot. Type 'bye' to exit.");

        while (true) {
            System.out.print("You: ");
            String input = scanner.nextLine().toLowerCase();

            if (input.equals("bye")) {
                System.out.println("🤖 ChatBot: Goodbye! Have a great day.");
                break;
            }

            switch (input) {
                case "hi":
                case "hello":
                    System.out.println("🤖 ChatBot: Hello there! How can I assist you?");
                    break;
                case "how are you":
                    System.out.println("🤖 ChatBot: I'm just code, but I'm doing great! How about you?");
                    break;
                case "i'm fine":
                    System.out.println("🤖 ChatBot: Glad to hear that!");
                    break;
                case "what is your name":
                    System.out.println("🤖 ChatBot: I'm ChatBot, your friendly Java assistant.");
                    break;
                case "what can you do":
                    System.out.println("🤖 ChatBot: I can chat with you, tell jokes, and answer basic questions.");
                    break;
                case "tell me a joke":
                    System.out.println("🤖 ChatBot: Why don't programmers like nature? It has too many bugs!");
                    break;
                case "who created you":
                    System.out.println("🤖 ChatBot: I was created by a Java developer like you!");
                    break;
                case "what's java":
                    System.out.println("🤖 ChatBot: Java is a high-level, object-oriented programming language.");
                    break;
                case "what is oop":
                    System.out.println("🤖 ChatBot: OOP stands for Object-Oriented Programming.");
                    break;
                case "define encapsulation":
                    System.out.println("🤖 ChatBot: Encapsulation is bundling data with methods that operate on that data.");
                    break;
                case "define inheritance":
                    System.out.println("🤖 ChatBot: Inheritance allows a class to acquire properties of another class.");
                    break;
                case "define polymorphism":
                    System.out.println("🤖 ChatBot: Polymorphism allows methods to perform different tasks based on input.");
                    break;
                case "define abstraction":
                    System.out.println("🤖 ChatBot: Abstraction hides complexity by showing only the necessary details.");
                    break;
                case "suggest a book":
                    System.out.println("🤖 ChatBot: 'Clean Code' by Robert C. Martin is a great book for programmers.");
                    break;
                case "suggest a movie":
                    System.out.println("🤖 ChatBot: You should watch 'The Social Network'. It's inspiring for developers!");
                    break;
                case "help":
                    System.out.println("🤖 ChatBot: You can ask about Java, OOP, or even ask for jokes and suggestions!");
                    break;
                default:
                    System.out.println("🤖 ChatBot: Sorry, I don't understand that. Try asking something else.");
            }
        }

        scanner.close();
    }
}
