package Chapter01;

public class Logical {

	public static void main(String[] args) {

		// 논리연산자는 이항연산자인데
		// 각항이 true, false의 변수나 연산이여야한다.

		int a = 7;
		int b = 3;

		// || =or(논리합)
		// true || false => true
		// true || true => true
		// 1 + 0 = 1
		// false || true -> true
		// false || false => false

		boolean r1 = (a > b) || (b != a);

		// && =or(논리곱)
		// true && false =>  false
		// true && true => true
		// 1 * 0 = 0
		// false && true ->  false
		// false && false => false

		
		System.out.println( a == b || a > b); //t
		System.out.println( a == b && a > b); //f
		
		System.out.println( a != b || a > b); //t
		System.out.println( a != b && a > b); //t
		
		
		// ! : not : 단항연산자
		
		System.out.println(!(a>b));
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
