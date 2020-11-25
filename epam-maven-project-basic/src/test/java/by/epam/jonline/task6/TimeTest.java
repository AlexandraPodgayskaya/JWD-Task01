package by.epam.jonline.task6;

import org.junit.Assert;
import org.junit.Test;

public class TimeTest {
	
	@Test
	public void hoursMinutesSecondsPozitiveTest01 () {
		
		int second = 7259;
		
		int [] actuals;
		int [] expecteds = {2, 0, 59};
		
		Time obj = new Time ();
		
		actuals = obj.hoursMinutesSeconds(second);
		
		Assert.assertArrayEquals(expecteds, actuals);
		
	}
	
	@Test
	public void hoursMinutesSecondsPozitiveTest02 () {
		
		int second = 30;
		
		int [] actuals;
		int [] expecteds = {0, 0, 30};
		
		Time obj = new Time ();
		
		actuals = obj.hoursMinutesSeconds(second);
		
		Assert.assertArrayEquals(expecteds, actuals);
		
	}
	
	@Test
	public void hoursMinutesSecondsNegativeTest01 () {
		
		int second = -4700;
		
		int [] actuals;
		int [] expecteds = {0, 0, 0};
		
		Time obj = new Time ();
		
		actuals = obj.hoursMinutesSeconds(second);
		
		Assert.assertArrayEquals(expecteds, actuals);
		
	}
	
	@Test
	public void hoursMinutesSecondsNegativeTest02 () {
		
		int second = 96571;
		
		int [] actuals;
		int [] expecteds = {0, 0, 0};
		
		Time obj = new Time ();
		
		actuals = obj.hoursMinutesSeconds(second);
		
		Assert.assertArrayEquals(expecteds, actuals);
		
	}

}
