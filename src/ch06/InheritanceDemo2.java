package ch06;

public class InheritanceDemo2 {

	public static void main(String[] args) {

	}

}

// Class A <-- Class B 
//class A {
//	
//}
//
//class B extends A{
//	
//}
//
////class A <--  Class B <-- Class C
////class C extends B{
////	
////}
//
////class A <--  Class B
////class A <--  Class C
////class A <--  Class D
//class C extends A{
//	
//}
//class D extends A{
//	
//}

//class A <-- class C (X) 다중 상속은 자바는 허용하지 않음 
//class B <-- Class C (X)
class A {
	String name;

	void method() {
		System.out.println("A의 메서드");
	}
}

class B {
	String name;

	void method1() {
		System.out.println("B의 메서드");
	}
}

//class C extends A, B { //다중 상속은 안된다
//	
//}