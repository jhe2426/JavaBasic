package chapter5.B_ApiClass;

import java.util.Random;
import java.util.Scanner;

//API Class
//Java 자체에서 제공해주는 개발에 도움을 주는 각종 라이브러리

public class ApiClass {

	public static void main(String[] args) {
		//Object class
		//모든 class의 조상 class
		Object object = new Scanner(System.in);
		object = new int[10]; //기본형 변수인데 알아서 오토박싱이 되어 Integer형태로 들어가게 된 것
		
		//String class
		//문자열 처리에 대한 메서드가 정의되어 있는 클래스
		//.concat(문자열); 메서드는 +기호로 대체할 수 있어서 잘 안 사용함
		String string = " This is string contents ";
		
		//.substring(시작 인텍스, 종료 인덱스);
		String subString = string.substring(6, 8);
		System.out.println(subString); //is
		
		//.length();
		//문자열 길이 가져오는 메서드
		
		//.toUpperCase();
		//모든 문자를 대문자로 교체
		//.toLowerCase():
		//모든 문자를 소문자로 교체
		String upperCase = string.toUpperCase();
		String lowerCase = string.toLowerCase();
		System.out.println(upperCase);
		System.out.println(lowerCase);
		
		//.indexOf(문자열);
		//해당하는 문자열이 존재한다면 그 위치의 첫 번째 인덱스 번호를 반환해주는 메서드 인덱스로 반환을 해주므로 정수형으로 받아야 한다.
		//해당하는 문자열이 존재하지 않으면 -1을 반환
		int stringIndex = string.indexOf("ais"); //-1
		System.out.println(stringIndex);
		
		//.trim();
		//문자열의 앞 뒤 공백을 제거해주는 메서드
		String trimString = string.trim();
		System.out.println(trimString);
		
		//.replaceAll(변환할 문자열, 변환될 문자열);
		//특정 문자열을 지정한 문자열로 변경해주는 메서드
		String repalceString = string.replaceAll("is", "are");
		System.out.println(repalceString);
		
		//Wrapper class
		//기본형 데이터 타입을 참조형 데디터 타입으로 다루기 위한 클래스
		//int -> Integer
		//double -> Double
		//....
		Integer integer =1; //알아서 오토박싱을 해줌
		int number = integer; //알아서 언박싱을 해줌
		
		//문자열 -> 숫자
		String numberString = "110";
		number = Integer.parseInt(numberString);
		System.out.println(number);
		
		
		//숫자 -> 문자열
		numberString = Integer.toString(550);
		System.out.println(numberString);
		
		//Random class
		//무작위의 값을 얻고자 할 때 유용한 클래스
		Random random  = new Random();
		//.nextInt() : 무작위의 int형 정수
		//.nextLong() : 무작위의 Long형 정수
		//.nextInt(최대 값) : 최대 값보다 작은 int형 정수를 반환해주는 메서드(이 메서드는 양수의 값만 나옴)
		int randomNumber = random.nextInt();
		int randomNumber2 = random.nextInt(3); // 0~2 중에서 랜덤으로 나오게 됨
		System.out.println(randomNumber);
		System.out.println(randomNumber2);
		
		//로또 프로그램
		int[] lotto = new int[6];
		for(int index = 0; index < lotto.length; index++) {
			//lotto[index] = random.nextInt(45); //<- 0 ~ 44중에서 랜덤으로 나오게 됨
			//중복 제거
			
			boolean equal = false;
			int lottoNumber =  random.nextInt(45) + 1; // <- 1 ~ 45중에서 랜덤으로 나오게 됨
			
			
			//여기 이중 for문에 continue를 넣게 되면 첫번 째 for문의 조건식으로 가는 것이 아니라 
			//여기 이중 for문의 조건식으로 가기 때문에 옳지 않았던 거
//			for(int subIndex = 0; subIndex < index; subIndex++) {
//			if(lotto[subIndex] == lottoNumber) continue;
//		}			
			
			
			//처음의 index값은 0이므로 인덱스가 0인값을 일단 이중 for문이 안 돈다(근데 이건 문제가 아니라 어차피 index가 0일 때는 비교할 대상이 없기 때문에 상관 없음)
			//일부러 subIndex의 범위가 index의 값보다 작게 해놓은 것 
			//0다음으로 for문이 돌면 index값이 1이 되므로 이중 for문이 한 번은 도는데
			//랜덤으로 값을 집어 넣는 문이 아래에 선언되어 있기 때문에
			//이중 for문이 돌아도 어차피  lotto[index]의 값은 초기화가 안 되어있기 때문에 값이 0일 것이라서 
			//중복제거를 할 수 없는 것
//			for(int subIndex = 0; subIndex < index; subIndex++) {
//				if(lotto[subIndex] == lotto[index]) equal = true;
//			}
//				int lotto[index] =  random.nextInt(45) + 1;		
			//
			
			// subIndex < index; : index가 0일 때는 비교할 필요가 없다(비교할 대상이 존재하지 않음)
			//일부러 subIndex의 범위가 index의 값보다 작게 해놓은 것 
			//그래야지 현재 index의 범위보다 높은 범위의 값을 비교하지 않기 때문에 성능상 문제가 발생하지 않게 된다.
			for(int subIndex = 0; subIndex < index; subIndex++) {
				if(lotto[subIndex] == lottoNumber) {
					System.out.println(lotto[subIndex] + "중복 제거 " + lotto[index] );
					equal = true;
					break;
				}
			
				
			}
			
			if (equal) {
				--index;
				continue;
			}
			
			lotto[index] = lottoNumber; 
		}
		
		for (int lottoNumber : lotto) {
			System.out.print(lottoNumber + " ");
		}
		
		
	}

}
