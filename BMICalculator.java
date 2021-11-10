import java.text.DecimalFormat;
import java.util.Scanner;
import java.io.File;

/** This is a program designed to calculate the user's BMI based on the given height and weight values.
 *@version 11/09/21
 *@author sdonahue
 */

public class BMICalculator {
    /**
     * Convert English to metric units, perform the BMI calculation
     * NOTE:this method must handle bad data
     */
    public static double computeBMI(int inches, int pounds) {
        //1 inch = .0254 meters
        //1 pound = .454 kg
        if (inches <= 0 || pounds <= 0)
            return 0;
        return pounds * .454 / Math.pow(inches * .0254, 2);
    }

    /**
     * For extracting int and converting feet to inches */
    public static int extractInt(String value) {
        int qtPos = value.indexOf("'");
        int dblQtPos = value.indexOf("\"");
        if (qtPos == -1 || dblQtPos == -1) {
            return -1;
        }
        int feet = Integer.parseInt(value.substring(0, qtPos));
        int inches = Integer.parseInt(value.substring(qtPos + 1, dblQtPos));


        if (inches < 0 || inches > 11 || feet < 0)
            return -1;

        return (feet * 12 + inches == 0) ? -1 : feet * 12 + inches;
    }
        /**
         * Uses a Scanner to prompt the user for info, process the
         * feet/inches conversion, calls the computeBMI method and prints the
         * correct information*/

        public static void main (String[]args){
            Scanner in = new Scanner(System.in);
            DecimalFormat df = new DecimalFormat("0.00");
            String height = " ";
            int weight = 0;
            while (true) {
                try {
                    height = " ";
                    while(extractInt(height)==-1)   {
                        System.out.print("Enter your height in feet and inches (format 6'2\"):  ");
                        height = in.nextLine(); }
                    System.out.print("Enter your weight in pounds: ");
                    weight = in.nextInt();
                    in.nextLine(); //scanner weird
                    System.out.println("Your BMI, expressed as weight(kg)/height(m)^2: " + df.format(computeBMI(extractInt(height), weight)));
                    System.out.print("Continue(Y/N): ");
                    String cont = in.nextLine();
                    if (!cont.toLowerCase().equals("y"))
                        break;
                } catch (Exception e) {
                    height = " ";
                    weight = 0;
                    System.err.println("Enter a valid entry one time"); //custom error

                }
                System.out.println("End of program");

            }


        }
    }
