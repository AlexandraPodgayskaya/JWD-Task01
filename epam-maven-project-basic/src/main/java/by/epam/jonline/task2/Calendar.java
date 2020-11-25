package by.epam.jonline.task2;

/* Составить программу, которая по заданным году и номеру месяца определяет количество дней в этом месяце, 
и чтобы корректно определялись все високосные года.*/

public class Calendar {

	public int numberOfDays(int month, int year) {

		int numberOfDays = 0;

		if (year > 0) {

			switch (month) {

			case 1:
				numberOfDays = 31;
				break;

			case 2:
				numberOfDays = year % 4 == 0 ? 29 : 28;
				break;

			case 3:
				numberOfDays = 31;
				break;

			case 4:
				numberOfDays = 30;
				break;

			case 5:
				numberOfDays = 31;
				break;

			case 6:
				numberOfDays = 30;
				break;

			case 7:
				numberOfDays = 31;
				break;

			case 8:
				numberOfDays = 31;
				break;

			case 9:
				numberOfDays = 30;
				break;

			case 10:
				numberOfDays = 31;
				break;

			case 11:
				numberOfDays = 30;
				break;

			case 12:
				numberOfDays = 31;
				break;

			default:
				System.out.println("Заданного номера месяца не существует");

			}

		} else {

			System.out.println("Значение года должно быть больше 0");

		}

		return numberOfDays;

	}

}
