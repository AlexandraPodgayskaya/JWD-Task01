package by.epam.jonline.task2;

import org.junit.Test;

import junit.framework.Assert;

public class CalendarTest {

	@Test
	public void numberOfDaysPozitiveTest01() {

		int month = 2;
		int year = 2020;

		int actual;
		int expected = 29;

		Calendar obj = new Calendar();

		actual = obj.numberOfDays(month, year);

		Assert.assertEquals(expected, actual);

	}

	@Test
	public void numberOfDaysPozitiveTest02() {

		int month = 2;
		int year = 2019;

		int actual;
		int expected = 28;

		Calendar obj = new Calendar();

		actual = obj.numberOfDays(month, year);

		Assert.assertEquals(expected, actual);

	}

	@Test
	public void numberOfDaysPozitiveTest03() {

		int month = 5;
		int year = 1992;

		int actual;
		int expected = 31;

		Calendar obj = new Calendar();

		actual = obj.numberOfDays(month, year);

		Assert.assertEquals(expected, actual);

	}

	@Test
	public void numberOfDaysNegativeTest01() {

		int month = 4;
		int year = -1900;

		int actual;
		int expected = 0;

		Calendar obj = new Calendar();

		actual = obj.numberOfDays(month, year);

		Assert.assertEquals(expected, actual);

	}

	@Test
	public void numberOfDaysNegativeTest02() {

		int month = 15;
		int year = 2015;

		int actual;
		int expected = 0;

		Calendar obj = new Calendar();

		actual = obj.numberOfDays(month, year);

		Assert.assertEquals(expected, actual);

	}
	
}
