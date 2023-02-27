package chapter1.F_Operator;

//연산자
//산술 연산자, 대입 연산자, 비교 연산자, 논리 연산자, 삼항 연산자
public class Operator {

	public static void main(String[] args) {
		
		//산술 연산자
		
		//덧셈 연산자 : +
		//좌항에 우항을 더한 값을 반환
		int addResult = 8 + 3;
		System.out.println(addResult);
		
		//뺄셈 연산자 : -
		//좌항에 우항을 뺀 값을 반환
		int minusResult = 8 - 3;
		System.out.println(minusResult);
		
		//곱셈 연산자 : *
		//좌항에 우항을 곱한 값을 반환
		int multiResult = 8 * 3;
		System.out.println(multiResult);
		
		//나눗셈 연산자 : /
		//좌항에 우항을 나눈 값을(나눈 전체 값을) 반환
		int divideResult = 8 / 3; //나눈 전체 값을 반환을 하지만 int형이므로 소숫점 자리를 int형에 담지 못하므로 2만 출력이 되는 것
		//int형은 정수만 담을 수 있으므로(즉, 실수는 담지 못함)
		System.out.println(divideResult);
		float float1 = 2.66666F;
		int number1 = (int)float1;
		System.out.println(number1);
		
		//double은 소숫점 15자리에서 오차가 발생하게 됨
		double divideResult2 = 8.0/3.0;
		System.out.println(divideResult2);
		
		//나머지 연산자 : %
		//좌항에 우항을 나눈 나머지 값을 반환
		int remainderResult = 8 % 3;
		System.out.println(remainderResult);
		
		
		//정수와 정수를 연산하면 정수가 반환 됨
		//정수와 실수를 연산하면 실수가 반환 됨
		//실수와 실수를 연산한면 실수가 반환 됨
		
		
		
		
		//증감 연산자 : '변수' 자신을 1  증가 혹은 감소하는 연산자이다.
		
		//증가 연산자 : ++
		//연산자의 좌항 혹은 우항의 값을 1 증가 시킴
		int integer1 = 10;
		++integer1;
		System.out.println(integer1);
		integer1++;
		System.out.println(integer1);
		System.out.println("==========================");
		integer1 = 0;
		System.out.println(integer1); //0
		System.out.println(++integer1); //1
		System.out.println(integer1); //1
		System.out.println(integer1++); //1
		System.out.println(integer1); //2
		
		//상수에는 증감연산자 사용 불가능
		//final int NUMBER = 0;
		//NUMBER++;
		
		//감소 연산자 : --
		//연산자의 좌항 혹은 우항의 값을 1 감소 시킴
		int integer2 = 10;
		--integer2;
		System.out.println(integer2);
		integer2--;
		System.out.println(integer2);
		
		System.out.println(--integer2); //7
		System.out.println(integer2); //7
		System.out.println(integer2--); //7
		System.out.println(integer2); //6
		
		
		int number2 = 8;
		int number3 = 3;
		int sampleNumber = number2 / --number3; // 8/2
		int sampleNumber2 = number2 / number3++; // 8/2 number3 = 3으로 변환됨
		
		
		//대입 연산자
		//좌항에 우항을 (누적)대입
		//좌항의 변수에 좌항 변수와 우항을 연산한 결과를 대입
	
		//= : 좌항에 우항을 대입
		int number4 = 10;
		
		//+= : 좌항에 우항을 더한 값을 좌항에 대입
		number4 += 3;
		System.out.println(number4);
		
		//-= : 좌항에 우항을 뺀 값을 좌항에 대입
		number4 -= 6;
		System.out.println(number4);
		
		//*= : 좌항에 우항을 곱한 값을 좌항에 대입
		number4 *= 3;
		System.out.println(number4);
		
		// /= : 좌항에 우항을 나눈 값을 좌항에 대입
		number4 /= 5;
		System.out.println(number4);
	
		// %= : 좌항에 우항을 나눈 나머지 값을 좌항에 대입
		number4%=3;
		System.out.println(number4);
		
		//대입 연산자의 좌항에는 무조건 변수만 지정할 수 있음
		
	
		//비교 연산자
		//좌항을 우항과 비교한결과를 논리(boolean형) 값으로 변환 
		
		//==
		//좌항이 우항과 같다면 true를 반환, 아니면 false를 반환
		boolean boolean1 = 10 == 12;
		System.out.println(boolean1);
		
		//!=
		//좌항이 우항과 다르다면 true를 반환, 아니면 false를 반환
		boolean boolean2 = 10 != 12;
		System.out.println(boolean2);
		
		// > , >=
		// > : 좌항이 우항보다 크면 true를 반환, 아니면 false를 반환
		// >= : 좌항이 우항보다 크거나 같으면 true를 반환, 아니면 false를 반환
		boolean boolean3 = 10 > 10;
		System.out.println(boolean3);
		boolean boolean4 = 10 >= 10;
		System.out.println(boolean4);
		
		
		// < , <=
		// < : 좌항이 우항보다 작으면 true를 반환, 아니면 false를 반환
		// <= : 좌항이 우항보다 작거나 같으면 true를 반환, 아니면 false를 반환
		boolean boolean5 = 8 < 10;
		System.out.println(boolean5);
		boolean boolean6 = 10 <= 10;
		System.out.println(boolean6);
		
		
		//논리 연산자
		//논리 값을 연산하는 연산자
		
		// && : AND 연산
		//좌항과 우항이 모두 true일 때 true를 반환, 아니면  false를 반환
		boolean boolean7 = true && true;
		System.out.println(boolean7);
		boolean boolean8 = true && false;
		System.out.println(boolean8);
		int number5 = 8;
		int number6 = 3;
		boolean boolean9 = number5 > number6 && true;
		System.out.println(boolean9);
		
		// || : OR 연산
		//좌항과 우항 중 하나라도 true일 때 true를 반환, 아니면 false를 반환
		boolean boolean10 = false || false;
		System.out.println(boolean10);
		boolean10 = true || false;
		System.out.println(boolean10);
		
		boolean boolean11  = (number5 > number6) && (number6 > number5++);
		System.out.println(number5);
		
		
		boolean11  = (number6 > number5)  &&  (number5++ > number6) ;
		System.out.println(number5); // 9 
		//1이 증가가 안 됨 
		//왜냐하면 앞 수식 false이므로 AND연산자는 하나라도 false이면 결괏값이
		//false이므로 뒤에 식인  (number5++ > number6)를 실행을 하지 않고 바로 false를 리턴하므로 
		//뒤에 식은 실행도 되지 않으므로 당연히 증가 연산자가 계산될 일이 없으므로 9인 것이다.
		
		
		boolean boolean12 = (number5 > number6) || (number6> ++number5);
		System.out.println(number5); //number5의 값은 9이다.
		//이유는 
		//OR연산은 하나가 true이면 당연히 결괏값이 true이므로 첫 번째 수식이 true이므로 뒤에 있는 식을 읽지도 않고 바로 true값을 리턴하므로
		

		// ! : NOT 연산(부정 연산)
		// 논리값의 부정을 반환
		boolean boolean13 = !(number5 > number6);
		System.out.println(boolean13);
		
		
		
		
		
		//삼항 연산자
		//조건에 따라 다른 결과를 반환하는 연산자
		//조건(리턴 되는 값들이 boolean형인 것) ? 참일 때 결과 : 거짓일 때 결과;
		//조건 ? 참일 때 결과 : 거짓일 때 결과;
		String string1 = number5 > number6 ? "3보다 큽니다." : "3보다 크지 않습니다.";
		System.out.println(string1);
		//삼항연산자를 이용해서 if else문을 사용하지 않고 if else문과 똑같은 의미로 표현한다.
		string1 = number5 > number6 ? "3보다 큽니다." : number5 == number6 ? "3입니다." : "3보다 작습니다.";
		System.out.println(string1);
		
		
		
		
		
	}

}
