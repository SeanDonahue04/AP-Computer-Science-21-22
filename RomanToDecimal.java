public class RomanToDecimal {
    /**
     * A program designed to convert roman numerals (strings) to numbers (integers)
     * @version 10/03/19
     * @author sdonahue
     */


    /**
     * Method that accepts a single Roman numeral and returns its decimal equivalent
     */
    public static int romanToDecimal(String roman)  {
        int decimal = 0;
        for(int i = 0;i < roman.length(); i++ )  {
            //System.out.println(roman.substring(i, i+1).toUpperCase());
            if(roman.substring(i, i+1).toUpperCase().equals("I"))   {
                decimal += 1;
            }
            else if(roman.substring(i, i+1).toUpperCase().equals("V"))  {
                decimal += 5;
            }
            else if(roman.substring(i, i+1).toUpperCase().equals("X"))  {
                decimal += 10;
            }
            else if(roman.substring(i, i+1).toUpperCase().equals("L"))  {
                decimal += 50;
            }
            else if(roman.substring(i, i+1).toUpperCase().equals("C"))  {
                decimal += 100;
            }
            else if(roman.substring(i, i+1).toUpperCase().equals("D"))  {
                decimal += 500;
            }
            else if(roman.substring(i, i+1).toUpperCase().equals("M"))  {
                decimal += 1000;
            }
            else {
                //program encountered an invalid character
                return -1;
            }
        }
        /**
         * For identifying first invariant
         */
        if(roman.toUpperCase().indexOf("IV") != -1)
            decimal -= 2;
        if(roman.toUpperCase().indexOf("IX") != -1)
            decimal -= 2;
        if(roman.toUpperCase().indexOf("XL") != -1)
            decimal -= 20;
        if(roman.toUpperCase().indexOf("XC") != -1)
            decimal -= 20;
        if(roman.toUpperCase().indexOf("CD") != -1)
            decimal -= 200;
        if(roman.toUpperCase().indexOf("CM") != -1)
            decimal -= 200;
        return decimal;
    }

    /**
     * Main Method
     * includes romanToDecimal
     */
    public static void main(String[] args)  {
        for(String temp : args) {
            int val = romanToDecimal(temp);
            if(val == -1)
                System.out.println("Input: "+ temp + "=> output: invalid");
            else
                System.out.println("Input: "+ temp + "=> output: " + romanToDecimal(temp));

        }
    }
}
