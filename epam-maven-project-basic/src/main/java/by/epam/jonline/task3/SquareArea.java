package by.epam.jonline.task3;

/* Окружность вписана в квадрат заданной площади. Найти площадь квадрата, вписанного в эту окружность.
Во сколько раз площадь вписанного квадрата меньше площади заданного? */

public class SquareArea {

	public double searchSquareArea(double givenArea) {

		double squareArea = 0;

		if (givenArea > 0) {

			squareArea = givenArea / 2;
			System.out.println("Площадь вписанного квадрата меньше площади заданного квадрата в "
					+ givenArea / squareArea + " раз(а)");

		} else {

			System.out.println("Неверно задан параметр");

		}

		return squareArea;
	}

}
