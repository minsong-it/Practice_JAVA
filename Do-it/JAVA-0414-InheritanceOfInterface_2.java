package Chap11.sec02_interface.Ex03_inheritanceOfInterface_2;


interface A{
	public abstract void abc();
}

interface B{
	void bcd();
}

class C implements A{
	public void abc() {
		
	}
}

/*
 * public -> default 불가능
 * class D가 인터페이스 B를 상속받을 경우 메소드는 default 불가
 */

public class InheritanceOfInterface_2 {

	public static void main(String[] args) {
		

	}

}
