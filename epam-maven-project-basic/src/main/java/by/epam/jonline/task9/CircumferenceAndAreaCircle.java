package by.epam.jonline.task9;

// Вычислить длину окружности и площадь круга одного и того же заданного радиуса R.

public class CircumferenceAndAreaCircle {

	public double[] searchCircumferenceAndAreaCircle(double radius) {

		double circumference = 0;
		double areaCircle = 0;
		double[] circumferenceAndAreaCircle;

		if (radius > 0) {
			circumference = 2 * Math.PI * radius;
			areaCircle = Math.PI * Math.pow(radius, 2);

		} else {
			System.out.println("Радиус не может быть отрицательным.");

		}

		circumferenceAndAreaCircle = new double[] { circumference, areaCircle };
		
		return circumferenceAndAreaCircle;
		
	}

}
