package Chap11.sec02_interface.Ex05_CreatObjectOfInterface_2;

interface A{
	int a = 3;
	void abc();
}

public class CreatObjectOfInterface_2 {
	public static void main(String[] args) {
		
		A a1 = new A() {
			@Override
			public void abc() {
				System.out.println("방법 2. 익명 이너 클래스를 이용한 객체 생성");
			}
		};
		
		A a2 = new A() {
			@Override
			public void abc() {
				System.out.println("방법 2. 익명 이너 클래스를 이용한 객체 생성");
			}
		};
		
		a1.abc();
		a2.abc();  //상속에서 객체 생성을 하더라도 매번 재정의 해줘야 함
	
	}

}
