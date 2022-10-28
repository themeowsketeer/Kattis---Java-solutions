public class Quadratic {

	public static void main(String[] args) {
		double a = Double.parseDouble(args[0]);
		double b = Double.parseDouble(args[1]);
		double c = Double.parseDouble(args[2]);

		double delta = b * b - 4 * a * c;

		double root1 = (-b + Math.sqrt(delta)) / (2 * a * c);
		double root2 = (-b - Math.sqrt(delta)) / (2 * a * c);

		System.out.println("Two roots");
		System.out.println(root1);
		System.out.println(root2);
	}

}
