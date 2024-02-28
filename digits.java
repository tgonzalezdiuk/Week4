/*************
 * Tamara Gonzalez
 * Date: Febuary 26th, 2024
 * Program Name: Java
 ***************/

public class digits
{
    public static void main (String[ ] args)
    {
        int hundreds;
        int tens;
        int ones;
        int num;

        num = 256;

        hundreds = num/100;
        tens = (num%100)/10 ;
        ones = num%10;
        System.out.println("The hundreds-place digit is: " + hundreds);
        System.out.println("The tens-place digit is: " + tens);
        System.out.println("The one's digit is: " + ones);
    }
}