package by.epam.jonline.task9;

import org.junit.Assert;
import org.junit.Test;

public class CircumferenceAndAreaCircleTest {

	@Test
	public void searchCircumferenceAndAreaCirclePozitiveTest01() {

		double radius = 5;

		double[] actuals;
		double[] expecteds = { 31.41, 78.53 };

		CircumferenceAndAreaCircle obj = new CircumferenceAndAreaCircle();

		actuals = obj.searchCircumferenceAndAreaCircle(radius);

		Assert.assertArrayEquals(expecteds, actuals, 0.10);

	}

	@Test
	public void searchCircumferenceAndAreaCircleNegativeTest01() {

		double radius = -5;

		double[] actuals;
		double[] expecteds = { 0, 0 };

		CircumferenceAndAreaCircle obj = new CircumferenceAndAreaCircle();

		actuals = obj.searchCircumferenceAndAreaCircle(radius);

		Assert.assertArrayEquals(expecteds, actuals, 0.10);

	}
	
	@Test
	public void searchCircumferenceAndAreaCircleNegativeTest02() {

		double radius = 0;

		double[] actuals;
		double[] expecteds = { 0, 0 };

		CircumferenceAndAreaCircle obj = new CircumferenceAndAreaCircle();

		actuals = obj.searchCircumferenceAndAreaCircle(radius);

		Assert.assertArrayEquals(expecteds, actuals, 0.10);

	}
	
	@Test
	public void searchCircumferenceAndAreaCircleNegativeTest03() {

		double radius = 1.7976931348623157E308;

		double[] actuals;
		double[] expecteds = { Double.POSITIVE_INFINITY, Double.POSITIVE_INFINITY };

		CircumferenceAndAreaCircle obj = new CircumferenceAndAreaCircle();

		actuals = obj.searchCircumferenceAndAreaCircle(radius);

		Assert.assertArrayEquals(expecteds, actuals, 0.10);

	}


}
