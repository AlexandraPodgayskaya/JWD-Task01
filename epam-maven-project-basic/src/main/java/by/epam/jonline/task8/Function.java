package by.epam.jonline.task8;

// Вычислить значение функции: f(x) = -x2 + 3x + 9, если x >= 3; f(x) = 1 / (x3 - 6), если x < 3.

public class Function {

	public double functionValue(double x) {

		return x < 3 ? 1 / (Math.pow(x, 3) - 6) : -Math.pow(x, 2) + 3 * x + 9;

	}

}
