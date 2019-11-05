
public class Vartest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		final double PI = 3.14;
		
		
		//정수
		
		
		byte b=1;
		short s=10;
		int i = 2000;
		long l =12341234123L;
		
		//실수
		float f = 3.14f;
		double d = 3.14;
		
		
		//문자
		char c = 'a';
		char c2 = 65;
		
		
		
		//불린
		boolean bool = true;
		boolean bool2 = false;
		
		
		
		
		
		System.out.println(c2);
		System.out.println(b);
		System.out.println(s);
		System.out.println(i);
		System.out.println(l);
		System.out.println(f);
		System.out.println(d);
		System.out.println(c);
		System.out.println(bool);
		System.out.println(bool2);
	
		
		/*
		 * 참조형(refernce type)		
		 */
		//문자열은 기본타입이 아니다.
		// 문자열은 기본타입 char가 모여 있는 String class의 객체다
		String str = "hello";
		System.out.println(str.length());
		
		/*
		 * 지역변수초기화
		 * 
		 */
		//지역변수는 초기화  {}안에 있는것이 지역변수
		//안되어 있는 상태로 사용하면 오류.
		int j = 1;
		int k = j + 10;
		System.out.println(j);
		
		
		/*
		 * 상수
		 */
		//final은 상수를 만들어줌. 다시는 변경 안되는것. NUMBER 대문자로 써줌
		
		
		
		final int NUMBER = 10;
		System.out.println(NUMBER);
		//오류
		//초기화할 때 final이 붙어 있는 변수는
		//초기화 이후 부터는 값을 대입할 수 없다.
		//number = 100;
		
		
		
		
	}

}
