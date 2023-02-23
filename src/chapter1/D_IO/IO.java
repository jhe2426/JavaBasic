package chapter1.D_IO;

import java.util.Scanner;

//IO : 입 출력을 뜻함
//console을 통해서 개발자로부터 입력을 받을 때 Scanner 객체를 사용 함
//console로 데이터를 출력할 땐 System 객체를 사용 함
public class IO {
	//리터럴 상수 : 글자 그대로(변수명 그 자체에) 의미가 있어서 이름이 없는 상수
	public static void main(String[] args) {
		
		
		//console 출력
		//System.out.println(출력하고자하는 변수 혹은 상수);
		//sysout 단축키로 바로 작성 가능
		String comment = "이것은 변수에 저장된 문자열입니다.";
		System.out.println("이것은 리터럴 상수 문자열입니다.");
		System.out.println(comment);
		
		
		
		//System.out.println(변수 혹은 상수);
		//변수 혹은 상수 자리에 어떤 데이터 타입이 와도 됨
		//float은 소수점 6자리에서 오차가 발생
		float float1 = 1.1111111111F;
		System.out.println(float1); // 출력 결과 : 1.1111112
		
		
		
		//입력
		//Scanner scanner = new Scanner(System.in);
		Scanner scanner = new Scanner(System.in);
		//System.out.println(scanner);
		//Scanner 객체의 .next**(); 기능(메서드)를 사용해서 입력을 받을 수 있음 
		//**에는 입력받을 데이터 타입이 들어감
//		int inputInteger = scanner.nextInt();
//		System.out.print("입력 받은 값 : ");
//		System.out.println(inputInteger);
		
		String inputString = scanner.nextLine();
		System.out.println("입력 받은 문자열 : ");
		System.out.println(inputString);
		
		
		
		
	}

}
