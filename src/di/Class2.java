package di;

public class Class2 {

//내부에서 의존성을 부여하고 있는 거
//	private Class3 class3 = new Class3("부산");
//	private Class4 class4 = new Class4("Hi");
	
	private Class3 class3;
	private Class4 class4;
	
	
	public Class2(Class3 class3, Class4 class4) {
		this.class3 = class3;
		this.class4 = class4;
	}
	
	public String method1() {
		class4.printHello();
		return class3.getName();
	}
	
}
