package com.ques1;

public class Main {
	public static void main(String[] args){
		Bird b1 = new Parrot();
		b1.fly(); // Over
		((Parrot) b1).sing();
		
	}
}
class Bird{
	public void fly(){
		System.out.println("Bird is flying");
	}
}

class Parrot extends Bird{
	@Override
	public void fly(){
		System.out.println("I am flying");
	}
	public void sing(){
		System.out.println("I am Singing");
	}
	
}
