package di;

public class Class1 {
	
	//의존성이란 한 객체가 다른 객체를 사용할 때 의존성이 있다고 한다.
	
	//다른 클래스를 선언해서 해당 인스턴스를 사용하는 것이 의존성이다.
	//private Class2 class2 = new Class2(); // 의존성을 내부에서 주입하고 있는 거 
	
	//의존성을 외부에서 받아오는 거
	private Class2 class2;
	
	//의존성을 외부에서 주입하는 거
	public Class1(Class2 class2) {
		this.class2 = class2;
	}
	
	public void method2() {
		System.out.println(class2.method1());
	}
	
}
