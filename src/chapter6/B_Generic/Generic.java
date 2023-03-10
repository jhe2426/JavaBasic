package chapter6.B_Generic;
//제네릭
//다양한 타입을 다루는 메서드나 클래스에 컴파일 시 타입을 체크하는 기술
//컴파일 시 타입을 체크하기 때문에 유연하게 개발을 할 수 있다.

class GenericClass<D> {
	
	boolean status;
	String message;
	D data ;
	
	//제네릭 메서드는 GenericClass<D>이렇게만 하면 <D>이게 뭔지 모르므로 아래와 같이 <D>를 꼭  GenericClass<D>앞에 붙여줘야하는 것
	static <D> GenericClass<D> getInstance(boolean status, String message, D data) {
		GenericClass<D> instance = new GenericClass<D>();
		instance.status = status;
		instance.message = message;
		instance.data = data;
		
		return instance;
	}
}

public class Generic {

	public static void main(String[] args) {
		
		GenericClass<Integer> generic1 = new GenericClass<Integer>();
		GenericClass<String> generic2 = new GenericClass<String>();

//		generic1.data = "String";
		generic1.data = 1;
		generic2.data = "String";

		
		GenericClass<?> generic3 = GenericClass.getInstance(true, "message", "String");
		
		
	}

}
