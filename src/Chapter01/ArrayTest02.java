package Chapter01;

public class ArrayTest02 {

	public static void main(String[] args) {
		// 배열 정의, 배열변수선언방법
		int array1[]; // 비추
		int[] array2; // 추천*******************
		// 오류
		// int[10] array3;

		/*
		 * 배열 초기화 :기본적으로 숫자타입의 배열은 0으로 초기화 된다.
		 * 
		 */

		int[] array4 = new int[5];

		for (int n : array4) {

			System.out.println(n);
		}
		//직접 값 대입으로 초기화
		int[] array5 = new int[5];
		array5[0] = 0;
		array5[1] = 0;
		array5[2] = 0;
		array5[3] = 0;
		array5[4] = 0;
		
		for (int n : array5) {

			System.out.println(n);
		}
		
			//3. 배열 리터럴(literal)로 초기화
		int[] array6 = {10, 20, 30, 40, 50};//*********************************
		for(int n : array6) {
			System.out.println(n);
		}
		
		
		//4. 리터럴 초기화 주의점 (변수정의 = 변수선언 + 리터럴 초기화)
		int[] array7;
//		array7 = {10, 20, 30, 40, 50}; 이건 안됨.
		
		//비추천 초기화
		
		int[] =array8 = new int[] {10, 20, 30, 40, 50};
		for(int n : array8) {
			
			System.out.println(n);
		}
		
		
		
	}

}
