package chapter3.B_VariableMethod;

//메서드
//특정 작업을 수행하는 일련의 문장들을 하나로 묶은 것
//작업을 미리 작성해 두는 것
//메서드에서 가장 중요한 것은 메서드에 넣을 값과 반환 값만 알면 됨(이걸 Black Box구조라고 함)

//재귀호출(사용하면 좋지 않음 안 쓰는 방향으로 코드를 작성해야 함)
//메서드 내부에서 자기 자신을 다시 호출하는것

//메서드의 장점
//1. 높은 재사용성을 가지고 있다. : 한 번 만들어 놓은 메서드를 반복해서 사용가능
//2. 중복된 코드를 제거할 수 있다. : 반복적으로 나타나는 문장들을 메서드로 만들어서 사용하면 
//													코드의 중복을 제거할 수 있고 수정이 발생하면 하나의 코드만 수정하면 됨
//3. 프로그램을 구조화할 수 있다. : 작업 단위로 여러 개의 메서드에 담아서 프로그램을 구조화 시킬 수 있다.

//if문, 메서드 사용 방법이 프로그램을 잘 짜는지 아닌지를 판가름 함

//파라미터가 있는 메서드는 반드시 파라미터 범위 등과 같은 검증을 먼저 해줘야 함
class HigherMathematics {
	//클래스 변수는 인스턴스 메서드에 사용 가능하지만
	//클래스 메서드에 인스턴스 메서드가 정의 되어져 있으면 오류가 발생 됨(인스턴스 변수는 인스턴스 생성을 해야지만 사용이 가능한데 
	//																										클래스 메서드는 인스턴스 생성할 필요 없이 사용 가능한데 클래스 메서드 안에 인스턴스 변수를 사용하게 되면 앞 뒤가 안 맞기 때문에 오류가 발생하는 것)
	static final double PIE = 3.14;


	//클래스 변수와 마찬가지로 메서드에 static을 포함하게 되면
	//클래스 메서드로 사용할 수 있음 (즉, 클래스명으로 사용할 수 있다.)
	//입력을 받는 모든 메서드는 유효성 검사를 해야 한다!
	//파라미터가 있는 메서드는 반드시 파라미터 범위 등과 같은 검증을 먼저 해줘야 함
	//매개변수 유효성 검사(중요)
	//매개변수가 적절한 것인지 확인하는 작업이 제일 먼저 이루어져야함
	//적절한 값이 오지 않을 경우 적절한 값이 왔을 경우 모두 대비해서 구현부를 작성해야 함
	static double getTriangleSize(double underside, double height) {
		if (underside <= 0 || height <= 0) {
			System.out.println("밑변과 높이는 양수이어야 합니다.");
			return 0;
		}
		double size = 0.5 * underside * height;
		return size;
	}
	
	static double getCircleSize(double radius) {	
		if(radius <= 0) {
			System.out.println("반지름은 양수이어야 합니다.");
			return 0;
		}
		double size = radius * radius * PIE;
		return size;
	}
	
	static double getCircumference(double radius) {
		if(radius <= 0) {
			System.out.println("반지름은 양수이어야 합니다.");
		}
		double Circumference = radius * PIE * 2;
		return Circumference;
	}
	
}

public class Method1 {
//[]은 생략가능
	//메서드의 선언부
	//[접근제어자 기타제어자] 반환타입 메서드명([매개변수[, ....])
	public static void main(String[] args) 
	//메서드의 구현부
	//실제 프로그램의 절차를 작성하는 부분
	//return 데이터;로 결과를 반환시켜줌 //리턴의 데이터에는 무엇을 반환하고 싶은지 변수 명으로 리턴을 하는 것이 유지 보수하거나 다른 사람이 알아 보기 쉬워진다.
	//(반환 타입이 void이면 return;으로 메서드를 종료 시킴)
	{
	
		
		HigherMathematics math = new HigherMathematics();
		//메서드 호출, 호출 시 인자로 전달한 값이 메서드의 매개변수에 각 각 복사됨
		//참조형 매개변수 : 인스턴스의 주소가 복사됨, 변수의 값을 읽고 변경할 수 있음(read & write)
		//참조형 매개변수는 주솟값을 복사하기 때문에 메서드에서 값이 변경되면 인자 값으로 넘긴 참조형 변수 또한 해당 값으로 변경 됨
		double triangleSize = HigherMathematics.getTriangleSize(10, 0);
		System.out.println(triangleSize);
	
		double circleSize = math.getCircleSize(5);
		System.out.println(circleSize);
		
		
		
	}

}
