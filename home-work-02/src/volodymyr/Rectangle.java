package volodymyr;

public class Rectangle {

	private int width;
	private int length;

	Rectangle() {
		this.width = 5;
		this.length = 10;
	}

	Rectangle(int width, int lenght) {
		this.width = width;
		this.length = lenght;
	}

	public String toString() {
		return "����� ������������ = " + (width * length) + " " + "�������� ������������ = " + (2 * (width + length));
	}

}
