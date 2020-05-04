package app.shape;

public class Cylinder extends Circle {
	private double height = 1.0;

	public Cylinder() {
	}
	public Cylinder(double radius, double height) {
		super(radius);
		this.height = height;
	}

	public Cylinder(double height, double radius, String color, boolean filled) {
		super(radius, color, filled);
		this.height = height;
	}

	/**
	 * @return the height
	 */
	public double getHeight() {
		return height;
	}

	/**
	 * @param height the height to set
	 */
	public void setHeight(double height) {
		this.height = height;
	}
	/**
	 * getArea
	 * Tính diện tích toàn phần
	 * 
	 * @return Double
	 */
	@Override
	public double getArea() {
		double area       = super.getArea(); // Diện tích đáy
		double areaAround = getAreaAround(); // Diện tích sung quanh hình trụ
		return area * 2 + areaAround;
	}

	/**
	 * getArea
	 * Tính diện tích sung quanh
	 * 
	 * @return Double
	 */
	public double getAreaAround() {
		double perimeter = super.getPerimeter(); // Chu vi đáy
		return perimeter * height;
	}

	/**
	 * getVolume()
	 * Tính thể tích
	 * 
	 * @return Double
	 */
	public double getVolume() {
		double area = super.getArea(); // Diện tích đáy
		return area * height;
	}

	/**
	 * toString() class description
	 * 
	 * @return String
	 */
	@Override
	public String toString() {
		return "A Cylinder with bottom radius= " + getRadius() + ", height " + getHeight();
	}
}
