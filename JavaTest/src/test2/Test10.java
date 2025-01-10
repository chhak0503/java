package test2;

public class Test10 {
	public static void main(String[] args) {
		
		for(int i=0 ; i<10 ; i++) {
			System.out.print(fibo(i)+" ");
		}		
		
	}
	
	public static int fibo(int n) {
		if(n <= 1) {
			return n;
		}
		return fibo(n-2) + fibo(n-1);
	}	
}