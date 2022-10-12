package Chap09.Sec02_typecasting.Ex01_Typecasting_1;

class A {}
class B extends A{}
class C extends B{}
class D extends B{}

public class Typecasting_1 {
	public static void main(String[] args) {
		
		//업캐스팅
		A ac = (A) new C(); //c -> a 자동 업캐스팅
		B bc = (B) new C(); //c - > b 자동 업캐스팅 
		
		B bb = new B();
		A a = (A) bb;
		
		//다운캐스팅 (캐스팅 시 예외 상황)
		A aa = new A();
		// B b = (B) aa;
		// C c = (C) aa;     a -> c 다운캐스팅은 불가능
		
		
		//다운캐스팅 가능
		A ab = new B(); 
		B b = (B) ab;      //a -> b 수동변환 가능
		//C c = (C) ab;    a -> c 다운캐스팅은 x
		
		B bd = new D();
		D d = (D) bd;
		
		A ad = new D();
		B b1 = (B) ad;
		D d1 = (D) ad;
		

	}

}
