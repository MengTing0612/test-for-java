package Rect;

 class PlainRect extends test1 {
	double startx;
	double starty;
	double length;  //这里有问题
	double  width;
	
	PlainRect(double x,double y,double i, double j )
	{
		startx=x;
		starty=y;
		length=i;
		width =j;
		
	}
	PlainRect()
	{
		startx=0;
		starty=0;
	}
	public boolean isInside(double x,double y)
	{
		if((startx+length)>x&x>startx) 
			if((starty+width)>y&y>starty)
				return true;
			else 
				return false;
		else 
		        return false;
	}

}
