package Chap07_ExternalComponents.Sec01_PackageImport;

import Chap07_ExternalComponents.Sec01_PackageImport.common.A;

public class PackageImport_2 {
	public static void main(String[] args) {
		
		A a = new A();
		System.out.println(a.m);
		System.out.println(a.n);
		a.print();
		
		/*
		import Chap07_ExternalComponents.Sec01_PackageImport.common.A;
	== Chap07_ExternalComponents.Sec01_PackageImport.common.A a = new
	Chap07_ExternalComponents.Sec01_PackageImport.common.A();
		*/
		
	}

}
