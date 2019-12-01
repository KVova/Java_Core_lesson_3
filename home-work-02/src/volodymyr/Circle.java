package volodymyr;

public class Circle {
	
	private double s;
	private double l;
	
	public double getS(){
		return s;
	}
	
	public void setRadius(double radius) {
		this.s = Math.PI*Math.pow(radius, 2);
	}
	
	public double getL() {
		return l;
	}
	
	public void setDiameter(double diameter) {
		this.l = Math.PI*diameter;
	}

}
