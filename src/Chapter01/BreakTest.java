package Chapter01;

public class BreakTest {

	public static void main(String[] args) {
		//0에서 부터 합이 5000이상이  될 때까지 합을 하는 루틴
		int i = 0;
		int sum = 0;
		
//		for(i = 0; sum < 5000; i++) {
//			
//			sum += i;
//			
//		}
//		
		while(true) {
			sum +=i;
			if(sum >= 5000) {
				break;
				
			}
			
			i++;
		}
		
		
		
//		int i = 0;
//		int sum = 0;
//		while(sum < 5000) {
//			
//			sum = sum + i;
//			i++;
//		}
		System.out.println(i);
		System.out.println(sum);
//		while( true) {
//			
//			System.out.println(11111);
//				
//		
//		}

		
	}

}
