package Uri;

public class Uri1043 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		double a, b, c, perimetro, area;

		a = sc.nextDouble();
		b = sc.nextDouble();
		c = sc.nextDouble();
		
		perimetro = a + b + c;
		area = (a + b) * c / 2;

		if ((a < b + c) && (b < a + c) && (c < a + b)) {
			System.out.printf("Perimetro = %.1f%n", perimetro);

		} else
			System.out.printf("Area = %.1f%n", area);

		sc.close();
	}

}
