package Chap11.sec01_abstractclass.Ex01_AbstractClass_1;


abstract class A{
	abstract void abc();
}

class B extends A{
	void abc() {   //상속받은 추상메서드 정의 
		System.out.println("방법 1. 자식 클래스 생성 및 추상 메서드 구현");
	}
}

public class AbstractClass {
	public static void main(String[] args) {
		A b1 = new B();
		A b2 = new B();
		
		b1.abc();
		b2.abc();

	}

}
