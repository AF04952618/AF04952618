package com.ajp1;

public class StaticEx {
	//instance
	int num;
	//static variables
	static int val;
	
	//static method
	static void getMsg() {
		System.out.println("Static method"+val);
	}	
	//instance
	void getcall() {
		System.out.println("Static method"+val+","+num);
	}
    public static void main(String[] args) {
		val=10;
		System.out.println(val);
		StaticEx staticEx=new StaticEx();
		staticEx.num=20;
		System.out.println(staticEx.num);
		staticEx.val=30;
		System.out.println(staticEx.val);
		getMsg();
    }


}


