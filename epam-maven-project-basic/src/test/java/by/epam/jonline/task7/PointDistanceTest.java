package by.epam.jonline.task7;

import org.junit.Test;

import junit.framework.Assert;

public class PointDistanceTest {

	@Test
	public void nearestPointPozitiveTest01() {

		Dot a = new Dot(5, 2);
		Dot b = new Dot(-3, 7);

		Dot actual;
		Dot expected = a;

		PointDistance obj = new PointDistance();

		actual = obj.nearestPoint(a, b);

		Assert.assertEquals(expected, actual);

	}

	@Test
	public void nearestPointPozitiveTest02() {

		Dot a = new Dot(2, 5);
		Dot b = new Dot(3, 4);

		Dot actual;
		Dot expected = b;

		PointDistance obj = new PointDistance();

		actual = obj.nearestPoint(a, b);

		Assert.assertEquals(expected, actual);

	}

	@Test
	public void nearestPointPozitiveTest03() {

		Dot a = new Dot(0, 0);
		Dot b = new Dot(2, 4);

		Dot actual;
		Dot expected = a;

		PointDistance obj = new PointDistance();

		actual = obj.nearestPoint(a, b);

		Assert.assertEquals(expected, actual);

	}

	@Test
	public void nearestPointNegativeTest01() {

		Dot a = new Dot(3, 2);
		Dot b = new Dot(-3, -2);

		PointDistance obj = new PointDistance();

		Assert.assertNull(obj.nearestPoint(a, b));

	}

	@Test
	public void nearestPointNegativeTest02() {

		Dot a = new Dot(5, 10);
		Dot b = new Dot(5, 10);

		PointDistance obj = new PointDistance();

		Assert.assertNull(obj.nearestPoint(a, b));

	}

	@Test
	public void nearestPointNegativeTest03() {

		Dot a = null;
		Dot b = new Dot(-5, 1);

		PointDistance obj = new PointDistance();

		Assert.assertNull(obj.nearestPoint(a, b));

	}

	@Test
	public void nearestPointNegativeTest04() {

		Dot a = null;
		Dot b = null;

		PointDistance obj = new PointDistance();

		Assert.assertNull(obj.nearestPoint(a, b));

	}

	@Test
	public void searchDistancePozitiveTest01() {

		Dot dot = new Dot(4, 3);

		double actual;
		double expected = 5;

		actual = PointDistance.searchDistance(dot);

		Assert.assertEquals(expected, actual);

	}
	
	@Test
	public void searchDistancePozitiveTest02() {

		Dot dot = new Dot(0, 0);

		double actual;
		double expected = 0;

		actual = PointDistance.searchDistance(dot);

		Assert.assertEquals(expected, actual);

	}
	
	@Test
	public void searchDistanceNegativeTest01() {

		Dot dot = null;

		double actual;
		double expected = 0;

		actual = PointDistance.searchDistance(dot);

		Assert.assertEquals(expected, actual);

	}


}
