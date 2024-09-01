package _02_nested_loops._3_for_loop_gauntlet;

import javax.swing.JOptionPane;

public class gauntlet {
	public static void main(String[] args) {
		// if (daFreshJays == 0) {
		// }

		String chosing = JOptionPane.showInputDialog("chose a number 1-11");
		System.out.println("you chose to run program " + chosing + "\n  running...\n");
		if (chosing.equals("1")) {
			for (int numone = 1; numone < 101; numone++) {
				System.out.println(numone);
			}}

		if (chosing.equals("2")) {
			for (int numtwo = 100; numtwo > 0; numtwo--) {
				System.out.println(numtwo);
			}}

		if (chosing.equals("3")) {
			for (int numthree = 1; numthree < 101; numthree++) {
				if (numthree % 2 == 0) {
					System.out.println(numthree);
				}}}

		if (chosing.equals("4")) {
			for (int numfour = 1; numfour < 101; numfour++) {
				if (numfour % 2 == 1) {
					System.out.println(numfour);
				}}}

		if (chosing.equals("5")) {
			for (int numfive = 1; numfive < 501; numfive++) {
				if (numfive % 2 == 1) {
					System.out.println(numfive + " is odd");
				}else {
					System.out.println(numfive + " is even");
				}}}

		if (chosing.equals("6")) {
			for (int numsix = 1; numsix < 778; numsix++) {
				if (numsix % 7 == 0) {
					System.out.println(numsix);
				}}}

		if (chosing.equals("7")) {
			for (int numseven = 2010; numseven < 2025; numseven++) {
				int age = numseven-2010;
				System.out.println("in " + numseven + " I was " + age);
			}}

		if (chosing.equals("8")) {
			for (int numeight = 0; numeight < 3; numeight++) {
				for (int numeighttwo = 0; numeighttwo < 3; numeighttwo++) {
					System.out.println(numeight + " "+numeighttwo);
				}
			}
		}

		if (chosing.equals("9")) {
			for (int numninetwo = 0; numninetwo < 3; numninetwo++) {

				for (int numnine = 1; numnine < 4; numnine++) {

					System.out.print(numninetwo * 3 + numnine + " ");
				}
				System.out.println("");	

			}
		}

		if (chosing.equals("10")) {
			for (int numtentwo = 0; numtentwo < 10; numtentwo++) {

				for (int numten = 1; numten < 11; numten++) {
					if(numtentwo<1) {
						System.out.print(numtentwo * 10 + numten + "  ");
					}else {
						System.out.print(numtentwo * 10 + numten + " ");
					}
				}
				System.out.println("");	
			}

		}

		if (chosing.equals("11")) {
			for (int numeltwo = 1; numeltwo < 7; numeltwo++) {			
				for (int numel = 0; numel < numeltwo; numel++) {
					System.out.print("*");
				}
				
				System.out.println("");
			}

		}
	



		

















	}  
}