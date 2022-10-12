package Chap09.Sec01_inheritancepolymorphism.Ex02_Polymorphism;


class A{}
class B extends A{}
class C extends B{}
class D extends B{}


public class Polymorphism {
	public static void main(String[] args) {
		
		A a1 = new A();
		A a2 = new B(); //B는 A이다 o 
		A a3 = new C();
		A a4 = new D();
		
		B b2 = new B(); //A 객체 생성불가 A는 B이다 x
		B b3 = new C();
		B b4 = new D();
		
		C c3 = new C();  // C는 C이다 가능, B는 C이다 x
		
		D d4 = new D(); // D는 D이다 가능, B는 Ddlek x
	

	}

}
