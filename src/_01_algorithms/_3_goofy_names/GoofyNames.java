package _01_algorithms._3_goofy_names;
/*
 *    Copyright (c) The League of Amazing Programmers 2013-2017
 *    Level 0
 */

import javax.swing.JOptionPane;
import java.util.Scanner;
public class GoofyNames {
	public static void main(String[] args) {
		String name = "";
		String goofyName;
		// 1. Ask the user to enter their name
		name = JOptionPane.showInputDialog("please enter your name");
		// 2. Print upper case name to the console using .toUpperCase()
		//    Run your program to see that this works.
   goofyName = name.toUpperCase();
		int length = name.length();
		for(int num = 0; num < length; num++) {
			//System.out.println(goofyName);
			//System.out.println(name);
			if(num%2==0) {
			System.out.println(goofyName.charAt(num));
			}else {
				System.out.println(name.charAt(num));
			}
			
			}
		// 3. Loop through each character of the name (steps 4 - 7).
		//    HINT: Use .length() to determine the number of characters in the String.

		// 4. Create a char variable to store the next character of the name
		//    use .charAt()


		// 5. Use MODULO operator (%) to identify if it is an EVEN or ODD character.


		// 6. Even characters should be made uppercase and odd characters made lowercase
		//    HINT: use Character.toUpperCase() or Character.toLowerCase()


		// 7. ADD the char to the end of the name String


		// 8. Use pop-up to show user their Goofy name

	}
}

