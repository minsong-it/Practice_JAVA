package Chap10.sec02_abstractmodifier.Ex02_AbstractModifier_2;

abstract class Animal{
	abstract void cry();
}

class Cat extends Animal{    
	void cry() {      //상속받은 추상메서드를 정의
		System.out.println("양옹");
	}
}

class Dog extends Animal{
	void cry() {
		System.out.println("왈왈");
	}
}

public class AbstractModifier_2 {
	public static void main(String[] args) {
		
		Animal animal1 = new Cat();  //객체생성
		Animal animal2 = new Dog();  
		
		animal1.cry();   //정의한 추상메서드 출력
		animal2.cry();
		
	}
}
