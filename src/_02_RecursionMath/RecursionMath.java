package _02_RecursionMath;

public class RecursionMath {

	public static int recursiveMultiplication(int number, int times) {
		// If times is 1
		if (times == 1) {
			return number;
		} else if ((times == 0) || (number == 0)) {
			return 0;
		}
		// Return number

		// Else return number + recursionMultiplication(number, times-1)
		return number + recursiveMultiplication(number, times - 1);

	}

	// Try this one on your own!
	// Hint: if numberToDivideBy is bigger than number,
	// you can't divide anymore
	public static int recursiveDivision(int number, int numberToDivideBy) {
		if (numberToDivideBy == 0) {
			return 0;
		} else if (numberToDivideBy > number) {
			return 0;
		}
		return 1 + recursiveDivision(number - numberToDivideBy, numberToDivideBy);

	}

	// Try this one on your own!
	public static int recursivePower(int number, int power) {
		if (power == 0) {
			return 1;
		}
		return number * recursivePower(number, power - 1);
	}
}
