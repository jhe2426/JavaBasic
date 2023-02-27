package chapter2.C_For;

import java.util.Arrays;

//for 반복문
//규칙이 있는 작업을 반복하는 제어문
//일반적으로 반복 횟수가 정해져 있을 때 사용하는 반복문
public class For {

	public static void main(String[] args) {
		//반복문을 사용하는 이유
		//길이가 5인 int 타입의 배열(intArray5)을 선언 및 생성
		int[] intArray5 = new int[5];
		//intArray5에 각 인덱스를 1~5까지 값으로 초기화
		intArray5[0] = 1;
		intArray5[1] = 2;
		intArray5[2] = 3;
		intArray5[3] = 4;
		intArray5[4] = 5;
		//중복되는 코드가 최소화 되어야함
		
		//for 반복문
		//특정한 변수가 증감하며 조건에 부합하는 동안 반복하는 반복문
		//사용 방법 : 
		//for (변수 선언 혹은 초기화; 조건; 증감식) { 실행할 코드 }
		
		//변수 선언 혹은 초기화 : 반복문을 위해 사용할 변수를 선언 혹은 초기화하는 것
		//조건 : 반복을 계속하기 위한 조건문, 해당 조건문이 true이면 반복, false면 탈출(for문을 종료)
		//실행할 코드  : 조건이 true일 때 실행할 코드
		
		for(int index = 0; index < 5; index++) {
			//실행할 코드
			intArray5[index] = index + 1;
		}
		
		//for문의 경우 코드 블럭에 오는 실행할 코드가 한 구문이면
		//{}를 제거할 수 있음
		for(int index = 0; index < 5; index++) 
			intArray5[index] = index + 1;

		
		//foreach 반복문
		//배열의 요소 값을 직접 읽고자 할 때 배열을 반복하면서
		//요소를 하나씩 복사해서 사용할 수 있음
		//사용 방법 : for (배열요소의 데이터 타입 변수명 : 배열) { 실행할 코드 }  
		
//		System.out.println(intArray5[0]);
//		System.out.println(intArray5[1]);
//		System.out.println(intArray5[2]);
//		System.out.println(intArray5[3]);
//		System.out.println(intArray5[4]);
//		System.out.println(Arrays.toString(intArray5));
		
		System.out.println("====== 일반 for문 =====");
		for (int index = 0 ; index < intArray5.length; index++) {
			System.out.println(intArray5[index]); 
			intArray5[index] = 10; // 직접 배열에 접근을 하여 값을 바꾸는 for문임
		}
	
	
		for(int number : intArray5) 
			System.out.println(number);
		

		System.out.println("====== foreach문 =====");
		for (int index = 0; index < intArray5.length; index++) {
			intArray5[index] = index + 1;
		}
		
		//foreach문은
		//요소를 하나씩 복사해서 사용할 수 있음
		//실제 저장되어져 있는 배열의 값은 변경이 되지않고
		//복사된 변수의 값이 변경이 되는 것
		//주의!!!!
		//실제 메모리에 저장 되어져 있는 배열의 값을 변경하고 싶으면 일반 for문을 사용하여 값을 변경을 해줘야지 값이 변경이 됨!
		for(int number : intArray5) {
			System.out.println(number);
			number = 10; //실제 메모리에 저장 되어져 있는 배열의 값은 변경 되지 않음!!!
		}
		
		for (int number : intArray5) System.out.println(number);
		
		
	}

}
