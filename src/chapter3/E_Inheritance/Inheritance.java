package chapter3.E_Inheritance;

//상속
//기존 클래스를 재사용해서 새로운 클래스를 작성하는 것
//코드의 재사용성을 높이고 코드의 중복을 제거 -> 생산성이 향상, 유지보수성이 향상

//사용 방법 : 
//class 클래스명 extends 조상 클래스명 { ... }

//클래스나 메서드는 한 번 작성하면 최대한 수정 안 하는 방향으로 가야함
//그러므로 처음에 설계할 때 제대로 해야함
class Human {
	String name;
	int age;
	String telNumber;
	String country; //국적
	
	Human() {}
	
	Human(String name, int age) {
		this.name = name;
		this.age = age;
		this.telNumber = "010-1111-2222";
		this.country = "Korea";
	}
	
	//name은 굳이 작성하지 않아도 멤버 변수 name인 것을 알지만
	//지칭은 정확하게 하는 것이 좋기 때문에 this를 작성해주는 것이다.
	void eat(String food) {
		System.out.println(this.name + "가" + food+"를 먹습니다.");
	}
	
}


//Developer 클래스는 Human의 속성과 기능을 모두 사용 가능
class Developer extends Human{
	String position;//개발 분야
	String language; //개발 언어
	
	Developer() {}
	
	Developer(String name, int age, String position, String lanquage) {
		//super : 부모 클래스를 지칭한다.
		//super() : 부모 클래스의 생성자를 지칭하는 것이다.
		super(name, age);
		this.position = position;
		this.language = lanquage;
	}
	
	void develope() {
		//this.name이 왜 가능하면 인스턴스의 모든 변수를 지칭하는 것이므로
		//Developer은 Human을 상속 받으므로 Developer가 인스턴스화가 되면 부모의 멤버를 다 사용할 수 있으므로
		//this.name이 console에 찍히는 것임
		//this.name을 해도 찍히지만 정확하게 name이 어디에 있는 것인지가 중요하므로 super.name으로 작성하는 것이 옳바르다.
		//왜냐하면 name은 상속을 받아서 사용되는 것이므로
		//자식클래스에 존재하는 변수가 아니므로 정확하게 지칭해주는 것이 좋다.
		System.out.println(super.name + "이 " + this.language + "로 " + this.position + "개발을 합니다.");
	}
}	
	
	


public class Inheritance {

	public static void main(String[] args) {
		
		Developer developer1 = new Developer();
		
		developer1.name = "John doe";
		developer1.position = "Back end";
		developer1.language = "Java";
		
		developer1.eat("사과");
		developer1.develope();
		
		Developer developer2 = new Developer("Michael", 29, "Front End", "Javascript" );
		developer2.eat("바나나");
		developer2.develope();
		

	}

}
