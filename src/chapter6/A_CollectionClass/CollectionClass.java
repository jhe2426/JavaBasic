package chapter6.A_CollectionClass;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.Set;
import java.util.TreeSet;

//Collection Framework
//배열 형태의 데이터를 보다 편하게 사용할 수 있도록 해주는 클래스의 집합


public class CollectionClass {

	public static void main(String[] args) {
		
		//Set 클래스
		//집합의 개념이다. - 중복을 허용하지 않고 순서가 없는 형태이다.
		//Set은 인터페이스이다. 그래서 인스턴스로 만들수가 없다.
		//순서가 없기 때문에 index 사용 불가능 (값들을 꺼내 보기 위해 Iterator(반복자)를 사용하면 됨)
		
		//Set 인터페이스를 구현한 클래스 2개
		//HashSet<E> : 중복을 허용하지 않고 순서가 없는 형태이다. (주로 값의 중복제거를 할 때 사용됨)
		//순서가 없기 때문에 인덱스로 접근이 불가능하다.
		//.add(넣을 값)를 사용해서 값을 넣으면 됨
		Set<Integer> integerSet = new HashSet<Integer>();
		integerSet.add(4859);
		integerSet.add(123);
		integerSet.add(4859);
		integerSet.add(798);
		integerSet.add(798);
		integerSet.add(3564113);
		
		//일반적으로 Iterator를 사용할 때는 while문을 사용해서 값을 꺼냄
		Iterator<Integer> iterator = integerSet.iterator();
		
		
		//.hasNext() : 커서 기준으로 값이 있는지 없는지를 검사함 커서 기준으로 값이 없으면 false를 반환함
		while(iterator.hasNext()) {
			//.next() : 첫 번째에 있는 값을 반환을 하고 다음 자리로 커서를 옮겨주는 메서드
			System.out.println(iterator.next());
		}
		
		//foreach문은 인덱스로 접근해서 사용하는 것이 아니므로 Set을 Iterator로 말고 foreach문으로 모든 값을 출력할 수 있다.
		for (Integer item : integerSet) {
			System.out.println(item);
		}
		
		//TreeSet<E> : 중복을 허용하지 않고 순서가 없는 형태 + 정렬 기능이 추가된 클래스이다.  (주로 값의 중복제거와 정렬을 함께하고 싶을 때 사용함)
		Set<Integer> treeSet = new TreeSet<Integer>();
		treeSet.add(4859);
		treeSet.add(123);
		treeSet.add(4859);
		treeSet.add(798);
		treeSet.add(798);
		treeSet.add(3564113);
		
		for(Integer item : treeSet) {
			System.out.println(item);
		}
		
		System.out.println("================List 시작==================");
		
		//List(인터페이스)
		//데이터를 일렬로 나열한 구조
		//순서가 존재하고 중복이 허용된다.(가변길이의 배열임)
		
		//ArrayList<E> : 순서가 존재하고 중복이 허용된 '배열'
		List<String> list = new ArrayList<String>();	
		list.add("apple");
		list.add(0,"banana"); //이미 존재하는 인덱스에 특정 인덱스를 지정하게 되면 이미 존재하는 값의 index값이 뒤로 물러가게 된다.
		
		list.set(0, "BaNaNa"); //값 변경
		
		String removeItem = list.remove(1); //배열 내에서 값을  꺼내서 값을 반환해줌
		
		System.out.println(removeItem);
		System.out.println(list.toString());
		
		//모든 컬렉션의 길이는 size() 메서드를 사용해서 알아낼 수 있다.
		for (int index = 0; index < list.size(); index++) {
			System.out.println(list.get(index));
		}
		
		
		//LinkedList<E> : 순서가 존재하고 중복이 허용된 '배열' + 
		//								각 요소가 이전 요소와 다음 요소의 주소를 같이 가지고 있음 검색속도가 빠름				
		//각 요소가 자신의 이전 요소의 주소와 다음 요소의 주소를 가지고 있음 그래서 검색속도가 빠름
		//주솟값을 저장하고 있으므로 메모리 차지를 많이 함
		List<Integer> arrayList = new ArrayList<Integer>();
		List<Integer> linkedList = new LinkedList<Integer>();
		
		long startTime = System.currentTimeMillis();
		for(int integer = 0; integer < 100_000; integer++) {
			arrayList.add(0, integer);		
		}
		long endTime = System.currentTimeMillis();
		 System.out.println("Array List 작업 시간 : " + (endTime - startTime));
		 
		 
			startTime = System.currentTimeMillis();
			for(int integer = 0; integer < 100_000; integer++) {
				linkedList.add(0, integer);		
			}
			endTime = System.currentTimeMillis();
			 System.out.println("Linked List 작업 시간 : " + (endTime - startTime));
		
		System.out.println("================Map 시작==================");
		
		//Map(인터페이스)
		//key와 value가 하나의 쌍으로 저장되는 구조
		//순서가 존재하지 않음, 단 key를 사용해서 특정한 value를 가져올 수 있음
		//key는 항상 유니크해야함 중복되면 안됨(왜냐하면 key로 값에 접근이 가능한데 중복이 가능하면 값에 접근을 하지 못하기 때문이다.)
		//순서가 없어서 인덱스를 사용 못하지만 값이 키(이름)과 함께 저장이 되므로 원하는 요소를 선택할 수 있다.
		
		// HashMap<E, E>
		//HashMap사용은 아주 좋지 못한 것임(왜냐하면 값에 오브젝트가 들어가면 오브젝트의 멤버 변수를 그자체로 사용을 못하므로 좋은 코드가 아님)
		//키가 무엇이 선언되어있는지도 일일이 다 확인을 해야한다. 값을 꺼내올 때도 힘들기 때문
		Map<String, String> hashMap = new HashMap<String, String>();
		
		hashMap.put("key", "value");
		hashMap.put("apple","사과");
		
		System.out.println(hashMap.get("apple"));
		

		//Lotto 응용(항상 로직을 짤 때 나올 결과 값이 무엇을 충족해야하는지 생각하면 거기에 알맞는 Collection을 찾아 로직을 작성하면 코드가 엄청 짧아짐)
		Set<Integer> lotto = new TreeSet<Integer>();
		Random ramdom = new Random();
		System.out.println(lotto.size());
		while (lotto.size() < 6) { //처음 lotto.size()가 0으로 시작하니깐 
			int randomNumber = ramdom.nextInt(45) + 1;
			lotto.add(randomNumber);
		}
		
 		System.out.println(lotto.toString());
		
		
		
	}

}
