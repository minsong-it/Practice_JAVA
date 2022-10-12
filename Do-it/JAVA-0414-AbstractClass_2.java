package Chap11.sec01_abstractclass.Ex02_AbstractClass_2;

abstract class A{
	abstract void abc();
}

public class AbstractClass_2 {
	public static void main(String[] args) {
		
		A a1 = new A() {
			void abc() {
				System.out.println("방법 2. 익명 이너 클래스 방법으로 객체 생성");
			}
		}; //객체생성 중괄호에는 세미클론
		
		A a2 = new A() {
			void abc() {
				System.out.println("방법 2. 익명 이너 클래스 방법으로 객체 생성");
			}
		};
		
		a1.abc();   //추상메서드 정의 - > A에 있는 추상메서드 출력
		a2.abc();    //추가 객체 생성에도 똑같이 정의해줘야 함
		
	}

}
