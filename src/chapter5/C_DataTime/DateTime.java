package chapter5.C_DataTime;

import java.text.SimpleDateFormat;
import java.time.DayOfWeek;
import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;
import java.time.ZoneId;
import java.time.temporal.ChronoUnit;
import java.util.Date;

//날짜 및 시간
public class DateTime {

	public static void main(String[] args) {
		//System.currentTimeMillis();
		//현재 시간을 long 타입으로 0.001초 단위로 표현해줌
		//1970년 1월 1일기준으로 0.001초 단위로 얼마나 지났는지 표시를 해줌
		//용도를 시작 시간를 찍고 메서드를 실행하고 끝난 시간을 찍어 둘의 시간을 빼서
		//두 개의 시간 사이의 메서드가 몇 초가 걸렸는지를 확인할 때 사용되어짐
		long startTime = System.currentTimeMillis();
		System.out.println(startTime);
		
	
		for (int count = 0; count < 1000000000; count++) {
			count++;
		}
	
		long endTime = System.currentTimeMillis();
		System.out.println(endTime);
		
		
		//Date class
		//날짜를 관리 해주는 클래스
		//주로 날짜와 관련된 데이터 타입을 취급할 때 사용
		//날짜를 저장할 때 사용하는 클래스
		//연산할 때는 거의 Date class를 이용해서 계산하지 않음
		Date date = new Date();
		System.out.println(date);
		
		//getMonth() 잘 사용하지는 않음
		System.out.println(date.getMonth()); //Date class에서 Month를 인덱스로 다룸
		//그래서 월은 현재 월보다 1작게 나오는 것
		
		//시간을 맞추는 메서드
		//setHours() 잘 사용하지는 않음
//		date.setHours(10);
//		System.out.println(date);
		
		date.setHours(date.getHours() + 2);
		System.out.println(date);
		
		
		//요즘에는 이런식으로 사용함
		//Time Package에 있는 Instant.now() 를 사용해서
		//Date로 형 변환을 해서 사용하는것
		//Time Package를 사용하면 시간 계산을 Time Package 메서드를 이용해서 편리하게 할 수 있어서 자주 쓰는 거 같음
		Date now = Date.from(Instant.now());
		System.out.println(now);
		
		Date minusTwoHour = Date.from(Instant.now().minus(2, ChronoUnit.HOURS));
		System.out.println(minusTwoHour);
		
		//SimpleDateFormat
		//Date타입의 참조 변수를 지정한 포멧의 문자열로 변경해주는 클래스
		//y : 연, M : 월, d : 일, H : 시간, m : 분, s : 초
		SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy. MM. dd. HH:mm:ss");
		
//		Date now = Date.from(Instant.now());
		String formatedDate = simpleDateFormat.format(now);
		System.out.println(formatedDate);
		
		
		//Time Package
		//Date와 Calander 클래스의 단점 보완
		
		//LocalDate class
		//날짜를 관리해주는 class
		LocalDate localDate = LocalDate.now(); 
		System.out.println(localDate); //현재 날짜가 출력 됨
		LocalDate localDateOf = LocalDate.of(2022, 12, 25); //2022-12-25
		System.out.println(localDateOf);
		
		//LocalTime class
		//시간을 관리해주는 class
		LocalTime localTime = LocalTime.now();
		System.out.println(localTime); //현재 시간의 나노 단위 초까지 출력 됨
		LocalTime localTimeOf = LocalTime.of(12, 40);
		System.out.println(localTimeOf); //12:40
		
		//LocalDateTime class
		//날짜와 시간을 관리해주는 class
		LocalDateTime localDateTime = LocalDateTime.now();
		System.out.println(localDateTime); // 중간 T가 붙여서 나와 날짜와 시간을 구분해줌
		LocalDateTime localDateTimeof = LocalDateTime.of(localDateOf, localTimeOf);
		System.out.println(localDateTimeof);
		
		//특정 날짜 혹은 시간 가져오기
		//.getXXX(); XXX : 년, 월, 일, ..
		int year = localDateTime.getYear();
		
		int month = localDateTime.getMonthValue();
		System.out.println(month);
		Month enumMonth = localDateTime.getMonth();
		System.out.println(enumMonth);
		
		int dayOfYear = localDateTime.getDayOfYear(); //이번 연도에서 365일 중에 며칠인지를 반환해줌
		System.out.println(dayOfYear);
		int dayOfMonth = localDateTime.getDayOfMonth();
		DayOfWeek dayOfWeek = localDateTime.getDayOfWeek(); //요일을 반환해줌
		System.out.println(dayOfWeek);
		
		boolean isLeapYear = localDate.isLeapYear(); //윤달 인지 아닌지를 논리형으로 리턴해주는 메서드 Date 클래스에만 있음
		
		int hour = localDateTime.getHour();
		int minute = localDateTime.getMinute();
		int second = localDateTime.getSecond();
		int nano = localDateTime.getNano();
	
		//특정 날짜 및 시간 변경 (직접 변경, 더하기, 빼기)
		//직접 변경 : withXXX(int타입 데이터);
		//더하기 - 빼기 : plusXXX(long 타입 데이터), minusXXX(long 타입 데이터);
		localDateTime = localDateTime.withYear(2012).plusWeeks(4).minusHours(9);
		localDateTime = localDateTime.withDayOfYear(1).plusMinutes(50).minusNanos(50000);
		
		Instant instant = localDateTime.atZone(ZoneId.systemDefault()).toInstant();
		Date dateTime = Date.from(instant);
  
		System.out.println(dateTime);
	}

}
