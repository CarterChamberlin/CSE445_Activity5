// Author: Carter Chamberlin
// ASURITE: cdchamb3
// Date: 27 January 2019
// Assignment: Lecture Activity 5


import java.lang.Thread;


public class DigitCountThread extends Thread{

    private String userString;

    public DigitCountThread(String userString) {
        this.userString = userString;
    }

    public void run() {

        int count = 0;
        for (int i = 0; i < userString.length(); i++) {
            if (Character.isDigit(userString.charAt(i))) {
                count++;
            }
        }

        System.out.println("The string \"" + userString + "\" has " + count + " digits in it");

    }

}
