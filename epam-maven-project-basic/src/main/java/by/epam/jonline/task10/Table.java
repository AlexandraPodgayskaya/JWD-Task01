package by.epam.jonline.task10;

/* Составить программу для вычисления значений функции F(x) на отрезке [а, b] с шагом h. 
Результат представить в виде таблицы, первый столбец которой – значения аргумента, второй - 
соответствующие значения функции. F(x) = tg (x).*/

public class Table {

	public void outputTable(double[][] table) {

		for (int i = 0; i < table.length; i++) {

			for (int j = 0; j < table[i].length; j++) {

				System.out.print(table[i][j] + "  " + '\t');

			}

			System.out.println();

		}

	}

	public double[][] functionValue(int a, int b, int h) {

		double[][] table;

		if (b > a && h > 0) {

			table = new double[(b - a) / h + 1][2];

			int x = a;

			for (int i = 0; i < table.length; i++) {

				table[i][0] = x;
				table[i][1] = Math.tan(x);
				x = x + h;

			}

		} else {

			System.out.println("Параметры заданы неверно");
			table = new double[1][1];

		}

		outputTable(table);

		return table;
	}

}
