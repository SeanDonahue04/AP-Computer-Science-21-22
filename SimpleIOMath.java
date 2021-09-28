import java.util.Scanner;

/**
 * This is a simple IO project where the user is prompted to answer some questions and the program responds with some facts about their answers.
 * @version Monday, September 27, 2021
 * @author sdonahue
 */

public class SimpleIOMath {
    /**
     * Main entry point for class SimpleIOMath
     */
    private String name;
    private int age;
    private int favNumber;

    private int smallestPrime(int num)  {
        for(int i = 2; i <= (int)(Math.sqrt(num))+1; i++)   {
            if (num % i == 0)
                return i;
        }
        return num;
    }

    /**
     * This is used for prompting the user for information
     */
    public void promptUser()    {
        Scanner in = new Scanner(System.in);
        System.out.println("Question 1: What is your name? ");
        name = in.nextLine();
        System.out.println("Question 2: How old are you? ");
        age = in.nextInt();
        System.out.println("Question 3: What is your favorite number?: ");
        favNumber = in.nextInt();
        System.out.println("I'm gonna teach you how to sing it out");
        System.out.println("Come on, come on, come on");
        System.out.println("Let me tell you what it's all about");
        System.out.println("Reading, writing, arithmetic");
        System.out.println("Are the branches of the learning tree");
    }

    /**
     * This is where the information is calculated and printed.
     */
    public void printInfo() {
        System.out.println("Your name is: "+name);
        System.out.println("Your age is: "+age);
        System.out.println("At your next birthday you will turn "+ (age + 1) );
        System.out.println("The first prime factor of "+age+" is:" + smallestPrime(age) );
        System.out.println("Your favorite number is:"+ favNumber);
        System.out.println("Your favorite number squared is:"+ favNumber * favNumber);


    }

    /**
     * THis is the main method including promptUser() and printInfo()
     * @param args
     */
    public static void main(String[] args)  {
        System.out.println("* Sit yourself down, take a seat *");
        System.out.println("* All you gotta do is repeat after me *");
        SimpleIOMath obj = new SimpleIOMath();
        obj.promptUser();
        obj.printInfo();
        System.out.println("* end of program *");

    }
}
