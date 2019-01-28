// Author: Carter Chamberlin
// ASURITE: cdchamb3
// Date: 27 January 2019
// Assignment: Lecture Activity 5





import java.util.Scanner;


public class AnalyzeString {

    public static void main(String[] args)throws Exception {

        // create scanner object and read in user string into "str"
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter a string for analysis: ");

        String str = scan.nextLine();

        // Create an instance of DigitCountThread
        DigitCountThread dct = new DigitCountThread(str);


        // Create an instance of isPalindromeThread
        isPalindromeThread ipt = new isPalindromeThread(str);


        // Create an instance of upperCountThread
        upperCountThread uct = new upperCountThread(str);


        // Start upperCountThread
        uct.start();


        // Start DigitCountThread instance created above
        dct.start();


        // Start isPalindrome instance created above
        ipt.start();


        // wait for the three threads to complete
        try {
            uct.join();
            dct.join();
            ipt.join();
        } catch(InterruptedException ignored) {

        }

        System.out.println("\n\nProgram has finished");


        // display digit count, upper count and whether the string is a palindrome or not

    }
}
