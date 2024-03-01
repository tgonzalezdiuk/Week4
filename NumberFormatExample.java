/*********

 * Tamara Gonzalez 
 * Date : 03/01/2024
 * Program : Java 
 */

import java.text.NumberFormat;
public class NumberFormatExample
{
    public static void main(String[] args) {
        double dollars = 21.5;
        int num = 1234;
        double numWuthDecimal = 2.0/3.0;
        double sale = .15;

        NumberFormat money = NumberFormat.getCurrencyInstance();
        NumberFormat = number = NumberFormat.getIntegerInstance();
        NumberFormat = decimal = NumberFormat.getNumberInstance();
        NumberFormat = percent = NumberFormat.getPercentInstance();

        System.out.Println(money.format(dollars));
        System.out.Println(number.format(num));
        System.out.Println(decimal.format(numWithDecimal));
        System.out.Println(percent.format(sale));

    }
}