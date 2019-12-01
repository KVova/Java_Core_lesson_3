package volodymyr;

public class Application {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Rectangle a1 = new Rectangle();
		Rectangle a2 = new Rectangle(5, 10);

		System.out.println(a1);
		System.out.println(a2);
	
		Circle radius = new Circle();
		
		double rs;
		radius.setRadius(25);
		rs = radius.getS();
		System.out.println("Площа кола = " + rs);
		
		double dl;
		radius.setDiameter(25);
		dl = radius.getL();
		System.out.println("Довжина кола = " + dl);
		
	}
}
