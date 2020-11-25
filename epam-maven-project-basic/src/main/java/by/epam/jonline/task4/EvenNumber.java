package by.epam.jonline.task4;

/* Составить программу, печатающую значение true, если указанное высказывание является истинным,
и false — в противном случае: среди заданных целых чисел А, В, С, D есть хотя бы два четных.*/

public class EvenNumber {

	public boolean MinTwoEvenNumber(int a, int b, int c, int d) {

		int[] array = new int[] { a, b, c, d };
		int counter = 0;

		for (int number : array) {

			if (number % 2 == 0) {
				counter++;

			}
		}

		return counter >= 2;

	}

}
