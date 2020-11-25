package by.epam.jonline.task3;

import org.junit.Test;

import junit.framework.Assert;

public class SquareAreaTest {

	@Test
	public void searchSquareAreaPozitiveTest01() {

		double givenArea = 8;

		double actual;
		double expected = 4;

		SquareArea obj = new SquareArea();

		actual = obj.searchSquareArea(givenArea);

		Assert.assertEquals(expected, actual);

	}

	@Test
	public void searchSquareAreaNegativeTest01() {

		double givenArea = 0;

		double actual;
		double expected = 0;

		SquareArea obj = new SquareArea();

		actual = obj.searchSquareArea(givenArea);

		Assert.assertEquals(expected, actual);

	}

	@Test
	public void searchSquareAreaNegativeTest02() {

		double givenArea = -5;

		double actual;
		double expected = 0;

		SquareArea obj = new SquareArea();

		actual = obj.searchSquareArea(givenArea);

		Assert.assertEquals(expected, actual);

	}

}
