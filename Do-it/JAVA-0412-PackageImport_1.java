package Chap07_ExternalComponents.Sec01_PackageImport;

public class PackageImport_1 {

	public static void main(String[] args) {
		
		Chap07_ExternalComponents.Sec01_PackageImport.common.A a = new
	Chap07_ExternalComponents.Sec01_PackageImport.common.A();		
		
		System.out.println(a.m);
		System.out.println(a.n);
		a.print();
		
		

	}

}
