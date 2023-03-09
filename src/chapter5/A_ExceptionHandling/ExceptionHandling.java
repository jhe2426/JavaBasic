package chapter5.A_ExceptionHandling;

import java.util.Scanner;

//예외 처리하는 방법 중요함!!
//예외
//오류 중 개발자가 예측해서 제어할 수 있는 오류이다.
//컴파일 및 로직상의 문제는 없지만 사용자의 입력 혹은 타 프로그램의 결과에서
//예상치 못한 값을 받아 처리할 때 발생

//시스템 에러 : 개발자가 코드상으로 조취를 취할 수 없는 문제를 나타냄(전원 부족, 메모리 부족)
//컴파일 에러 : 컴파일이 불가능한 상태 (오타, 참조 타입 불일치....)
//런타임 에러 : 프로그램이 실행 도중 발생하는 문제 (빌드 실패, 포트 중복, 데이터베이스 연결 실패....)
//로직 에러 : 프로그램의 아웃풋이 예상과 다르게 나오는 문제
//예외 : 정상적인 입력에서는 정상 처리가 되지만 비정상적인 입력에서는 처리가 되자 않는 문제 (null 값 참조, 로직 실행 중 데이터베이스 연결 실패.....)
public class ExceptionHandling {

	//throws 예외 클래스 : 해당 예외를 호출부로 책임을 전가
	//throws가 선언부에 추가된 메서드를 호출하는 곳에서
	//예외처리에 대한 강제성이 부여 됨
	private static void bringException()  throws Exception{ //Exception자리에 특정 예외 이름을 적어도 되고 그 부모인 Exception을 적어도 된다.
		Exception exception = new Exception("예외 던지기 발생!");
		throw exception;
	}
	
	public static void main(String[] args) {
		//예외 상황
//		Scanner scanner = null;
//		scanner.nextLine();
		
//		Scanner scanner = null;
//		if(scanner != null) scanner.nextLine(); //if문으로 예외를 처리하는 방법
		
		
//		int[] numbers = {1, 2, 3};
//		System.out.println(numbers[3]);

		//예외 처리
		//예외를 예상하고 그 상황에 대해서 적절한 대처를 해주는 것
		//가장 좋은 것 (예외가 발생하지 않도록 하는 것이 최우선임)
		
		//try - catch문으로 예외 잡기
		//try 구문에 예외가 발생할 수 있는 문장을 작성
		//catch 구문에 해당 예외 상황에 대한 대처 구문을 작성
		
		//사용 방법
		//try {예외가 발생할수 있는 문장}
		//catch (예외타입 예외참조변수) { 예외가 발생했을 때 처리할 문장 }
		
		Scanner scanner = null;
		//서버 지속성(보안)을 위해 try -catch문을 많이 사용해서 예외처리를 해줘야 함
		try {
			int number = scanner.nextInt();
			//Exception 예외 클래스의 부모 클래스중 가장 높은 조상이므로 모든 예외는 Exception으로 
			//받아서 처리하면 됨(어떤 예외가 발생할지 전부 다 알수는 없으므로 부모형 타입으로 예외를 받는 것이다.)
		} catch (Exception exception) { 
			System.out.println("Null Pointer Exception 발생!");
		}
		
		
		//throw : 테스트용 고의로 예외 발생하게 하는 키워드
		try {
			//Exception class로 예외 생성 가능
			Exception exception = new Exception("고의 예외 발생 시키기!");
			//throw으로 예외를 강제로 발생시키는 것
			throw exception;
		} catch (Exception exception) {
			exception.printStackTrace();
		}
		

		
		//throws 예외 던지기 :
		//예외가 발생했을 경우 현재 메서드가 예외를 처리하지 않고 자신을 호출한 쪽으로 예외 처리 책임을 넘기는 것
		//해당 메서드를 호출하게 되면 예외 처리의 강제성을 갖게 됨
		try {
			bringException();
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		
		
		 
		
		
		
	}

}



