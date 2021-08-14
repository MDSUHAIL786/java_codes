package placement.oops;

public class Oops {
	public int a=10;
	public int b=2;
	public static int sum(int... a) {
		int tsum=0;
		for(int val:a)
			tsum+=val;
		return tsum;
	}
	
	public void fun() {
		
		System.out.println("this is fun of class oops");
	}
	public void fun1() {
		System.out.println("this is fun1 of class oops");
	}


}
