package example.SignIn;

import java.util.Scanner;

//로그인 프로세스 구현
public class SignIn {

	//입력
	//아이디, 비밀번호
	public static void main(String[] args) {
		//final선언된 변수명은 무조건 다 대문자로 선언을 해야 함!!
		//단어를 구분할 때는 언더바(_)를 이용해서 구분 함
		final String ID = "qwer1234";
		final String PASSWORD = "qwer1234";
		
		
		//1. 사용자로부터 아이디와 패스워드 입력받음
		Scanner scanner = new Scanner(System.in);
		System.out.println("아이디와 비밀번호를 입력하세요.");
		String userId = scanner.nextLine();
		String userPassword = scanner.nextLine();
		
		//2. 사용자가 모두 (아이디와 비밀번호) 입력했는지 검증
		//(userId, userPassword 변수가 비었는지 확인)
		//문자열에서 값이 비었는지 확인하는 기능(메서드)가 존재
		//string(변수).isEmpty() : 비었으면 true를 반환, 아니면 false를 반환
		if(userId.isEmpty() || userPassword.isEmpty()) {
			System.out.println("모두 입력하세요.");
			return;	//return을 작성하면 쓰레드가(프로그램이) 종료가 됨
		}
		
		//3. 사용자 입력값과 저장된 값이 같은지 검증
		//string.equals(비교대상) : 같으면 true를 반환, 아니면 false를 반환
		if (!(userId.equals(ID)  && userPassword.equals(PASSWORD))) {
			System.out.println("로그인 실패");
		}
		System.out.println("로그인 성공");
		
	}
	//출력(결과)
	//성공, 실패 (모두 입력하지 않았을 때, 정보가 일치하지 않을 때)
}
