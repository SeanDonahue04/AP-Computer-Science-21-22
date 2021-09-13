import java.util.Scanner;

/**
        * Class HolyGrail is a lab using a scanner. It's a simple IO program involving a bridge keeper and some questions.
        * @version 09/13/2021
        * @author sdonahue
        */
public class HolyGrail {
       /**
        * Main entry point for class HolyGrail
        *@para, args main line arguments if needed
        */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("* A chat with the bridge keeper *");
        System.out.println("Who would cross the Bridge of Death must answer me these questions three, ere the other side he see.");
        System.out.println("Question 1: What is your name?: ");
        String name = input.nextLine();
        System.out.println("Question 2: What is your quest?: ");
        String quest = input.nextLine();
        System.out.println("Question 3: What is your favorite color?: ");
        String color = input.nextLine();
        System.out.println("King Arthur says, \"You have to know these things when you're a king, you know.\"");
        System.out.println("Your name is " + name);
        System.out.println("Your quest is " + quest);
        System.out.println("Your favorite color is " + color);
        System.out.println("* end of program *");
    }
}
