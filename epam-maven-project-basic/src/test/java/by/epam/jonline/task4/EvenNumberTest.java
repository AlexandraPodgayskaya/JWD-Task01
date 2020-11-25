package by.epam.jonline.task4;

import org.junit.Test;

import junit.framework.Assert;

public class EvenNumberTest {

	@Test
	public void MinTwoEvenNumberPozitiveTest01() {

		int a = 5;
		int b = 7;
		int c = 3;
		int d = 1;

		EvenNumber obj = new EvenNumber();

		Assert.assertFalse(obj.MinTwoEvenNumber(a, b, c, d));

	}

	@Test
	public void MinTwoEvenNumberPozitiveTest02() {

		int a = -5;
		int b = 10;
		int c = 11;
		int d = -3;

		EvenNumber obj = new EvenNumber();

		Assert.assertFalse(obj.MinTwoEvenNumber(a, b, c, d));

	}

	@Test
	public void MinTwoEvenNumberPozitiveTest03() {

		int a = 5;
		int b = 10;
		int c = 15;
		int d = 20;

		EvenNumber obj = new EvenNumber();

		Assert.assertTrue(obj.MinTwoEvenNumber(a, b, c, d));

	}

	@Test
	public void MinTwoEvenNumberPozitiveTest04() {

		int a = -1;
		int b = 16;
		int c = -8;
		int d = 8;

		EvenNumber obj = new EvenNumber();

		Assert.assertTrue(obj.MinTwoEvenNumber(a, b, c, d));

	}

	@Test
	public void MinTwoEvenNumberPozitiveTest05() {

		int a = -2;
		int b = 10;
		int c = -8;
		int d = 20;

		EvenNumber obj = new EvenNumber();

		Assert.assertTrue(obj.MinTwoEvenNumber(a, b, c, d));

	}

	@Test
	public void MinTwoEvenNumberPozitiveTest06() {

		int a = 0;
		int b = 0;
		int c = 0;
		int d = 0;

		EvenNumber obj = new EvenNumber();

		Assert.assertTrue(obj.MinTwoEvenNumber(a, b, c, d));

	}

}
