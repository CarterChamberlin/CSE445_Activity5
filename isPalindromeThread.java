// Author: Carter Chamberlin
// ASURITE: cdchamb3
// Date: 27 January 2019
// Assignment: Lecture Activity 5


import java.lang.Thread;


public class isPalindromeThread extends Thread{

    private String userString;

    public isPalindromeThread(String userString) {
        this.userString = userString;
    }

    public void run() {

        String reverseString = "";

        for (int i = userString.length() - 1; i >= 0; i--) {
            reverseString = reverseString + userString.charAt(i);
        }



        if (userString.equals(reverseString)) {

            System.out.println("The string \"" + userString + "\" is a palindrome");
        }
        else {
            System.out.println("The string \"" + userString + "\" is not a palindrome");
        }




    }

}
