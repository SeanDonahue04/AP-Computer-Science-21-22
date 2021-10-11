import java.util.Scanner; 

public class BasicIO {
    public static void main(Integer[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("How old are you?: ");
        int age = input.nextInt();
        //ask the user their age

        // print summary info
        System.out.println("Your age squared is" + age*age);
        // print the user's age squared
    }
}
