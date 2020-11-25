package by.epam.jonline.task1;

import org.junit.Test;

import junit.framework.Assert;

public class SquareNumberTest {

	@Test
	public void lastDigitOfSquarePozitiveTest01() {

		int number = 151;

		int actual;
		int expected = 1;

		SquareNumber obj = new SquareNumber();

		actual = obj.lastDigitOfSquare(number);

		Assert.assertEquals(expected, actual);

	}

	@Test
	public void lastDigitOfSquarePozitiveTest02() {

		int number = 0;

		int actual;
		int expected = 0;

		SquareNumber obj = new SquareNumber();

		actual = obj.lastDigitOfSquare(number);

		Assert.assertEquals(expected, actual);

	}

	@Test
	public void lastDigitOfSquarePozitiveTest03() {

		int number = -5;

		int actual;
		int expected = 5;

		SquareNumber obj = new SquareNumber();

		actual = obj.lastDigitOfSquare(number);

		Assert.assertEquals(expected, actual);

	}

}
