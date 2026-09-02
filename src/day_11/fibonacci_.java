package day_11;

public class fibonacci_ {
	public static void main(String[] args) {
		
	
	int a=0,b=1;
	int n=8;
	System.out.print(a+ " "+b+" ");
	for(int i=2;i<=n;i++) {
		int x=a+b;
		a=b;
		b=x;		
		System.out.print(x+" ");
	}

}}
