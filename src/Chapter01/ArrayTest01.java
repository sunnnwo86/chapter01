package Chapter01;

public class ArrayTest01 {

	public static void main(String[] args) {
		//배열의 필요성
		
		int student1Score = 90;
		int student2Score = 90;
		int student3Score = 90;	
		int student4Score = 90;
		int student5Score = 90;
		int student6Score = 90;
		
		
		
		int[] studentScores = new int[5];
		studentScores[0] = 100;
		studentScores[1] = 80;
		studentScores[2] = 70;
		studentScores[3] = 60;
		studentScores[4] = 100;
				System.out.println(studentScores.length);
				int sum2= 0;
				for( int i = 0; i < studentScores.length ; i++) {
						sum2 += studentScores[i];
						//System.out.println(studentScores[i]);
					
				}
		System.out.println(sum2/studentScores.length);
		
		//foreach 순회
		int sum3 = 0;
		for(int score :studentScores) {
			sum3 += score;
					
		}
		System.out.println("sum3 "+ sum3/studentScores.length);
	}

}
