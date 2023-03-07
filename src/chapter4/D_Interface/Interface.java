package chapter4.D_Interface;

//인터페이스
//추상 클래스보다 추상화 정도가 높은 존재
//추상 클래스와 다르게 일반 메서드와 일반 멤버 변수를 가질 수 없음
//메서드를 무조건 추상메서드를 받음(그래서 public abstract를 생략해도 됨)

//사용 방법 :
//interface 인터페이스명 { }
interface ExampleInterface {
	//변수를 사용할 때는 public static final 형태로만 사용 할 수 있음
	public static final int NUMBER = 10;
	
	//메서드를 사용 할 때는 public abstract로 선언해야 함
	//메서드 경우에는 public abstract를 생략해도 알아서 붙여줌
	public abstract void method1();
	public void method2();
	void method3();
}



//인터페이스 간의 상속
//, 를 써서 다중 상속이 가능
interface SubExampleInterface extends ExampleInterface {
	
}

//인터페이스 구현
//인터페이스도 추상 메서드를 포함하고 있기 때문에
//해당 메서드를 구현하는 클래스를 통해서 인스턴스를 만들어 줘야함
//인터페이스를 클래스로 구현 할 때는 implements 키워드를 사용
class Implement implements ExampleInterface {

	@Override
	public void method1() {
		System.out.println("메서드 1");
	}

	@Override
	public void method2() {
		System.out.println("메서드 2");
	}

	@Override
	public void method3() {
		System.out.println("메서드 3");
	}
	
}

public class Interface {

	public static void main(String[] args) {
		//인터페이스 자체로 인스턴스를 생성 할 수 없음
		//ExampleInterface exampleInterface = new ExampleInterface();

		//자손 클래스가 부모 인터페이스형을 메서드를 다 재정의했기 때문에 표현할 수 있으므로 다형성 적용이 가능한 것
		ExampleInterface exampleInterface = new Implement();
	}

}
