package by.epam.jonline.task6;

// Идет n-я секунда суток, определить, сколько полных часов, полных минут и секунд прошло к этому моменту.

public class Time {

	public int[] hoursMinutesSeconds(int second) {

		int minute = 0;
		int hour = 0;

		if (second > 0 && second < 86400) {
			
			hour = second / 3600;
			second = second % 3600;
			minute = second / 60;
			second = second % 60;

		} else {

			System.out.println("Число секунд должно быть больше 0 и меньше 86400");
			return new int[3]; 

		}
		
		return new int[] { hour, minute, second };

	}
}
