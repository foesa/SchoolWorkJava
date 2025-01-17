import java.util.Arrays;
import java.util.Scanner;

public class SieveofEratosthenes {
	public static boolean[] sieve(int n){
		boolean[] sequence = createSequence(n);
		for(int count = 0;count<=n;count++) {
			int higherMultiple = count+2;
			if(sequence[count]==true) {
				sequence = crossOutHigherMultiples(higherMultiple, sequence);
			}
			String crossedOut = sequenceToString(sequence);
			System.out.println(crossedOut);
			
		}
		return sequence; 
	}
	public static boolean[] createSequence(int n){
			boolean[] numberArray = new boolean[n-1];
			Arrays.fill(numberArray, true);
			return numberArray;
	}
	public static boolean[] crossOutHigherMultiples(int n, boolean[] numberArray){
		for (int count = 0; count<numberArray.length;count++) {
			if(n*(count+2)<=numberArray.length-1) {
				numberArray[(count+2)*n] = false;
			}
			else {
				count = numberArray.length;
			}
		}
		return numberArray;
	}
	public static String sequenceToString(boolean[] numberArray) {
		String crossedOutString = "";
		for(int count = 0; count<numberArray.length;count++) {
			int number = count + 2;
			if(numberArray[count]==true) {
				crossedOutString += number+",";
			}
			else {
				crossedOutString += "["+number+"]"+",";
			}
		}
		return crossedOutString;
	}
	public static String nonCrossedOutSubSeqToString(boolean[] numberArray) {
		String nonCrossedOut = "";
		for (int count = 0; count<numberArray.length; count++) {
			int number = count + 2;
			if(numberArray[count]==true) {
				nonCrossedOut += number+",";
			}
		}
		return nonCrossedOut;
	}
	public static void main(String[]args) {
		Scanner inputScanner = new Scanner(System.in);
		System.out.println("Please enter a number to find the prime numbers: ");
		int maxNumber = inputScanner.nextInt();
		boolean[] numberSieve = sieve(maxNumber);
		String sieve = nonCrossedOutSubSeqToString(numberSieve);
		System.out.println(sieve);
	}
}