package Rect;

public class test1 {
	public  double length;
	public  double width;
	
	test1(int x,int y)
	{
		length=x;
		width=y;
	}
	
	test1()
	{
		
	}
	public double area()
	{
		
		return length*width;
	}
	
	public double len()
	{
		
		return 2*(length+width);
	}

}
