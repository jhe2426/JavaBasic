package example.SignUp;

import java.util.Scanner;

//하나의 프로그램(기능) 이란?
//Input(입력) -> Process(절차) -> Output(출력)
//하나의 기능을 만들려면 입력에 해당하는 출력이 어떻게 나오는지를 생각을 한 뒤
//Process(절차)를 구성하면 됨



//Dto : 사용자로부터 입력 받은 값을 임시로 저장을 하여 프로세스 처리할 때 값들을 주고 받기위한 클래스임
class SignUpDto{
	String userId;
	String userPassword;
	String userPasswordCheck;
	String userName;
}

//회원가입 프로세스 구현
public class SignUp {
	//입력 받는 프로세스의 가장의 기본 프로세스는 필수로 입력되어야 하는 부분이 입력이 되었는지 확인
	
	//입력
	//아이디, 비밀번호, 비밀번호 확인, 이름
	public static void main(String[] args) {
		String[] idList = {"qwer", "asdf", "zxcv"}; //문자열은 배열이므로 지금 초기화한 것은 다차원 배열에 속함
		
		//1. 사용자로부터 아이디, 비밀번호, 비밀번호 확인, 이름을 입력 받음
		Scanner scanner = new Scanner(System.in);
		
		SignUpDto dto = new SignUpDto();
		
		System.out.println("아이디 : ");
		dto.userId = scanner.nextLine();
		
		System.out.println("비밀번호 : ");
		dto.userPassword = scanner.nextLine();
		
		System.out.println("비밀번호 확인 : ");
		dto.userPasswordCheck = scanner.nextLine();
		
		System.out.println("이름 : ");
		dto.userName = scanner.nextLine();
		
		//자원 반납
		scanner.close();
		
		//2. 모두 입력 받았는지 검증
		//string.isBlank() : 문자열이 비었거나 띄어쓰기만으로 구성됐을 때 true를 반환, 아니면 false를 반환
		if(dto.userId.isBlank() || dto.userPassword.isBlank() || dto.userPasswordCheck.isBlank() || dto.userName.isBlank()) {
			System.out.println("모두 입력하세요");
			return;
		}
		
		//3. 아이디 중복 체크
		//3-1) 일반 for문 사용(직접 배열에 접근하는 것)
//		for(int index = 0; index < idList.length; index++) {
//			if(userId.equals(idList[index])) { //기준이 앞으로 오게하여 가독성이 좋아짐
//				System.out.println("이미 존재하는 아이디입니다.");
//				return;
//			}
//		}
		
		
		//3-2) foreach문 사용
		//배열의 각 각 요소의 값을 변경하지 않고 단지 읽기만 한다면 foreach문을 사용하는게 가장 좋음!
		//foreach문을 사용하여 배열의 각 각의 요소 값을 바꾼다 한들 복사하는 원리라서(직접 접근하는 것이 아니라)
		//실제 배열의 요소들의 값이 변경이 되지 않음
		for(String id : idList) {
			if(dto.userId.equals(id)) {
				System.out.println("이미 존재하는 아이디입니다.");
				return;
			}
		}
		
		//4. 비밀번호 확인 체크
		if( !dto.userPassword.equals(dto.userPasswordCheck)) {
			System.out.println("비밀번호가 서로 일치하지 않습니다.");
			return;
		}
		System.out.println("회원가입 성공");
		
		//항상 if문에는 비정상적인 부분을 걸러서 처리를 해줘야 함
		//전체 흐름이 이상하게 흐르지 않도록(프로그램의 끝이 정상적으로 끝나도록 하는 것이 올바른 흐름) if문에서 걸러주는 것이 아주 중요함
	}
	//결과
	//회원가입 성공, 회원가입 실패 (모두 입력하지 않았을 때, 아이디가 중복될 때, 비밀번호가 서로 다를 때)
}
