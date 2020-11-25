package by.epam.jonline.task7;

/* Даны две точки А(х1, у1) и В(х2, у2). Составить алгоритм, определяющий, которая из точек находится 
ближе к началу координат x y.*/

public class PointDistance {

	public Dot nearestPoint(Dot a, Dot b) {

		Dot nearestPoint = null;

		if (a != null && b != null) {
			
			if (searchDistance(a) < searchDistance(b)) {
				nearestPoint = a;
				
			} else if (searchDistance(b) < searchDistance(a)) {
				nearestPoint = b;
				
			} else {
				System.out.println("Две точки находятся на одинаковом расстоянии от начала координат.");
				
			}
			
		} else {
			System.out.println("Точка не может быть null.");
			
		}
		
		return nearestPoint; 

	}

	public static double searchDistance(Dot dot) {
		
		if (dot == null) {
			System.out.println("Точка не может быть null.");
			return 0;
			
		}
		
		return Math.sqrt(Math.pow(dot.x, 2) + Math.pow(dot.y, 2));

	}

}
