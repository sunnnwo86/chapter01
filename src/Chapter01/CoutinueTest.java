package Chapter01;

public class CoutinueTest {
		
	//1-20까지 2의 배수나 (또는) 3의 배수가 아닌 수만 수만 출력하는 문제.
	//1-20까지 (2의 배수가 아니고 3의 배수가 아닌) 수만 출력하는 문제.
	public static void main(String[] args) {
		
//		for(int i = 1; i <=20; i++) {
//			
//			if(i % 2 != 0 && i % 3 != 0) {
//				System.out.println(i);
//		
//				}
//			
//		}
//		
//		
//		
//		
//	}
			for(int i = 1; i <= 20 ; i ++) {
				
				if( i  % 2 ==0) {
					
					continue;
				}
				if( i % 3 ==0) {
					
					continue;
				}
				System.out.println(i);
			}
		
		
	}
}
