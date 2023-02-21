package com.ontariotechu.sofe3980U;

import org.joda.time.LocalTime;
import java.util.Scanner;

/**
 * Hello world!
 *
 */
public class App {
    public static void main( String[] args ) {
        LocalTime currentTime = new LocalTime();
        System.out.println("The current local time is: " + currentTime);

        Scanner input = new Scanner(System.in);

        System.out.println("Enter the first binary number:");
        String binary1String = input.nextLine();
        while(!isBinary(binary1String)){
            System.out.println("Invalid input, please enter a valid binary number (only 0s and 1s allowed)");
            binary1String = input.nextLine();
        }
        Binary binary1 = new Binary(binary1String);
        System.out.println("First binary number is " + binary1.getValue());

        System.out.println("Enter the second binary number:");
        String binary2String = input.nextLine();
        while(!isBinary(binary2String)){
            System.out.println("Invalid input, please enter a valid binary number (only 0s and 1s allowed)");
            binary2String = input.nextLine();
        }
        Binary binary2 = new Binary(binary2String);
        System.out.println("Second binary number is " + binary2.getValue());

        Binary sum = Binary.add(binary1, binary2);
        System.out.println("Their summation is " + sum.getValue());

        Binary conjunction = Binary.AND(binary1, binary2);
        System.out.println("Their conjunction is " + conjunction.getValue());

        Binary disjunction = Binary.OR(binary1, binary2);
        System.out.println("Their disjunction is " + disjunction.getValue());
    }
    public static boolean isBinary(String input) {
        for (char c : input.toCharArray()) {
            if (c != '0' && c != '1') {
                return false;
            }
        }
        return true;
    }
}