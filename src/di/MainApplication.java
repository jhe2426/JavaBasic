package di;

public class MainApplication {

	// 이렇게 외부에서 의존성을 주입했을 때 내부에서 의존성을 주입했을 때보다 덜 의존적이다.
	private static Class4 class4 = new Class4("Hi");
	private static Class3 class3 = new Class3("부산");
	
	private static Class2 class2 = new Class2(class3, class4);
	
	private static Class1 class1 = new Class1(class2);
	
	public static void main(String[] args) {
		class1.method2();
	}

}
