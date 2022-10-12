package Chap11.sec02_interface.Ex01_InterfaceCharacteristics;

interface A{
	public static final int a = 3;
	public abstract void abc();
}

interface B{
	int b= 3; //자동
	void bcd();
}

public class InterfaceCharacteristics {
	public static void main(String[] args) {
		
		System.out.println(A.a);
		System.out.println(B.b);  //static이니까 인터페이스명으로 호출
		

	}

}
