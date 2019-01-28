// Author: Carter Chamberlin
// ASURITE: cdchamb3
// Date: 27 January 2019
// Assignment: Lecture Activity 5


import java.lang.Thread;


public class upperCountThread extends Thread{

    private String userString;

    public upperCountThread(String userString) {
        this.userString = userString;
    }

    public void run() {

        int count = 0;

        for (int i = 0; i < userString.length(); i++) {
            if (Character.isUpperCase(userString.charAt(i))) {
                count++;
            }
        }

        System.out.println("The string \"" + userString + "\" has " + count + " uppercase characters");
    }
}
