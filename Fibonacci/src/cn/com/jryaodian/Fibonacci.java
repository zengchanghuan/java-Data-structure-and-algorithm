package cn.com.jryaodian;

public class Fibonacci {

	public static int fibonacci(int n) {
		if (n <= 1)
		{
			return n;
		}
		else {
			return fib(n - 1) + fib(n - 1);
		}
	}
	public static int fibonacci2(int n) {
		if (n <= 1)
		{
			return n;
		}
		else {
			int first = 0;
			int second = 1;
			for (int i = 0;i < n - 1;i++) {
				int sum = first + second;
				first = second;
				second = sum;
				
			}
			return second;
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		System.out.println(fibonacci(30));
		System.out.println(fibonacci2(64));
	}

}
