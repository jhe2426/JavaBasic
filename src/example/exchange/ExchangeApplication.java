package example.exchange;

import java.util.Scanner;

//환전기 어플리케이션
//Input : 금액, 넣을 화폐, 바꿀 화폐
//Output : 금액, 바뀐 화폐
public class ExchangeApplication {
	
	private static String[] managedCurrencies= {
			"KRW", "USD", "JPY"
	} ;
	//main 메서드에 사용하고 싶은데 main 메서드는 static이므로 static메서드에는 인스턴스 변수는 들어오지 못하므로
	//배열에 static을 붙여준 것
	//ExchangeApplication 클래스 안에서만 사용될 배열이므로 접근제어자를 private로 선언한 것
	private static	ExchangeRate[] exchangeRates = {
			//원화 - 달러
			new ExchangeRate("KRW", "USD", 1000 / 1318.8 ),
			//원화 - 엔화
			new ExchangeRate("KRW", "JPY", 1000 / 960.35 ), 
			//달러 - 원화
			new ExchangeRate("USD", "KRW", 1318.8 / 1000),
			//달러 - 엔화
			new ExchangeRate("USD", "JPY", 1318.8 / 0.96035),
			//엔화 - 원화
			new ExchangeRate("JPY", "KRW", 960.35 / 1000 ),
			//엔화 - 달러
			new ExchangeRate("JPY", "USD", 0.96035 / 1318.8)
	};
	public static void main(String[] args) {
		
		//scanner은 숫자를 받고 문자열을 받으려면 문자열을 못 받는 오류가 발생하므로
		//문자열 먼저 받은 뒤 숫자를 입력 받는 것이 좋음
		//입력
		Scanner scanner = new Scanner(System.in);
		//try문에 변수가 선언이 되어있으면 지역변수가 되므로 사용하지 못하게 되므로 선언만 try문에서 빼 놓은 것
		String exchangingCurrency = null;
		String exchangedCurrency = null;
		int amount = 0;
		try {
			System.out.println("넣을 화폐 : ");
			 exchangingCurrency = scanner.nextLine();
			System.out.println("바꿀 화폐 : ");
			 exchangedCurrency = scanner.nextLine();
			System.out.println("환전할 금액 : ");
			 amount = scanner.nextInt();
		}catch (Exception exception) {
			//exception.printStackTrace();
			System.out.println("입력 값의 타입이 맞지 않습니다.");
			return;
		} finally {
			scanner.close();
		} 
		

		
		
		//입력 값이 잘 가져와지는 확인
		//System.out.println(exchangingCurrency + " " + exchangedCurrency + " " + amount);

		//비정상 출력이 나올 경우
		//모두 입력되지 않았을 경우 (모두 입력하지 않았습니다.)
		//입력한 화폐가 동일할 때 (동일한 화폐로 환전할 수 없습니다.)
		//입력한 금액이 -혹은 0일 때 (유효한 금액이 아닙니다.)
		//관리하고 있지 않은 화폐 종료일 때 (유효하지 않은 화폐 단위입니다.)
		
		
		//입력 검증                
		//모두 입력했는지
		//금액 부분은 입력하지 않으면 프로그램이 종료가 되지 않으므로(scanner가 끝나지 않음) 조건에 넣지 않은 것
		if (exchangingCurrency.isBlank() || exchangedCurrency.isBlank()) {
			System.out.println("모두 입력해 주세요.");
			return;
		}
		
		//입력한 화폐가 동일할 때
		if (exchangingCurrency.equals(exchangedCurrency)) {
			System.err.println("동일한 화폐로 환전할 수 없습니다.");
			return;
		}
		
		//유효한 금액이 아닐 때 (금액이 양수가 아닐 때)
		if (amount <= 0) {
			System.out.println("유효한 금액이 아닙니다.");
			return;
		}
		
		//관리하고 있는 화폐 단위가 아닐 때
		//배열의 값을 읽기만 할 것이므로 foreach문을 사용한 것
		boolean hasExchanging = false;
		boolean hasExchanged = false;
		for( String managedCurrency : managedCurrencies) {
			
			if(exchangingCurrency.equals(managedCurrency)) {
				hasExchanging = true;
			}
				
			if(exchangedCurrency.equals(managedCurrency)) {
				hasExchanged = true;
			}
				
			//왜 이 if문 설정해두면 원하는 값이 안 나오지?
			//배열의 모든 요소와 입력 값을 비교를 함으로 당연히 for문을 돌다가 입력값과 배열의 요소와 같지 않은 것이 나오므로 해당 if문은 잘못 된 것
//			if (!exchangingCurrency.equals(managedCurrency) || !exchangedCurrency.equals(managedCurrency)) {
//				System.out.println("유효하지 않은 화폐 단위입니다.");
//				return;
//			}
			//왜 이 if문을 for문 안에 넣으면 원하는 값이 왜 안 나오지?
			//for문이 돌아갈 때는 hasExchanging값과 hasExchanged값이 바로 true가 되는 것이 아니므로
			//정상적으로 입력이 됐다라는 가정하에 조건식이 완료가 된 후에야 확실히 hasExchanging값과 hasExchanged값이 true을 가지고 있으므로
			//아래의 if문은 반복문 밖에 입력을 해야하는 것이다.
//			if(!(hasExchanging && hasExchanged)) {
//				System.out.println("유효하지 않은 화폐 단위입니다.");
//				return;
//			}
			
		}
		
		if(!(hasExchanging && hasExchanged)) {
			System.out.println("유효하지 않은 화폐 단위입니다.");
			return;
		}
		

		double resultAmount = amount;
		
		for(ExchangeRate exchangeRate : exchangeRates) {
			//이런 식으로 긴 조건문은 따로 변수로 만들어주면 가독성이 좋아짐
			boolean isSame = exchangingCurrency.equals(exchangeRate.getExchangingCurrency()) && 
					exchangedCurrency.equals(exchangeRate.getExchangedCurrency());
			//ExchangeRate에 변수를 private로 선언 했기 때문에 접근을 하려면 public으로 선언한 get메서드를 호출해야한다.
			if (isSame)
			 {
					resultAmount *= exchangeRate.getExchangeRate();
					//계속 배열의 모든 요소의 값을 꺼내 for문의 조건문을 계속 검색할 테니 break를 사용해서 for문을 나오는 것
					break;
			}
		}
		
		//정상 출력
		System.out.println(exchangedCurrency + " : " + resultAmount);
		
		
	}

}
