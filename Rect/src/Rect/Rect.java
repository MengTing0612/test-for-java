package Rect;

public class Rect {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        test1 re = new test1(1,2);
        PlainRect re1 =new PlainRect(10,10,20,10);
       // re.test1();
        System.out.println("���ε����Ϊ��"+re.area());
        System.out.println("���ε��ܳ�Ϊ��"+re.area());
        System.out.println("���Ƿ��ھ����ڣ�"+re1.isInside(25.5, 13));
	}

}
