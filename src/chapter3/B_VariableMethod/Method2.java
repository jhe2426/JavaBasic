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
	static void setArea(Triangle triangle) {
		double area = 0.5 * triangle.underside * triangle.height; //넓이
		triangle.area = area;
	}
	
	static Triangle createTriangle(double underside, double height) {
		Triangle triangle = new Triangle();
		
		triangle.underside = underside;
		triangle.height = height;
		//pow제곱 구해주는 시스템 함수
		triangle.diagonal = Math.sqrt((Math.pow(underside, 2) + Math.pow(height, 2)));
		setArea(triangle);
		triangle.circumference = triangle.underside + triangle.height + triangle.diagonal;
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
