package Chapter01;

import java.util.Scanner;

public class DoWhileTest {

	public static void main(String[] args) {
		
		
		Scanner scanner = new Scanner(System.in);
		int input = 0;
		int sum = 0;
		
		do {
			
			System.out.print("입력[0 to quit]>");
			input = scanner.nextInt();
			sum = sum + input;
			
			
		
		} while(input > 0);//0보다 크면 밖으로 나감.
		
		System.out.println("입력한 수의 총합은 "+sum+"입니다.");
		scanner.close();
	}

}
