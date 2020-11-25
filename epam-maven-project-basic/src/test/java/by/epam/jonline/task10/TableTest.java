package by.epam.jonline.task10;

import org.junit.Assert;

import org.junit.Test;

public class TableTest {

	@Test
	public void functionValuePozitiveTest01() {

		int a = 1;
		int b = 18;
		int h = 5;

		Table obj = new Table();

		double[][] table = obj.functionValue(a, b, h);

		double[] actuals = table[0];
		double[] expecteds = { 1, 1.55740 };

		Assert.assertArrayEquals(expecteds, actuals, 0.10);

		actuals = table[1];
		expecteds = new double[] { 6, -0.29100 };

		Assert.assertArrayEquals(expecteds, actuals, 0.10);

		actuals = table[2];
		expecteds = new double[] { 11, -225.95084 };

		Assert.assertArrayEquals(expecteds, actuals, 0.10);

		actuals = table[3];
		expecteds = new double[] { 16, 0.30063 };

		Assert.assertArrayEquals(expecteds, actuals, 0.10);

	}
	
	@Test
	public void functionValuePozitiveTest02() {

		int a = -15;
		int b = 0;
		int h = 4;

		Table obj = new Table();

		double[][] table = obj.functionValue(a, b, h);

		double[] actuals = table[0];
		double[] expecteds = { -15.0, 0.85599 };

		Assert.assertArrayEquals(expecteds, actuals, 0.10);

		actuals = table[1];
		expecteds = new double[] { -11.0, 225.95084 };

		Assert.assertArrayEquals(expecteds, actuals, 0.10);

		actuals = table[2];
		expecteds = new double[] { -7.0, -0.87144 };

		Assert.assertArrayEquals(expecteds, actuals, 0.10);

		actuals = table[3];
		expecteds = new double[] { -3.0, 0.14254 };

		Assert.assertArrayEquals(expecteds, actuals, 0.10);

	}
	
	@Test
	public void functionValueNegativeTest01() {

		int a = 5;
		int b = -5;
		int h = 2;

		Table obj = new Table();

		double[][] table = obj.functionValue(a, b, h);

		double[] actuals = table[0];
		double[] expecteds = new double [1];

		Assert.assertArrayEquals(expecteds, actuals, 0.10);
		
	}
	
	@Test
	public void functionValueNegativeTest02() {

		int a = 5;
		int b = 10;
		int h = -2;

		Table obj = new Table();

		double[][] table = obj.functionValue(a, b, h);

		double[] actuals = table[0];
		double[] expecteds = new double [1];

		Assert.assertArrayEquals(expecteds, actuals, 0.10);
		
	}
	
	
}
