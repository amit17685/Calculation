package calculate;

public class calculate {
	
	private int a,b,c;
	static int x=10;
	public int getAdd(int a,int e) {
		this.a=a;
		b=e;
	 c=a+b;
	 return c;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		calculate obj1=new calculate();
		int h=obj1.getAdd(5, 6);
		
		System.out.println("value of d=" +h);
		System.out.println("Value of C is " + obj1.c);
		System.out.println("value of d=" +x);
		System.out.println("value of d=" +obj1.x);	
		System.out.println("value of d=" +calculate.x);
	}

}
