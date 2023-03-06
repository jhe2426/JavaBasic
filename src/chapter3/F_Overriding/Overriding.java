package chapter3.F_Overriding;



//오버라이딩
//조상 클래스로부터 상속 받은 메서드의 내용을 변경하는 것
//상속받은 메서드를 자손 클래스에 맞게 변경 시키고자 할 때 오버라이딩을 사용
class Human {
	String name;
	
	void eat(String food) {
		System.out.println(this.name + "가 " + food + "를 먹습니다.");
	}
}

class Developer extends Human{
	
	//오버로딩이 된 것
	//Human을 상속받은 클래스이므로 부모 클래스에 eat(String food) {} 메서드가 있기 때문에 아래의 메서드는 오버로딩이 된 것이다.
	//Overloading
	void eat() {
		System.out.println(super.name   + "가 식사를 합니다.");
	}
	
	//Override
	@Override //컴파일러에게 메서드가 오버라이딩을 할 것임을 알려 개발자들이 오버로딩을 하는 실수를 줄일 수 있도록 도와주는 어노테이션이다.
	void eat(String food) {
		System.out.println(super.name + "가 " + food + "를 절반만 먹습니다.");
	}
}

public class Overriding {

	public static void main(String[] args) {
		Developer developer = new Developer();
		developer.name = "John doe";
		developer.eat("사과");
		developer.eat();
		
		Human human = new Human();
		human.name = "Michael"; 
		human.eat("바나나");
		

		
	}

}
