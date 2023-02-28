package chapter3.A_ClassObject;

//class 
//설계도
//객체를 정의해 놓은 것
//객체를 생성하는 기반
//객체를 정의하는 틀 또는 설계도
//구조체에 메서드가 포함되어있는 것을 class라고도 하기도 함
//구조체 : 연속되는 메모리공간에 다른 타입의 변수가 저장이 되도록 되어있는 것을 의미

//클래스는 객체의 상태를 나타내는 필드와 객체의 행동을 나타내는 메서드로 구성이 됨
//필드  : 클래스에 포함된 변수 혹은 상수
//메서드 : 어떠한 특정 작업을 수행하기 위한 명령문의 집합

//object(객체)
//실제로 존재하는 모든 것들을 의미 
//클래스로 생성된 실체

//클래스로 생성된 각 각의 객체는 독립적으로 존재함
//같은 클래스로 생성된 객체라 하더라도 각 각이 가지고 있는 '속성의 값'은 다를 수 있음(일반적으로 다름)

//클래스 선언 방법
//class 클래스명 { 속성1, 속성2, ..., 기능1, 기능2, ...}
//속성 : 변수, 특성, 필드, 상태라고  표현 함
//기능 : 메서드, 함수, 행위라고 표현 함

//클래스 명은 UpperCamelCase 명명 규칙을 따름
class SmartPhone {
	
	//속성 및 특성 및 상태(변수로 나타내면 됨)
	//기종
	String modelName;
	//색상
	String color;
	//메모리
	int memory;
	//전화번호
	String telNumber;
	//전원(상태)
	boolean power;
	
	//기능
	//전화 걸기
	void call(String toTelNumber) {
		System.out.println(toTelNumber + "로 전화를 겁니다.");
	}
	//영상 시청
	void watchVideo() {
		System.out.println("영상을 시정합니다.");
	}
	//메세지 보내기
	void sendMessage(String message, String toTelNumber) {
		System.out.println(toTelNumber + "로 " + message + " 를 보냅니다.");
	}
	//전원키고 끄기
	void setPower() {
		power = !power;
	}
	
}


public class ClassObject {

	public static void main(String[] args) {
		//인스턴스
		//특정 클래스로 생성된 객체를 '인스턴스'라고 함
		//클래스로 객체를 생성하는 행위를 '인스턴스화'한다라고 함
		
		//인스턴스 선언 방법
		//클래스 참조변수명(인스턴스명);
		SmartPhone iPhone14;
		
		//인스턴스 생성 방법
		//참조변수명 = new 클래스명();
		iPhone14 = new SmartPhone(); //iPhone14는 인스턴스가 됐음(메모리 주솟값을 부여 받음)
		SmartPhone iPhone14Pro = new SmartPhone();
		System.out.println(iPhone14);
		System.out.println(iPhone14Pro);

		//인스턴스의 속성 접근 및 기능 사용
		//속성 접근 : 참조변수.멤버변수;
		//기능 사용 : 참조변수.메서드([매개변수[, ....]]);
		iPhone14.modelName = "IPHONE";
		iPhone14.color = "black";
		iPhone14.memory = 512;
		iPhone14.telNumber = "010-1111-2222";
		iPhone14.power = false;
		
		System.out.println(iPhone14.modelName);
		System.out.println(iPhone14.telNumber);
		
		//참조형 데이터 타입은 초기화가 안 됐을 때는 null값이 디폴트로 들어가 있음
		//자바에서 null은 메모리의 위치를 아직 지정하지 않았다.(지정 되지 않았다)를 의미
		//null은 어떤 데이터도 없는 것(값이 아예 존재하지 않는 것)
		//기본형 데이터 타입 중(실수들은) 초기화가 안 됐을 때는 0값이 디폴트로 들어가 있음
		//기본형 데이터 타입 중 boolean형은  초기화가 안 됐을 때는 false값이 디폴트로 들어가 있음
		//기본형 데이터 타입은 초기화가 안 됐을 때는 메모리의 모든 칸에 다 0이 들어감
		 System.out.println(iPhone14Pro.modelName);
		 System.out.println(iPhone14Pro.memory);
		 System.out.println(iPhone14Pro.power);
		 
		 iPhone14.call("010-2222-2222");
		 iPhone14.watchVideo();
		 System.out.println(iPhone14.power);
		 iPhone14.setPower();
		 System.out.println(iPhone14.power);
		 iPhone14.sendMessage("", "");
		 
		 
		 iPhone14Pro = iPhone14;
		 System.out.println(iPhone14Pro);
		 System.out.println(iPhone14);
		 iPhone14Pro.telNumber = "010-9999-9999";
		 System.out.println(iPhone14.telNumber);
		 
		 //객체 배열(거의 쓰이지 않음)
		 //선언 및 생성 방법 :
		 //클래스명[] 객체배열명 = new 클래스명[길이];
		 SmartPhone[] smartPhoneList = new SmartPhone[3];
		 
		 smartPhoneList[0] = iPhone14; 
		 smartPhoneList[1] = iPhone14Pro;
		 smartPhoneList[2] = new SmartPhone();
		 
		 //같은 주솟값이 각 각의 인덱스에 들어가게 됨
//		 SmartPhone smartPhone = new SmartPhone();
//		 for (int index = 0; index < smartPhoneList.length; index++) {
//			 smartPhone.telNumber = "010-1111-1111" + index; 
//			 smartPhoneList[index] = smartPhone;
//		 }
//		 
		
		 for (int index = 0; index < smartPhoneList.length; index++) {
			 //각 각의 인덱스에 들어가는 변수명은 같지만 index값이 증가함에 따라(반복문이 돌면서)
			 //같은 변수명을 다시 생성하기 때문에(새로운 메모리 주솟값을 가짐)
			 //주솟값이 달라지는 것이다.
			 //그래서 telNumber가 각 각의 인덱스 값이 다른 것이다.!
			 SmartPhone smartPhone = new SmartPhone(); //새로운 주소 생성
			 smartPhone.telNumber = "010-1111-1111" + index; 
			 smartPhoneList[index] = smartPhone;
		 }
		 
		 for(SmartPhone phone : smartPhoneList) {
			 System.out.println(phone.telNumber);
		 }
		 
	}

}
