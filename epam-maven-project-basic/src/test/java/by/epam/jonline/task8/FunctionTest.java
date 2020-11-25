package by.epam.jonline.task8;

import org.junit.Test;

import junit.framework.Assert;

public class FunctionTest {

	@Test
	public void functionValuePozitiveTest01() {

		double x = 3;

		double actual;
		double expected = 9;

		Function obj = new Function();

		actual = obj.functionValue(x);

		Assert.assertEquals(expected, actual);

	}

	@Test
	public void functionValuePozitiveTest02() {

		double x = 2;

		double actual;
		double expected = 0.5;

		Function obj = new Function();

		actual = obj.functionValue(x);

		Assert.assertEquals(expected, actual);

	}
	
	@Test
	public void functionValueNegativeTest01() {

		double x = 1.7976931348623157E308 ;

		double actual;
		double expected = Double.NaN;

		Function obj = new Function();

		actual = obj.functionValue(x);

		Assert.assertEquals(expected, actual);

	}

}
