package chapter1.E_Array;

//배열
//'같은 타입'의 변수가 나열된 형태
//배열은 '생성'해서 사용 함 => 생성해서 사용하는 변수를 참조형 변수라고 부름 
//참조형 변수에는 실제 데이터 값이 아닌 메모리 주소 값을 가지고 있음
//new 연산자로 생성할 수 있음
//배열은 참조형이므로 실제 데이터가 저장되는 것이 아니라
//데이터 배열이 저장된 첫 번째 메모리 주소가 저장 됨
public class Array {

	public static void main(String[] args) {
		
		//String strin1 = new String();
		//String 또한 참조형이므로 new로 생성을 해서 초기화해야 하지만 아주 많이 사용되므로 생성을 하지 않고도 초기화할 수 있도록 시스템에서
		//만들어 놓음
		
		//동일한 그룹의 데이터 변수로만 선언해서 사용할 때
		int score1, score2, score3, score4, score5;
		//초기화
		score1 = 90;
		score2 = 100;
		score3 = 70;
		//위 방식의 문제점
		//관리가 어려움, 특정 조건에 따른 데이터를 가져오기 힘듦
		
		//배열
		//동일한 타입이면서 동일한 그룹의 변수들을 묶어서 관리해주는 형태
		
		// 선언 방법 : 데이터 타입[] 배열명;
		//변수명 명명할 때 List를 붙이거나 s를 붙여 복수형으로 나타냄
		int[] scores;
		
		//생성 방법 : 배열명 = new 데이터 타입[배열의 길이];
		scores = new int[5];
		System.out.println(scores);//참조형 변수이므로 메모리 주솟값이 들어가 있음
		
		//초기화 방법 : 배열명[인덱스 번호] = 데이터;
		//인텍스는 0번 부터 시작
		scores[0] = 90;
		scores[1] = 100;
		scores[2] = 95;
		scores[3] = 75;
		scores[4] = 80;
		//오류, 예외가 발생하면 항상 메모하는 습관 가지기
		
		
		//선언과 동시에 생성 및 초기화
		
		//1. 데이터 타입[] 배열명 = new 데이터타입[]{ 요소1, 요소2, 요소3, .....};
		int[] scoreList = new int[] {90,100,95};
		System.out.println(scoreList.length);
		
		//2. 데이터 타입[] 배열명 = {요소1, 요소2, .....};
		char[] string = { 'h', 'e', 'l', 'l', 'o' };
		System.out.println(string); //char의 배열은 문자열이라서 메모리 주솟값이 아닌 실제 데이터 값들이 출력이 됨
		string[0] = 'k';
		System.out.println(string[0]);
		
		
		
		//다차원 배열
		//선언 방법 : 데이터 타입[][] 배열명;
		//생성 방법 : 배열명 = new 데이터 타입[ 첫 번째 배열 길이 ][ 두 번째 배열 길이 ];
		//선언과 동시에 초기화
		//1. 데이터 타입[][] 배열명 = new 데이터 타입[][] { {요소11, ....}, { 요소21, ...}, ...... };
		//2. 데이터 타입[][] 배열명 = { {요소11, ....}, {요소21, ....}, .... } ;
		
		//scoreList = new int[] {90,100,95};
		int[] extraScoreList = scoreList; //배열은 참조형 데이터 이므로 참조형 변수에는 메모리 주솟값이 들어가 있으므로
		//extraScoreList에 scoreList을 대입하면 두 개의 참조형 변수에는 같은 메모리 주솟값을 가지게 되는 것이다.
		extraScoreList[0] = 70;
		System.out.println(scoreList); //[I@515f550a
		System.out.println(extraScoreList); //[I@515f550a
		System.out.println(scoreList[0]); //70
		System.out.println(extraScoreList[0]); //70
		//위와 같은 문제점을 해결하기위해 배열 복사 기능을 하는 메서드들이 존재 함
		//그러면 참조하는 변수의 메모리 주솟값은 달라지고 실제 데이터 값들만 가져올 수가 있게 됨
		
		
		
		
	}

}
