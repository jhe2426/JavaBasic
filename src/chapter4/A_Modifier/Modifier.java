package chapter4.A_Modifier;

import chapter4.A_AccessModifier.Example4;

//제어자
//클래스, 변수 혹은 메서드의 선언부에서 사용되는 부가적 의미를 추가해주는 키워드
//접근 제어자 : public, protect, default, private

//기타 제어자 : static, abstract, final 

//하나의 대상에 여러 개의 제어자를 종합해서 사용할 수 있다.
//단, 접근 제어자는 한 선언에 대하여 한 번만 사용할 수 있음
//제어자의 순서는 무관(접근 제어자가 가장 왼쪽으로 오게하는 것을 권장함)


//static 제어자
//해당 제어자가 포함되어있는 선언문은 클래스 단위로 사용가능하도록 함(=정적선언)
//멤버 변수, 멤버 메서드에서 사용 가능
class Example1 {
	static int number1;
	static void function1() {}
}


//final 제어자
//해당 제어자가 포함되어있는 선언문은 변경이 불가능하도록 함
//클래스, 메서드, 변수에서 사용 가능

//클래스 선언문에  final이 포함되면 해당 클래스를 상속하지 못함
final class Example2 {
	//메서드 선언문에 final이 포함되면 해당 메서드를 오버라이딩을 하지 못 함
	final void function2() {
		//변수 선언문에 final이 포함되면  초기화한 후 해당 변수의 값을 변경하지 못함
		final int NUMBER2 = 10;
		//he final local variable NUMBER2 cannot be assigned. It must be blank and not using a compound assignment라고
		//컴파일 오류가 발생
//		NUMBER2 = 12;
	}
}
class Example2_1 {
	final void function2() {}
}

class Example2_2 extends Example2_1 {
	//Cannot override the final method from Example2_1라고
	//컴파일 오류가 발생
//	void function2() {}
}


//abstract 제어자
//해당 제어자가 포함되어 있는 선언문은 선언만 되어있고 구현은 되어있지 않을음 나타냄
//클래스, 메서드에서 사용 가능

//클래스 선언문에 abstract가 포함되어 있으면 해당 클래스는 구현되지 않은 메서드를
//포함하고 있음을 의미
abstract class Example3 {
	//메서드 선언문에 abstract가 포함되어 있으면 해당 메서드는 구현되지 않았음을 의미
	abstract void function3(); 
}


public class Modifier {

	public static void main(String[] args) {
		Example4 example4 = new Example4(); 
		example4.number4 = 10;
		
		
	}

}
