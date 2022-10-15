package com.javaproject.example;

public class StaticBlock {
	int age;
	private StaticBlock() {
		age=40;
		System.out.println(age);
	}
	{
	System.out.println("Initialization block");	
	}
	
 static {
	System.out.println("staic block");
}
 static int createobj() {
	 StaticBlock obj1=new StaticBlock();
	 //obj1.age=45;
	 return obj1.age;
 }
 static void test() {
	System.out.println("test method");
}
static void test1() {
	
	System.out.println("test method 2");
	test();
}
public static void main(String[] a) {
	StaticBlock obj=new StaticBlock();
	System.out.println(obj.age);
	test1();
	System.out.println("main method");
}

}
