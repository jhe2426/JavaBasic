package chapter4.B_Polymorphism;
//자식 클래스는 부모 클래스 멤버들을 다 표현할 수 있으므로 자동 형 변환이 가능하므로  
	//- 자식 클래스는 언제나 부모 클래스를 대체할 수 있다는 원칙
	//- 부모 클래스가 들어갈 위치에 자식 클래스가 위치해도 정상 작동해야 하는 원칙
//부모 클래스는 자식 클래스의 멤버를 다 표현할 수 없기 때문에 형 변환을 명시해줘야한다.
	//자손 클래스에는 멤버가 없어도 즉, 부모 클래스 멤버들만 가지고 있어 부모와 같아도 부모는 그것을 알길이 없으므로 자동 형 변환이 불가능하다.
//다형성
//조상 클래스 타입의 참조 변수로 자손 클래스의 인스턴스를 참조할 수 있도록 하는 것
//쉽게 말해서 참조 변수의 형 변환이라고 함

class SuperClass {
	int number1;
	int number2;


	SuperClass(int number1, int number2) {
		this.number1 = number1;
		this.number2 = number2;
	}
	
	void method1() {}
	void method2() {}
}

//조상의 기본 생성자가 사라지면 자손 클래스들은 생성자를 만들어 줘야한다.
class SubClass1 extends SuperClass {
	int number3;

	SubClass1(int number1, int number2, int number3) {
		super(number1, number2);
		this.number3 = number3;
	}
	
	void method3() {}
}

//조상의 기본 생성자가 사라지면 자손 클래스들은 생성자를 만들어 줘야한다.
//java 규칙 중 부모클래스에 기본 생성자가 없는 클래스를 상속받는 경우 부모클래스의 생성자를 호출해야 된다는 규칙이 있습니다. 
//자식 객체를 생성하면, 부모 객체를 먼저 생성한 후, 자식 객체가 그 다음에 생성됩니다.
//그러므로 기본 생성자가 없다는 것은 자식들의 기본 생성자로 부모의 생성자를 사용할 수 없게 되므로
//부모 클래스에 존재하는 생성자를 자식 생성자에도 명시를 해줘 자식 클래스가 생성이 될 때 부모 먼저 생성자가 호출이 되고 그 다음에
//자식의 클래스의 생성자가 생성되어야 하므로 꼭 자식 클래스의 생성자에는 부모 클래스를 초기하는 것이 들어가 있어야 한다.
class SubClass2 extends SuperClass {
	SubClass2(int number1, int number2) {
		super(number1, number2);
	}
	
	void method1() {
		System.out.println("Override!!");
	}
	
}


public class Polymorphism {

	public static void main(String[] args) {
		SuperClass superClass = new SuperClass(1,2);
		SubClass1 subClass1 = new SubClass1(11,22,33);
		SubClass2 subClass2 = new SubClass2(111,222);
		
		//자손 타입 -> 조상 타입(Up casting) : 자동 형 변환 가능
		SuperClass super1 = subClass1; // 바라 보는 곳은 같지만 바라볼 수 있는 범위가 달라지는 것 
		SuperClass super2 = subClass2;
		
		System.out.println(subClass1.number3);
		System.out.println(subClass1);
		System.out.println(super1);
		//참조변수의 형 변환을 한다고 하더라도 인스턴스가 가지고 있는 데이터에는
		//아무런 영향을 미치지 않음
		//단지 인스턴스의 사용 범위를 조절하는 것
//		- 형변환은 참조변수의 타입을 변환하는 것이지 인스턴스를 변환하는 것은 아니기 때문에 참조변수의 형변환은 인스턴스에 아무런 영향을 미치지 않음
//		- 단지 참조변수의 형변환을 통해서, 참조하고 있는 인스턴스에서 사용할 수 있는 멤버의 범위를 조절하는 것뿐임
		SubClass1 sub1 = (SubClass1)super1; //그래서 다시 형 변환을 해주면 바라보는 곳은 같기 때문에 처음 초기화 했던 값들이 들어가 있고 사용할 수 있는 범위가 늘러나는 것
		
	
		System.out.println(sub1.number3);
		System.out.println(sub1);
		
		super2.method1();
		
		
		
		//조상 타입 -> 자손 타입(Down casting) : 자동 형 변환 불가능
//		SubClass1 sub1 = (SubClass1)superClass;
//		SubClass2 sub2 = (SubClass2)superClass; 
		
		
		//여러 종류의 객체를 배열로 다루기
		//한 배열의 타입을 부모형으로 지정한 뒤 인덱스 값으로 자손의 객체들이 들어오게 만드는 것은 아주 안 좋은 코드임
		//사용할 일 없음
		//매개변수 다형성도 별로 좋치 않음(사용하면 if문으로 걸러줘야하므로 코드가 좋지 않게 됨)
		
		
		
		
		
		
		
	}

}
