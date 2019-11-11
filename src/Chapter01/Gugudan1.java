package Chapter01;

public class Gugudan1 {

	public static void main(String[] args) {
	
		int i = 1;
		while(i <= 9) {
			
			
			int j = 1;
			while(j <= 9) {
				int k = i*j;
				System.out.println(i + "*"+ j+ "="+k);
		
			j++;
			}
			System.out.println("==================================");
			i++;
			
			
		}
		
		
	}

}
