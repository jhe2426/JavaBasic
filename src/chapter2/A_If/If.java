package chapter2.A_If;

//if 구문
//조건에 따라 실행시키고자 하는 로직(프로세스)이 다를 때 사용하는 구문
public class If {

	public static void main(String[] args) {
		
		//단순 if문
		//조건이 true일 때 실행할 코드를 지정하는 구문
		//사용 방법 : if (조건) {조건이 true일 때 실행할 코드}
		int age = 12;
		
		if (age > 19) {
			System.out.println("성인입니다.");
		}
		System.out.println("조건 검사 완료");
		
		//if문의 경우 코드 블럭에 오는 실행할 코드가 하나의 구문이면
		//{}를 제거하고 사용 가능
		if (age > 19) System.out.println("성인입니다.");
		
		
		
		//if - else문
		//조건이 true일 경우와 false일 경우 실행되는 코드를 각 각 지정한 구문
		//사용 방법 : 
		//if (조건)  {true일 때 실행할 코드}
		//else {false일 때 실행할 코드}
		if (age > 19) {
			System.out.println("성인입니다.");
		} else {
			System.out.println("미성년자입니다.");
		}
		
		//if문과 마찬가지로 else문도 코드 블럭에 오는 실행할 코드가 
		//하나의 구문이면 {}를 제거하고 사용 가능
		if (age > 19) System.out.println("성인입니다.");
		else System.out.println("미성년자입니다.");
		
		//중첩 if문
		//if문 혹은 else문의 코드 블럭 안에 if문을 작성
		//별로 좋은 방법은 아님(사용하지 않길 권장 함)
		if (age <= 19) {
			if(age < 8) System.out.println("미취학 아동입니다.");
			else System.out.println("청소년입니다.");
			//if(age < 8) System.out.println("미취학 아동입니다.");
			//else System.out.println("청소년입니다."); 들은 하나의 if문이므로 하나의 구문이므로
			//중괄호를 생략해도 됨
		} else {
				System.out.println("성인입니다.");
		}
		
		
		//if문에 else문이 있어도 if문의 하나의 구문이므로 {}를 생략해도 오류가 뜨지 않는 것이다.
		if (age <= 19) 
			if(age < 8) System.out.println("미취학 아동입니다.");
			else System.out.println("청소년입니다.");
		 else {
				System.out.println("성인입니다.");
		}
		
		
		
		
		if (age > 19) {
			System.out.println("성인입니다.");
		} else {
				if (age < 8) System.out.println("미취학 아동입니다.");
				else System.out.println("청소년입니다.");
		}
		
		
		
		//if - else if - else문
		//중첩 if문의 응용
		//else문의 코드 블럭에 오는 코드가 한 줄일 때 {}를 제거할 수 있음을 이용
		if ( age > 19) {
			System.out.println("성인입니다.");
		} else if (age > 8){
				System.out.println("미취학 아동입니다.");
		} else {
			System.out.println("청소년입니다.");
		}
		
		
		
		
		
		
		
		//else문을 사용하지 않고 if문을 작성하는 것이 좋음
		//코드의 전체 흐름이 정상으로 흘러야한다.
		//if문을 사용하여 비정상적인 것들을 걸러줘야하지 코드가 정말 깔끔하고 전체 흐름이 끊기지 않는다.
		
		boolean nomal = true;
		
		//안 좋은 코드
		if (nomal) {
			boolean nomal2 = true;
			if(nomal2) {
				System.out.println("정상 결과");
			}else {
				System.out.println("비정상 2");
			}
		} else {
			System.out.println("비정상 1");
		}
		
		
		//옳은 if문 사용하는 코드임
		//if문 연달아서 비정상 코드일 때를 걸러주는 것이 좋은 코드임
		if(!nomal) System.out.println("비정상 1");
		boolean nomal2 = true;
		if (!nomal2) System.out.println("비정상 2");
		System.out.println("정상 결과");
		
		
	}

}
