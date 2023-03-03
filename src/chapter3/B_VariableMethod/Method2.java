package chapter3.B_VariableMethod;

class Triangle {
	double underside; //밑변
	double height; //높이
	double diagonal; //빗변

	double area; //넓이
	double circumference; //둘레
}


class TriangleMath {
	
	//참조형 매개변수 : 인스턴스의 주소가 복사됨, 변수의 값을 읽고 변경할 수 있음(read & write)
	//참조형 매개변수는 주솟값을 복사하기 때문에 메서드에서 값이 변경되면 인자 값으로 넘긴 참조형 변수 또한 해당 값으로 변경 됨
	//파라미터로 참조변수를 받는다면 메모리 주소가 복사돼서 넘어오기 때문에
	//실제 작업도 해당 메모리 주소에서 작업을 진행함
	//그러므로 실제 데이터가 변경 됨

	//삼각형 넓이 구하는 메서드
	static void setArea(Triangle triangle) {
		double area = 0.5 * triangle.underside * triangle.height; //넓이
		triangle.area = area;
	}
	
	//빗변 길이 구하는 메서드
	static void setDiagonal(Triangle triangle) {	
		double squareDiagonal = Math.pow(triangle.underside, 2) + Math.pow(triangle.height, 2);
		double diagonal = Math.sqrt(squareDiagonal);
		triangle.diagonal = diagonal;
	}
	
	//둘레 길이 구하는 메서드
	static void setCircumference(Triangle triangle) {
		triangle.circumference = triangle.height + triangle.underside + triangle.diagonal;
	}
	
	
	//메서드는 실행이 시작되면 해당 변수들은 메모리의 스택 부분에 저장되어져 있다가 실행이 끝나면 스택 부분에서 소멸됨
	static Triangle createTriangle(double underside, double height) {
		Triangle triangle = new Triangle(); //인스턴스는 힙에 저장되어짐(힙에 저장되어지면 메서드의 실행이 종료가 되어도 메모리상에서 날라가지 않음)
		
		triangle.underside = underside;
		triangle.height = height;
		//pow 메서드는 제곱을 구해주는 시스템 
		//sqrt 메서드는 매개변수로 전달받은 숫자의 제곱근을 반환해주는 메서드
		//따로 메서드를 만들어 빼주면서 각 각의 식마다 변수명을 지정하여 해주는 것이 가독성에 훨씬 좋음
		//triangle.diagonal = Math.sqrt((Math.pow(underside, 2) + Math.pow(height, 2)));
		setDiagonal(triangle);
		setArea(triangle);
		setCircumference(triangle);
		//아래의 식은 가독성이 안 좋으므로 메서드를 따로 정의 해놓고 사용함
		//아래의 식으로 사용하게 되면 코드가 더러워지므로 따로 메서드로 빼놓는 것이 좋음
		//triangle.circumference = triangle.underside + triangle.height + triangle.diagonal;
		return triangle;
	}
	
}

public class Method2 {

	public static void main(String[] args) {
		Triangle traiangle1 = new Triangle();
		traiangle1.underside = 3;
		traiangle1.height = 4;
		traiangle1.diagonal = 5;

		TriangleMath.setArea(traiangle1);
		System.out.println(traiangle1.area);
		
		Triangle triangle2 = TriangleMath.createTriangle(5, 5);
		System.out.println(triangle2.area);
	}

}
