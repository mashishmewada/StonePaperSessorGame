package com.JavaSPS;

public class factorial {

//	static int facto(int n) {
//	if(n==0 || n==1) {
//		return 1;
//	}
//	else {
//		return n * facto(n-1);
//	}
//}
static int facto_iterative(int n) {
	if(n==0 || n==1) {
		return 1;
	}
	else {
		int product = 1;
		for (int i = 1; i <= n; i++) {
			product *= i;
		}
		return product;
		} 
}

public static void main(String[] args) {
	// TODO Auto-generated method stub
	
	int x =  5;
	//System.out.println("The value of x Factorial is " +facto(x));
	System.out.println("The value of x Factorial iterative is " +facto_iterative(x));

}

}
