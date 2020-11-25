package by.epam.jonline.task1;

// Написать программу, позволяющую по последней цифре числа определить последнюю цифру его квадрата.

public class SquareNumber {

	public int lastDigitOfSquare(int number) {

		int lastDigit = number % 10;

		return lastDigit * lastDigit % 10;
		
	}

}
