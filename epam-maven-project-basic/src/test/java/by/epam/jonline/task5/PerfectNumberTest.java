package by.epam.jonline.task5;

import org.junit.Test;

import junit.framework.Assert;

public class PerfectNumberTest {

	@Test
	public void isPerfectNumberPozitiveTest01() {

		int number = 6;

		PerfectNumber obj = new PerfectNumber();

		Assert.assertTrue(obj.isPerfectNumber(number));

	}

	@Test
	public void isPerfectNumberPozitiveTest02() {

		int number = 12;

		PerfectNumber obj = new PerfectNumber();

		Assert.assertFalse(obj.isPerfectNumber(number));

	}

	@Test
	public void isPerfectNumberPozitiveTest03() {

		int number = -6;

		PerfectNumber obj = new PerfectNumber();

		Assert.assertFalse(obj.isPerfectNumber(number));

	}

}
