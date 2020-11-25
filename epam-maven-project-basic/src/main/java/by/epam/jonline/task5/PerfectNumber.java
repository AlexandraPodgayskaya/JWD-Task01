package by.epam.jonline.task5;

/* Составить программу, печатающую значение true, если указанное высказывание является истинным, 
и false — в противном случае: является ли целое число совершенным (сумма делителей равна самому числу).*/

public class PerfectNumber {

	public boolean isPerfectNumber(int number) {

		if (number <= 0) {
			return false;
		}

		int sum = 0;

		for (int i = 1; i < number; i++) {

			if (number % i == 0) {
				sum += i;

			}

		}

		return number == sum;

	}

}
