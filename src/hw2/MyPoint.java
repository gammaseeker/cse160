//Joey Jiemjitpolchai, 111613728
package hw2;

public class MyPoint {

	private double x;
	private double y;
	
	public MyPoint()
	{
		this.x = 0;
		this.y = 0;
	}
	
	public MyPoint(double x, double y)
	{
		this.x = x;
		this.y = y;
	}
	
	public double getX()
	{
		return this.x;
	}
	
	public double getY()
	{
		return this.y;
	}
	
	public double distance(MyPoint point)
	{
		return Math.sqrt(Math.pow(point.y - this.y, 2) + Math.pow(point.x - this.x, 2));
	}
	
	public double distance(double x, double y)
	{
		MyPoint other = new MyPoint(x, y);
		return distance(other);
	}
}
