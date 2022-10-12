package Chap08.sec01_accessmdifier.Ex01_AccessModifierOfMember;

import Chap08.sec01_accessmdifier.Ex01_AccessModifierOfMember.pack1.A;
import Chap08.sec01_accessmdifier.Ex01_AccessModifierOfMember.pack1.B;
import Chap08.sec01_accessmdifier.Ex01_AccessModifierOfMember.pack2.C;
import Chap08.sec01_accessmdifier.Ex01_AccessModifierOfMember.pack2.D;

public class AccessModifierOfMember {
	public static void main(String[] args) {
		A a = new A();
		B b = new B();
		C c = new C();
		D d = new D();
		
		a.print();
		b.print();
		c.print();
		d.print();
		

	}

}
