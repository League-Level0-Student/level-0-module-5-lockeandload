package _01_algorithms._1_prime_or_not;
import javax.swing.JOptionPane;

import processing.core.PApplet;

public class pirimeOrNot {
	public static void main(String[] args) {
		String num = JOptionPane.showInputDialog("please enter a number");
		int numInt = Integer.parseInt(num);	
		int numCheck;
		for(numCheck =2; numCheck<numInt; numCheck++){
			System.out.println(numCheck);
			if(numInt%numCheck==0){
				JOptionPane.showMessageDialog(null,"It is not a prime number");	
				System.exit(0);
			  }	
		}
		JOptionPane.showMessageDialog(null,"It is a prime number");	
		System.exit(0);
	}

}
