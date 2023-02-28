package chapter2.D_While;

//while 반복문
//일반적으로 반복 횟수가 지정되어 있지 않을 때 사용하는 반복문
public class While {

	public static void main(String[] args) {
		//while문
		//조건을 검사하고 해당 조건이 true일 경우 코드 블럭을 실행하는 반복문
		//if문의 반복 형태이다.
		//반복 실행할 코드 블럭이 종료되면 조건을 다시 검사하고
		//true면 반복, false면 탈출(반복문 종료)
		//사용 방법 : while (조건) { 실행할 코드 }  
		int number = 0;
		
		while (true) {
			//continue : 반복문이 continue 문을 만났을 때 아래에 존재하는 코드를 무시하고 상단의 조건 검사부로 넘어감
			//continue : continue문을 만나면 코드 블럭내에서 아래에 오는 
			//모든 코드를 무시하고 다시 조건을 검사한다.
			//일반적으로 continue문은 조건문과 함께 사용 됨
			//while문에서 continue의 주의할 점!
			//조건문의 코드 블럭 내에 해당 변수를 변경시켜주는 코드가 존재해야 함
			//그래야지 무한 루프에 빠지지 않음
			if ((number % 2) == 0) { 
				number++;
				continue;		
			}
			System.out.println(number);
			//주의할 점!
			//while문에서는 조건에 사용되는 변수가
			//필수로 실행코드 내에서 변경이 이루어 져야 한다.!!
			number++;
			//break : 반복문의 코드 블럭을 강제로 종료 시킬 때 사용한다.
			//일반적으로 break문은 조건문과 함께 사용 됨
			if (number == 200) break;
		}
		
		//number = 200
		
		//do - while
		//반복 실행할 코드를 무조건 한 번 실행 한 후에 조건을 검사하는 반복문
		//사용 방법 : do { 실행할 코드 } while (조건);
		do {
			System.out.println(number);
			number++;
		}while (number < 200);
		
		
		System.out.println(number); 

		//하나의 프로그램(기능) 이란?
		// Input(입력) -> Process(절차) -> Output(출력)
		//하나의 기능을 만들려면 입력에 해당하는 출력이 어떻게 나오는지를 생각을 한 뒤
		//Process(절차)를 구성하면 됨
		
		
	}


}
