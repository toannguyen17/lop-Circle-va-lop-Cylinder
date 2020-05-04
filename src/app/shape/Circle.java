package app.shape;

public class Circle {
	protected double  radius = 1.0;
	protected String  color  = "green";
	protected boolean filled = true;

	public Circle() {
	}

	public Circle(double radius) {
		this.radius = radius;
	}

	public Circle(double radius, String color, boolean filled) {
		this.color  = color;
		this.filled = filled;
		this.radius = radius;
	}

	/**
	 * getColor()
	 * 
	 * @return String
	 */
	public String getColor() {
		return color;
	}

	/**
	 * setColor()
	 */
	public void setColor(String color) {
		this.color = color;
	}

	/**
	 * isFilled()
	 * 
	 * @return Boolean
	 */
	public boolean isFilled() {
		return filled;
	}

	/**
	 * setFilled
	 */
	public void setFilled(boolean filled) {
		this.filled = filled;
	}

	/**
	 * getRadius()
	 * 
	 * @return Double
	 */
	public double getRadius() {
		return radius;
	}

	/**
	 * setRadius()
	 */
	public void setRadius(double radius) {
		this.radius = radius;
	}

	/**
	 * getArea
	 * 
	 * @return Double
	 */
	public double getArea() {
		return radius * radius * Math.PI;
	}

	/**
	 * getPerimeter()
	 * 
	 * @return Double
	 */
	public double getPerimeter() {
		return 2 * radius * Math.PI;
	}

	/**
	 * toString()
	 * class description
	 * 
	 * @return String
	 */
	@Override
	public String toString() {
		return "A Circle with radius=" + getRadius();
	}
}
