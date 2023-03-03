package chapter3.B_VariableMethod;

//클래스에서의 변수
//인스턴스 변수 : 각 각의 인스턴스마다 고유하게 가지고 있어야하는 속성을 지정할 때 사용
//클래스 변수 : 해당 클래스로 만들어진 모든 인스턴스가 동일하게 가지고 있어야하는 속성을 지정할 때 사용
//지역 변수 : 메서드 내에서 선언된 변수 (인스턴스 변수와 클래스 변수는 전역 변수라고 함)


class GalaxyPhone{
	
	//인스턴스 변수 : 인스턴스마다 고유하기 가지고 있는 속성
	//인스턴스 변수는 인스턴스가 생성된 후에 사용 가능함
	//인스턴스 변수 선언
	String model;
	String owner;
	String telNumber;
	
	//클래스 변수 : 해당 클래스로 생성된 모든 인스턴스가 동일하게 가지고 있는 속성(같은 메모리 주소를 바라보고 있음)
	//선언 방법 : static 데이터타입 변수명;
	//클래스 변수는 인스턴스 생성 없이 클래스로 사용이 가능 (인스턴스로도 사용 가능)
	//클래스 변수 선언 및 초기화
	static String maker = "SAMSUNG";
	
}


//static은 상수로 선언된 변수에  붙어서 자주 사용되어짐
class MonitorSize{
	//static final 순서로 작성하는 것이 규칙임
	static final int HEIGHT = 1080;
	static final int WIDTH = 1920;
}

public class VariableMethod {

	//VariableMethod 클래스의 전역 변수임
	int number = 10;
	
	public static void main(String[] args) {
		//main 메서드의 지역 변수
		double decimal = 10.0;
		
		int size = MonitorSize.HEIGHT * MonitorSize.WIDTH;
		
		GalaxyPhone myS23 = new GalaxyPhone();
		myS23.model = "S23";
		myS23.owner = "정하은";
		myS23.telNumber = "010-1111-2222";
		
		GalaxyPhone myS22 = new GalaxyPhone();
		myS22.model = "S22";
		myS22.owner = "정하은";
		myS22.telNumber = "010-2222-2222";
		
		System.out.println(myS23.telNumber);
		System.out.println(myS22.telNumber);
		
		//클래스 변수는 인스턴스로 접근하는 것은 옳지 않은 방법임
		//클래스 변수는 클래스명으로 접근해야함
		myS23.maker = "SAMSUNG";
		
		System.out.println(myS23.maker);
		System.out.println(myS22.maker);
		System.out.println(GalaxyPhone.maker);
		
		
		
	}

}
