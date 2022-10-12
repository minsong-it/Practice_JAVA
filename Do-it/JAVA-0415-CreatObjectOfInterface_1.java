package Chap11.sec02_interface.Ex04_CreatObjectOfInterface_1;

interface A{
	int a = 3;
	void abc();
}

class B implements A{
	public void abc() {
		System.out.println("방법 1. 자식 클래스 생성자로 객체 생성");
	}
}

public class CreatObjectOfInterface_1 {

	public static void main(String[] args) {
		
		A b1 = new B();
		A b2 = new B();
		
		b1.abc();
		b2.abc(); //둘다 상속받은 메소드 출력
		
	}

}
