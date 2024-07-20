package _01_algorithms._2_fibonacci;
public class fibonacciCode {
	public static void main(String[] args) {
		int otherInt=1;
		int secondInt=0;
		int sum;
		for(int loopInt=0;loopInt<9999;loopInt++) {
			sum = otherInt + secondInt;
			secondInt = otherInt;
			otherInt = sum;   
			System.out.println(sum);
		}
	}
}

