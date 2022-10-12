package Chap09.Sec02_typecasting.Ex02_Typecasting_2;


class A{
	int m = 3;
	void abc() {
		System.out.println("A 클래스");
	}
}

class B extends A{
	int n = 4;
	void bcd() {
		System.out.println("B 클래스");
	}
}

public class Typecasting_2 {
	public static void main(String[] args) {
		
		A aa = new A();
		System.out.println(aa.m);
		aa.abc();    //A 클래스 내의 생성자들이니까 가능
		
		B bb = new B();
		System.out.println(bb.m);
		System.out.println(bb.n);
		bb.abc();
		bb.bcd();   //B 클래스는 A 클래스 상속받아 객체 B값을 생성했으므로 A, B 생성자 가능
		
		A ab = new B();
		System.out.println(ab.m);
		ab.abc();    //A 클래스 메소드니까 B 타입이라도 가능
		
	}

}
