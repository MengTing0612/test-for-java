package Rect;

public class Rect {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        test1 re = new test1(1,2);
        PlainRect re1 =new PlainRect(10,10,20,10);
       // re.test1();
        System.out.println("矩形的面积为："+re.area());
        System.out.println("矩形的周长为："+re.area());
        System.out.println("点是否在矩形内："+re1.isInside(25.5, 13));
	}

}
