package chapter3.D_Constructor;

//생성자
//생성자는 인스턴스가 생성될 때 호출되는 인스턴스 '초기화 메서드'이다.
//인스턴스 변수의 초기화 작업에 사용되어짐 (일반적으로 기본형 변수는 0으로 참조형 변수는 null로 초기화를 해줌)
//인스턴스 생성 시에 실행되어야할 작업을 작성하는 위치이다.

//생성자의 조건
//생성자의 이름은 해당 클래스명과 같아야 함
//생성자는 반환 값이 없음
class Circle {
	double radius; //반지름
	double diameter; //지름
	double circumference; //원 둘레
	double area; //원 넓이
	
	//생성자 사용 방법
	//클래스명([파라미터[, .....]]) { 인스턴스 생성 시 실행할 코드}	
	//생성자의 초기화 작업에는 this를 적어 주는 것이 좋음(옳은 방법임)
	Circle(double radius) { //변수명을 항상 풀네임으로 작성해야 함
		System.out.println("Cricle이 생성됩니다.");
		//this :  인스턴스 자신을 지칭하는 것
		this.radius = radius; //this가 지칭하는 것은 해당 인스턴스를 지칭하는 것
		//this.radius는 인스턴스 자신의 radius변수를 지칭하는 것
		this.diameter = 2 * radius;
		this.circumference = 3.14 * 2 *radius;
		this.area = 3.14 * radius * radius;
	}
	
	//생성자도 메서드이기 때문에 오버로딩을 적용해서
	//매개변수에 따라 다른 작업을 수행하게 할 수 있다.
	Circle() {
		System.out.println("빈 생성자입니다.");
		this.radius = 10;
		this.diameter = 2 * this.radius;
		this.circumference = 3.14 * this.diameter;
		this.area = 3.14 * this.radius * this.radius;
	}
	
	//생성자를 이용해서 인스턴스 복사하기(거의 사용하지 않음)
	//메모리 주소 값이 복사 되는 것이 아니라 해당 변수들의 값만 가져오는 것
	Circle(Circle circle) {
		this.radius = circle.radius;
		this.diameter = circle.diameter;
		this.circumference = circle.circumference;
		this.area = circle.area;
	}
	
	
	
	
	
	
}
public class Constructor {

	public static void main(String[] args) {
		
		//Circle() : 생성시 초기화를 해주는 메서드임
		//디폴트 기본 생성자로 초기화 할 시
		//클래스 멤버 변수는 new 했을 때 기본 생성자를 통해 초기화가 되었기 때문에 해당 변수에 값을 입력해주지 않아도 그 변수를 사용하려고 할 때
		//오류가 발생하지 않는 것
		//해당 변수에 값을 넣어주지 않아도 기본형 타입은 전부 다 0으로 초기화
		//참조형 변수는 전부 다 null로 초기화를 해줌
		System.out.println("==============생성자===========");
		Circle circle1 = new Circle();
		Circle circle2 = new Circle(5);
		System.out.println("==============생성자===========");
		
		System.out.println(circle1.area);
		System.out.println(circle2.area);
		


		
		
		//초기화를 하지 않고 해당 변수를 선언만하고 사용하려고 해서 오류가 발생하게 됨
//		double radius;
//		System.out.println(radius);
		
		//실무에서는 git 레파지토리 생성시 이름을 master를 사용하지 않고 main으로 사용함
	}

}
