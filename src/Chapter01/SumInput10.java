package Chapter01;

import java.util.Scanner;

public class SumInput10 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int number = scanner.nextInt();
		int i= 1 ;
		int sum = 0;
		while( i <= number) {
		
			
			System.out.println(i);
			sum = sum + i;
			i++;
			
		}
		
	System.out.println(number+"까지 합은 "+sum+"입니다.");
	scanner.close();	
	}

}
