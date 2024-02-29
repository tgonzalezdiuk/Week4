/*************
 * Tamara Gonzalez
 * Date: Febuary 28th, 2024
 * Program Name: Java
 ***************/

 import java.util.*;

 public class digitsRevision 
 {
     public static void main (String [] args)
     {
         Scanner input = new Scanner(System.in);
     
         System.out.print("Enter a three digit number ");

         int hundreds;
         int tens;
         int ones;
         int num;
         num = input.nextInt();

        
        hundreds = num/100;
        tens = (num%100)/10 ;
        ones = num%10;
        input.close();

        System.out.println("The hundreds-place digit is: " + hundreds);
        System.out.println("The tens-place digit is: " + tens);
        System.out.println("The one's digit is: " + ones);

    }
}